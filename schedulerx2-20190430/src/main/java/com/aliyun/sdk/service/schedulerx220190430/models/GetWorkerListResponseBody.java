// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetWorkerListResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkerListResponseBody</p>
 */
public class GetWorkerListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The job information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The additional information that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Cannot find product according to your domain.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4F68ABED-AC31-4412-9297-D9A8F0401108****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The call is successful.</li>
         * <li><strong>false</strong>: The call fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetWorkerListResponseBody build() {
            return new GetWorkerListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWorkerListResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkerListResponseBody</p>
     */
    public static class WorkerInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Starter")
        private String starter;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("WorkerAddress")
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
             * <p>The IP address of the worker.</p>
             * 
             * <strong>example:</strong>
             * <p>30.225.16.49</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The label of the worker.</p>
             * 
             * <strong>example:</strong>
             * <p>gray</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The port number of the worker.</p>
             * 
             * <strong>example:</strong>
             * <p>60831</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The startup method of the worker.</p>
             * 
             * <strong>example:</strong>
             * <p>springboot</p>
             */
            public Builder starter(String starter) {
                this.starter = starter;
                return this;
            }

            /**
             * <p>The version of the worker.</p>
             * 
             * <strong>example:</strong>
             * <p>1.3.4</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The address of the worker. The address is in the format of ${worker_id}@${worker_ip}:${worker_port}.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:030225016049_11734_25917@30.225.16.49">030225016049_11734_25917@30.225.16.49</a>:60831</p>
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
    /**
     * 
     * {@link GetWorkerListResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkerListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WorkerInfos")
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
             * <p>The worker information.</p>
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
