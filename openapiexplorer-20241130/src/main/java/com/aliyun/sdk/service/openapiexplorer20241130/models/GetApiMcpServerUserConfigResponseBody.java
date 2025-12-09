// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openapiexplorer20241130.models;

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
 * {@link GetApiMcpServerUserConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetApiMcpServerUserConfigResponseBody</p>
 */
public class GetApiMcpServerUserConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("enablePublicAccess")
    private Boolean enablePublicAccess;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("vpcWhitelists")
    private java.util.List<String> vpcWhitelists;

    private GetApiMcpServerUserConfigResponseBody(Builder builder) {
        this.accountId = builder.accountId;
        this.enablePublicAccess = builder.enablePublicAccess;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.requestId = builder.requestId;
        this.vpcWhitelists = builder.vpcWhitelists;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApiMcpServerUserConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return enablePublicAccess
     */
    public Boolean getEnablePublicAccess() {
        return this.enablePublicAccess;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vpcWhitelists
     */
    public java.util.List<String> getVpcWhitelists() {
        return this.vpcWhitelists;
    }

    public static final class Builder {
        private String accountId; 
        private Boolean enablePublicAccess; 
        private String gmtCreate; 
        private String gmtModified; 
        private String requestId; 
        private java.util.List<String> vpcWhitelists; 

        private Builder() {
        } 

        private Builder(GetApiMcpServerUserConfigResponseBody model) {
            this.accountId = model.accountId;
            this.enablePublicAccess = model.enablePublicAccess;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.requestId = model.requestId;
            this.vpcWhitelists = model.vpcWhitelists;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * enablePublicAccess.
         */
        public Builder enablePublicAccess(Boolean enablePublicAccess) {
            this.enablePublicAccess = enablePublicAccess;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * vpcWhitelists.
         */
        public Builder vpcWhitelists(java.util.List<String> vpcWhitelists) {
            this.vpcWhitelists = vpcWhitelists;
            return this;
        }

        public GetApiMcpServerUserConfigResponseBody build() {
            return new GetApiMcpServerUserConfigResponseBody(this);
        } 

    } 

}
