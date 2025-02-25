// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListNodesResponseBody} extends {@link TeaModel}
 *
 * <p>ListNodesResponseBody</p>
 */
public class ListNodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Headers")
    private Headers headers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

    private ListNodesResponseBody(Builder builder) {
        this.headers = builder.headers;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodesResponseBody create() {
        return builder().build();
    }

    /**
     * @return headers
     */
    public Headers getHeaders() {
        return this.headers;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private Headers headers; 
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * <p>The header of the response.</p>
         */
        public Builder headers(Headers headers) {
            this.headers = headers;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E1FD7642-7C40-4FF2-9C0F-21F1A1746F70</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListNodesResponseBody build() {
            return new ListNodesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodesResponseBody</p>
     */
    public static class Headers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X-Total-Count")
        private Integer xTotalCount;

        private Headers(Builder builder) {
            this.xTotalCount = builder.xTotalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Headers create() {
            return builder().build();
        }

        /**
         * @return xTotalCount
         */
        public Integer getXTotalCount() {
            return this.xTotalCount;
        }

        public static final class Builder {
            private Integer xTotalCount; 

            /**
             * <p>The number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder xTotalCount(Integer xTotalCount) {
                this.xTotalCount = xTotalCount;
                return this;
            }

            public Headers build() {
                return new Headers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodesResponseBody</p>
     */
    public static class IpAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("ipType")
        private String ipType;

        private IpAddress(Builder builder) {
            this.host = builder.host;
            this.ipType = builder.ipType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpAddress create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return ipType
         */
        public String getIpType() {
            return this.ipType;
        }

        public static final class Builder {
            private String host; 
            private String ipType; 

            /**
             * <p>The IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.xx.xx</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The type of the IP address. Valid values:</p>
             * <ul>
             * <li>public: public IP address</li>
             * <li>private: private IP address</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>public</p>
             */
            public Builder ipType(String ipType) {
                this.ipType = ipType;
                return this;
            }

            public IpAddress build() {
                return new IpAddress(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("tagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>xyz</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodesResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentStatus")
        private String agentStatus;

        @com.aliyun.core.annotation.NameInMap("cloudAssistantStatus")
        private String cloudAssistantStatus;

        @com.aliyun.core.annotation.NameInMap("ecsInstanceId")
        private String ecsInstanceId;

        @com.aliyun.core.annotation.NameInMap("ecsInstanceName")
        private String ecsInstanceName;

        @com.aliyun.core.annotation.NameInMap("ipAddress")
        private java.util.List < IpAddress> ipAddress;

        @com.aliyun.core.annotation.NameInMap("osType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List < Tags> tags;

        private Result(Builder builder) {
            this.agentStatus = builder.agentStatus;
            this.cloudAssistantStatus = builder.cloudAssistantStatus;
            this.ecsInstanceId = builder.ecsInstanceId;
            this.ecsInstanceName = builder.ecsInstanceName;
            this.ipAddress = builder.ipAddress;
            this.osType = builder.osType;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return agentStatus
         */
        public String getAgentStatus() {
            return this.agentStatus;
        }

        /**
         * @return cloudAssistantStatus
         */
        public String getCloudAssistantStatus() {
            return this.cloudAssistantStatus;
        }

        /**
         * @return ecsInstanceId
         */
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        /**
         * @return ecsInstanceName
         */
        public String getEcsInstanceName() {
            return this.ecsInstanceName;
        }

        /**
         * @return ipAddress
         */
        public java.util.List < IpAddress> getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String agentStatus; 
            private String cloudAssistantStatus; 
            private String ecsInstanceId; 
            private String ecsInstanceName; 
            private java.util.List < IpAddress> ipAddress; 
            private String osType; 
            private String status; 
            private java.util.List < Tags> tags; 

            /**
             * <p>The status of the shipper on the ECS instance. Valid values:</p>
             * <ul>
             * <li>heartOk: The heartbeat is normal.</li>
             * <li>heartLost: The heartbeat is abnormal.</li>
             * <li>uninstalled: The shipper is not installed.</li>
             * <li>failed: The shipper fails to be installed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>heartOk</p>
             */
            public Builder agentStatus(String agentStatus) {
                this.agentStatus = agentStatus;
                return this;
            }

            /**
             * <p>Indicates whether the Cloud Assistant client is installed. Valid values:</p>
             * <ul>
             * <li>true: installed</li>
             * <li>false: not installed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder cloudAssistantStatus(String cloudAssistantStatus) {
                this.cloudAssistantStatus = cloudAssistantStatus;
                return this;
            }

            /**
             * <p>The ID of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp13y63575oypr****</p>
             */
            public Builder ecsInstanceId(String ecsInstanceId) {
                this.ecsInstanceId = ecsInstanceId;
                return this;
            }

            /**
             * <p>The name of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS_beat</p>
             */
            public Builder ecsInstanceName(String ecsInstanceName) {
                this.ecsInstanceName = ecsInstanceName;
                return this;
            }

            /**
             * <p>The IP addresses of the ECS instance.</p>
             */
            public Builder ipAddress(java.util.List < IpAddress> ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * <p>The operating system type of the ECS instance. Valid values:</p>
             * <ul>
             * <li>windows: Windows Server</li>
             * <li>linux: Linux</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>linux</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * <p>The status of the ECS instance. Valid values:</p>
             * <ul>
             * <li>running: The instance is running.</li>
             * <li>starting: The instance is being started.</li>
             * <li>stopping: The instance is being stopped.</li>
             * <li>stopped: The instance is stopped.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags of the ECS instance.</p>
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
