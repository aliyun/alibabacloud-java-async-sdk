// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewayAuthInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGatewayAuthInfoResponseBody</p>
 */
public class DescribeGatewayAuthInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("Password")
    private String password;

    @NameInMap("PublicIp")
    private String publicIp;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Username")
    private String username;

    private DescribeGatewayAuthInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.password = builder.password;
        this.publicIp = builder.publicIp;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewayAuthInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return publicIp
     */
    public String getPublicIp() {
        return this.publicIp;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String password; 
        private String publicIp; 
        private String requestId; 
        private Boolean success; 
        private String username; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * PublicIp.
         */
        public Builder publicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Username.
         */
        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public DescribeGatewayAuthInfoResponseBody build() {
            return new DescribeGatewayAuthInfoResponseBody(this);
        } 

    } 

}
