// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckAoneAppAuditRequest} extends {@link RequestModel}
 *
 * <p>CheckAoneAppAuditRequest</p>
 */
public class CheckAoneAppAuditRequest extends Request {
    @Query
    @NameInMap("AoneAppName")
    @Validation(required = true)
    private String aoneAppName;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private CheckAoneAppAuditRequest(Builder builder) {
        super(builder);
        this.aoneAppName = builder.aoneAppName;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckAoneAppAuditRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aoneAppName
     */
    public String getAoneAppName() {
        return this.aoneAppName;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<CheckAoneAppAuditRequest, Builder> {
        private String aoneAppName; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(CheckAoneAppAuditRequest request) {
            super(request);
            this.aoneAppName = request.aoneAppName;
            this.securityToken = request.securityToken;
        } 

        /**
         * AoneAppName.
         */
        public Builder aoneAppName(String aoneAppName) {
            this.putQueryParameter("AoneAppName", aoneAppName);
            this.aoneAppName = aoneAppName;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public CheckAoneAppAuditRequest build() {
            return new CheckAoneAppAuditRequest(this);
        } 

    } 

}
