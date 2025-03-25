// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link GetSecretValueResponseBody} extends {@link TeaModel}
 *
 * <p>GetSecretValueResponseBody</p>
 */
public class GetSecretValueResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecretArn")
    private String secretArn;

    @com.aliyun.core.annotation.NameInMap("SecretName")
    private String secretName;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    private GetSecretValueResponseBody(Builder builder) {
        this.code = builder.code;
        this.DBInstanceId = builder.DBInstanceId;
        this.description = builder.description;
        this.message = builder.message;
        this.password = builder.password;
        this.requestId = builder.requestId;
        this.secretArn = builder.secretArn;
        this.secretName = builder.secretName;
        this.status = builder.status;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecretValueResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return secretArn
     */
    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * @return secretName
     */
    public String getSecretName() {
        return this.secretName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder {
        private String code; 
        private String DBInstanceId; 
        private String description; 
        private String message; 
        private String password; 
        private String requestId; 
        private String secretArn; 
        private String secretName; 
        private String status; 
        private String username; 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Secret.NotFound</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The description of the access credential.</p>
         * 
         * <strong>example:</strong>
         * <p>test secret</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The password of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>pwd123</p>
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ARN of the access credential for the created Data API account. Format: <code>acs:gpdb:{{region}}:{{accountId}}:secret/{{secretName}}-{{32 digits random string}</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:gpdb:cn-beijing:1033**:secret/testsecret-eG2AQGRIwQ0zFp4VA7mYL3uiCXTfDQbQ</p>
         */
        public Builder secretArn(String secretArn) {
            this.secretArn = secretArn;
            return this;
        }

        /**
         * <p>The name of the access credential.</p>
         * 
         * <strong>example:</strong>
         * <p>testsecret</p>
         */
        public Builder secretName(String secretName) {
            this.secretName = secretName;
            return this;
        }

        /**
         * <p>The status of the operation. Valid values:</p>
         * <ul>
         * <li><strong>success</strong></li>
         * <li><strong>fail</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The name of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>testacc</p>
         */
        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public GetSecretValueResponseBody build() {
            return new GetSecretValueResponseBody(this);
        } 

    } 

}
