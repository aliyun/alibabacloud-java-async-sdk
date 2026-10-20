// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

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
 * {@link GetConnectorResponseBody} extends {@link TeaModel}
 *
 * <p>GetConnectorResponseBody</p>
 */
public class GetConnectorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetConnectorResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConnectorResponseBody create() {
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
     * @return status
     */
    public String getStatus() {
        return this.status;
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
        private String message; 
        private String requestId; 
        private String status; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetConnectorResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
            this.success = model.success;
        } 

        /**
         * <p>The result code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Requests throttling triggered.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7BA8ADD9-53D6-53F0-918F-A1E776AD230E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status code of the response.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. The valid values are:</p>
         * <ul>
         * <li><p><code>true</code>: The call was successful.</p>
         * </li>
         * <li><p><code>false</code>: The call failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetConnectorResponseBody build() {
            return new GetConnectorResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetConnectorResponseBody} extends {@link TeaModel}
     *
     * <p>GetConnectorResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectorId")
        private String connectorId;

        @com.aliyun.core.annotation.NameInMap("ConnectorName")
        private String connectorName;

        @com.aliyun.core.annotation.NameInMap("ConnectorType")
        private String connectorType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        private Data(Builder builder) {
            this.connectorId = builder.connectorId;
            this.connectorName = builder.connectorName;
            this.connectorType = builder.connectorType;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return connectorId
         */
        public String getConnectorId() {
            return this.connectorId;
        }

        /**
         * @return connectorName
         */
        public String getConnectorName() {
            return this.connectorName;
        }

        /**
         * @return connectorType
         */
        public String getConnectorType() {
            return this.connectorType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        public static final class Builder {
            private String connectorId; 
            private String connectorName; 
            private String connectorType; 
            private String description; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.connectorId = model.connectorId;
                this.connectorName = model.connectorName;
                this.connectorType = model.connectorType;
                this.description = model.description;
            } 

            /**
             * <p>The ID of the connector.</p>
             * 
             * <strong>example:</strong>
             * <p>conn_file_e0c9db4030b2465a9478028f7d76cd92_1234</p>
             */
            public Builder connectorId(String connectorId) {
                this.connectorId = connectorId;
                return this;
            }

            /**
             * <p>The name of the connector.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder connectorName(String connectorName) {
                this.connectorName = connectorName;
                return this;
            }

            /**
             * <p>The type of the connector.</p>
             * 
             * <strong>example:</strong>
             * <p>FILE</p>
             */
            public Builder connectorType(String connectorType) {
                this.connectorType = connectorType;
                return this;
            }

            /**
             * <p>The description of the connector.</p>
             * 
             * <strong>example:</strong>
             * <p>Description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
