// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListForwardStrategiesResponseBody} extends {@link TeaModel}
 *
 * <p>ListForwardStrategiesResponseBody</p>
 */
public class ListForwardStrategiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ForwardStrategies")
    private java.util.List<ForwardStrategies> forwardStrategies;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Long totalNum;

    private ListForwardStrategiesResponseBody(Builder builder) {
        this.forwardStrategies = builder.forwardStrategies;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListForwardStrategiesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forwardStrategies
     */
    public java.util.List<ForwardStrategies> getForwardStrategies() {
        return this.forwardStrategies;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalNum
     */
    public Long getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private java.util.List<ForwardStrategies> forwardStrategies; 
        private String requestId; 
        private Long totalNum; 

        private Builder() {
        } 

        private Builder(ListForwardStrategiesResponseBody model) {
            this.forwardStrategies = model.forwardStrategies;
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
        } 

        /**
         * ForwardStrategies.
         */
        public Builder forwardStrategies(java.util.List<ForwardStrategies> forwardStrategies) {
            this.forwardStrategies = forwardStrategies;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>D6707286-A50E-57B1-B2CF-EFAC59E850D8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalNum.
         */
        public Builder totalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public ListForwardStrategiesResponseBody build() {
            return new ListForwardStrategiesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListForwardStrategiesResponseBody} extends {@link TeaModel}
     *
     * <p>ListForwardStrategiesResponseBody</p>
     */
    public static class ForwardStrategies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DestinationId")
        private String destinationId;

        @com.aliyun.core.annotation.NameInMap("DestinationType")
        private String destinationType;

        @com.aliyun.core.annotation.NameInMap("ForwardId")
        private String forwardId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ForwardStrategies(Builder builder) {
            this.description = builder.description;
            this.destinationId = builder.destinationId;
            this.destinationType = builder.destinationType;
            this.forwardId = builder.forwardId;
            this.name = builder.name;
            this.priority = builder.priority;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ForwardStrategies create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return destinationId
         */
        public String getDestinationId() {
            return this.destinationId;
        }

        /**
         * @return destinationType
         */
        public String getDestinationType() {
            return this.destinationType;
        }

        /**
         * @return forwardId
         */
        public String getForwardId() {
            return this.forwardId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String description; 
            private String destinationId; 
            private String destinationType; 
            private String forwardId; 
            private String name; 
            private String priority; 
            private String status; 

            private Builder() {
            } 

            private Builder(ForwardStrategies model) {
                this.description = model.description;
                this.destinationId = model.destinationId;
                this.destinationType = model.destinationType;
                this.forwardId = model.forwardId;
                this.name = model.name;
                this.priority = model.priority;
                this.status = model.status;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DestinationId.
             */
            public Builder destinationId(String destinationId) {
                this.destinationId = destinationId;
                return this;
            }

            /**
             * DestinationType.
             */
            public Builder destinationType(String destinationType) {
                this.destinationType = destinationType;
                return this;
            }

            /**
             * ForwardId.
             */
            public Builder forwardId(String forwardId) {
                this.forwardId = forwardId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ForwardStrategies build() {
                return new ForwardStrategies(this);
            } 

        } 

    }
}
