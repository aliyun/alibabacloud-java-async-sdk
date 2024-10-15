// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CorpAuthLinkInfoQueryResponseBody} extends {@link TeaModel}
 *
 * <p>CorpAuthLinkInfoQueryResponseBody</p>
 */
public class CorpAuthLinkInfoQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private CorpAuthLinkInfoQueryResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CorpAuthLinkInfoQueryResponseBody create() {
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
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Module module; 
        private String requestId; 
        private String traceId; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * module.
         */
        public Builder module(Module module) {
            this.module = module;
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
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public CorpAuthLinkInfoQueryResponseBody build() {
            return new CorpAuthLinkInfoQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CorpAuthLinkInfoQueryResponseBody} extends {@link TeaModel}
     *
     * <p>CorpAuthLinkInfoQueryResponseBody</p>
     */
    public static class LinkCorps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("corp_name")
        private String corpName;

        @com.aliyun.core.annotation.NameInMap("open_corp_id")
        private String openCorpId;

        @com.aliyun.core.annotation.NameInMap("true_corp_id")
        private String trueCorpId;

        private LinkCorps(Builder builder) {
            this.corpName = builder.corpName;
            this.openCorpId = builder.openCorpId;
            this.trueCorpId = builder.trueCorpId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LinkCorps create() {
            return builder().build();
        }

        /**
         * @return corpName
         */
        public String getCorpName() {
            return this.corpName;
        }

        /**
         * @return openCorpId
         */
        public String getOpenCorpId() {
            return this.openCorpId;
        }

        /**
         * @return trueCorpId
         */
        public String getTrueCorpId() {
            return this.trueCorpId;
        }

        public static final class Builder {
            private String corpName; 
            private String openCorpId; 
            private String trueCorpId; 

            /**
             * corp_name.
             */
            public Builder corpName(String corpName) {
                this.corpName = corpName;
                return this;
            }

            /**
             * open_corp_id.
             */
            public Builder openCorpId(String openCorpId) {
                this.openCorpId = openCorpId;
                return this;
            }

            /**
             * true_corp_id.
             */
            public Builder trueCorpId(String trueCorpId) {
                this.trueCorpId = trueCorpId;
                return this;
            }

            public LinkCorps build() {
                return new LinkCorps(this);
            } 

        } 

    }
    /**
     * 
     * {@link CorpAuthLinkInfoQueryResponseBody} extends {@link TeaModel}
     *
     * <p>CorpAuthLinkInfoQueryResponseBody</p>
     */
    public static class OrgCorp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("corp_name")
        private String corpName;

        @com.aliyun.core.annotation.NameInMap("open_corp_id")
        private String openCorpId;

        @com.aliyun.core.annotation.NameInMap("true_corp_id")
        private String trueCorpId;

        private OrgCorp(Builder builder) {
            this.corpName = builder.corpName;
            this.openCorpId = builder.openCorpId;
            this.trueCorpId = builder.trueCorpId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrgCorp create() {
            return builder().build();
        }

        /**
         * @return corpName
         */
        public String getCorpName() {
            return this.corpName;
        }

        /**
         * @return openCorpId
         */
        public String getOpenCorpId() {
            return this.openCorpId;
        }

        /**
         * @return trueCorpId
         */
        public String getTrueCorpId() {
            return this.trueCorpId;
        }

        public static final class Builder {
            private String corpName; 
            private String openCorpId; 
            private String trueCorpId; 

            /**
             * corp_name.
             */
            public Builder corpName(String corpName) {
                this.corpName = corpName;
                return this;
            }

            /**
             * open_corp_id.
             */
            public Builder openCorpId(String openCorpId) {
                this.openCorpId = openCorpId;
                return this;
            }

            /**
             * true_corp_id.
             */
            public Builder trueCorpId(String trueCorpId) {
                this.trueCorpId = trueCorpId;
                return this;
            }

            public OrgCorp build() {
                return new OrgCorp(this);
            } 

        } 

    }
    /**
     * 
     * {@link CorpAuthLinkInfoQueryResponseBody} extends {@link TeaModel}
     *
     * <p>CorpAuthLinkInfoQueryResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("link_corps")
        private java.util.List < LinkCorps> linkCorps;

        @com.aliyun.core.annotation.NameInMap("org_corp")
        private OrgCorp orgCorp;

        private Module(Builder builder) {
            this.linkCorps = builder.linkCorps;
            this.orgCorp = builder.orgCorp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return linkCorps
         */
        public java.util.List < LinkCorps> getLinkCorps() {
            return this.linkCorps;
        }

        /**
         * @return orgCorp
         */
        public OrgCorp getOrgCorp() {
            return this.orgCorp;
        }

        public static final class Builder {
            private java.util.List < LinkCorps> linkCorps; 
            private OrgCorp orgCorp; 

            /**
             * link_corps.
             */
            public Builder linkCorps(java.util.List < LinkCorps> linkCorps) {
                this.linkCorps = linkCorps;
                return this;
            }

            /**
             * org_corp.
             */
            public Builder orgCorp(OrgCorp orgCorp) {
                this.orgCorp = orgCorp;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
