// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ModifyCampaignNumbersRequest} extends {@link RequestModel}
 *
 * <p>ModifyCampaignNumbersRequest</p>
 */
public class ModifyCampaignNumbersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CampaignId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String campaignId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstGroupId")
    private String instGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NumberList")
    private java.util.List<String> numberList;

    private ModifyCampaignNumbersRequest(Builder builder) {
        super(builder);
        this.campaignId = builder.campaignId;
        this.instGroupId = builder.instGroupId;
        this.instanceId = builder.instanceId;
        this.numberList = builder.numberList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCampaignNumbersRequest create() {
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
     * @return instGroupId
     */
    public String getInstGroupId() {
        return this.instGroupId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return numberList
     */
    public java.util.List<String> getNumberList() {
        return this.numberList;
    }

    public static final class Builder extends Request.Builder<ModifyCampaignNumbersRequest, Builder> {
        private String campaignId; 
        private String instGroupId; 
        private String instanceId; 
        private java.util.List<String> numberList; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCampaignNumbersRequest request) {
            super(request);
            this.campaignId = request.campaignId;
            this.instGroupId = request.instGroupId;
            this.instanceId = request.instanceId;
            this.numberList = request.numberList;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6badb397-<strong><strong>-</strong></strong>-21019d382a09</p>
         */
        public Builder campaignId(String campaignId) {
            this.putQueryParameter("CampaignId", campaignId);
            this.campaignId = campaignId;
            return this;
        }

        /**
         * InstGroupId.
         */
        public Builder instGroupId(String instGroupId) {
            this.putQueryParameter("InstGroupId", instGroupId);
            this.instGroupId = instGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NumberList.
         */
        public Builder numberList(java.util.List<String> numberList) {
            String numberListShrink = shrink(numberList, "NumberList", "json");
            this.putQueryParameter("NumberList", numberListShrink);
            this.numberList = numberList;
            return this;
        }

        @Override
        public ModifyCampaignNumbersRequest build() {
            return new ModifyCampaignNumbersRequest(this);
        } 

    } 

}
