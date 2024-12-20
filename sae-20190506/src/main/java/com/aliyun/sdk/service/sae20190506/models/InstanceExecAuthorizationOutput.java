// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link InstanceExecAuthorizationOutput} extends {@link TeaModel}
 *
 * <p>InstanceExecAuthorizationOutput</p>
 */
public class InstanceExecAuthorizationOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accessKeyId")
    private String accessKeyId;

    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("authorization")
    private String authorization;

    @com.aliyun.core.annotation.NameInMap("date")
    private String date;

    @com.aliyun.core.annotation.NameInMap("endpoint")
    private String endpoint;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private InstanceExecAuthorizationOutput(Builder builder) {
        this.accessKeyId = builder.accessKeyId;
        this.accountId = builder.accountId;
        this.authorization = builder.authorization;
        this.date = builder.date;
        this.endpoint = builder.endpoint;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstanceExecAuthorizationOutput create() {
        return builder().build();
    }

    /**
     * @return accessKeyId
     */
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return authorization
     */
    public String getAuthorization() {
        return this.authorization;
    }

    /**
     * @return date
     */
    public String getDate() {
        return this.date;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessKeyId; 
        private String accountId; 
        private String authorization; 
        private String date; 
        private String endpoint; 
        private String requestId; 

        /**
         * accessKeyId.
         */
        public Builder accessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * authorization.
         */
        public Builder authorization(String authorization) {
            this.authorization = authorization;
            return this;
        }

        /**
         * date.
         */
        public Builder date(String date) {
            this.date = date;
            return this;
        }

        /**
         * endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public InstanceExecAuthorizationOutput build() {
            return new InstanceExecAuthorizationOutput(this);
        } 

    } 

}
