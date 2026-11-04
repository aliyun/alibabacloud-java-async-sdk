// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link QueryDeviceEventRecordResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDeviceEventRecordResponseBody</p>
 */
public class QueryDeviceEventRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryDeviceEventRecordResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceEventRecordResponseBody create() {
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
    public java.util.List<Data> getData() {
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
        private Integer code; 
        private java.util.List<Data> data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryDeviceEventRecordResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code:</p>
         * <ul>
         * <li><strong>200</strong>: The call was successful.</li>
         * <li>Other: An error code. For more information, see <a href="https://help.aliyun.com/document_detail/145071.html">Error codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The query results.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>tenant auth error</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>06DC77A0-4622-42DB-9EE0-25FIOHS82JK1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful:</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryDeviceEventRecordResponseBody build() {
            return new QueryDeviceEventRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDeviceEventRecordResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceEventRecordResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private String beginTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("VodUrl")
        private String vodUrl;

        private Data(Builder builder) {
            this.beginTime = builder.beginTime;
            this.endTime = builder.endTime;
            this.fileName = builder.fileName;
            this.vodUrl = builder.vodUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return beginTime
         */
        public String getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return vodUrl
         */
        public String getVodUrl() {
            return this.vodUrl;
        }

        public static final class Builder {
            private String beginTime; 
            private String endTime; 
            private String fileName; 
            private String vodUrl; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.beginTime = model.beginTime;
                this.endTime = model.endTime;
                this.fileName = model.fileName;
                this.vodUrl = model.vodUrl;
            } 

            /**
             * <p>The start time of the recording.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-08 15:55:35</p>
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * <p>The end time of the recording.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-08 15:56:32</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The name of the recording file.</p>
             * 
             * <strong>example:</strong>
             * <p>file1</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The URL of the recording file.</p>
             * <blockquote>
             * <p>The URL contains authentication information and is valid only for a single use. It cannot be reused.</p>
             * </blockquote>
             */
            public Builder vodUrl(String vodUrl) {
                this.vodUrl = vodUrl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
