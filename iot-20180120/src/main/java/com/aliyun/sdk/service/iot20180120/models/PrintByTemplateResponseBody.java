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
 * {@link PrintByTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>PrintByTemplateResponseBody</p>
 */
public class PrintByTemplateResponseBody extends TeaModel {
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

    private PrintByTemplateResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PrintByTemplateResponseBody create() {
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

        private Builder(PrintByTemplateResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the request fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.printservice.NotSigned</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The result of the printing operation.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>print service not open</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>66FF51D3-<em><strong>-49F1-B1A2-</strong></em></p>
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

        public PrintByTemplateResponseBody build() {
            return new PrintByTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PrintByTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>PrintByTemplateResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceErrorCode")
        private String deviceErrorCode;

        @com.aliyun.core.annotation.NameInMap("DeviceErrorMessage")
        private String deviceErrorMessage;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MaxRetryCount")
        private Integer maxRetryCount;

        @com.aliyun.core.annotation.NameInMap("RetryCount")
        private Integer retryCount;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private Data(Builder builder) {
            this.deviceErrorCode = builder.deviceErrorCode;
            this.deviceErrorMessage = builder.deviceErrorMessage;
            this.id = builder.id;
            this.maxRetryCount = builder.maxRetryCount;
            this.retryCount = builder.retryCount;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deviceErrorCode
         */
        public String getDeviceErrorCode() {
            return this.deviceErrorCode;
        }

        /**
         * @return deviceErrorMessage
         */
        public String getDeviceErrorMessage() {
            return this.deviceErrorMessage;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return maxRetryCount
         */
        public Integer getMaxRetryCount() {
            return this.maxRetryCount;
        }

        /**
         * @return retryCount
         */
        public Integer getRetryCount() {
            return this.retryCount;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String deviceErrorCode; 
            private String deviceErrorMessage; 
            private String id; 
            private Integer maxRetryCount; 
            private Integer retryCount; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.deviceErrorCode = model.deviceErrorCode;
                this.deviceErrorMessage = model.deviceErrorMessage;
                this.id = model.id;
                this.maxRetryCount = model.maxRetryCount;
                this.retryCount = model.retryCount;
                this.success = model.success;
            } 

            /**
             * <p>The error code returned by the printer. Valid values:</p>
             * <ul>
             * <li>2: The printer ran out of paper.</li>
             * <li>3: A paper jam occurred in the printer.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder deviceErrorCode(String deviceErrorCode) {
                this.deviceErrorCode = deviceErrorCode;
                return this;
            }

            /**
             * <p>The error message returned by the printer.</p>
             * 
             * <strong>example:</strong>
             * <p>no paper</p>
             */
            public Builder deviceErrorMessage(String deviceErrorMessage) {
                this.deviceErrorMessage = deviceErrorMessage;
                return this;
            }

            /**
             * <p>The ID of the printing operation.</p>
             * 
             * <strong>example:</strong>
             * <p>NyWh5lw3<em><strong><strong>RfL9LJUivhOhQV</strong></strong></em></p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The maximum number of retries. The value is fixed at 2, which indicates that up to two printing retries are supported.</p>
             * <p>If the printer responds to the printing command with a failure or timeout error, IoT Platform delivers the printing command to the printer.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maxRetryCount(Integer maxRetryCount) {
                this.maxRetryCount = maxRetryCount;
                return this;
            }

            /**
             * <p>The actual number of retries.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder retryCount(Integer retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * <p>Indicates whether the printing operation was successful.</p>
             * <ul>
             * <li><strong>true</strong>: The printing operation was successful.</li>
             * <li><strong>false</strong>: The printing operation failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
