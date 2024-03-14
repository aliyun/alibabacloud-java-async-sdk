// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewayLDAPInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGatewayLDAPInfoResponseBody</p>
 */
public class DescribeGatewayLDAPInfoResponseBody extends TeaModel {
    @NameInMap("BaseDN")
    private String baseDN;

    @NameInMap("Code")
    private String code;

    @NameInMap("IsEnabled")
    private Boolean isEnabled;

    @NameInMap("IsTls")
    private Boolean isTls;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RootDN")
    private String rootDN;

    @NameInMap("ServerIp")
    private String serverIp;

    @NameInMap("Success")
    private Boolean success;

    private DescribeGatewayLDAPInfoResponseBody(Builder builder) {
        this.baseDN = builder.baseDN;
        this.code = builder.code;
        this.isEnabled = builder.isEnabled;
        this.isTls = builder.isTls;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.rootDN = builder.rootDN;
        this.serverIp = builder.serverIp;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewayLDAPInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return baseDN
     */
    public String getBaseDN() {
        return this.baseDN;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isEnabled
     */
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * @return isTls
     */
    public Boolean getIsTls() {
        return this.isTls;
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
     * @return rootDN
     */
    public String getRootDN() {
        return this.rootDN;
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

    public static final class Builder {
        private String baseDN; 
        private String code; 
        private Boolean isEnabled; 
        private Boolean isTls; 
        private String message; 
        private String requestId; 
        private String rootDN; 
        private String serverIp; 
        private Boolean success; 

        /**
         * BaseDN.
         */
        public Builder baseDN(String baseDN) {
            this.baseDN = baseDN;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * IsTls.
         */
        public Builder isTls(Boolean isTls) {
            this.isTls = isTls;
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
         * RootDN.
         */
        public Builder rootDN(String rootDN) {
            this.rootDN = rootDN;
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

        public DescribeGatewayLDAPInfoResponseBody build() {
            return new DescribeGatewayLDAPInfoResponseBody(this);
        } 

    } 

}
