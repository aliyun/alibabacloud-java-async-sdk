// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The error message returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The number of configurations that are imported.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The details of the data.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * The code returned.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The request is successfully processed.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   `true`: The request was successful.
         * *   `false`: The request failed.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The error code that is returned.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ImportNacosConfigResponseBody build() {
            return new ImportNacosConfigResponseBody(this);
        } 

    } 

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
             * The ID of the group.
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
             * The ID of the group.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * The information about configurations that are failed to be imported.
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
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailData")
        private java.util.List < FailData> failData;

        @com.aliyun.core.annotation.NameInMap("SkipCount")
        private Integer skipCount;

        @com.aliyun.core.annotation.NameInMap("SkipData")
        private java.util.List < SkipData> skipData;

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
        public java.util.List < FailData> getFailData() {
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
        public java.util.List < SkipData> getSkipData() {
            return this.skipData;
        }

        /**
         * @return succCount
         */
        public Integer getSuccCount() {
            return this.succCount;
        }

        public static final class Builder {
            private java.util.List < FailData> failData; 
            private Integer skipCount; 
            private java.util.List < SkipData> skipData; 
            private Integer succCount; 

            /**
             * The data structure.
             */
            public Builder failData(java.util.List < FailData> failData) {
                this.failData = failData;
                return this;
            }

            /**
             * The information about skipped configurations.
             */
            public Builder skipCount(Integer skipCount) {
                this.skipCount = skipCount;
                return this;
            }

            /**
             * The data structure.
             */
            public Builder skipData(java.util.List < SkipData> skipData) {
                this.skipData = skipData;
                return this;
            }

            /**
             * The number of configurations that are skipped.
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
