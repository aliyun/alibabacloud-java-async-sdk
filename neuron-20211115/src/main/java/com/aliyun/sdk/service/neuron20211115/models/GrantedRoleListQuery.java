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
 * {@link GrantedRoleListQuery} extends {@link TeaModel}
 *
 * <p>GrantedRoleListQuery</p>
 */
public class GrantedRoleListQuery extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authorizerId")
    private String authorizerId;

    @com.aliyun.core.annotation.NameInMap("authorizerType")
    private String authorizerType;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private GrantedRoleListQuery(Builder builder) {
        this.authorizerId = builder.authorizerId;
        this.authorizerType = builder.authorizerType;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantedRoleListQuery create() {
        return builder().build();
    }

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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String authorizerId; 
        private String authorizerType; 
        private String name; 

        private Builder() {
        } 

        private Builder(GrantedRoleListQuery model) {
            this.authorizerId = model.authorizerId;
            this.authorizerType = model.authorizerType;
            this.name = model.name;
        } 

        /**
         * authorizerId.
         */
        public Builder authorizerId(String authorizerId) {
            this.authorizerId = authorizerId;
            return this;
        }

        /**
         * authorizerType.
         */
        public Builder authorizerType(String authorizerType) {
            this.authorizerType = authorizerType;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public GrantedRoleListQuery build() {
            return new GrantedRoleListQuery(this);
        } 

    } 

}
