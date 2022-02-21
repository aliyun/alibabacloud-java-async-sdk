// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWorkerListResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkerListResponseBody</p>
 */
public class GetWorkerListResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetWorkerListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkerListResponseBody create() {
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
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
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

        public GetWorkerListResponseBody build() {
            return new GetWorkerListResponseBody(this);
        } 

    } 

    public static class WorkerInfos extends TeaModel {
        @NameInMap("Ip")
        private String ip;

        @NameInMap("Label")
        private String label;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("Starter")
        private String starter;

        @NameInMap("Version")
        private String version;

        @NameInMap("WorkerAddress")
        private String workerAddress;

        private WorkerInfos(Builder builder) {
            this.ip = builder.ip;
            this.label = builder.label;
            this.port = builder.port;
            this.starter = builder.starter;
            this.version = builder.version;
            this.workerAddress = builder.workerAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkerInfos create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return starter
         */
        public String getStarter() {
            return this.starter;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return workerAddress
         */
        public String getWorkerAddress() {
            return this.workerAddress;
        }

        public static final class Builder {
            private String ip; 
            private String label; 
            private Integer port; 
            private String starter; 
            private String version; 
            private String workerAddress; 

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * Starter.
             */
            public Builder starter(String starter) {
                this.starter = starter;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * WorkerAddress.
             */
            public Builder workerAddress(String workerAddress) {
                this.workerAddress = workerAddress;
                return this;
            }

            public WorkerInfos build() {
                return new WorkerInfos(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("WorkerInfos")
        private java.util.List < WorkerInfos> workerInfos;

        private Data(Builder builder) {
            this.workerInfos = builder.workerInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return workerInfos
         */
        public java.util.List < WorkerInfos> getWorkerInfos() {
            return this.workerInfos;
        }

        public static final class Builder {
            private java.util.List < WorkerInfos> workerInfos; 

            /**
             * WorkerInfos.
             */
            public Builder workerInfos(java.util.List < WorkerInfos> workerInfos) {
                this.workerInfos = workerInfos;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
