// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ListMediaLiveInputsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMediaLiveInputsResponseBody</p>
 */
public class ListMediaLiveInputsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Inputs")
    private java.util.List<Inputs> inputs;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListMediaLiveInputsResponseBody(Builder builder) {
        this.inputs = builder.inputs;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMediaLiveInputsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return inputs
     */
    public java.util.List<Inputs> getInputs() {
        return this.inputs;
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
        private java.util.List<Inputs> inputs; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListMediaLiveInputsResponseBody model) {
            this.inputs = model.inputs;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The inputs.</p>
         */
        public Builder inputs(java.util.List<Inputs> inputs) {
            this.inputs = inputs;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListMediaLiveInputsResponseBody build() {
            return new ListMediaLiveInputsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMediaLiveInputsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaLiveInputsResponseBody</p>
     */
    public static class InputInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestHost")
        private String destHost;

        @com.aliyun.core.annotation.NameInMap("FlowId")
        private String flowId;

        @com.aliyun.core.annotation.NameInMap("FlowOutputName")
        private String flowOutputName;

        @com.aliyun.core.annotation.NameInMap("MonitorUrl")
        private String monitorUrl;

        @com.aliyun.core.annotation.NameInMap("SourceUrl")
        private String sourceUrl;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        private InputInfos(Builder builder) {
            this.destHost = builder.destHost;
            this.flowId = builder.flowId;
            this.flowOutputName = builder.flowOutputName;
            this.monitorUrl = builder.monitorUrl;
            this.sourceUrl = builder.sourceUrl;
            this.streamName = builder.streamName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputInfos create() {
            return builder().build();
        }

        /**
         * @return destHost
         */
        public String getDestHost() {
            return this.destHost;
        }

        /**
         * @return flowId
         */
        public String getFlowId() {
            return this.flowId;
        }

        /**
         * @return flowOutputName
         */
        public String getFlowOutputName() {
            return this.flowOutputName;
        }

        /**
         * @return monitorUrl
         */
        public String getMonitorUrl() {
            return this.monitorUrl;
        }

        /**
         * @return sourceUrl
         */
        public String getSourceUrl() {
            return this.sourceUrl;
        }

        /**
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        public static final class Builder {
            private String destHost; 
            private String flowId; 
            private String flowOutputName; 
            private String monitorUrl; 
            private String sourceUrl; 
            private String streamName; 

            private Builder() {
            } 

            private Builder(InputInfos model) {
                this.destHost = model.destHost;
                this.flowId = model.flowId;
                this.flowOutputName = model.flowOutputName;
                this.monitorUrl = model.monitorUrl;
                this.sourceUrl = model.sourceUrl;
                this.streamName = model.streamName;
            } 

            /**
             * <p>The endpoint that the stream is pushed to. This parameter is returned for PUSH inputs.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://domain/app/stream</p>
             */
            public Builder destHost(String destHost) {
                this.destHost = destHost;
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
             * FlowOutputName.
             */
            public Builder flowOutputName(String flowOutputName) {
                this.flowOutputName = flowOutputName;
                return this;
            }

            /**
             * <p>The URL for input monitoring.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://domain/app/stream_for_monitor</p>
             */
            public Builder monitorUrl(String monitorUrl) {
                this.monitorUrl = monitorUrl;
                return this;
            }

            /**
             * <p>The source URL where the stream is pulled from. This parameter is returned for PULL inputs.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://domain/app/stream</p>
             */
            public Builder sourceUrl(String sourceUrl) {
                this.sourceUrl = sourceUrl;
                return this;
            }

            /**
             * <p>The name of the pushed stream. This parameter is returned for PUSH inputs.</p>
             * 
             * <strong>example:</strong>
             * <p>mystream</p>
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            public InputInfos build() {
                return new InputInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMediaLiveInputsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaLiveInputsResponseBody</p>
     */
    public static class Inputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelIds")
        private java.util.List<String> channelIds;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("InputId")
        private String inputId;

        @com.aliyun.core.annotation.NameInMap("InputInfos")
        private java.util.List<InputInfos> inputInfos;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
        private java.util.List<String> securityGroupIds;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Inputs(Builder builder) {
            this.channelIds = builder.channelIds;
            this.createTime = builder.createTime;
            this.inputId = builder.inputId;
            this.inputInfos = builder.inputInfos;
            this.name = builder.name;
            this.securityGroupIds = builder.securityGroupIds;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Inputs create() {
            return builder().build();
        }

        /**
         * @return channelIds
         */
        public java.util.List<String> getChannelIds() {
            return this.channelIds;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return inputId
         */
        public String getInputId() {
            return this.inputId;
        }

        /**
         * @return inputInfos
         */
        public java.util.List<InputInfos> getInputInfos() {
            return this.inputInfos;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return securityGroupIds
         */
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<String> channelIds; 
            private String createTime; 
            private String inputId; 
            private java.util.List<InputInfos> inputInfos; 
            private String name; 
            private java.util.List<String> securityGroupIds; 
            private String type; 

            private Builder() {
            } 

            private Builder(Inputs model) {
                this.channelIds = model.channelIds;
                this.createTime = model.createTime;
                this.inputId = model.inputId;
                this.inputInfos = model.inputInfos;
                this.name = model.name;
                this.securityGroupIds = model.securityGroupIds;
                this.type = model.type;
            } 

            /**
             * <p>The IDs of the channels associated with the input.</p>
             */
            public Builder channelIds(java.util.List<String> channelIds) {
                this.channelIds = channelIds;
                return this;
            }

            /**
             * <p>The time when the input was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-03T06:56:42Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the input.</p>
             * 
             * <strong>example:</strong>
             * <p>SEGK5KA6KYKAWQQH</p>
             */
            public Builder inputId(String inputId) {
                this.inputId = inputId;
                return this;
            }

            /**
             * <p>The input configurations.</p>
             */
            public Builder inputInfos(java.util.List<InputInfos> inputInfos) {
                this.inputInfos = inputInfos;
                return this;
            }

            /**
             * <p>The name of the input.</p>
             * 
             * <strong>example:</strong>
             * <p>myinput</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The IDs of the security groups associated with the input.</p>
             */
            public Builder securityGroupIds(java.util.List<String> securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * <p>The input type.</p>
             * 
             * <strong>example:</strong>
             * <p>RTMP_PUSH</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Inputs build() {
                return new Inputs(this);
            } 

        } 

    }
}
