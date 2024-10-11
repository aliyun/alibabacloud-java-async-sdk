// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryClusterDiskSpecificationResponseBody} extends {@link TeaModel}
 *
 * <p>QueryClusterDiskSpecificationResponseBody</p>
 */
public class QueryClusterDiskSpecificationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryClusterDiskSpecificationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorCode = builder.errorCode;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryClusterDiskSpecificationResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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
        private Integer code; 
        private Data data; 
        private String dynamicMessage; 
        private String errorCode; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of the data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The dynamic part in the error message. This parameter is used to replace the **%s** variable in the <strong>ErrMessage</strong> parameter.</p>
         * <blockquote>
         * <p> If the return value of the <strong>ErrMessage</strong> parameter is <strong>The Value of Input Parameter %s is not valid</strong> and the return value of the <strong>DynamicMessage</strong> parameter is <strong>DtsJobId</strong>, the specified <strong>DtsJobId</strong> parameter is invalid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>The specified parameter is invalid.</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-100-000</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The request is successfully processed.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E13A3A34-7201-50C4-B2D0-0D7DB891811E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request was successful.</li>
         * <li><code>false</code>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryClusterDiskSpecificationResponseBody build() {
            return new QueryClusterDiskSpecificationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryClusterDiskSpecificationResponseBody} extends {@link TeaModel}
     *
     * <p>QueryClusterDiskSpecificationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Max")
        private Integer max;

        @com.aliyun.core.annotation.NameInMap("Min")
        private Integer min;

        @com.aliyun.core.annotation.NameInMap("Step")
        private Integer step;

        private Data(Builder builder) {
            this.max = builder.max;
            this.min = builder.min;
            this.step = builder.step;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return max
         */
        public Integer getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public Integer getMin() {
            return this.min;
        }

        /**
         * @return step
         */
        public Integer getStep() {
            return this.step;
        }

        public static final class Builder {
            private Integer max; 
            private Integer min; 
            private Integer step; 

            /**
             * <p>The maximum disk capacity. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder max(Integer max) {
                this.max = max;
                return this;
            }

            /**
             * <p>The minimum disk capacity. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder min(Integer min) {
                this.min = min;
                return this;
            }

            /**
             * <p>The step size of the disk capacity.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder step(Integer step) {
                this.step = step;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
