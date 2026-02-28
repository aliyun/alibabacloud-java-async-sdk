// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs_workbench20220220.models;

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
 * {@link LoginInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>LoginInstanceResponseBody</p>
 */
public class LoginInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Root")
    private Root root;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private LoginInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.root = builder.root;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LoginInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return root
     */
    public Root getRoot() {
        return this.root;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Root root; 
        private String success; 

        private Builder() {
        } 

        private Builder(LoginInstanceResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.root = model.root;
            this.success = model.success;
        } 

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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>abc-123</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Root.
         */
        public Builder root(Root root) {
            this.root = root;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public LoginInstanceResponseBody build() {
            return new LoginInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link LoginInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>LoginInstanceResponseBody</p>
     */
    public static class DisposableAccount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LoginFormActionUrl")
        private String loginFormActionUrl;

        @com.aliyun.core.annotation.NameInMap("LoginUrl")
        private String loginUrl;

        private DisposableAccount(Builder builder) {
            this.loginFormActionUrl = builder.loginFormActionUrl;
            this.loginUrl = builder.loginUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DisposableAccount create() {
            return builder().build();
        }

        /**
         * @return loginFormActionUrl
         */
        public String getLoginFormActionUrl() {
            return this.loginFormActionUrl;
        }

        /**
         * @return loginUrl
         */
        public String getLoginUrl() {
            return this.loginUrl;
        }

        public static final class Builder {
            private String loginFormActionUrl; 
            private String loginUrl; 

            private Builder() {
            } 

            private Builder(DisposableAccount model) {
                this.loginFormActionUrl = model.loginFormActionUrl;
                this.loginUrl = model.loginUrl;
            } 

            /**
             * LoginFormActionUrl.
             */
            public Builder loginFormActionUrl(String loginFormActionUrl) {
                this.loginFormActionUrl = loginFormActionUrl;
                return this;
            }

            /**
             * LoginUrl.
             */
            public Builder loginUrl(String loginUrl) {
                this.loginUrl = loginUrl;
                return this;
            }

            public DisposableAccount build() {
                return new DisposableAccount(this);
            } 

        } 

    }
    /**
     * 
     * {@link LoginInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>LoginInstanceResponseBody</p>
     */
    public static class InstanceLoginView extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultViewUrl")
        private String defaultViewUrl;

        private InstanceLoginView(Builder builder) {
            this.defaultViewUrl = builder.defaultViewUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceLoginView create() {
            return builder().build();
        }

        /**
         * @return defaultViewUrl
         */
        public String getDefaultViewUrl() {
            return this.defaultViewUrl;
        }

        public static final class Builder {
            private String defaultViewUrl; 

            private Builder() {
            } 

            private Builder(InstanceLoginView model) {
                this.defaultViewUrl = model.defaultViewUrl;
            } 

            /**
             * DefaultViewUrl.
             */
            public Builder defaultViewUrl(String defaultViewUrl) {
                this.defaultViewUrl = defaultViewUrl;
                return this;
            }

            public InstanceLoginView build() {
                return new InstanceLoginView(this);
            } 

        } 

    }
    /**
     * 
     * {@link LoginInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>LoginInstanceResponseBody</p>
     */
    public static class InstanceLoginInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceLoginToken")
        private String instanceLoginToken;

        @com.aliyun.core.annotation.NameInMap("InstanceLoginView")
        private InstanceLoginView instanceLoginView;

        @com.aliyun.core.annotation.NameInMap("LoginSuccess")
        private Boolean loginSuccess;

        private InstanceLoginInfoList(Builder builder) {
            this.instanceId = builder.instanceId;
            this.instanceLoginToken = builder.instanceLoginToken;
            this.instanceLoginView = builder.instanceLoginView;
            this.loginSuccess = builder.loginSuccess;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceLoginInfoList create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceLoginToken
         */
        public String getInstanceLoginToken() {
            return this.instanceLoginToken;
        }

        /**
         * @return instanceLoginView
         */
        public InstanceLoginView getInstanceLoginView() {
            return this.instanceLoginView;
        }

        /**
         * @return loginSuccess
         */
        public Boolean getLoginSuccess() {
            return this.loginSuccess;
        }

        public static final class Builder {
            private String instanceId; 
            private String instanceLoginToken; 
            private InstanceLoginView instanceLoginView; 
            private Boolean loginSuccess; 

            private Builder() {
            } 

            private Builder(InstanceLoginInfoList model) {
                this.instanceId = model.instanceId;
                this.instanceLoginToken = model.instanceLoginToken;
                this.instanceLoginView = model.instanceLoginView;
                this.loginSuccess = model.loginSuccess;
            } 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceLoginToken.
             */
            public Builder instanceLoginToken(String instanceLoginToken) {
                this.instanceLoginToken = instanceLoginToken;
                return this;
            }

            /**
             * InstanceLoginView.
             */
            public Builder instanceLoginView(InstanceLoginView instanceLoginView) {
                this.instanceLoginView = instanceLoginView;
                return this;
            }

            /**
             * LoginSuccess.
             */
            public Builder loginSuccess(Boolean loginSuccess) {
                this.loginSuccess = loginSuccess;
                return this;
            }

            public InstanceLoginInfoList build() {
                return new InstanceLoginInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link LoginInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>LoginInstanceResponseBody</p>
     */
    public static class SessionControl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaseUrl")
        private String baseUrl;

        private SessionControl(Builder builder) {
            this.baseUrl = builder.baseUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SessionControl create() {
            return builder().build();
        }

        /**
         * @return baseUrl
         */
        public String getBaseUrl() {
            return this.baseUrl;
        }

        public static final class Builder {
            private String baseUrl; 

            private Builder() {
            } 

            private Builder(SessionControl model) {
                this.baseUrl = model.baseUrl;
            } 

            /**
             * BaseUrl.
             */
            public Builder baseUrl(String baseUrl) {
                this.baseUrl = baseUrl;
                return this;
            }

            public SessionControl build() {
                return new SessionControl(this);
            } 

        } 

    }
    /**
     * 
     * {@link LoginInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>LoginInstanceResponseBody</p>
     */
    public static class Root extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisposableAccount")
        private DisposableAccount disposableAccount;

        @com.aliyun.core.annotation.NameInMap("InstanceLoginInfoList")
        private java.util.List<InstanceLoginInfoList> instanceLoginInfoList;

        @com.aliyun.core.annotation.NameInMap("SessionControl")
        private SessionControl sessionControl;

        private Root(Builder builder) {
            this.disposableAccount = builder.disposableAccount;
            this.instanceLoginInfoList = builder.instanceLoginInfoList;
            this.sessionControl = builder.sessionControl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Root create() {
            return builder().build();
        }

        /**
         * @return disposableAccount
         */
        public DisposableAccount getDisposableAccount() {
            return this.disposableAccount;
        }

        /**
         * @return instanceLoginInfoList
         */
        public java.util.List<InstanceLoginInfoList> getInstanceLoginInfoList() {
            return this.instanceLoginInfoList;
        }

        /**
         * @return sessionControl
         */
        public SessionControl getSessionControl() {
            return this.sessionControl;
        }

        public static final class Builder {
            private DisposableAccount disposableAccount; 
            private java.util.List<InstanceLoginInfoList> instanceLoginInfoList; 
            private SessionControl sessionControl; 

            private Builder() {
            } 

            private Builder(Root model) {
                this.disposableAccount = model.disposableAccount;
                this.instanceLoginInfoList = model.instanceLoginInfoList;
                this.sessionControl = model.sessionControl;
            } 

            /**
             * DisposableAccount.
             */
            public Builder disposableAccount(DisposableAccount disposableAccount) {
                this.disposableAccount = disposableAccount;
                return this;
            }

            /**
             * InstanceLoginInfoList.
             */
            public Builder instanceLoginInfoList(java.util.List<InstanceLoginInfoList> instanceLoginInfoList) {
                this.instanceLoginInfoList = instanceLoginInfoList;
                return this;
            }

            /**
             * SessionControl.
             */
            public Builder sessionControl(SessionControl sessionControl) {
                this.sessionControl = sessionControl;
                return this;
            }

            public Root build() {
                return new Root(this);
            } 

        } 

    }
}
