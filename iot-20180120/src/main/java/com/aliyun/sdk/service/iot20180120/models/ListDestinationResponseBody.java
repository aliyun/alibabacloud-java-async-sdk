// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDestinationResponseBody} extends {@link TeaModel}
 *
 * <p>ListDestinationResponseBody</p>
 */
public class ListDestinationResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Destinations")
    private Destinations destinations;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("Page")
    private Integer page;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
    private Integer total;

    private ListDestinationResponseBody(Builder builder) {
        this.code = builder.code;
        this.destinations = builder.destinations;
        this.errorMessage = builder.errorMessage;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDestinationResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return destinations
     */
    public Destinations getDestinations() {
        return this.destinations;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private Destinations destinations; 
        private String errorMessage; 
        private Integer page; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Destinations.
         */
        public Builder destinations(Destinations destinations) {
            this.destinations = destinations;
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
         * Page.
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListDestinationResponseBody build() {
            return new ListDestinationResponseBody(this);
        } 

    } 

    public static class DestinationsDestinations extends TeaModel {
        @NameInMap("Configuration")
        private String configuration;

        @NameInMap("Description")
        private String description;

        @NameInMap("DestinationId")
        private Long destinationId;

        @NameInMap("IsFailover")
        private Boolean isFailover;

        @NameInMap("Name")
        private String name;

        @NameInMap("Type")
        private String type;

        @NameInMap("UtcCreated")
        private String utcCreated;

        private DestinationsDestinations(Builder builder) {
            this.configuration = builder.configuration;
            this.description = builder.description;
            this.destinationId = builder.destinationId;
            this.isFailover = builder.isFailover;
            this.name = builder.name;
            this.type = builder.type;
            this.utcCreated = builder.utcCreated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DestinationsDestinations create() {
            return builder().build();
        }

        /**
         * @return configuration
         */
        public String getConfiguration() {
            return this.configuration;
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
            private String description; 
            private Long destinationId; 
            private Boolean isFailover; 
            private String name; 
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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

            public DestinationsDestinations build() {
                return new DestinationsDestinations(this);
            } 

        } 

    }
    public static class Destinations extends TeaModel {
        @NameInMap("destinations")
        private java.util.List < DestinationsDestinations> destinations;

        private Destinations(Builder builder) {
            this.destinations = builder.destinations;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Destinations create() {
            return builder().build();
        }

        /**
         * @return destinations
         */
        public java.util.List < DestinationsDestinations> getDestinations() {
            return this.destinations;
        }

        public static final class Builder {
            private java.util.List < DestinationsDestinations> destinations; 

            /**
             * destinations.
             */
            public Builder destinations(java.util.List < DestinationsDestinations> destinations) {
                this.destinations = destinations;
                return this;
            }

            public Destinations build() {
                return new Destinations(this);
            } 

        } 

    }
}
