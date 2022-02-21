// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeModelServiceListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeModelServiceListResponseBody</p>
 */
public class DescribeModelServiceListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeModelServiceListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeModelServiceListResponseBody create() {
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

        public DescribeModelServiceListResponseBody build() {
            return new DescribeModelServiceListResponseBody(this);
        } 

    } 

    public static class ModelList extends TeaModel {
        @NameInMap("AlgorithmCode")
        private String algorithmCode;

        @NameInMap("AppCode")
        private String appCode;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ModelServiceInstanceId")
        private String modelServiceInstanceId;

        @NameInMap("ModelServiceName")
        private String modelServiceName;

        @NameInMap("ModelServiceStatus")
        private String modelServiceStatus;

        @NameInMap("QpsRequired")
        private Integer qpsRequired;

        private ModelList(Builder builder) {
            this.algorithmCode = builder.algorithmCode;
            this.appCode = builder.appCode;
            this.createTime = builder.createTime;
            this.modelServiceInstanceId = builder.modelServiceInstanceId;
            this.modelServiceName = builder.modelServiceName;
            this.modelServiceStatus = builder.modelServiceStatus;
            this.qpsRequired = builder.qpsRequired;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelList create() {
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
         * @return modelServiceInstanceId
         */
        public String getModelServiceInstanceId() {
            return this.modelServiceInstanceId;
        }

        /**
         * @return modelServiceName
         */
        public String getModelServiceName() {
            return this.modelServiceName;
        }

        /**
         * @return modelServiceStatus
         */
        public String getModelServiceStatus() {
            return this.modelServiceStatus;
        }

        /**
         * @return qpsRequired
         */
        public Integer getQpsRequired() {
            return this.qpsRequired;
        }

        public static final class Builder {
            private String algorithmCode; 
            private String appCode; 
            private String createTime; 
            private String modelServiceInstanceId; 
            private String modelServiceName; 
            private String modelServiceStatus; 
            private Integer qpsRequired; 

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
             * ModelServiceInstanceId.
             */
            public Builder modelServiceInstanceId(String modelServiceInstanceId) {
                this.modelServiceInstanceId = modelServiceInstanceId;
                return this;
            }

            /**
             * ModelServiceName.
             */
            public Builder modelServiceName(String modelServiceName) {
                this.modelServiceName = modelServiceName;
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
             * QpsRequired.
             */
            public Builder qpsRequired(Integer qpsRequired) {
                this.qpsRequired = qpsRequired;
                return this;
            }

            public ModelList build() {
                return new ModelList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ModelList")
        private java.util.List < ModelList> modelList;

        @NameInMap("Total")
        private String total;

        private Data(Builder builder) {
            this.modelList = builder.modelList;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return modelList
         */
        public java.util.List < ModelList> getModelList() {
            return this.modelList;
        }

        /**
         * @return total
         */
        public String getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < ModelList> modelList; 
            private String total; 

            /**
             * ModelList.
             */
            public Builder modelList(java.util.List < ModelList> modelList) {
                this.modelList = modelList;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(String total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
