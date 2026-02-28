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
 * {@link GetDestinationResponseBody} extends {@link TeaModel}
 *
 * <p>GetDestinationResponseBody</p>
 */
public class GetDestinationResponseBody extends TeaModel {
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

        private Builder(GetDestinationResponseBody model) {
            this.code = model.code;
            this.destination = model.destination;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
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
         * <p>The information about the data destination.</p>
         */
        public Builder destination(Destination destination) {
            this.destination = destination;
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

        public GetDestinationResponseBody build() {
            return new GetDestinationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDestinationResponseBody} extends {@link TeaModel}
     *
     * <p>GetDestinationResponseBody</p>
     */
    public static class Destination extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Configuration")
        private String configuration;

        @com.aliyun.core.annotation.NameInMap("DestinationId")
        private String destinationId;

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

            private Builder() {
            } 

            private Builder(Destination model) {
                this.configuration = model.configuration;
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
             * <p>The ID of the data destination.</p>
             * 
             * <strong>example:</strong>
             * <p>1003</p>
             */
            public Builder destinationId(String destinationId) {
                this.destinationId = destinationId;
                return this;
            }

            /**
             * <p>Indicates whether the data destination is configured to receive error operation data. Error operation data is data that failed to be forwarded for two consecutive times.</p>
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
             * <p>The operation that is performed on the data of the data destination.</p>
             * <ul>
             * <li><strong>REPUBLISH</strong>: forwards topic data that is processed by a parser script to an IoT Platform communication topic.</li>
             * <li><strong>AMQP</strong>: forwards topic data that is processed by a parser script to an Advanced Message Queuing Protocol (AMQP) consumer group.</li>
             * <li><strong>DATAHUB</strong>: forwards topic data to Alibaba Cloud DataHub for stream data processing.</li>
             * <li><strong>ONS</strong>: forwards topic data that is processed by a parser script to Message Queue for Apache RocketMQ for message distribution.</li>
             * <li><strong>MNS</strong>: forwards topic data to Message Service (MNS) for message transmission.</li>
             * <li><strong>FC</strong>: forwards topic data to Function Compute for event computing.</li>
             * <li><strong>OTS</strong>: forwards topic data to Tablestore for NoSQL data storage.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>REPUBLISH</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The time when the data destination was created. The time is displayed in UTC. Format: <code>yyyy-MM-dd\&quot;T\&quot;HH:mm:ss.SSS\&quot;Z\&quot;</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-27T12:45:43.000Z</p>
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
