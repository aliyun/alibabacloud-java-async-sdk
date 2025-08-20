// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link CommonConfig} extends {@link TeaModel}
 *
 * <p>CommonConfig</p>
 */
public class CommonConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Idp")
    private Idp idp;

    private CommonConfig(Builder builder) {
        this.idp = builder.idp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CommonConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return idp
     */
    public Idp getIdp() {
        return this.idp;
    }

    public static final class Builder {
        private Idp idp; 

        private Builder() {
        } 

        private Builder(CommonConfig model) {
            this.idp = model.idp;
        } 

        /**
         * Idp.
         */
        public Builder idp(Idp idp) {
            this.idp = idp;
            return this;
        }

        public CommonConfig build() {
            return new CommonConfig(this);
        } 

    } 

    /**
     * 
     * {@link CommonConfig} extends {@link TeaModel}
     *
     * <p>CommonConfig</p>
     */
    public static class Dingtalk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventCallbackBase")
        private String eventCallbackBase;

        @com.aliyun.core.annotation.NameInMap("EventLabel")
        private String eventLabel;

        @com.aliyun.core.annotation.NameInMap("HomePage")
        private String homePage;

        @com.aliyun.core.annotation.NameInMap("LoginRedirect")
        private String loginRedirect;

        private Dingtalk(Builder builder) {
            this.eventCallbackBase = builder.eventCallbackBase;
            this.eventLabel = builder.eventLabel;
            this.homePage = builder.homePage;
            this.loginRedirect = builder.loginRedirect;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dingtalk create() {
            return builder().build();
        }

        /**
         * @return eventCallbackBase
         */
        public String getEventCallbackBase() {
            return this.eventCallbackBase;
        }

        /**
         * @return eventLabel
         */
        public String getEventLabel() {
            return this.eventLabel;
        }

        /**
         * @return homePage
         */
        public String getHomePage() {
            return this.homePage;
        }

        /**
         * @return loginRedirect
         */
        public String getLoginRedirect() {
            return this.loginRedirect;
        }

        public static final class Builder {
            private String eventCallbackBase; 
            private String eventLabel; 
            private String homePage; 
            private String loginRedirect; 

            private Builder() {
            } 

            private Builder(Dingtalk model) {
                this.eventCallbackBase = model.eventCallbackBase;
                this.eventLabel = model.eventLabel;
                this.homePage = model.homePage;
                this.loginRedirect = model.loginRedirect;
            } 

            /**
             * EventCallbackBase.
             */
            public Builder eventCallbackBase(String eventCallbackBase) {
                this.eventCallbackBase = eventCallbackBase;
                return this;
            }

            /**
             * EventLabel.
             */
            public Builder eventLabel(String eventLabel) {
                this.eventLabel = eventLabel;
                return this;
            }

            /**
             * HomePage.
             */
            public Builder homePage(String homePage) {
                this.homePage = homePage;
                return this;
            }

            /**
             * LoginRedirect.
             */
            public Builder loginRedirect(String loginRedirect) {
                this.loginRedirect = loginRedirect;
                return this;
            }

            public Dingtalk build() {
                return new Dingtalk(this);
            } 

        } 

    }
    /**
     * 
     * {@link CommonConfig} extends {@link TeaModel}
     *
     * <p>CommonConfig</p>
     */
    public static class Feishu extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventCallbackBase")
        private String eventCallbackBase;

        @com.aliyun.core.annotation.NameInMap("EventLabel")
        private String eventLabel;

        @com.aliyun.core.annotation.NameInMap("HomePage")
        private String homePage;

        @com.aliyun.core.annotation.NameInMap("LoginRedirect")
        private String loginRedirect;

        private Feishu(Builder builder) {
            this.eventCallbackBase = builder.eventCallbackBase;
            this.eventLabel = builder.eventLabel;
            this.homePage = builder.homePage;
            this.loginRedirect = builder.loginRedirect;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Feishu create() {
            return builder().build();
        }

        /**
         * @return eventCallbackBase
         */
        public String getEventCallbackBase() {
            return this.eventCallbackBase;
        }

        /**
         * @return eventLabel
         */
        public String getEventLabel() {
            return this.eventLabel;
        }

        /**
         * @return homePage
         */
        public String getHomePage() {
            return this.homePage;
        }

        /**
         * @return loginRedirect
         */
        public String getLoginRedirect() {
            return this.loginRedirect;
        }

        public static final class Builder {
            private String eventCallbackBase; 
            private String eventLabel; 
            private String homePage; 
            private String loginRedirect; 

            private Builder() {
            } 

            private Builder(Feishu model) {
                this.eventCallbackBase = model.eventCallbackBase;
                this.eventLabel = model.eventLabel;
                this.homePage = model.homePage;
                this.loginRedirect = model.loginRedirect;
            } 

            /**
             * EventCallbackBase.
             */
            public Builder eventCallbackBase(String eventCallbackBase) {
                this.eventCallbackBase = eventCallbackBase;
                return this;
            }

            /**
             * EventLabel.
             */
            public Builder eventLabel(String eventLabel) {
                this.eventLabel = eventLabel;
                return this;
            }

            /**
             * HomePage.
             */
            public Builder homePage(String homePage) {
                this.homePage = homePage;
                return this;
            }

            /**
             * LoginRedirect.
             */
            public Builder loginRedirect(String loginRedirect) {
                this.loginRedirect = loginRedirect;
                return this;
            }

            public Feishu build() {
                return new Feishu(this);
            } 

        } 

    }
    /**
     * 
     * {@link CommonConfig} extends {@link TeaModel}
     *
     * <p>CommonConfig</p>
     */
    public static class Idaas2 extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventCallbackBase")
        private String eventCallbackBase;

        @com.aliyun.core.annotation.NameInMap("EventLabel")
        private String eventLabel;

        private Idaas2(Builder builder) {
            this.eventCallbackBase = builder.eventCallbackBase;
            this.eventLabel = builder.eventLabel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Idaas2 create() {
            return builder().build();
        }

        /**
         * @return eventCallbackBase
         */
        public String getEventCallbackBase() {
            return this.eventCallbackBase;
        }

        /**
         * @return eventLabel
         */
        public String getEventLabel() {
            return this.eventLabel;
        }

        public static final class Builder {
            private String eventCallbackBase; 
            private String eventLabel; 

            private Builder() {
            } 

            private Builder(Idaas2 model) {
                this.eventCallbackBase = model.eventCallbackBase;
                this.eventLabel = model.eventLabel;
            } 

            /**
             * EventCallbackBase.
             */
            public Builder eventCallbackBase(String eventCallbackBase) {
                this.eventCallbackBase = eventCallbackBase;
                return this;
            }

            /**
             * EventLabel.
             */
            public Builder eventLabel(String eventLabel) {
                this.eventLabel = eventLabel;
                return this;
            }

            public Idaas2 build() {
                return new Idaas2(this);
            } 

        } 

    }
    /**
     * 
     * {@link CommonConfig} extends {@link TeaModel}
     *
     * <p>CommonConfig</p>
     */
    public static class Saml extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Acs")
        private String acs;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private String metadata;

        private Saml(Builder builder) {
            this.acs = builder.acs;
            this.metadata = builder.metadata;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Saml create() {
            return builder().build();
        }

        /**
         * @return acs
         */
        public String getAcs() {
            return this.acs;
        }

        /**
         * @return metadata
         */
        public String getMetadata() {
            return this.metadata;
        }

        public static final class Builder {
            private String acs; 
            private String metadata; 

            private Builder() {
            } 

            private Builder(Saml model) {
                this.acs = model.acs;
                this.metadata = model.metadata;
            } 

            /**
             * Acs.
             */
            public Builder acs(String acs) {
                this.acs = acs;
                return this;
            }

            /**
             * Metadata.
             */
            public Builder metadata(String metadata) {
                this.metadata = metadata;
                return this;
            }

            public Saml build() {
                return new Saml(this);
            } 

        } 

    }
    /**
     * 
     * {@link CommonConfig} extends {@link TeaModel}
     *
     * <p>CommonConfig</p>
     */
    public static class Idp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApOidcCallbackUrl")
        private String apOidcCallbackUrl;

        @com.aliyun.core.annotation.NameInMap("Dingtalk")
        private Dingtalk dingtalk;

        @com.aliyun.core.annotation.NameInMap("Feishu")
        private Feishu feishu;

        @com.aliyun.core.annotation.NameInMap("Idaas2")
        private Idaas2 idaas2;

        @com.aliyun.core.annotation.NameInMap("Saml")
        private Saml saml;

        private Idp(Builder builder) {
            this.apOidcCallbackUrl = builder.apOidcCallbackUrl;
            this.dingtalk = builder.dingtalk;
            this.feishu = builder.feishu;
            this.idaas2 = builder.idaas2;
            this.saml = builder.saml;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Idp create() {
            return builder().build();
        }

        /**
         * @return apOidcCallbackUrl
         */
        public String getApOidcCallbackUrl() {
            return this.apOidcCallbackUrl;
        }

        /**
         * @return dingtalk
         */
        public Dingtalk getDingtalk() {
            return this.dingtalk;
        }

        /**
         * @return feishu
         */
        public Feishu getFeishu() {
            return this.feishu;
        }

        /**
         * @return idaas2
         */
        public Idaas2 getIdaas2() {
            return this.idaas2;
        }

        /**
         * @return saml
         */
        public Saml getSaml() {
            return this.saml;
        }

        public static final class Builder {
            private String apOidcCallbackUrl; 
            private Dingtalk dingtalk; 
            private Feishu feishu; 
            private Idaas2 idaas2; 
            private Saml saml; 

            private Builder() {
            } 

            private Builder(Idp model) {
                this.apOidcCallbackUrl = model.apOidcCallbackUrl;
                this.dingtalk = model.dingtalk;
                this.feishu = model.feishu;
                this.idaas2 = model.idaas2;
                this.saml = model.saml;
            } 

            /**
             * ApOidcCallbackUrl.
             */
            public Builder apOidcCallbackUrl(String apOidcCallbackUrl) {
                this.apOidcCallbackUrl = apOidcCallbackUrl;
                return this;
            }

            /**
             * Dingtalk.
             */
            public Builder dingtalk(Dingtalk dingtalk) {
                this.dingtalk = dingtalk;
                return this;
            }

            /**
             * Feishu.
             */
            public Builder feishu(Feishu feishu) {
                this.feishu = feishu;
                return this;
            }

            /**
             * Idaas2.
             */
            public Builder idaas2(Idaas2 idaas2) {
                this.idaas2 = idaas2;
                return this;
            }

            /**
             * Saml.
             */
            public Builder saml(Saml saml) {
                this.saml = saml;
                return this;
            }

            public Idp build() {
                return new Idp(this);
            } 

        } 

    }
}
