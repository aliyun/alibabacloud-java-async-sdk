// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNodesResponseBody} extends {@link TeaModel}
 *
 * <p>ListNodesResponseBody</p>
 */
public class ListNodesResponseBody extends TeaModel {
    @NameInMap("Headers")
    private Headers headers;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
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
         * The header of the response.
         */
        public Builder headers(Headers headers) {
            this.headers = headers;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The returned result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListNodesResponseBody build() {
            return new ListNodesResponseBody(this);
        } 

    } 

    public static class Headers extends TeaModel {
        @NameInMap("X-Total-Count")
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
             * The number of entries returned.
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
    public static class IpAddress extends TeaModel {
        @NameInMap("host")
        private String host;

        @NameInMap("ipType")
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
             * The IP address.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The type of the IP address. Valid values:
             * <p>
             * 
             * *   public: public IP address
             * *   private: private IP address
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
    public static class Tags extends TeaModel {
        @NameInMap("tagKey")
        private String tagKey;

        @NameInMap("tagValue")
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
             * The key of the tag.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The value of the tag.
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
    public static class Result extends TeaModel {
        @NameInMap("agentStatus")
        private String agentStatus;

        @NameInMap("cloudAssistantStatus")
        private String cloudAssistantStatus;

        @NameInMap("ecsInstanceId")
        private String ecsInstanceId;

        @NameInMap("ecsInstanceName")
        private String ecsInstanceName;

        @NameInMap("ipAddress")
        private java.util.List < IpAddress> ipAddress;

        @NameInMap("osType")
        private String osType;

        @NameInMap("status")
        private String status;

        @NameInMap("tags")
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
             * The status of the shipper on the ECS instance. Valid values:
             * <p>
             * 
             * *   heartOk: The heartbeat is normal.
             * *   heartLost: The heartbeat is abnormal.
             * *   uninstalled: The shipper is not installed.
             * *   failed: The shipper fails to be installed.
             */
            public Builder agentStatus(String agentStatus) {
                this.agentStatus = agentStatus;
                return this;
            }

            /**
             * Indicates whether the Cloud Assistant client is installed. Valid values:
             * <p>
             * 
             * *   true: installed
             * *   false: not installed
             */
            public Builder cloudAssistantStatus(String cloudAssistantStatus) {
                this.cloudAssistantStatus = cloudAssistantStatus;
                return this;
            }

            /**
             * The ID of the ECS instance.
             */
            public Builder ecsInstanceId(String ecsInstanceId) {
                this.ecsInstanceId = ecsInstanceId;
                return this;
            }

            /**
             * The name of the ECS instance.
             */
            public Builder ecsInstanceName(String ecsInstanceName) {
                this.ecsInstanceName = ecsInstanceName;
                return this;
            }

            /**
             * The IP addresses of the ECS instance.
             */
            public Builder ipAddress(java.util.List < IpAddress> ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * The operating system type of the ECS instance. Valid values:
             * <p>
             * 
             * *   windows: Windows Server
             * *   linux: Linux
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * The status of the ECS instance. Valid values:
             * <p>
             * 
             * *   running: The instance is running.
             * *   starting: The instance is being started.
             * *   stopping: The instance is being stopped.
             * *   stopped: The instance is stopped.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tags of the ECS instance.
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
