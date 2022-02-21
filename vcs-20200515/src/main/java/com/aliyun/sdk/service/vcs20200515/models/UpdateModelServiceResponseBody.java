// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateModelServiceResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateModelServiceResponseBody</p>
 */
public class UpdateModelServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateModelServiceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateModelServiceResponseBody create() {
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

        public UpdateModelServiceResponseBody build() {
            return new UpdateModelServiceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AlgorithmCode")
        private String algorithmCode;

        @NameInMap("ModelServiceInstanceId")
        private String modelServiceInstanceId;

        @NameInMap("ModelServiceInstanceName")
        private String modelServiceInstanceName;

        @NameInMap("ModelServiceStatus")
        private String modelServiceStatus;

        @NameInMap("QpsRequired")
        private Integer qpsRequired;

        private Data(Builder builder) {
            this.algorithmCode = builder.algorithmCode;
            this.modelServiceInstanceId = builder.modelServiceInstanceId;
            this.modelServiceInstanceName = builder.modelServiceInstanceName;
            this.modelServiceStatus = builder.modelServiceStatus;
            this.qpsRequired = builder.qpsRequired;
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
         * @return qpsRequired
         */
        public Integer getQpsRequired() {
            return this.qpsRequired;
        }

        public static final class Builder {
            private String algorithmCode; 
            private String modelServiceInstanceId; 
            private String modelServiceInstanceName; 
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
             * QpsRequired.
             */
            public Builder qpsRequired(Integer qpsRequired) {
                this.qpsRequired = qpsRequired;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
