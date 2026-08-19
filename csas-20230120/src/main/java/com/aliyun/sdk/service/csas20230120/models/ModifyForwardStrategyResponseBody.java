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
 * {@link ModifyForwardStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyForwardStrategyResponseBody</p>
 */
public class ModifyForwardStrategyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ForwardStrategy")
    private ForwardStrategy forwardStrategy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyForwardStrategyResponseBody(Builder builder) {
        this.forwardStrategy = builder.forwardStrategy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyForwardStrategyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forwardStrategy
     */
    public ForwardStrategy getForwardStrategy() {
        return this.forwardStrategy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ForwardStrategy forwardStrategy; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyForwardStrategyResponseBody model) {
            this.forwardStrategy = model.forwardStrategy;
            this.requestId = model.requestId;
        } 

        /**
         * ForwardStrategy.
         */
        public Builder forwardStrategy(ForwardStrategy forwardStrategy) {
            this.forwardStrategy = forwardStrategy;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2EBEEB93-E7AF-5667-B492-FA95C70821A0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyForwardStrategyResponseBody build() {
            return new ModifyForwardStrategyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyForwardStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyForwardStrategyResponseBody</p>
     */
    public static class ForwardStrategy extends TeaModel {
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
        private Long priority;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ForwardStrategy(Builder builder) {
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

        public static ForwardStrategy create() {
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
        public Long getPriority() {
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
            private Long priority; 
            private String status; 

            private Builder() {
            } 

            private Builder(ForwardStrategy model) {
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
            public Builder priority(Long priority) {
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

            public ForwardStrategy build() {
                return new ForwardStrategy(this);
            } 

        } 

    }
}
