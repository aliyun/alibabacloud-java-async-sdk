// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link CloneNacosConfigResponseBody} extends {@link TeaModel}
 *
 * <p>CloneNacosConfigResponseBody</p>
 */
public class CloneNacosConfigResponseBody extends TeaModel {
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

    private CloneNacosConfigResponseBody(Builder builder) {
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

    public static CloneNacosConfigResponseBody create() {
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
         * <p>The dynamic part in the error message. This parameter is used to replace the **%s** variable in the <strong>ErrMessage</strong> parameter.</p>
         * <blockquote>
         * <p> If the return value of the <strong>ErrMessage</strong> parameter is <strong>The Value of Input Parameter %s is not valid</strong> and the return value of the <strong>DynamicMessage</strong> parameter is <strong>DtsJobId</strong>, the specified <strong>DtsJobId</strong> parameter is invalid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The number of successful operations.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameter is invalid.</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-100-000</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
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
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The details of the data.</p>
         * 
         * <strong>example:</strong>
         * <p>Clone Completed Successfully</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>6678DBA9-5600-5948-ACF8-ED3105B288A3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The response code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CloneNacosConfigResponseBody build() {
            return new CloneNacosConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CloneNacosConfigResponseBody} extends {@link TeaModel}
     *
     * <p>CloneNacosConfigResponseBody</p>
     */
    public static class FailData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataId")
        private String dataId;

        @com.aliyun.core.annotation.NameInMap("Group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        private FailData(Builder builder) {
            this.dataId = builder.dataId;
            this.group = builder.group;
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailData create() {
            return builder().build();
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        public static final class Builder {
            private String dataId; 
            private String group; 
            private String reason; 

            /**
             * <p>mse-200-105</p>
             * 
             * <strong>example:</strong>
             * <p>test2.yaml</p>
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * <p>duplicatedClusterAliasName</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            public FailData build() {
                return new FailData(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloneNacosConfigResponseBody} extends {@link TeaModel}
     *
     * <p>CloneNacosConfigResponseBody</p>
     */
    public static class SkipData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataId")
        private String dataId;

        @com.aliyun.core.annotation.NameInMap("Group")
        private String group;

        private SkipData(Builder builder) {
            this.dataId = builder.dataId;
            this.group = builder.group;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkipData create() {
            return builder().build();
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        public static final class Builder {
            private String dataId; 
            private String group; 

            /**
             * <p>The details of the failed configurations.</p>
             * 
             * <strong>example:</strong>
             * <p>test.yaml</p>
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * <p>The data structure.</p>
             * 
             * <strong>example:</strong>
             * <p>public</p>
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            public SkipData build() {
                return new SkipData(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloneNacosConfigResponseBody} extends {@link TeaModel}
     *
     * <p>CloneNacosConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailData")
        private java.util.List<FailData> failData;

        @com.aliyun.core.annotation.NameInMap("SkipCount")
        private Integer skipCount;

        @com.aliyun.core.annotation.NameInMap("SkipData")
        private java.util.List<SkipData> skipData;

        @com.aliyun.core.annotation.NameInMap("SuccCount")
        private Integer succCount;

        private Data(Builder builder) {
            this.failData = builder.failData;
            this.skipCount = builder.skipCount;
            this.skipData = builder.skipData;
            this.succCount = builder.succCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return failData
         */
        public java.util.List<FailData> getFailData() {
            return this.failData;
        }

        /**
         * @return skipCount
         */
        public Integer getSkipCount() {
            return this.skipCount;
        }

        /**
         * @return skipData
         */
        public java.util.List<SkipData> getSkipData() {
            return this.skipData;
        }

        /**
         * @return succCount
         */
        public Integer getSuccCount() {
            return this.succCount;
        }

        public static final class Builder {
            private java.util.List<FailData> failData; 
            private Integer skipCount; 
            private java.util.List<SkipData> skipData; 
            private Integer succCount; 

            /**
             * <p>The details of the failed configurations.</p>
             */
            public Builder failData(java.util.List<FailData> failData) {
                this.failData = failData;
                return this;
            }

            /**
             * <p>The data structure.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder skipCount(Integer skipCount) {
                this.skipCount = skipCount;
                return this;
            }

            /**
             * <p>The ID of the data.</p>
             */
            public Builder skipData(java.util.List<SkipData> skipData) {
                this.skipData = skipData;
                return this;
            }

            /**
             * <p>The details of the skipped configurations.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder succCount(Integer succCount) {
                this.succCount = succCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
