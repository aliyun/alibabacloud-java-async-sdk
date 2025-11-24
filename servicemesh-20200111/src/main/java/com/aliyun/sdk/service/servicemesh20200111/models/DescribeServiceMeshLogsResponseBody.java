// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link DescribeServiceMeshLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceMeshLogsResponseBody</p>
 */
public class DescribeServiceMeshLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Logs")
    private java.util.List<Logs> logs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logs
     */
    public java.util.List<Logs> getLogs() {
        return this.logs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Logs> logs; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeServiceMeshLogsResponseBody model) {
            this.logs = model.logs;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the logs.</p>
         */
        public Builder logs(java.util.List<Logs> logs) {
            this.logs = logs;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>31d3a0f0-07ed-4f6e-9004-1804498c****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeServiceMeshLogsResponseBody build() {
            return new DescribeServiceMeshLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeServiceMeshLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshLogsResponseBody</p>
     */
    public static class Logs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Log")
        private String log;

        @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
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

            private Builder() {
            } 

            private Builder(Logs model) {
                this.creationTime = model.creationTime;
                this.log = model.log;
                this.serviceMeshId = model.serviceMeshId;
            } 

            /**
             * <p>The point in time when the logs were generated.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-19T15:21:53+08:00</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The content of the logs.</p>
             * 
             * <strong>example:</strong>
             * <p>[RequestID: 31d3a0f0-07ed-4f6e-9004-1804498c****, UID-110982038403****] c096d641835af4658827a4c66c234**** | Start to add cluster c186a6d9641a24098b5499d4d8313****</p>
             */
            public Builder log(String log) {
                this.log = log;
                return this;
            }

            /**
             * <p>The ASM instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ca04bc38979214bf2882be79d39b4****</p>
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
