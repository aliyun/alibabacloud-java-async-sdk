// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appflow20230904.models;

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
 * {@link ListFlowsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFlowsResponseBody</p>
 */
public class ListFlowsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Flows")
    private java.util.List<Flows> flows;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListFlowsResponseBody(Builder builder) {
        this.flows = builder.flows;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return flows
     */
    public java.util.List<Flows> getFlows() {
        return this.flows;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Flows> flows; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListFlowsResponseBody model) {
            this.flows = model.flows;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Flows.
         */
        public Builder flows(java.util.List<Flows> flows) {
            this.flows = flows;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>02FB9782-5390-5DF9-A1DA-9F2DE2FA1E3D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListFlowsResponseBody build() {
            return new ListFlowsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFlowsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFlowsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFlowsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFlowsResponseBody</p>
     */
    public static class Flows extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("FlowDesc")
        private String flowDesc;

        @com.aliyun.core.annotation.NameInMap("FlowId")
        private String flowId;

        @com.aliyun.core.annotation.NameInMap("FlowName")
        private String flowName;

        @com.aliyun.core.annotation.NameInMap("FlowTemplate")
        private String flowTemplate;

        @com.aliyun.core.annotation.NameInMap("FlowVersion")
        private String flowVersion;

        @com.aliyun.core.annotation.NameInMap("FlowVersionStatus")
        private String flowVersionStatus;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("ReleasedVersion")
        private Integer releasedVersion;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("WebhookUrl")
        private String webhookUrl;

        private Flows(Builder builder) {
            this.enabled = builder.enabled;
            this.flowDesc = builder.flowDesc;
            this.flowId = builder.flowId;
            this.flowName = builder.flowName;
            this.flowTemplate = builder.flowTemplate;
            this.flowVersion = builder.flowVersion;
            this.flowVersionStatus = builder.flowVersionStatus;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.releasedVersion = builder.releasedVersion;
            this.tags = builder.tags;
            this.webhookUrl = builder.webhookUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Flows create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return flowDesc
         */
        public String getFlowDesc() {
            return this.flowDesc;
        }

        /**
         * @return flowId
         */
        public String getFlowId() {
            return this.flowId;
        }

        /**
         * @return flowName
         */
        public String getFlowName() {
            return this.flowName;
        }

        /**
         * @return flowTemplate
         */
        public String getFlowTemplate() {
            return this.flowTemplate;
        }

        /**
         * @return flowVersion
         */
        public String getFlowVersion() {
            return this.flowVersion;
        }

        /**
         * @return flowVersionStatus
         */
        public String getFlowVersionStatus() {
            return this.flowVersionStatus;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return releasedVersion
         */
        public Integer getReleasedVersion() {
            return this.releasedVersion;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return webhookUrl
         */
        public String getWebhookUrl() {
            return this.webhookUrl;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String flowDesc; 
            private String flowId; 
            private String flowName; 
            private String flowTemplate; 
            private String flowVersion; 
            private String flowVersionStatus; 
            private String gmtCreate; 
            private String gmtModified; 
            private Integer releasedVersion; 
            private java.util.List<Tags> tags; 
            private String webhookUrl; 

            private Builder() {
            } 

            private Builder(Flows model) {
                this.enabled = model.enabled;
                this.flowDesc = model.flowDesc;
                this.flowId = model.flowId;
                this.flowName = model.flowName;
                this.flowTemplate = model.flowTemplate;
                this.flowVersion = model.flowVersion;
                this.flowVersionStatus = model.flowVersionStatus;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.releasedVersion = model.releasedVersion;
                this.tags = model.tags;
                this.webhookUrl = model.webhookUrl;
            } 

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * FlowDesc.
             */
            public Builder flowDesc(String flowDesc) {
                this.flowDesc = flowDesc;
                return this;
            }

            /**
             * FlowId.
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * FlowName.
             */
            public Builder flowName(String flowName) {
                this.flowName = flowName;
                return this;
            }

            /**
             * FlowTemplate.
             */
            public Builder flowTemplate(String flowTemplate) {
                this.flowTemplate = flowTemplate;
                return this;
            }

            /**
             * FlowVersion.
             */
            public Builder flowVersion(String flowVersion) {
                this.flowVersion = flowVersion;
                return this;
            }

            /**
             * FlowVersionStatus.
             */
            public Builder flowVersionStatus(String flowVersionStatus) {
                this.flowVersionStatus = flowVersionStatus;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * ReleasedVersion.
             */
            public Builder releasedVersion(Integer releasedVersion) {
                this.releasedVersion = releasedVersion;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * WebhookUrl.
             */
            public Builder webhookUrl(String webhookUrl) {
                this.webhookUrl = webhookUrl;
                return this;
            }

            public Flows build() {
                return new Flows(this);
            } 

        } 

    }
}
