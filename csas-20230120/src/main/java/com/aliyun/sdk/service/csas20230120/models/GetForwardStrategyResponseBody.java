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
 * {@link GetForwardStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>GetForwardStrategyResponseBody</p>
 */
public class GetForwardStrategyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ForwardStrategy")
    private ForwardStrategy forwardStrategy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetForwardStrategyResponseBody(Builder builder) {
        this.forwardStrategy = builder.forwardStrategy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetForwardStrategyResponseBody create() {
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

        private Builder(GetForwardStrategyResponseBody model) {
            this.forwardStrategy = model.forwardStrategy;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The forwarding rule.</p>
         */
        public Builder forwardStrategy(ForwardStrategy forwardStrategy) {
            this.forwardStrategy = forwardStrategy;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>BE4FB974-11BC-5453-9BE1-1606A73EACA6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetForwardStrategyResponseBody build() {
            return new GetForwardStrategyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetForwardStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>GetForwardStrategyResponseBody</p>
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
             * <p>The policy description.</p>
             * 
             * <strong>example:</strong>
             * <p>solemn_index</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The target instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>connector-bb95f515b6818623</p>
             */
            public Builder destinationId(String destinationId) {
                this.destinationId = destinationId;
                return this;
            }

            /**
             * <p>The destination type. Valid values:</p>
             * <ul>
             * <li><strong>Connector</strong>: connector.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Connector</p>
             */
            public Builder destinationType(String destinationType) {
                this.destinationType = destinationType;
                return this;
            }

            /**
             * <p>The forwarding rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>fs-b87a2f8e863bf02c</p>
             */
            public Builder forwardId(String forwardId) {
                this.forwardId = forwardId;
                return this;
            }

            /**
             * <p>The policy name.</p>
             * 
             * <strong>example:</strong>
             * <p>dynamic_route_name_eb55d3a3</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The policy priority. The value 1 indicates the highest priority, and the value 100 indicates the lowest priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Long priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The policy status. Valid values:</p>
             * <ul>
             * <li><strong>Enabled</strong>: Enabled.</li>
             * <li><strong>Disabled</strong>: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
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
