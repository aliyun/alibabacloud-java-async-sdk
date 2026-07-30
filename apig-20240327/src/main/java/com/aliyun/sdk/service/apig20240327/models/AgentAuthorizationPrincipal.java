// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link AgentAuthorizationPrincipal} extends {@link TeaModel}
 *
 * <p>AgentAuthorizationPrincipal</p>
 */
public class AgentAuthorizationPrincipal extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("principalId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String principalId;

    @com.aliyun.core.annotation.NameInMap("principalType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String principalType;

    private AgentAuthorizationPrincipal(Builder builder) {
        this.principalId = builder.principalId;
        this.principalType = builder.principalType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgentAuthorizationPrincipal create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return principalId
     */
    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * @return principalType
     */
    public String getPrincipalType() {
        return this.principalType;
    }

    public static final class Builder {
        private String principalId; 
        private String principalType; 

        private Builder() {
        } 

        private Builder(AgentAuthorizationPrincipal model) {
            this.principalId = model.principalId;
            this.principalType = model.principalType;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder principalId(String principalId) {
            this.principalId = principalId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder principalType(String principalType) {
            this.principalType = principalType;
            return this;
        }

        public AgentAuthorizationPrincipal build() {
            return new AgentAuthorizationPrincipal(this);
        } 

    } 

}
