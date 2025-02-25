// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link UpdateIdentityToBenefitPkgMappingRequest} extends {@link RequestModel}
 *
 * <p>UpdateIdentityToBenefitPkgMappingRequest</p>
 */
public class UpdateIdentityToBenefitPkgMappingRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("amount")
    private Long amount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("benefit_pkg_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String benefitPkgId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expire_time")
    private Long expireTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("identity_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identityId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("identity_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identityType;

    private UpdateIdentityToBenefitPkgMappingRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.amount = builder.amount;
        this.benefitPkgId = builder.benefitPkgId;
        this.expireTime = builder.expireTime;
        this.identityId = builder.identityId;
        this.identityType = builder.identityType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIdentityToBenefitPkgMappingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return amount
     */
    public Long getAmount() {
        return this.amount;
    }

    /**
     * @return benefitPkgId
     */
    public String getBenefitPkgId() {
        return this.benefitPkgId;
    }

    /**
     * @return expireTime
     */
    public Long getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return identityId
     */
    public String getIdentityId() {
        return this.identityId;
    }

    /**
     * @return identityType
     */
    public String getIdentityType() {
        return this.identityType;
    }

    public static final class Builder extends Request.Builder<UpdateIdentityToBenefitPkgMappingRequest, Builder> {
        private String domainId; 
        private Long amount; 
        private String benefitPkgId; 
        private Long expireTime; 
        private String identityId; 
        private String identityType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIdentityToBenefitPkgMappingRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.amount = request.amount;
            this.benefitPkgId = request.benefitPkgId;
            this.expireTime = request.expireTime;
            this.identityId = request.identityId;
            this.identityType = request.identityType;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The number of benefit packages.</p>
         * <p>This parameter specifies the number of benefit packages of the resource type. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder amount(Long amount) {
            this.putBodyParameter("amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * <p>The unique identifier of the benefit package.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>40cb7794c9294</p>
         */
        public Builder benefitPkgId(String benefitPkgId) {
            this.putBodyParameter("benefit_pkg_id", benefitPkgId);
            this.benefitPkgId = benefitPkgId;
            return this;
        }

        /**
         * <p>The expiration time of the benefit package. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * <p>By default, the benefit package never expires.</p>
         * 
         * <strong>example:</strong>
         * <p>1633167071000</p>
         */
        public Builder expireTime(Long expireTime) {
            this.putBodyParameter("expire_time", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>The unique identifier of the entity.</p>
         * <p>If you call this operation to manage the benefits of a user, set this parameter to the ID of the user.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user123</p>
         */
        public Builder identityId(String identityId) {
            this.putBodyParameter("identity_id", identityId);
            this.identityId = identityId;
            return this;
        }

        /**
         * <p>The type of the entity. If you call this operation to manage the benefits of a user, set this parameter to user.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        public Builder identityType(String identityType) {
            this.putBodyParameter("identity_type", identityType);
            this.identityType = identityType;
            return this;
        }

        @Override
        public UpdateIdentityToBenefitPkgMappingRequest build() {
            return new UpdateIdentityToBenefitPkgMappingRequest(this);
        } 

    } 

}
