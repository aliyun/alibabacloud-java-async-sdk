// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRetcodeLogstoreResponseBody} extends {@link TeaModel}
 *
 * <p>GetRetcodeLogstoreResponseBody</p>
 */
public class GetRetcodeLogstoreResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetRetcodeLogstoreResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRetcodeLogstoreResponseBody create() {
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

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The returned struct.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRetcodeLogstoreResponseBody build() {
            return new GetRetcodeLogstoreResponseBody(this);
        } 

    } 

    public static class RetcodeSLSConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Logstore")
        private String logstore;

        @com.aliyun.core.annotation.NameInMap("Project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private RetcodeSLSConfig(Builder builder) {
            this.logstore = builder.logstore;
            this.project = builder.project;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RetcodeSLSConfig create() {
            return builder().build();
        }

        /**
         * @return logstore
         */
        public String getLogstore() {
            return this.logstore;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String logstore; 
            private String project; 
            private String regionId; 

            /**
             * The Log Service Logstore.
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * The Log Service project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public RetcodeSLSConfig build() {
                return new RetcodeSLSConfig(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("RetcodeSLSConfig")
        private RetcodeSLSConfig retcodeSLSConfig;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.message = builder.message;
            this.retcodeSLSConfig = builder.retcodeSLSConfig;
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
         * @return retcodeSLSConfig
         */
        public RetcodeSLSConfig getRetcodeSLSConfig() {
            return this.retcodeSLSConfig;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String message; 
            private RetcodeSLSConfig retcodeSLSConfig; 
            private String status; 

            /**
             * The content of the log.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The information about Log Service.
             */
            public Builder retcodeSLSConfig(RetcodeSLSConfig retcodeSLSConfig) {
                this.retcodeSLSConfig = retcodeSLSConfig;
                return this;
            }

            /**
             * The status of the request.
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
