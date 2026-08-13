// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20251111.models;

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
 * {@link AbortCasesRequest} extends {@link RequestModel}
 *
 * <p>AbortCasesRequest</p>
 */
public class AbortCasesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CampaignId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String campaignId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumbers")
    private java.util.List<String> phoneNumbers;

    private AbortCasesRequest(Builder builder) {
        super(builder);
        this.campaignId = builder.campaignId;
        this.instanceId = builder.instanceId;
        this.phoneNumbers = builder.phoneNumbers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AbortCasesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return campaignId
     */
    public String getCampaignId() {
        return this.campaignId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return phoneNumbers
     */
    public java.util.List<String> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public static final class Builder extends Request.Builder<AbortCasesRequest, Builder> {
        private String campaignId; 
        private String instanceId; 
        private java.util.List<String> phoneNumbers; 

        private Builder() {
            super();
        } 

        private Builder(AbortCasesRequest request) {
            super(request);
            this.campaignId = request.campaignId;
            this.instanceId = request.instanceId;
            this.phoneNumbers = request.phoneNumbers;
        } 

        /**
         * <p>活动ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2180afb0-83a9-4a13-9f19-467d63041dbf</p>
         */
        public Builder campaignId(String campaignId) {
            this.putQueryParameter("CampaignId", campaignId);
            this.campaignId = campaignId;
            return this;
        }

        /**
         * <p>外呼实例ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1dcb09c5-d5db-4397-bf65-db854463beea</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>待终止的号码列表</p>
         */
        public Builder phoneNumbers(java.util.List<String> phoneNumbers) {
            String phoneNumbersShrink = shrink(phoneNumbers, "PhoneNumbers", "json");
            this.putQueryParameter("PhoneNumbers", phoneNumbersShrink);
            this.phoneNumbers = phoneNumbers;
            return this;
        }

        @Override
        public AbortCasesRequest build() {
            return new AbortCasesRequest(this);
        } 

    } 

}
