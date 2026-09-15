// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link OpenSensitiveFileScanResponseBody} extends {@link TeaModel}
 *
 * <p>OpenSensitiveFileScanResponseBody</p>
 */
public class OpenSensitiveFileScanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private OpenSensitiveFileScanResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenSensitiveFileScanResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(OpenSensitiveFileScanResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The result code. A value of <strong>200</strong> indicates success. Any other value indicates failure. You can use this field to determine the cause of the failure.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned for modifying the sensitive file scan switch.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The detailed information of the error code.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request. Alibaba Cloud generates a unique identifier for each request. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>B4A4C081-7F06-5481-9323-02A5419B9423</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result status of the API call. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The API call was successful.</li>
         * <li><strong>false</strong>: The API call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public OpenSensitiveFileScanResponseBody build() {
            return new OpenSensitiveFileScanResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link OpenSensitiveFileScanResponseBody} extends {@link TeaModel}
     *
     * <p>OpenSensitiveFileScanResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SwitchOn")
        private String switchOn;

        private Data(Builder builder) {
            this.switchOn = builder.switchOn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return switchOn
         */
        public String getSwitchOn() {
            return this.switchOn;
        }

        public static final class Builder {
            private String switchOn; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.switchOn = model.switchOn;
            } 

            /**
             * <p>The switch operation. Valid values:</p>
             * <ul>
             * <li><strong>on</strong>: Enable.</li>
             * <li><strong>off</strong>: Disable.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder switchOn(String switchOn) {
                this.switchOn = switchOn;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
