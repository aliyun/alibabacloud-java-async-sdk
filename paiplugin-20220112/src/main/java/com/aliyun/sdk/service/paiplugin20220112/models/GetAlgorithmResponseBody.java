// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAlgorithmResponseBody} extends {@link TeaModel}
 *
 * <p>GetAlgorithmResponseBody</p>
 */
public class GetAlgorithmResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private Integer errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    private GetAlgorithmResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlgorithmResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private Integer errorCode; 
        private String errorMessage; 
        private String requestId; 

        /**
         * 返回数据。
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 错误码。
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 错误信息。
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAlgorithmResponseBody build() {
            return new GetAlgorithmResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Id")
        private String id;

        @NameInMap("InferUserConfigMap")
        private String inferUserConfigMap;

        @NameInMap("Name")
        private String name;

        @NameInMap("TrainUserConfigMap")
        private String trainUserConfigMap;

        private Data(Builder builder) {
            this.description = builder.description;
            this.id = builder.id;
            this.inferUserConfigMap = builder.inferUserConfigMap;
            this.name = builder.name;
            this.trainUserConfigMap = builder.trainUserConfigMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return inferUserConfigMap
         */
        public String getInferUserConfigMap() {
            return this.inferUserConfigMap;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return trainUserConfigMap
         */
        public String getTrainUserConfigMap() {
            return this.trainUserConfigMap;
        }

        public static final class Builder {
            private String description; 
            private String id; 
            private String inferUserConfigMap; 
            private String name; 
            private String trainUserConfigMap; 

            /**
             * 算法说明。
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 算法Id。
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * 预测所需参数名与对应的参数说明。
             */
            public Builder inferUserConfigMap(String inferUserConfigMap) {
                this.inferUserConfigMap = inferUserConfigMap;
                return this;
            }

            /**
             * 算法名称。
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 训练所需参数名与对应的参数说明。
             */
            public Builder trainUserConfigMap(String trainUserConfigMap) {
                this.trainUserConfigMap = trainUserConfigMap;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
