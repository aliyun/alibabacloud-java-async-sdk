// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDISyncTaskConfigProcessResultResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDISyncTaskConfigProcessResultResponseBody</p>
 */
public class QueryDISyncTaskConfigProcessResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryDISyncTaskConfigProcessResultResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDISyncTaskConfigProcessResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * The information returned for the parameters that are asynchronously generated and used to create or update a real-time synchronization task in Data Integration.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID. You can locate logs and troubleshoot issues based on the ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryDISyncTaskConfigProcessResultResponseBody build() {
            return new QueryDISyncTaskConfigProcessResultResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskContent")
        private String taskContent;

        private Data(Builder builder) {
            this.message = builder.message;
            this.status = builder.status;
            this.taskContent = builder.taskContent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskContent
         */
        public String getTaskContent() {
            return this.taskContent;
        }

        public static final class Builder {
            private String message; 
            private String status; 
            private String taskContent; 

            /**
             * The reason why the parameters fail to be obtained. If the parameters are obtained, the value null is returned.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Indicates whether the parameters are obtained. Valid values:
             * <p>
             * 
             * *   success: The parameters are obtained.
             * *   fail: The parameters fail to be obtained. You can view the reason for the failure and troubleshoot the issue based on the reason.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The parameters that are obtained. The parameters are used as the request parameters of the [CreateDISyncTask](~~278725~~) or [UpdateDISyncTask](~~289109~~) operation to create or update a real-time synchronization task in Data Integration.
             */
            public Builder taskContent(String taskContent) {
                this.taskContent = taskContent;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
