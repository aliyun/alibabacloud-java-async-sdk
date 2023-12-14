// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBindAccountRequest} extends {@link RequestModel}
 *
 * <p>ModifyBindAccountRequest</p>
 */
public class ModifyBindAccountRequest extends Request {
    @Body
    @NameInMap("AccessId")
    private String accessId;

    @Body
    @NameInMap("AccountId")
    @Validation(required = true)
    private String accountId;

    @Body
    @NameInMap("AccountName")
    private String accountName;

    @Body
    @NameInMap("BindId")
    @Validation(required = true)
    private Long bindId;

    @Body
    @NameInMap("CloudCode")
    @Validation(required = true)
    private String cloudCode;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    private ModifyBindAccountRequest(Builder builder) {
        super(builder);
        this.accessId = builder.accessId;
        this.accountId = builder.accountId;
        this.accountName = builder.accountName;
        this.bindId = builder.bindId;
        this.cloudCode = builder.cloudCode;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBindAccountRequest create() {
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
     * @return bindId
     */
    public Long getBindId() {
        return this.bindId;
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

    public static final class Builder extends Request.Builder<ModifyBindAccountRequest, Builder> {
        private String accessId; 
        private String accountId; 
        private String accountName; 
        private Long bindId; 
        private String cloudCode; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBindAccountRequest request) {
            super(request);
            this.accessId = request.accessId;
            this.accountId = request.accountId;
            this.accountName = request.accountName;
            this.bindId = request.bindId;
            this.cloudCode = request.cloudCode;
            this.regionId = request.regionId;
        } 

        /**
         * AccessId.
         */
        public Builder accessId(String accessId) {
            this.putBodyParameter("AccessId", accessId);
            this.accessId = accessId;
            return this;
        }

        /**
         * AccountId.
         */
        public Builder accountId(String accountId) {
            this.putBodyParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * AccountName.
         */
        public Builder accountName(String accountName) {
            this.putBodyParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * BindId.
         */
        public Builder bindId(Long bindId) {
            this.putBodyParameter("BindId", bindId);
            this.bindId = bindId;
            return this;
        }

        /**
         * CloudCode.
         */
        public Builder cloudCode(String cloudCode) {
            this.putBodyParameter("CloudCode", cloudCode);
            this.cloudCode = cloudCode;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyBindAccountRequest build() {
            return new ModifyBindAccountRequest(this);
        } 

    } 

}
