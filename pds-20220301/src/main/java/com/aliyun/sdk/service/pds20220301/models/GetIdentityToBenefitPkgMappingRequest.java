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
 * {@link GetIdentityToBenefitPkgMappingRequest} extends {@link RequestModel}
 *
 * <p>GetIdentityToBenefitPkgMappingRequest</p>
 */
public class GetIdentityToBenefitPkgMappingRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("benefit_pkg_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String benefitPkgId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("identity_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identityId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("identity_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identityType;

    private GetIdentityToBenefitPkgMappingRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.benefitPkgId = builder.benefitPkgId;
        this.identityId = builder.identityId;
        this.identityType = builder.identityType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIdentityToBenefitPkgMappingRequest create() {
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
     * @return benefitPkgId
     */
    public String getBenefitPkgId() {
        return this.benefitPkgId;
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

    public static final class Builder extends Request.Builder<GetIdentityToBenefitPkgMappingRequest, Builder> {
        private String domainId; 
        private String benefitPkgId; 
        private String identityId; 
        private String identityType; 

        private Builder() {
            super();
        } 

        private Builder(GetIdentityToBenefitPkgMappingRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.benefitPkgId = request.benefitPkgId;
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
         * <p>The unique identifier of the entity.</p>
         * <p>If you want to manage the benefits of a user, set this parameter to a user ID.</p>
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
         * <p>The type of the entity. If you want to manage the benefits of a user, set this parameter to user.</p>
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
        public GetIdentityToBenefitPkgMappingRequest build() {
            return new GetIdentityToBenefitPkgMappingRequest(this);
        } 

    } 

}
