// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBindDataSourcesRequest} extends {@link RequestModel}
 *
 * <p>ListBindDataSourcesRequest</p>
 */
public class ListBindDataSourcesRequest extends Request {
    @Body
    @NameInMap("AccountId")
    @Validation(required = true)
    private String accountId;

    @Body
    @NameInMap("CloudCode")
    @Validation(required = true)
    private String cloudCode;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    private ListBindDataSourcesRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.cloudCode = builder.cloudCode;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBindDataSourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return cloudCode
     */
    public String getCloudCode() {
        return this.cloudCode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListBindDataSourcesRequest, Builder> {
        private String accountId; 
        private String cloudCode; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListBindDataSourcesRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.cloudCode = request.cloudCode;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the cloud account.
         */
        public Builder accountId(String accountId) {
            this.putBodyParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * The code of the cloud service provider.
         * <p>
         * 
         * Valid values:
         * 
         * *   qcloud
         * *   hcloud
         * *   aliyun
         */
        public Builder cloudCode(String cloudCode) {
            this.putBodyParameter("CloudCode", cloudCode);
            this.cloudCode = cloudCode;
            return this;
        }

        /**
         * The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:
         * <p>
         * 
         * *   cn-hangzhou: Your assets reside in regions in China.
         * *   ap-southeast-1: Your assets reside in regions outside China.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListBindDataSourcesRequest build() {
            return new ListBindDataSourcesRequest(this);
        } 

    } 

}
