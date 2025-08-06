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
 * {@link GetMediaLifecycleRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetMediaLifecycleRuleResponseBody</p>
 */
public class GetMediaLifecycleRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ForbiddenRuleIds")
    private java.util.List<String> forbiddenRuleIds;

    @com.aliyun.core.annotation.NameInMap("NonExistRuleIds")
    private java.util.List<String> nonExistRuleIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleList")
    private java.util.List<RuleList> ruleList;

    private GetMediaLifecycleRuleResponseBody(Builder builder) {
        this.forbiddenRuleIds = builder.forbiddenRuleIds;
        this.nonExistRuleIds = builder.nonExistRuleIds;
        this.requestId = builder.requestId;
        this.ruleList = builder.ruleList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaLifecycleRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forbiddenRuleIds
     */
    public java.util.List<String> getForbiddenRuleIds() {
        return this.forbiddenRuleIds;
    }

    /**
     * @return nonExistRuleIds
     */
    public java.util.List<String> getNonExistRuleIds() {
        return this.nonExistRuleIds;
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

    public static final class Builder {
        private java.util.List<String> forbiddenRuleIds; 
        private java.util.List<String> nonExistRuleIds; 
        private String requestId; 
        private java.util.List<RuleList> ruleList; 

        private Builder() {
        } 

        private Builder(GetMediaLifecycleRuleResponseBody model) {
            this.forbiddenRuleIds = model.forbiddenRuleIds;
            this.nonExistRuleIds = model.nonExistRuleIds;
            this.requestId = model.requestId;
            this.ruleList = model.ruleList;
        } 

        /**
         * ForbiddenRuleIds.
         */
        public Builder forbiddenRuleIds(java.util.List<String> forbiddenRuleIds) {
            this.forbiddenRuleIds = forbiddenRuleIds;
            return this;
        }

        /**
         * NonExistRuleIds.
         */
        public Builder nonExistRuleIds(java.util.List<String> nonExistRuleIds) {
            this.nonExistRuleIds = nonExistRuleIds;
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
         * RuleList.
         */
        public Builder ruleList(java.util.List<RuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }

        public GetMediaLifecycleRuleResponseBody build() {
            return new GetMediaLifecycleRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMediaLifecycleRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaLifecycleRuleResponseBody</p>
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
