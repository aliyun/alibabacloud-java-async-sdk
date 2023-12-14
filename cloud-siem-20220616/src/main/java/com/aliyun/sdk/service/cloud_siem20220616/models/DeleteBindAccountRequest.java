// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBindAccountRequest} extends {@link RequestModel}
 *
 * <p>DeleteBindAccountRequest</p>
 */
public class DeleteBindAccountRequest extends Request {
    @Body
    @NameInMap("AccessId")
    @Validation(required = true)
    private String accessId;

    @Body
    @NameInMap("AccountId")
    @Validation(required = true)
    private String accountId;

    @Body
    @NameInMap("BindId")
    private Long bindId;

    @Body
    @NameInMap("CloudCode")
    @Validation(required = true)
    private String cloudCode;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    private DeleteBindAccountRequest(Builder builder) {
        super(builder);
        this.accessId = builder.accessId;
        this.accountId = builder.accountId;
        this.bindId = builder.bindId;
        this.cloudCode = builder.cloudCode;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBindAccountRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteBindAccountRequest, Builder> {
        private String accessId; 
        private String accountId; 
        private Long bindId; 
        private String cloudCode; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBindAccountRequest request) {
            super(request);
            this.accessId = request.accessId;
            this.accountId = request.accountId;
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
        public DeleteBindAccountRequest build() {
            return new DeleteBindAccountRequest(this);
        } 

    } 

}
