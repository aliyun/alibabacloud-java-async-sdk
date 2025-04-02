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
 * {@link ImportNacosConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ImportNacosConfigResponseBody</p>
 */
public class ImportNacosConfigResponseBody extends TeaModel {
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

    private ImportNacosConfigResponseBody(Builder builder) {
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

    public static ImportNacosConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ImportNacosConfigResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.dynamicMessage = model.dynamicMessage;
            this.errorCode = model.errorCode;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The number of configurations that are imported.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The details of the data.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameter is invalid.</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-100-100</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request is successfully processed.</p>
         * 
         * <strong>example:</strong>
         * <p>The dynamic part in the error message. This parameter is used to replace the <strong>%s</strong> variable in the <strong>ErrMessage</strong> parameter.</p>
         * <blockquote>
         * <p> If the return value of the <strong>ErrMessage</strong> parameter is <strong>The Value of Input Parameter %s is not valid</strong> and the return value of the <strong>DynamicMessage</strong> parameter is <strong>DtsJobId</strong>, the specified <strong>DtsJobId</strong> parameter is invalid.</p>
         * </blockquote>
         */
        public Builder message(String message) {
            this.message = message;
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
         * <p>AF21683A-29C7-4853-AC0F-B5ADEE4****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The error code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ImportNacosConfigResponseBody build() {
            return new ImportNacosConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ImportNacosConfigResponseBody} extends {@link TeaModel}
     *
     * <p>ImportNacosConfigResponseBody</p>
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

            private Builder() {
            } 

            private Builder(FailData model) {
                this.dataId = model.dataId;
                this.group = model.group;
                this.reason = model.reason;
            } 

            /**
             * <p>The ID of the group.</p>
             * 
             * <strong>example:</strong>
             * <p>test2.yaml</p>
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * Group.
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
     * {@link ImportNacosConfigResponseBody} extends {@link TeaModel}
     *
     * <p>ImportNacosConfigResponseBody</p>
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

            private Builder() {
            } 

            private Builder(SkipData model) {
                this.dataId = model.dataId;
                this.group = model.group;
            } 

            /**
             * <p>The ID of the group.</p>
             * 
             * <strong>example:</strong>
             * <p>test.yaml</p>
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * <p>The information about configurations that are failed to be imported.</p>
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
     * {@link ImportNacosConfigResponseBody} extends {@link TeaModel}
     *
     * <p>ImportNacosConfigResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.failData = model.failData;
                this.skipCount = model.skipCount;
                this.skipData = model.skipData;
                this.succCount = model.succCount;
            } 

            /**
             * <p>The data structure.</p>
             */
            public Builder failData(java.util.List<FailData> failData) {
                this.failData = failData;
                return this;
            }

            /**
             * <p>The information about skipped configurations.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder skipCount(Integer skipCount) {
                this.skipCount = skipCount;
                return this;
            }

            /**
             * <p>The data structure.</p>
             */
            public Builder skipData(java.util.List<SkipData> skipData) {
                this.skipData = skipData;
                return this;
            }

            /**
             * <p>The number of configurations that are skipped.</p>
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
