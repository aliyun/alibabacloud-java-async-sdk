// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link ListNetworkServicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListNetworkServicesResponseBody</p>
 */
public class ListNetworkServicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("networkServices")
    private java.util.List<NetworkServices> networkServices;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("queues")
    private java.util.List<Queues> queues;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListNetworkServicesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.networkServices = builder.networkServices;
        this.nextToken = builder.nextToken;
        this.queues = builder.queues;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNetworkServicesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return networkServices
     */
    public java.util.List<NetworkServices> getNetworkServices() {
        return this.networkServices;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return queues
     */
    public java.util.List<Queues> getQueues() {
        return this.queues;
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
        private Integer maxResults; 
        private java.util.List<NetworkServices> networkServices; 
        private String nextToken; 
        private java.util.List<Queues> queues; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListNetworkServicesResponseBody model) {
            this.maxResults = model.maxResults;
            this.networkServices = model.networkServices;
            this.nextToken = model.nextToken;
            this.queues = model.queues;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>一次获取的最大记录数。</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * networkServices.
         */
        public Builder networkServices(java.util.List<NetworkServices> networkServices) {
            this.networkServices = networkServices;
            return this;
        }

        /**
         * <p>下一页TOKEN。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * queues.
         */
        public Builder queues(java.util.List<Queues> queues) {
            this.queues = queues;
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
         * <p>记录总数。</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListNetworkServicesResponseBody build() {
            return new ListNetworkServicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNetworkServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNetworkServicesResponseBody</p>
     */
    public static class StateChangeReason extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        private StateChangeReason(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StateChangeReason create() {
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

        public static final class Builder {
            private String code; 
            private String message; 

            private Builder() {
            } 

            private Builder(StateChangeReason model) {
                this.code = model.code;
                this.message = model.message;
            } 

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

            public StateChangeReason build() {
                return new StateChangeReason(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNetworkServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNetworkServicesResponseBody</p>
     */
    public static class NetworkServices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("networkServiceId")
        private String networkServiceId;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("stateChangeReason")
        private StateChangeReason stateChangeReason;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("vswitchIds")
        private java.util.List<String> vswitchIds;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private NetworkServices(Builder builder) {
            this.name = builder.name;
            this.networkServiceId = builder.networkServiceId;
            this.state = builder.state;
            this.stateChangeReason = builder.stateChangeReason;
            this.type = builder.type;
            this.vpcId = builder.vpcId;
            this.vswitchIds = builder.vswitchIds;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkServices create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return networkServiceId
         */
        public String getNetworkServiceId() {
            return this.networkServiceId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return stateChangeReason
         */
        public StateChangeReason getStateChangeReason() {
            return this.stateChangeReason;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswitchIds
         */
        public java.util.List<String> getVswitchIds() {
            return this.vswitchIds;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String name; 
            private String networkServiceId; 
            private String state; 
            private StateChangeReason stateChangeReason; 
            private String type; 
            private String vpcId; 
            private java.util.List<String> vswitchIds; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(NetworkServices model) {
                this.name = model.name;
                this.networkServiceId = model.networkServiceId;
                this.state = model.state;
                this.stateChangeReason = model.stateChangeReason;
                this.type = model.type;
                this.vpcId = model.vpcId;
                this.vswitchIds = model.vswitchIds;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * networkServiceId.
             */
            public Builder networkServiceId(String networkServiceId) {
                this.networkServiceId = networkServiceId;
                return this;
            }

            /**
             * state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * stateChangeReason.
             */
            public Builder stateChangeReason(StateChangeReason stateChangeReason) {
                this.stateChangeReason = stateChangeReason;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>VPC id。</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1vt6r7o1w4tw7j6****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * vswitchIds.
             */
            public Builder vswitchIds(java.util.List<String> vswitchIds) {
                this.vswitchIds = vswitchIds;
                return this;
            }

            /**
             * workspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public NetworkServices build() {
                return new NetworkServices(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNetworkServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNetworkServicesResponseBody</p>
     */
    public static class QueuesStateChangeReason extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        private QueuesStateChangeReason(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueuesStateChangeReason create() {
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

        public static final class Builder {
            private String code; 
            private String message; 

            private Builder() {
            } 

            private Builder(QueuesStateChangeReason model) {
                this.code = model.code;
                this.message = model.message;
            } 

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

            public QueuesStateChangeReason build() {
                return new QueuesStateChangeReason(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNetworkServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNetworkServicesResponseBody</p>
     */
    public static class Queues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("networkServiceId")
        private String networkServiceId;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("stateChangeReason")
        private QueuesStateChangeReason stateChangeReason;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("vswitchIds")
        private java.util.List<String> vswitchIds;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Queues(Builder builder) {
            this.name = builder.name;
            this.networkServiceId = builder.networkServiceId;
            this.state = builder.state;
            this.stateChangeReason = builder.stateChangeReason;
            this.type = builder.type;
            this.vpcId = builder.vpcId;
            this.vswitchIds = builder.vswitchIds;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Queues create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return networkServiceId
         */
        public String getNetworkServiceId() {
            return this.networkServiceId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return stateChangeReason
         */
        public QueuesStateChangeReason getStateChangeReason() {
            return this.stateChangeReason;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswitchIds
         */
        public java.util.List<String> getVswitchIds() {
            return this.vswitchIds;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String name; 
            private String networkServiceId; 
            private String state; 
            private QueuesStateChangeReason stateChangeReason; 
            private String type; 
            private String vpcId; 
            private java.util.List<String> vswitchIds; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Queues model) {
                this.name = model.name;
                this.networkServiceId = model.networkServiceId;
                this.state = model.state;
                this.stateChangeReason = model.stateChangeReason;
                this.type = model.type;
                this.vpcId = model.vpcId;
                this.vswitchIds = model.vswitchIds;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * networkServiceId.
             */
            public Builder networkServiceId(String networkServiceId) {
                this.networkServiceId = networkServiceId;
                return this;
            }

            /**
             * state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * stateChangeReason.
             */
            public Builder stateChangeReason(QueuesStateChangeReason stateChangeReason) {
                this.stateChangeReason = stateChangeReason;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>VPC id。</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1vt6r7o1w4tw7j6****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * vswitchIds.
             */
            public Builder vswitchIds(java.util.List<String> vswitchIds) {
                this.vswitchIds = vswitchIds;
                return this;
            }

            /**
             * workspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Queues build() {
                return new Queues(this);
            } 

        } 

    }
}
