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
 * {@link ListIdentityToBenefitPkgMappingRequest} extends {@link RequestModel}
 *
 * <p>ListIdentityToBenefitPkgMappingRequest</p>
 */
public class ListIdentityToBenefitPkgMappingRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("identity_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identityId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("identity_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identityType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("include_expired")
    private Boolean includeExpired;

    private ListIdentityToBenefitPkgMappingRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.identityId = builder.identityId;
        this.identityType = builder.identityType;
        this.includeExpired = builder.includeExpired;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIdentityToBenefitPkgMappingRequest create() {
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

    /**
     * @return includeExpired
     */
    public Boolean getIncludeExpired() {
        return this.includeExpired;
    }

    public static final class Builder extends Request.Builder<ListIdentityToBenefitPkgMappingRequest, Builder> {
        private String domainId; 
        private String identityId; 
        private String identityType; 
        private Boolean includeExpired; 

        private Builder() {
            super();
        } 

        private Builder(ListIdentityToBenefitPkgMappingRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.identityId = request.identityId;
            this.identityType = request.identityType;
            this.includeExpired = request.includeExpired;
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

        /**
         * <p>Specifies whether to return the benefit packages that expire. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder includeExpired(Boolean includeExpired) {
            this.putBodyParameter("include_expired", includeExpired);
            this.includeExpired = includeExpired;
            return this;
        }

        @Override
        public ListIdentityToBenefitPkgMappingRequest build() {
            return new ListIdentityToBenefitPkgMappingRequest(this);
        } 

    } 

}
