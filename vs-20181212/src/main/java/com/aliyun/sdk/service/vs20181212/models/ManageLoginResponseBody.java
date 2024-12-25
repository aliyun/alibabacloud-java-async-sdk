// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link ManageLoginResponseBody} extends {@link TeaModel}
 *
 * <p>ManageLoginResponseBody</p>
 */
public class ManageLoginResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LoginInfo")
    private LoginInfo loginInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ManageLoginResponseBody(Builder builder) {
        this.loginInfo = builder.loginInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ManageLoginResponseBody create() {
        return builder().build();
    }

    /**
     * @return loginInfo
     */
    public LoginInfo getLoginInfo() {
        return this.loginInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LoginInfo loginInfo; 
        private String requestId; 

        /**
         * LoginInfo.
         */
        public Builder loginInfo(LoginInfo loginInfo) {
            this.loginInfo = loginInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ManageLoginResponseBody build() {
            return new ManageLoginResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ManageLoginResponseBody} extends {@link TeaModel}
     *
     * <p>ManageLoginResponseBody</p>
     */
    public static class LoginInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdbLoginPort")
        private Integer adbLoginPort;

        @com.aliyun.core.annotation.NameInMap("LoginHostname")
        private String loginHostname;

        @com.aliyun.core.annotation.NameInMap("LoginPort")
        private Integer loginPort;

        private LoginInfo(Builder builder) {
            this.adbLoginPort = builder.adbLoginPort;
            this.loginHostname = builder.loginHostname;
            this.loginPort = builder.loginPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoginInfo create() {
            return builder().build();
        }

        /**
         * @return adbLoginPort
         */
        public Integer getAdbLoginPort() {
            return this.adbLoginPort;
        }

        /**
         * @return loginHostname
         */
        public String getLoginHostname() {
            return this.loginHostname;
        }

        /**
         * @return loginPort
         */
        public Integer getLoginPort() {
            return this.loginPort;
        }

        public static final class Builder {
            private Integer adbLoginPort; 
            private String loginHostname; 
            private Integer loginPort; 

            /**
             * AdbLoginPort.
             */
            public Builder adbLoginPort(Integer adbLoginPort) {
                this.adbLoginPort = adbLoginPort;
                return this;
            }

            /**
             * LoginHostname.
             */
            public Builder loginHostname(String loginHostname) {
                this.loginHostname = loginHostname;
                return this;
            }

            /**
             * LoginPort.
             */
            public Builder loginPort(Integer loginPort) {
                this.loginPort = loginPort;
                return this;
            }

            public LoginInfo build() {
                return new LoginInfo(this);
            } 

        } 

    }
}
