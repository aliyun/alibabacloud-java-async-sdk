// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeModelServiceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeModelServiceResponseBody</p>
 */
public class DescribeModelServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeModelServiceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeModelServiceResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
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

        public DescribeModelServiceResponseBody build() {
            return new DescribeModelServiceResponseBody(this);
        } 

    } 

    public static class ModelApiList extends TeaModel {
        @NameInMap("AlgorithmApiCode")
        private String algorithmApiCode;

        @NameInMap("ApiId")
        private String apiId;

        @NameInMap("ApiName")
        private String apiName;

        @NameInMap("ApiPath")
        private String apiPath;

        @NameInMap("CreateTime")
        private String createTime;

        private ModelApiList(Builder builder) {
            this.algorithmApiCode = builder.algorithmApiCode;
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.apiPath = builder.apiPath;
            this.createTime = builder.createTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelApiList create() {
            return builder().build();
        }

        /**
         * @return algorithmApiCode
         */
        public String getAlgorithmApiCode() {
            return this.algorithmApiCode;
        }

        /**
         * @return apiId
         */
        public String getApiId() {
            return this.apiId;
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return apiPath
         */
        public String getApiPath() {
            return this.apiPath;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        public static final class Builder {
            private String algorithmApiCode; 
            private String apiId; 
            private String apiName; 
            private String apiPath; 
            private String createTime; 

            /**
             * AlgorithmApiCode.
             */
            public Builder algorithmApiCode(String algorithmApiCode) {
                this.algorithmApiCode = algorithmApiCode;
                return this;
            }

            /**
             * ApiId.
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * ApiName.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * ApiPath.
             */
            public Builder apiPath(String apiPath) {
                this.apiPath = apiPath;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            public ModelApiList build() {
                return new ModelApiList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AlgorithmCode")
        private String algorithmCode;

        @NameInMap("AppCode")
        private String appCode;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ModelApiList")
        private java.util.List < ModelApiList> modelApiList;

        @NameInMap("ModelServiceInstanceId")
        private String modelServiceInstanceId;

        @NameInMap("ModelServiceInstanceName")
        private String modelServiceInstanceName;

        @NameInMap("ModelServiceStatus")
        private String modelServiceStatus;

        @NameInMap("Qps")
        private Long qps;

        private Data(Builder builder) {
            this.algorithmCode = builder.algorithmCode;
            this.appCode = builder.appCode;
            this.createTime = builder.createTime;
            this.modelApiList = builder.modelApiList;
            this.modelServiceInstanceId = builder.modelServiceInstanceId;
            this.modelServiceInstanceName = builder.modelServiceInstanceName;
            this.modelServiceStatus = builder.modelServiceStatus;
            this.qps = builder.qps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return algorithmCode
         */
        public String getAlgorithmCode() {
            return this.algorithmCode;
        }

        /**
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return modelApiList
         */
        public java.util.List < ModelApiList> getModelApiList() {
            return this.modelApiList;
        }

        /**
         * @return modelServiceInstanceId
         */
        public String getModelServiceInstanceId() {
            return this.modelServiceInstanceId;
        }

        /**
         * @return modelServiceInstanceName
         */
        public String getModelServiceInstanceName() {
            return this.modelServiceInstanceName;
        }

        /**
         * @return modelServiceStatus
         */
        public String getModelServiceStatus() {
            return this.modelServiceStatus;
        }

        /**
         * @return qps
         */
        public Long getQps() {
            return this.qps;
        }

        public static final class Builder {
            private String algorithmCode; 
            private String appCode; 
            private String createTime; 
            private java.util.List < ModelApiList> modelApiList; 
            private String modelServiceInstanceId; 
            private String modelServiceInstanceName; 
            private String modelServiceStatus; 
            private Long qps; 

            /**
             * AlgorithmCode.
             */
            public Builder algorithmCode(String algorithmCode) {
                this.algorithmCode = algorithmCode;
                return this;
            }

            /**
             * AppCode.
             */
            public Builder appCode(String appCode) {
                this.appCode = appCode;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ModelApiList.
             */
            public Builder modelApiList(java.util.List < ModelApiList> modelApiList) {
                this.modelApiList = modelApiList;
                return this;
            }

            /**
             * ModelServiceInstanceId.
             */
            public Builder modelServiceInstanceId(String modelServiceInstanceId) {
                this.modelServiceInstanceId = modelServiceInstanceId;
                return this;
            }

            /**
             * ModelServiceInstanceName.
             */
            public Builder modelServiceInstanceName(String modelServiceInstanceName) {
                this.modelServiceInstanceName = modelServiceInstanceName;
                return this;
            }

            /**
             * ModelServiceStatus.
             */
            public Builder modelServiceStatus(String modelServiceStatus) {
                this.modelServiceStatus = modelServiceStatus;
                return this;
            }

            /**
             * Qps.
             */
            public Builder qps(Long qps) {
                this.qps = qps;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
