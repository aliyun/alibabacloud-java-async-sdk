// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SendVerifyCodeRequest} extends {@link RequestModel}
 *
 * <p>SendVerifyCodeRequest</p>
 */
public class SendVerifyCodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtraInfo")
    private String extraInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerifyCodeAction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String verifyCodeAction;

    private SendVerifyCodeRequest(Builder builder) {
        super(builder);
        this.extraInfo = builder.extraInfo;
        this.regionId = builder.regionId;
        this.verifyCodeAction = builder.verifyCodeAction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendVerifyCodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extraInfo
     */
    public String getExtraInfo() {
        return this.extraInfo;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return verifyCodeAction
     */
    public String getVerifyCodeAction() {
        return this.verifyCodeAction;
    }

    public static final class Builder extends Request.Builder<SendVerifyCodeRequest, Builder> {
        private String extraInfo; 
        private String regionId; 
        private String verifyCodeAction; 

        private Builder() {
            super();
        } 

        private Builder(SendVerifyCodeRequest request) {
            super(request);
            this.extraInfo = request.extraInfo;
            this.regionId = request.regionId;
            this.verifyCodeAction = request.verifyCodeAction;
        } 

        /**
         * <p>The information required to send the verification code, in JSON format. When verifying a CEN instance, provide the CEN instance ID and the Alibaba Cloud account ID to which the CEN instance belongs.</p>
         * <ul>
         * <li>CenId: the CEN instance ID. </li>
         * <li>CenOwnerId: the Alibaba Cloud account ID to which the CEN instance belongs.</li>
         * </ul>
         * <blockquote>
         * <p>If the specified CenId belongs to the current Alibaba Cloud account, this parameter is not required. If the specified CenId belongs to a different Alibaba Cloud account, specify the Alibaba Cloud account ID of the owner.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;cenOwnerId&quot;: 1234567890******,&quot;cenId&quot;: &quot;cen-3weq30r6t0s7t4****&quot;}</p>
         */
        public Builder extraInfo(String extraInfo) {
            this.putQueryParameter("ExtraInfo", extraInfo);
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * <p>The region ID. Call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The action associated with the verification code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eds_cenID_securityverification</p>
         */
        public Builder verifyCodeAction(String verifyCodeAction) {
            this.putQueryParameter("VerifyCodeAction", verifyCodeAction);
            this.verifyCodeAction = verifyCodeAction;
            return this;
        }

        @Override
        public SendVerifyCodeRequest build() {
            return new SendVerifyCodeRequest(this);
        } 

    } 

}
