// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUnhealthyHostAvailabilityResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUnhealthyHostAvailabilityResponseBody</p>
 */
public class DescribeUnhealthyHostAvailabilityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("UnhealthyList")
    private UnhealthyList unhealthyList;

    private DescribeUnhealthyHostAvailabilityResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.unhealthyList = builder.unhealthyList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUnhealthyHostAvailabilityResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return unhealthyList
     */
    public UnhealthyList getUnhealthyList() {
        return this.unhealthyList;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private UnhealthyList unhealthyList; 

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Indicates whether the call was successful. Valid values:
         * <p>
         * 
         * *   true: The call was successful.
         * *   false: The call failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The unhealthy instances that are detected by the specified availability monitoring tasks.
         */
        public Builder unhealthyList(UnhealthyList unhealthyList) {
            this.unhealthyList = unhealthyList;
            return this;
        }

        public DescribeUnhealthyHostAvailabilityResponseBody build() {
            return new DescribeUnhealthyHostAvailabilityResponseBody(this);
        } 

    } 

    public static class InstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("String")
        private java.util.List < String > string;

        private InstanceList(Builder builder) {
            this.string = builder.string;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceList create() {
            return builder().build();
        }

        /**
         * @return string
         */
        public java.util.List < String > getString() {
            return this.string;
        }

        public static final class Builder {
            private java.util.List < String > string; 

            /**
             * String.
             */
            public Builder string(java.util.List < String > string) {
                this.string = string;
                return this;
            }

            public InstanceList build() {
                return new InstanceList(this);
            } 

        } 

    }
    public static class NodeTaskInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstanceList")
        private InstanceList instanceList;

        private NodeTaskInstance(Builder builder) {
            this.id = builder.id;
            this.instanceList = builder.instanceList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeTaskInstance create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceList
         */
        public InstanceList getInstanceList() {
            return this.instanceList;
        }

        public static final class Builder {
            private Long id; 
            private InstanceList instanceList; 

            /**
             * The ID of the availability monitoring task.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The unhealthy instances that are detected by the availability monitoring task.
             */
            public Builder instanceList(InstanceList instanceList) {
                this.instanceList = instanceList;
                return this;
            }

            public NodeTaskInstance build() {
                return new NodeTaskInstance(this);
            } 

        } 

    }
    public static class UnhealthyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeTaskInstance")
        private java.util.List < NodeTaskInstance> nodeTaskInstance;

        private UnhealthyList(Builder builder) {
            this.nodeTaskInstance = builder.nodeTaskInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnhealthyList create() {
            return builder().build();
        }

        /**
         * @return nodeTaskInstance
         */
        public java.util.List < NodeTaskInstance> getNodeTaskInstance() {
            return this.nodeTaskInstance;
        }

        public static final class Builder {
            private java.util.List < NodeTaskInstance> nodeTaskInstance; 

            /**
             * NodeTaskInstance.
             */
            public Builder nodeTaskInstance(java.util.List < NodeTaskInstance> nodeTaskInstance) {
                this.nodeTaskInstance = nodeTaskInstance;
                return this;
            }

            public UnhealthyList build() {
                return new UnhealthyList(this);
            } 

        } 

    }
}
