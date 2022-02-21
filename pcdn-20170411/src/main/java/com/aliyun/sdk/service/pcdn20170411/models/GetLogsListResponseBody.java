// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLogsListResponseBody} extends {@link TeaModel}
 *
 * <p>GetLogsListResponseBody</p>
 */
public class GetLogsListResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("LogList")
    private LogList logList;

    @NameInMap("RequestId")
    private String requestId;

    private GetLogsListResponseBody(Builder builder) {
        this.code = builder.code;
        this.logList = builder.logList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLogsListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return logList
     */
    public LogList getLogList() {
        return this.logList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private LogList logList; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * LogList.
         */
        public Builder logList(LogList logList) {
            this.logList = logList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetLogsListResponseBody build() {
            return new GetLogsListResponseBody(this);
        } 

    } 

    public static class Log extends TeaModel {
        @NameInMap("EndDate")
        private String endDate;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("StartDate")
        private String startDate;

        @NameInMap("Url")
        private String url;

        private Log(Builder builder) {
            this.endDate = builder.endDate;
            this.fileName = builder.fileName;
            this.startDate = builder.startDate;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Log create() {
            return builder().build();
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String endDate; 
            private String fileName; 
            private String startDate; 
            private String url; 

            /**
             * EndDate.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * StartDate.
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Log build() {
                return new Log(this);
            } 

        } 

    }
    public static class LogList extends TeaModel {
        @NameInMap("Log")
        private java.util.List < Log> log;

        private LogList(Builder builder) {
            this.log = builder.log;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogList create() {
            return builder().build();
        }

        /**
         * @return log
         */
        public java.util.List < Log> getLog() {
            return this.log;
        }

        public static final class Builder {
            private java.util.List < Log> log; 

            /**
             * Log.
             */
            public Builder log(java.util.List < Log> log) {
                this.log = log;
                return this;
            }

            public LogList build() {
                return new LogList(this);
            } 

        } 

    }
}
