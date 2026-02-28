// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link CreateDestinationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDestinationResponseBody</p>
 */
public class CreateDestinationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Destination")
    private Destination destination;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateDestinationResponseBody(Builder builder) {
        this.code = builder.code;
        this.destination = builder.destination;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDestinationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return destination
     */
    public Destination getDestination() {
        return this.destination;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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

    public static final class Builder {
        private String code; 
        private Destination destination; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateDestinationResponseBody model) {
            this.code = model.code;
            this.destination = model.destination;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Destination.
         */
        public Builder destination(Destination destination) {
            this.destination = destination;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateDestinationResponseBody build() {
            return new CreateDestinationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateDestinationResponseBody} extends {@link TeaModel}
     *
     * <p>CreateDestinationResponseBody</p>
     */
    public static class Destination extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Configuration")
        private String configuration;

        @com.aliyun.core.annotation.NameInMap("DestinationId")
        private Long destinationId;

        @com.aliyun.core.annotation.NameInMap("IsFailover")
        private Boolean isFailover;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UtcCreated")
        private String utcCreated;

        private Destination(Builder builder) {
            this.configuration = builder.configuration;
            this.destinationId = builder.destinationId;
            this.isFailover = builder.isFailover;
            this.name = builder.name;
            this.type = builder.type;
            this.utcCreated = builder.utcCreated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Destination create() {
            return builder().build();
        }

        /**
         * @return configuration
         */
        public String getConfiguration() {
            return this.configuration;
        }

        /**
         * @return destinationId
         */
        public Long getDestinationId() {
            return this.destinationId;
        }

        /**
         * @return isFailover
         */
        public Boolean getIsFailover() {
            return this.isFailover;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return utcCreated
         */
        public String getUtcCreated() {
            return this.utcCreated;
        }

        public static final class Builder {
            private String configuration; 
            private Long destinationId; 
            private Boolean isFailover; 
            private String name; 
            private String type; 
            private String utcCreated; 

            private Builder() {
            } 

            private Builder(Destination model) {
                this.configuration = model.configuration;
                this.destinationId = model.destinationId;
                this.isFailover = model.isFailover;
                this.name = model.name;
                this.type = model.type;
                this.utcCreated = model.utcCreated;
            } 

            /**
             * Configuration.
             */
            public Builder configuration(String configuration) {
                this.configuration = configuration;
                return this;
            }

            /**
             * DestinationId.
             */
            public Builder destinationId(Long destinationId) {
                this.destinationId = destinationId;
                return this;
            }

            /**
             * IsFailover.
             */
            public Builder isFailover(Boolean isFailover) {
                this.isFailover = isFailover;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UtcCreated.
             */
            public Builder utcCreated(String utcCreated) {
                this.utcCreated = utcCreated;
                return this;
            }

            public Destination build() {
                return new Destination(this);
            } 

        } 

    }
}
