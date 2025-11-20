// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link DescribeApplicationMseServiceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationMseServiceResponseBody</p>
 */
public class DescribeApplicationMseServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private DescribeApplicationMseServiceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationMseServiceResponseBody create() {
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
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(DescribeApplicationMseServiceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * <p>The API status or POP error code. Valid values: 2xx: The request was successful. 3xx: The request was redirected. 4xx: The request was invalid. 5xx: A server error occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The application information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code. Value description:</p>
         * <ul>
         * <li>If the request succeeds, this field is not returned.</li>
         * <li>For more information, see the <strong>Error codes</strong> section of this topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>System.Upgrading</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The additional information. Value description:</p>
         * <ul>
         * <li>If the request was successful, <strong>success</strong> is returned.</li>
         * <li>If the request failed, an error code is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B4D805CA-926D-41B1-8E63-7AD0C1ED****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the application instance groups were obtained successfully. Valid values:</p>
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
         * <p>The ID of the trace, which is used to query the exact call information.</p>
         * 
         * <strong>example:</strong>
         * <p>0a98a02315955564772843261e****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeApplicationMseServiceResponseBody build() {
            return new DescribeApplicationMseServiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApplicationMseServiceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationMseServiceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MseAppId")
        private String mseAppId;

        @com.aliyun.core.annotation.NameInMap("MseAppName")
        private String mseAppName;

        @com.aliyun.core.annotation.NameInMap("MseAppNameSpace")
        private String mseAppNameSpace;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.mseAppId = builder.mseAppId;
            this.mseAppName = builder.mseAppName;
            this.mseAppNameSpace = builder.mseAppNameSpace;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return mseAppId
         */
        public String getMseAppId() {
            return this.mseAppId;
        }

        /**
         * @return mseAppName
         */
        public String getMseAppName() {
            return this.mseAppName;
        }

        /**
         * @return mseAppNameSpace
         */
        public String getMseAppNameSpace() {
            return this.mseAppNameSpace;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String mseAppId; 
            private String mseAppName; 
            private String mseAppNameSpace; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.mseAppId = model.mseAppId;
                this.mseAppName = model.mseAppName;
                this.mseAppNameSpace = model.mseAppNameSpace;
                this.status = model.status;
            } 

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>mse-cn-hvm47******</p>
             */
            public Builder mseAppId(String mseAppId) {
                this.mseAppId = mseAppId;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder mseAppName(String mseAppName) {
                this.mseAppName = mseAppName;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>sae-ent</p>
             */
            public Builder mseAppNameSpace(String mseAppNameSpace) {
                this.mseAppNameSpace = mseAppNameSpace;
                return this;
            }

            /**
             * <p>The application status. Valid values:</p>
             * <ul>
             * <li>EXPIRED</li>
             * <li>REBOOTING</li>
             * <li>WAITING</li>
             * <li>FAIL</li>
             * <li>NULL/SUCCESS</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
