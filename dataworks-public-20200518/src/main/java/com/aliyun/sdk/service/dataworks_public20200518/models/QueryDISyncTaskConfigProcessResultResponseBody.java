// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDISyncTaskConfigProcessResultResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDISyncTaskConfigProcessResultResponseBody</p>
 */
public class QueryDISyncTaskConfigProcessResultResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Indicates whether the parameters are obtained. Valid values:
         * <p>
         * 
         * *   success: indicates that the parameters are obtained.
         * *   fail: indicates that the parameters fail to be obtained. You can view the reason for the failure and troubleshoot the issue based on the reason.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The information returned for the parameters that are asynchronously generated and used to create or update a real-time synchronization node or a synchronization solution in Data Integration.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the request. You can locate logs and troubleshoot issues based on the ID.
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
        @NameInMap("Message")
        private String message;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaskContent")
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
             * The parameters that are obtained. The parameters are used as the request parameters of the [CreateDISyncTask](~~278725~~) or [UpdateDISyncTask](~~289109~~) operation to create or update a real-time synchronization node or a synchronization solution in Data Integration.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The reason why the parameters fail to be obtained. If the parameters are obtained, the value null is returned.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TaskContent.
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
