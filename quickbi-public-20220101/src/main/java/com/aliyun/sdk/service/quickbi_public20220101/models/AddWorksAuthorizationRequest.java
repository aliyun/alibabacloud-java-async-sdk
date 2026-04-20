// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link AddWorksAuthorizationRequest} extends {@link RequestModel}
 *
 * <p>AddWorksAuthorizationRequest</p>
 */
public class AddWorksAuthorizationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthPoints")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer authPoints;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizeScope")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer authorizeScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizedId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authorizedId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireDay")
    private String expireDay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    private AddWorksAuthorizationRequest(Builder builder) {
        super(builder);
        this.authPoints = builder.authPoints;
        this.authorizeScope = builder.authorizeScope;
        this.authorizedId = builder.authorizedId;
        this.expireDay = builder.expireDay;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddWorksAuthorizationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authPoints
     */
    public Integer getAuthPoints() {
        return this.authPoints;
    }

    /**
     * @return authorizeScope
     */
    public Integer getAuthorizeScope() {
        return this.authorizeScope;
    }

    /**
     * @return authorizedId
     */
    public String getAuthorizedId() {
        return this.authorizedId;
    }

    /**
     * @return expireDay
     */
    public String getExpireDay() {
        return this.expireDay;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<AddWorksAuthorizationRequest, Builder> {
        private Integer authPoints; 
        private Integer authorizeScope; 
        private String authorizedId; 
        private String expireDay; 
        private String resourceId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(AddWorksAuthorizationRequest request) {
            super(request);
            this.authPoints = request.authPoints;
            this.authorizeScope = request.authorizeScope;
            this.authorizedId = request.authorizedId;
            this.expireDay = request.expireDay;
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder authPoints(Integer authPoints) {
            this.putQueryParameter("AuthPoints", authPoints);
            this.authPoints = authPoints;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder authorizeScope(Integer authorizeScope) {
            this.putQueryParameter("AuthorizeScope", authorizeScope);
            this.authorizeScope = authorizeScope;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ASDAS-WDAS****ASDA</p>
         */
        public Builder authorizedId(String authorizedId) {
            this.putQueryParameter("AuthorizedId", authorizedId);
            this.authorizedId = authorizedId;
            return this;
        }

        /**
         * ExpireDay.
         */
        public Builder expireDay(String expireDay) {
            this.putQueryParameter("ExpireDay", expireDay);
            this.expireDay = expireDay;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>al*************7ufv</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dashboard</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public AddWorksAuthorizationRequest build() {
            return new AddWorksAuthorizationRequest(this);
        } 

    } 

}
