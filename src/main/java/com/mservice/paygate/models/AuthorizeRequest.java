package com.mservice.paygate.models;

import com.mservice.shared.sharedmodels.PartnerClientInfo;
import lombok.Builder;

public class AuthorizeRequest extends Request {
	@Builder
	public AuthorizeRequest(String partnerCode, String orderId, String orderInfo, String accessKey, String amount, String signature, String extraData, String requestId, String notifyUrl, String returnUrl, String requestType, PartnerClientInfo partnerClientInfo) {
		super(partnerCode, orderId, orderInfo, accessKey, amount, signature, extraData, requestId, notifyUrl, returnUrl, requestType);
		this.partnerClientInfo = partnerClientInfo;
	}

	private PartnerClientInfo partnerClientInfo;

	public PartnerClientInfo getPartnerClientInfo() {
		return partnerClientInfo;
	}

	public void setPartnerClientInfo(PartnerClientInfo partnerClientInfo) {
		this.partnerClientInfo = partnerClientInfo;
	}
}
