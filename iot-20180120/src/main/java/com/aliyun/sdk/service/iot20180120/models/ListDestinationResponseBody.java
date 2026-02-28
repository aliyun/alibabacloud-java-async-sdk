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
 * {@link ListDestinationResponseBody} extends {@link TeaModel}
 *
 * <p>ListDestinationResponseBody</p>
 */
public class ListDestinationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Destinations")
    private Destinations destinations;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("Page")
    private Integer page;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
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

        private Builder() {
        } 

        private Builder(ListDestinationResponseBody model) {
            this.code = model.code;
            this.destinations = model.destinations;
            this.errorMessage = model.errorMessage;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * <p>The error code returned if the request fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data destinations.</p>
         */
        public Builder destinations(Destinations destinations) {
            this.destinations = destinations;
            return this;
        }

        /**
         * <p>The error message returned if the request fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E4C0FF92-2A86-41DB-92D3-73B60310D25E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListDestinationResponseBody build() {
            return new ListDestinationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDestinationResponseBody} extends {@link TeaModel}
     *
     * <p>ListDestinationResponseBody</p>
     */
    public static class DestinationsDestinations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Configuration")
        private String configuration;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DestinationId")
        private Long destinationId;

        @com.aliyun.core.annotation.NameInMap("IsFailover")
        private Boolean isFailover;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UtcCreated")
        private String utcCreated;

        private DestinationsDestinations(Builder builder) {
            this.configuration = builder.configuration;
            this.description = builder.description;
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
            private String description; 
            private Long destinationId; 
            private Boolean isFailover; 
            private String name; 
            private String status; 
            private String type; 
            private String utcCreated; 

            private Builder() {
            } 

            private Builder(DestinationsDestinations model) {
                this.configuration = model.configuration;
                this.description = model.description;
                this.destinationId = model.destinationId;
                this.isFailover = model.isFailover;
                this.name = model.name;
                this.status = model.status;
                this.type = model.type;
                this.utcCreated = model.utcCreated;
            } 

            /**
             * <p>The configuration data of the data destination.</p>
             */
            public Builder configuration(String configuration) {
                this.configuration = configuration;
                return this;
            }

            /**
             * <p>The description of the data destination.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the data destination.</p>
             * 
             * <strong>example:</strong>
             * <p>1003</p>
             */
            public Builder destinationId(Long destinationId) {
                this.destinationId = destinationId;
                return this;
            }

            /**
             * <p>Indicates whether the data destination is configured to receive error operation data. Error operation data is the data that failed to be forwarded for two consecutive times.</p>
             * <ul>
             * <li><strong>true</strong>: The data destination is configured to receive error operation data.</li>
             * <li><strong>false</strong>: The data destination is configured to receive regular data instead of error operation data.</li>
             * </ul>
             * <p>Default value: <strong>false</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isFailover(Boolean isFailover) {
                this.isFailover = isFailover;
                return this;
            }

            /**
             * <p>The name of the data destination.</p>
             * 
             * <strong>example:</strong>
             * <p>DataPurpose</p>
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
             * <p>The action of forwarding data to the data destination.</p>
             * 
             * <strong>example:</strong>
             * <p>REPUBLISH</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The time when the data destination was created. The time is displayed in UTC. The time follows the ISO 8601 standard in the <code>yyyy-MM-dd\&quot;T\&quot;HH:mm:ss.SSS\&quot;Z\&quot;</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-27T12:45:43.000Z</p>
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
    /**
     * 
     * {@link ListDestinationResponseBody} extends {@link TeaModel}
     *
     * <p>ListDestinationResponseBody</p>
     */
    public static class Destinations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("destinations")
        private java.util.List<DestinationsDestinations> destinations;

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
        public java.util.List<DestinationsDestinations> getDestinations() {
            return this.destinations;
        }

        public static final class Builder {
            private java.util.List<DestinationsDestinations> destinations; 

            private Builder() {
            } 

            private Builder(Destinations model) {
                this.destinations = model.destinations;
            } 

            /**
             * destinations.
             */
            public Builder destinations(java.util.List<DestinationsDestinations> destinations) {
                this.destinations = destinations;
                return this;
            }

            public Destinations build() {
                return new Destinations(this);
            } 

        } 

    }
}
