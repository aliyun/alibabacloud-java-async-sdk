// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PageQuerySpeechBroadcastHourResponseBody} extends {@link TeaModel}
 *
 * <p>PageQuerySpeechBroadcastHourResponseBody</p>
 */
public class PageQuerySpeechBroadcastHourResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private PageQuerySpeechBroadcastHourResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PageQuerySpeechBroadcastHourResponseBody create() {
        return builder().build();
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

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public PageQuerySpeechBroadcastHourResponseBody build() {
            return new PageQuerySpeechBroadcastHourResponseBody(this);
        } 

    } 

    public static class ResultDataData extends TeaModel {
        @NameInMap("Code")
        private Integer code;

        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("Msg")
        private String msg;

        @NameInMap("ProductKey")
        private String productKey;

        @NameInMap("ShareTaskCode")
        private String shareTaskCode;

        @NameInMap("SpeechId")
        private String speechId;

        @NameInMap("Speechs")
        private String speechs;

        @NameInMap("StartTime")
        private Long startTime;

        private ResultDataData(Builder builder) {
            this.code = builder.code;
            this.deviceName = builder.deviceName;
            this.msg = builder.msg;
            this.productKey = builder.productKey;
            this.shareTaskCode = builder.shareTaskCode;
            this.speechId = builder.speechId;
            this.speechs = builder.speechs;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultDataData create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return shareTaskCode
         */
        public String getShareTaskCode() {
            return this.shareTaskCode;
        }

        /**
         * @return speechId
         */
        public String getSpeechId() {
            return this.speechId;
        }

        /**
         * @return speechs
         */
        public String getSpeechs() {
            return this.speechs;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Integer code; 
            private String deviceName; 
            private String msg; 
            private String productKey; 
            private String shareTaskCode; 
            private String speechId; 
            private String speechs; 
            private Long startTime; 

            /**
             * Code.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * Msg.
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * ProductKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * ShareTaskCode.
             */
            public Builder shareTaskCode(String shareTaskCode) {
                this.shareTaskCode = shareTaskCode;
                return this;
            }

            /**
             * SpeechId.
             */
            public Builder speechId(String speechId) {
                this.speechId = speechId;
                return this;
            }

            /**
             * Speechs.
             */
            public Builder speechs(String speechs) {
                this.speechs = speechs;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public ResultDataData build() {
                return new ResultDataData(this);
            } 

        } 

    }
    public static class ResultData extends TeaModel {
        @NameInMap("Data")
        private java.util.List < ResultDataData> data;

        private ResultData(Builder builder) {
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultData create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List < ResultDataData> getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.List < ResultDataData> data; 

            /**
             * Data.
             */
            public Builder data(java.util.List < ResultDataData> data) {
                this.data = data;
                return this;
            }

            public ResultData build() {
                return new ResultData(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageId")
        private Integer pageId;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("PageToken")
        private String pageToken;

        @NameInMap("ResultData")
        private ResultData resultData;

        @NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.pageId = builder.pageId;
            this.pageSize = builder.pageSize;
            this.pageToken = builder.pageToken;
            this.resultData = builder.resultData;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageId
         */
        public Integer getPageId() {
            return this.pageId;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return pageToken
         */
        public String getPageToken() {
            return this.pageToken;
        }

        /**
         * @return resultData
         */
        public ResultData getResultData() {
            return this.resultData;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer pageId; 
            private Integer pageSize; 
            private String pageToken; 
            private ResultData resultData; 
            private Integer total; 

            /**
             * PageId.
             */
            public Builder pageId(Integer pageId) {
                this.pageId = pageId;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * PageToken.
             */
            public Builder pageToken(String pageToken) {
                this.pageToken = pageToken;
                return this;
            }

            /**
             * ResultData.
             */
            public Builder resultData(ResultData resultData) {
                this.resultData = resultData;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
