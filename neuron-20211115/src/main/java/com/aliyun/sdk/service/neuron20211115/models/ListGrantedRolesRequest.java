// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link ListGrantedRolesRequest} extends {@link RequestModel}
 *
 * <p>ListGrantedRolesRequest</p>
 */
public class ListGrantedRolesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("authorizerId")
    private String authorizerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("authorizerType")
    private String authorizerType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("enterpriseId")
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private ListGrantedRolesRequest(Builder builder) {
        super(builder);
        this.authorizerId = builder.authorizerId;
        this.authorizerType = builder.authorizerType;
        this.enterpriseId = builder.enterpriseId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGrantedRolesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizerId
     */
    public String getAuthorizerId() {
        return this.authorizerId;
    }

    /**
     * @return authorizerType
     */
    public String getAuthorizerType() {
        return this.authorizerType;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<ListGrantedRolesRequest, Builder> {
        private String authorizerId; 
        private String authorizerType; 
        private Long enterpriseId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(ListGrantedRolesRequest request) {
            super(request);
            this.authorizerId = request.authorizerId;
            this.authorizerType = request.authorizerType;
            this.enterpriseId = request.enterpriseId;
            this.name = request.name;
        } 

        /**
         * authorizerId.
         */
        public Builder authorizerId(String authorizerId) {
            this.putQueryParameter("authorizerId", authorizerId);
            this.authorizerId = authorizerId;
            return this;
        }

        /**
         * authorizerType.
         */
        public Builder authorizerType(String authorizerType) {
            this.putQueryParameter("authorizerType", authorizerType);
            this.authorizerType = authorizerType;
            return this;
        }

        /**
         * enterpriseId.
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("enterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public ListGrantedRolesRequest build() {
            return new ListGrantedRolesRequest(this);
        } 

    } 

}
