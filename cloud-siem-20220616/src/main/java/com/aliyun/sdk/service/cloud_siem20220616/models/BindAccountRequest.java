// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindAccountRequest} extends {@link RequestModel}
 *
 * <p>BindAccountRequest</p>
 */
public class BindAccountRequest extends Request {
    @Body
    @NameInMap("AccessId")
    @Validation(required = true)
    private String accessId;

    @Body
    @NameInMap("AccountId")
    @Validation(required = true)
    private String accountId;

    @Body
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Body
    @NameInMap("CloudCode")
    @Validation(required = true)
    private String cloudCode;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    private BindAccountRequest(Builder builder) {
        super(builder);
        this.accessId = builder.accessId;
        this.accountId = builder.accountId;
        this.accountName = builder.accountName;
        this.cloudCode = builder.cloudCode;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessId
     */
    public String getAccessId() {
        return this.accessId;
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
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

    public static final class Builder extends Request.Builder<BindAccountRequest, Builder> {
        private String accessId; 
        private String accountId; 
        private String accountName; 
        private String cloudCode; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(BindAccountRequest request) {
            super(request);
            this.accessId = request.accessId;
            this.accountId = request.accountId;
            this.accountName = request.accountName;
            this.cloudCode = request.cloudCode;
            this.regionId = request.regionId;
        } 

        /**
         * The AccessKey ID of the cloud account.
         */
        public Builder accessId(String accessId) {
            this.putBodyParameter("AccessId", accessId);
            this.accessId = accessId;
            return this;
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
         * The username of the cloud account.
         */
        public Builder accountName(String accountName) {
            this.putBodyParameter("AccountName", accountName);
            this.accountName = accountName;
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
        public BindAccountRequest build() {
            return new BindAccountRequest(this);
        } 

    } 

}
