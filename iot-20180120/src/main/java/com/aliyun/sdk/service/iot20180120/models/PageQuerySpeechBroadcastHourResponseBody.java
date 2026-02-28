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
 * {@link PageQuerySpeechBroadcastHourResponseBody} extends {@link TeaModel}
 *
 * <p>PageQuerySpeechBroadcastHourResponseBody</p>
 */
public class PageQuerySpeechBroadcastHourResponseBody extends TeaModel {
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

        private Builder(PageQuerySpeechBroadcastHourResponseBody model) {
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
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The result returned if the call is successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the request fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E4C0FF92-2A86-41DB-92D3-73B60310D25E</p>
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

        public PageQuerySpeechBroadcastHourResponseBody build() {
            return new PageQuerySpeechBroadcastHourResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PageQuerySpeechBroadcastHourResponseBody} extends {@link TeaModel}
     *
     * <p>PageQuerySpeechBroadcastHourResponseBody</p>
     */
    public static class ResultDataData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("Msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("ShareTaskCode")
        private String shareTaskCode;

        @com.aliyun.core.annotation.NameInMap("SpeechId")
        private String speechId;

        @com.aliyun.core.annotation.NameInMap("Speechs")
        private String speechs;

        @com.aliyun.core.annotation.NameInMap("StartTime")
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

            private Builder() {
            } 

            private Builder(ResultDataData model) {
                this.code = model.code;
                this.deviceName = model.deviceName;
                this.msg = model.msg;
                this.productKey = model.productKey;
                this.shareTaskCode = model.shareTaskCode;
                this.speechId = model.speechId;
                this.speechs = model.speechs;
                this.startTime = model.startTime;
            } 

            /**
             * <p>Indicates whether the speech was successfully broadcasted. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The speech was successfully broadcasted.</li>
             * <li><strong>1</strong>: The speech was repeatedly broadcasted.</li>
             * <li><strong>2</strong>: The speech does not exist.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The DeviceName of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>device1</p>
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * <p>The message that indicates the speech broadcasting result.</p>
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * <p>The <strong>ProductKey</strong> of the product to which the device belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>sd34****</p>
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * <p>The code of the sharing task.</p>
             * 
             * <strong>example:</strong>
             * <p>ebed9280_ba25_48df_80c2_****</p>
             */
            public Builder shareTaskCode(String shareTaskCode) {
                this.shareTaskCode = shareTaskCode;
                return this;
            }

            /**
             * <p>The ID of the speech that was broadcasted.</p>
             * 
             * <strong>example:</strong>
             * <p>42000011392021112380****</p>
             */
            public Builder speechId(String speechId) {
                this.speechId = speechId;
                return this;
            }

            /**
             * <p>The content of the broadcasted speech. The parameter value is a JSON array.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;ANC&quot;,&quot;CDF&quot;]</p>
             */
            public Builder speechs(String speechs) {
                this.speechs = speechs;
                return this;
            }

            /**
             * <p>The start time of speech broadcasting. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1663210172207</p>
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
    /**
     * 
     * {@link PageQuerySpeechBroadcastHourResponseBody} extends {@link TeaModel}
     *
     * <p>PageQuerySpeechBroadcastHourResponseBody</p>
     */
    public static class ResultData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<ResultDataData> data;

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
        public java.util.List<ResultDataData> getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.List<ResultDataData> data; 

            private Builder() {
            } 

            private Builder(ResultData model) {
                this.data = model.data;
            } 

            /**
             * <p>The result returned if the call is successful.</p>
             */
            public Builder data(java.util.List<ResultDataData> data) {
                this.data = data;
                return this;
            }

            public ResultData build() {
                return new ResultData(this);
            } 

        } 

    }
    /**
     * 
     * {@link PageQuerySpeechBroadcastHourResponseBody} extends {@link TeaModel}
     *
     * <p>PageQuerySpeechBroadcastHourResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageId")
        private Integer pageId;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("PageToken")
        private String pageToken;

        @com.aliyun.core.annotation.NameInMap("ResultData")
        private ResultData resultData;

        @com.aliyun.core.annotation.NameInMap("Total")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageId = model.pageId;
                this.pageSize = model.pageSize;
                this.pageToken = model.pageToken;
                this.resultData = model.resultData;
                this.total = model.total;
            } 

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageId(Integer pageId) {
                this.pageId = pageId;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
             * <p>If <strong>PageToken</strong> is empty, no next page exists.</p>
             * 
             * <strong>example:</strong>
             * <p>TGlzdFJlc291cm****</p>
             */
            public Builder pageToken(String pageToken) {
                this.pageToken = pageToken;
                return this;
            }

            /**
             * <p>The shared speech broadcasting data returned.</p>
             */
            public Builder resultData(ResultData resultData) {
                this.resultData = resultData;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
