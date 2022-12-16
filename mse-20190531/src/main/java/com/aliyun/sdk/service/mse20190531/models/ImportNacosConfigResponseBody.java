// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportNacosConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ImportNacosConfigResponseBody</p>
 */
public class ImportNacosConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("DynamicMessage")
    private String dynamicMessage;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * The status code returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The details of the data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The dynamic part in the error message. This parameter is used to replace the **%s** variable in the **Message** parameter. 
         * <p>
         * > If the specified **InstanceId** parameter is invalid, **The Value of Input Parameter %s is not valid** is returned for **Message** and **InstanceId** is returned for **DynamicMessage**.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * The error code returned if the request fails.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid values:
         * <p>
         * - `true`: The request is successful. 
         * - `false`: The request fails.
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
        @NameInMap("DataId")
        private String dataId;

        @NameInMap("Group")
        private String group;

        private FailData(Builder builder) {
            this.dataId = builder.dataId;
            this.group = builder.group;
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

        public static final class Builder {
            private String dataId; 
            private String group; 

            /**
             * The ID of the configuration.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * The ID of the group.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            public FailData build() {
                return new FailData(this);
            } 

        } 

    }
    public static class SkipData extends TeaModel {
        @NameInMap("DataId")
        private String dataId;

        @NameInMap("Group")
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
             * The ID of the configuration.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * The ID of the group.
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
        @NameInMap("FailData")
        private java.util.List < FailData> failData;

        @NameInMap("SkipCount")
        private Integer skipCount;

        @NameInMap("SkipData")
        private java.util.List < SkipData> skipData;

        @NameInMap("SuccCount")
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
             * The information about configurations failed to be imported.
             */
            public Builder failData(java.util.List < FailData> failData) {
                this.failData = failData;
                return this;
            }

            /**
             * The number of configurations that are skipped.
             */
            public Builder skipCount(Integer skipCount) {
                this.skipCount = skipCount;
                return this;
            }

            /**
             * The information about skipped configurations.
             */
            public Builder skipData(java.util.List < SkipData> skipData) {
                this.skipData = skipData;
                return this;
            }

            /**
             * The number of configurations that are imported.
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
