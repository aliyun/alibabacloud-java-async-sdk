// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceMeshLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceMeshLogsResponseBody</p>
 */
public class DescribeServiceMeshLogsResponseBody extends TeaModel {
    @NameInMap("Logs")
    private java.util.List < Logs> logs;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeServiceMeshLogsResponseBody(Builder builder) {
        this.logs = builder.logs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceMeshLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return logs
     */
    public java.util.List < Logs> getLogs() {
        return this.logs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Logs> logs; 
        private String requestId; 

        /**
         * The details of the logs.
         */
        public Builder logs(java.util.List < Logs> logs) {
            this.logs = logs;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeServiceMeshLogsResponseBody build() {
            return new DescribeServiceMeshLogsResponseBody(this);
        } 

    } 

    public static class Logs extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Log")
        private String log;

        @NameInMap("ServiceMeshId")
        private String serviceMeshId;

        private Logs(Builder builder) {
            this.creationTime = builder.creationTime;
            this.log = builder.log;
            this.serviceMeshId = builder.serviceMeshId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logs create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return log
         */
        public String getLog() {
            return this.log;
        }

        /**
         * @return serviceMeshId
         */
        public String getServiceMeshId() {
            return this.serviceMeshId;
        }

        public static final class Builder {
            private String creationTime; 
            private String log; 
            private String serviceMeshId; 

            /**
             * The point in time when the logs were generated.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The content of the logs.
             */
            public Builder log(String log) {
                this.log = log;
                return this;
            }

            /**
             * The ID of the ASM instance.
             */
            public Builder serviceMeshId(String serviceMeshId) {
                this.serviceMeshId = serviceMeshId;
                return this;
            }

            public Logs build() {
                return new Logs(this);
            } 

        } 

    }
}
