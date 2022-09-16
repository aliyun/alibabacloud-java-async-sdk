// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDestinationResponseBody} extends {@link TeaModel}
 *
 * <p>GetDestinationResponseBody</p>
 */
public class GetDestinationResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Destination")
    private Destination destination;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetDestinationResponseBody(Builder builder) {
        this.code = builder.code;
        this.destination = builder.destination;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDestinationResponseBody create() {
        return builder().build();
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

        public GetDestinationResponseBody build() {
            return new GetDestinationResponseBody(this);
        } 

    } 

    public static class Destination extends TeaModel {
        @NameInMap("Configuration")
        private String configuration;

        @NameInMap("DestinationId")
        private String destinationId;

        @NameInMap("IsFailover")
        private Boolean isFailover;

        @NameInMap("Name")
        private String name;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        @NameInMap("UtcCreated")
        private String utcCreated;

        private Destination(Builder builder) {
            this.configuration = builder.configuration;
            this.destinationId = builder.destinationId;
            this.isFailover = builder.isFailover;
            this.name = builder.name;
            this.status = builder.status;
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
        public String getDestinationId() {
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
         * @return status
         */
        public String getStatus() {
            return this.status;
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
            private String destinationId; 
            private Boolean isFailover; 
            private String name; 
            private String status; 
            private String type; 
            private String utcCreated; 

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
            public Builder destinationId(String destinationId) {
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
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
