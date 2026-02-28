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
 * {@link ListParserDestinationResponseBody} extends {@link TeaModel}
 *
 * <p>ListParserDestinationResponseBody</p>
 */
public class ListParserDestinationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListParserDestinationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListParserDestinationResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListParserDestinationResponseBody model) {
            this.code = model.code;
            this.data = model.data;
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public ListParserDestinationResponseBody build() {
            return new ListParserDestinationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListParserDestinationResponseBody} extends {@link TeaModel}
     *
     * <p>ListParserDestinationResponseBody</p>
     */
    public static class Destinations extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("UtcModified")
        private String utcModified;

        private Destinations(Builder builder) {
            this.configuration = builder.configuration;
            this.destinationId = builder.destinationId;
            this.isFailover = builder.isFailover;
            this.name = builder.name;
            this.type = builder.type;
            this.utcCreated = builder.utcCreated;
            this.utcModified = builder.utcModified;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Destinations create() {
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

        /**
         * @return utcModified
         */
        public String getUtcModified() {
            return this.utcModified;
        }

        public static final class Builder {
            private String configuration; 
            private Long destinationId; 
            private Boolean isFailover; 
            private String name; 
            private String type; 
            private String utcCreated; 
            private String utcModified; 

            private Builder() {
            } 

            private Builder(Destinations model) {
                this.configuration = model.configuration;
                this.destinationId = model.destinationId;
                this.isFailover = model.isFailover;
                this.name = model.name;
                this.type = model.type;
                this.utcCreated = model.utcCreated;
                this.utcModified = model.utcModified;
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

            /**
             * UtcModified.
             */
            public Builder utcModified(String utcModified) {
                this.utcModified = utcModified;
                return this;
            }

            public Destinations build() {
                return new Destinations(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListParserDestinationResponseBody} extends {@link TeaModel}
     *
     * <p>ListParserDestinationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("destinations")
        private java.util.List<Destinations> destinations;

        private Data(Builder builder) {
            this.destinations = builder.destinations;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return destinations
         */
        public java.util.List<Destinations> getDestinations() {
            return this.destinations;
        }

        public static final class Builder {
            private java.util.List<Destinations> destinations; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.destinations = model.destinations;
            } 

            /**
             * destinations.
             */
            public Builder destinations(java.util.List<Destinations> destinations) {
                this.destinations = destinations;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
