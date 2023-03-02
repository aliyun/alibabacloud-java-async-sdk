// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateDISyncTaskConfigForUpdatingResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateDISyncTaskConfigForUpdatingResponseBody</p>
 */
public class GenerateDISyncTaskConfigForUpdatingResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GenerateDISyncTaskConfigForUpdatingResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateDISyncTaskConfigForUpdatingResponseBody create() {
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
         * The information returned for the ID of the asynchronous thread.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request. You can locate logs and troubleshoot issues based on the ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   true: The request is successful.
         * *   false: The request fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GenerateDISyncTaskConfigForUpdatingResponseBody build() {
            return new GenerateDISyncTaskConfigForUpdatingResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Message")
        private String message;

        @NameInMap("ProcessId")
        private Long processId;

        @NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.message = builder.message;
            this.processId = builder.processId;
            this.status = builder.status;
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
         * @return processId
         */
        public Long getProcessId() {
            return this.processId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String message; 
            private Long processId; 
            private String status; 

            /**
             * The reason why the ID of the asynchronous thread fails to be generated. If the ID is successfully generated, the value null is returned.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The ID of the asynchronous thread. You can call the [QueryDISyncTaskConfigProcessResult](~~383465~~) operation to obtain the asynchronously generated parameters based on the ID. The parameters are used to update a real-time synchronization node or a synchronization solution in Data Integration.
             */
            public Builder processId(Long processId) {
                this.processId = processId;
                return this;
            }

            /**
             * Indicates whether the ID of the asynchronous thread is generated. Valid values:
             * <p>
             * 
             * *   success: indicates that the ID of the asynchronous thread is generated.
             * *   fail: indicates that the ID of the asynchronous thread fails to be generated. You can view the reason for the failure and troubleshoot the issue based on the reason.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
