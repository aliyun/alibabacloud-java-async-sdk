// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewayADInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGatewayADInfoResponseBody</p>
 */
public class DescribeGatewayADInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("IsEnabled")
    private Boolean isEnabled;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServerIp")
    private String serverIp;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Username")
    private String username;

    private DescribeGatewayADInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.domainName = builder.domainName;
        this.isEnabled = builder.isEnabled;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.serverIp = builder.serverIp;
        this.success = builder.success;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewayADInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return isEnabled
     */
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serverIp
     */
    public String getServerIp() {
        return this.serverIp;
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
        private String domainName; 
        private Boolean isEnabled; 
        private String message; 
        private String requestId; 
        private String serverIp; 
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
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * IsEnabled.
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServerIp.
         */
        public Builder serverIp(String serverIp) {
            this.serverIp = serverIp;
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

        public DescribeGatewayADInfoResponseBody build() {
            return new DescribeGatewayADInfoResponseBody(this);
        } 

    } 

}
