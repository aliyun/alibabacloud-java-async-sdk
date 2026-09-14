// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link GetContextStoreResponseBody} extends {@link TeaModel}
 *
 * <p>GetContextStoreResponseBody</p>
 */
public class GetContextStoreResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    @com.aliyun.core.annotation.NameInMap("config")
    private Config config;

    @com.aliyun.core.annotation.NameInMap("contextStoreName")
    private String contextStoreName;

    @com.aliyun.core.annotation.NameInMap("contextType")
    private String contextType;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private String updateTime;

    private GetContextStoreResponseBody(Builder builder) {
        this.agentSpace = builder.agentSpace;
        this.config = builder.config;
        this.contextStoreName = builder.contextStoreName;
        this.contextType = builder.contextType;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetContextStoreResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentSpace
     */
    public String getAgentSpace() {
        return this.agentSpace;
    }

    /**
     * @return config
     */
    public Config getConfig() {
        return this.config;
    }

    /**
     * @return contextStoreName
     */
    public String getContextStoreName() {
        return this.contextStoreName;
    }

    /**
     * @return contextType
     */
    public String getContextType() {
        return this.contextType;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String agentSpace; 
        private Config config; 
        private String contextStoreName; 
        private String contextType; 
        private String createTime; 
        private String description; 
        private String regionId; 
        private String requestId; 
        private String status; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(GetContextStoreResponseBody model) {
            this.agentSpace = model.agentSpace;
            this.config = model.config;
            this.contextStoreName = model.contextStoreName;
            this.contextType = model.contextType;
            this.createTime = model.createTime;
            this.description = model.description;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.status = model.status;
            this.updateTime = model.updateTime;
        } 

        /**
         * <p>The name of the AgentSpace to which the context store belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-space</p>
         */
        public Builder agentSpace(String agentSpace) {
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * <p>The configuration of the context store.</p>
         */
        public Builder config(Config config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The context store name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-context-store</p>
         */
        public Builder contextStoreName(String contextStoreName) {
            this.contextStoreName = contextStoreName;
            return this;
        }

        /**
         * <p>The type of the context store, such as experience or memory.</p>
         * 
         * <strong>example:</strong>
         * <p>experience</p>
         */
        public Builder contextType(String contextType) {
            this.contextType = contextType;
            return this;
        }

        /**
         * <p>The time when the context store was created, in ISO 8601 UTC format.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The description of the context store.</p>
         * 
         * <strong>example:</strong>
         * <p>我的上下文库</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The region ID of the context store.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the context store. Valid values:</p>
         * <ul>
         * <li>ACTIVE</li>
         * <li>INITIALIZING</li>
         * <li>FAILED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The time when the context store was last updated, in ISO 8601 UTC format.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-02T00:00:00Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetContextStoreResponseBody build() {
            return new GetContextStoreResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetContextStoreResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextStoreResponseBody</p>
     */
    public static class Source extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentSpace")
        private String agentSpace;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        private Source(Builder builder) {
            this.agentSpace = builder.agentSpace;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Source create() {
            return builder().build();
        }

        /**
         * @return agentSpace
         */
        public String getAgentSpace() {
            return this.agentSpace;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String agentSpace; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(Source model) {
                this.agentSpace = model.agentSpace;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The AgentSpace where the trace data source resides. This is the same as the AgentSpace specified during creation.</p>
             * 
             * <strong>example:</strong>
             * <p>my-agent-space</p>
             */
            public Builder agentSpace(String agentSpace) {
                this.agentSpace = agentSpace;
                return this;
            }

            /**
             * <p>The start time for data backfill, in ISO 8601 UTC format.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01T00:00:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Source build() {
                return new Source(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetContextStoreResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextStoreResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("metadataField")
        private java.util.Map<String, String> metadataField;

        @com.aliyun.core.annotation.NameInMap("miningInterval")
        private String miningInterval;

        @com.aliyun.core.annotation.NameInMap("serviceNames")
        private java.util.List<String> serviceNames;

        @com.aliyun.core.annotation.NameInMap("source")
        private Source source;

        private Config(Builder builder) {
            this.metadataField = builder.metadataField;
            this.miningInterval = builder.miningInterval;
            this.serviceNames = builder.serviceNames;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return metadataField
         */
        public java.util.Map<String, String> getMetadataField() {
            return this.metadataField;
        }

        /**
         * @return miningInterval
         */
        public String getMiningInterval() {
            return this.miningInterval;
        }

        /**
         * @return serviceNames
         */
        public java.util.List<String> getServiceNames() {
            return this.serviceNames;
        }

        /**
         * @return source
         */
        public Source getSource() {
            return this.source;
        }

        public static final class Builder {
            private java.util.Map<String, String> metadataField; 
            private String miningInterval; 
            private java.util.List<String> serviceNames; 
            private Source source; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.metadataField = model.metadataField;
                this.miningInterval = model.miningInterval;
                this.serviceNames = model.serviceNames;
                this.source = model.source;
            } 

            /**
             * <p>The metadata field mapping. The key is the business field and the value is the storage field.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;userId&quot;:&quot;user_id&quot;,&quot;sessionId&quot;:&quot;session_id&quot;}</p>
             */
            public Builder metadataField(java.util.Map<String, String> metadataField) {
                this.metadataField = metadataField;
                return this;
            }

            /**
             * <p>The experience mining interval. Valid values: 1h, 6h, 12h, and 1d. Default value: 1d.</p>
             * 
             * <strong>example:</strong>
             * <p>1d</p>
             */
            public Builder miningInterval(String miningInterval) {
                this.miningInterval = miningInterval;
                return this;
            }

            /**
             * <p>The list of service names. This works together with source.agentSpace to locate the trace data source. This value cannot be changed in the current version.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;order-service&quot;,&quot;payment-service&quot;]</p>
             */
            public Builder serviceNames(java.util.List<String> serviceNames) {
                this.serviceNames = serviceNames;
                return this;
            }

            /**
             * <p>The datasource config passed in by the user. This serves only as the root identifier of the data source.</p>
             */
            public Builder source(Source source) {
                this.source = source;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
}
