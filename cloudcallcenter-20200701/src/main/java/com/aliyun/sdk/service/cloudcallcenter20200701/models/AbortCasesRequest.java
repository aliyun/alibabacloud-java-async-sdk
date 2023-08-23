// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcallcenter20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AbortCasesRequest} extends {@link RequestModel}
 *
 * <p>AbortCasesRequest</p>
 */
public class AbortCasesRequest extends Request {
    @Query
    @NameInMap("CampaignId")
    private String campaignId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("PhoneNumberList")
    private java.util.List < String > phoneNumberList;

    private AbortCasesRequest(Builder builder) {
        super(builder);
        this.campaignId = builder.campaignId;
        this.instanceId = builder.instanceId;
        this.phoneNumberList = builder.phoneNumberList;
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
     * @return phoneNumberList
     */
    public java.util.List < String > getPhoneNumberList() {
        return this.phoneNumberList;
    }

    public static final class Builder extends Request.Builder<AbortCasesRequest, Builder> {
        private String campaignId; 
        private String instanceId; 
        private java.util.List < String > phoneNumberList; 

        private Builder() {
            super();
        } 

        private Builder(AbortCasesRequest request) {
            super(request);
            this.campaignId = request.campaignId;
            this.instanceId = request.instanceId;
            this.phoneNumberList = request.phoneNumberList;
        } 

        /**
         * CampaignId.
         */
        public Builder campaignId(String campaignId) {
            this.putQueryParameter("CampaignId", campaignId);
            this.campaignId = campaignId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PhoneNumberList.
         */
        public Builder phoneNumberList(java.util.List < String > phoneNumberList) {
            String phoneNumberListShrink = shrink(phoneNumberList, "PhoneNumberList", "json");
            this.putQueryParameter("PhoneNumberList", phoneNumberListShrink);
            this.phoneNumberList = phoneNumberList;
            return this;
        }

        @Override
        public AbortCasesRequest build() {
            return new AbortCasesRequest(this);
        } 

    } 

}
