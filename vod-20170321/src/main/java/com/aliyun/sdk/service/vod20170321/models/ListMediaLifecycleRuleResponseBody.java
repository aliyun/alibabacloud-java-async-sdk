// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link ListMediaLifecycleRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ListMediaLifecycleRuleResponseBody</p>
 */
public class ListMediaLifecycleRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleList")
    private java.util.List<RuleList> ruleList;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private ListMediaLifecycleRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.ruleList = builder.ruleList;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMediaLifecycleRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleList
     */
    public java.util.List<RuleList> getRuleList() {
        return this.ruleList;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<RuleList> ruleList; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListMediaLifecycleRuleResponseBody model) {
            this.requestId = model.requestId;
            this.ruleList = model.ruleList;
            this.total = model.total;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RuleList.
         */
        public Builder ruleList(java.util.List<RuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListMediaLifecycleRuleResponseBody build() {
            return new ListMediaLifecycleRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMediaLifecycleRuleResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaLifecycleRuleResponseBody</p>
     */
    public static class RuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("ModificationTime")
        private String modificationTime;

        @com.aliyun.core.annotation.NameInMap("RuleContent")
        private String ruleContent;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private RuleList(Builder builder) {
            this.appId = builder.appId;
            this.creationTime = builder.creationTime;
            this.modificationTime = builder.modificationTime;
            this.ruleContent = builder.ruleContent;
            this.ruleId = builder.ruleId;
            this.ruleType = builder.ruleType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleList create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return modificationTime
         */
        public String getModificationTime() {
            return this.modificationTime;
        }

        /**
         * @return ruleContent
         */
        public String getRuleContent() {
            return this.ruleContent;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String appId; 
            private String creationTime; 
            private String modificationTime; 
            private String ruleContent; 
            private String ruleId; 
            private String ruleType; 
            private String status; 

            private Builder() {
            } 

            private Builder(RuleList model) {
                this.appId = model.appId;
                this.creationTime = model.creationTime;
                this.modificationTime = model.modificationTime;
                this.ruleContent = model.ruleContent;
                this.ruleId = model.ruleId;
                this.ruleType = model.ruleType;
                this.status = model.status;
            } 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * ModificationTime.
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * RuleContent.
             */
            public Builder ruleContent(String ruleContent) {
                this.ruleContent = ruleContent;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleType.
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public RuleList build() {
                return new RuleList(this);
            } 

        } 

    }
}
