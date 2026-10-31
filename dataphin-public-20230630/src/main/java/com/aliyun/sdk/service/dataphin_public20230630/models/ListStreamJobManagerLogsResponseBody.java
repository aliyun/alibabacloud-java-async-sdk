// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ListStreamJobManagerLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListStreamJobManagerLogsResponseBody</p>
 */
public class ListStreamJobManagerLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListStreamJobManagerLogsResponseBody(Builder builder) {
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

    public static ListStreamJobManagerLogsResponseBody create() {
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListStreamJobManagerLogsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The backend response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The log file entries for JobManager or TaskManager. The logName parameter can be used to retrieve the log content.</p>
         */
        public Builder data(java.util.List<Data> data) {
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
         * <p>The details of the backend exception.</p>
         * 
         * <strong>example:</strong>
         * <p>internal error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListStreamJobManagerLogsResponseBody build() {
            return new ListStreamJobManagerLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListStreamJobManagerLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListStreamJobManagerLogsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogName")
        private String logName;

        @com.aliyun.core.annotation.NameInMap("Mtime")
        private Long mtime;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        private Data(Builder builder) {
            this.logName = builder.logName;
            this.mtime = builder.mtime;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return logName
         */
        public String getLogName() {
            return this.logName;
        }

        /**
         * @return mtime
         */
        public Long getMtime() {
            return this.mtime;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        public static final class Builder {
            private String logName; 
            private Long mtime; 
            private Long size; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.logName = model.logName;
                this.mtime = model.mtime;
                this.size = model.size;
            } 

            /**
             * <p>The original name of the log file, which corresponds to the LogName input parameter of GetStreamLogContent. Pass this value exactly as returned.</p>
             * 
             * <strong>example:</strong>
             * <p>flink--standalonesession-0-dataphin-session-7db678957dc449aab0086b931c9f8218-jobmanager.log</p>
             */
            public Builder logName(String logName) {
                this.logName = logName;
                return this;
            }

            /**
             * <p>The last modified time of the log file, as a millisecond timestamp since the Unix epoch.</p>
             * 
             * <strong>example:</strong>
             * <p>1792033500000</p>
             */
            public Builder mtime(Long mtime) {
                this.mtime = mtime;
                return this;
            }

            /**
             * <p>The size of the log file, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1048576</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
