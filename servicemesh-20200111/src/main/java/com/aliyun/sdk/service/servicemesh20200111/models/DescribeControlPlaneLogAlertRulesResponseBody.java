// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeControlPlaneLogAlertRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeControlPlaneLogAlertRulesResponseBody</p>
 */
public class DescribeControlPlaneLogAlertRulesResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeControlPlaneLogAlertRulesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeControlPlaneLogAlertRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeControlPlaneLogAlertRulesResponseBody build() {
            return new DescribeControlPlaneLogAlertRulesResponseBody(this);
        } 

    } 

    public static class Info extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Title")
        private String title;

        private Info(Builder builder) {
            this.description = builder.description;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Info create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String description; 
            private String title; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Info build() {
                return new Info(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ActionPolicyId")
        private String actionPolicyId;

        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("Info")
        private Info info;

        @NameInMap("RuleId")
        private String ruleId;

        private Data(Builder builder) {
            this.actionPolicyId = builder.actionPolicyId;
            this.enabled = builder.enabled;
            this.info = builder.info;
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return actionPolicyId
         */
        public String getActionPolicyId() {
            return this.actionPolicyId;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return info
         */
        public Info getInfo() {
            return this.info;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        public static final class Builder {
            private String actionPolicyId; 
            private Boolean enabled; 
            private Info info; 
            private String ruleId; 

            /**
             * ActionPolicyId.
             */
            public Builder actionPolicyId(String actionPolicyId) {
                this.actionPolicyId = actionPolicyId;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * Info.
             */
            public Builder info(Info info) {
                this.info = info;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
