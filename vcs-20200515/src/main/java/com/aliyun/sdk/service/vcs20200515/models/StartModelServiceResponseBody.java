// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartModelServiceResponseBody} extends {@link TeaModel}
 *
 * <p>StartModelServiceResponseBody</p>
 */
public class StartModelServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private StartModelServiceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartModelServiceResponseBody create() {
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

        public StartModelServiceResponseBody build() {
            return new StartModelServiceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ModelServiceInstanceId")
        private String modelServiceInstanceId;

        @NameInMap("ModelServiceInstanceName")
        private Integer modelServiceInstanceName;

        @NameInMap("ModelServiceStatus")
        private String modelServiceStatus;

        private Data(Builder builder) {
            this.modelServiceInstanceId = builder.modelServiceInstanceId;
            this.modelServiceInstanceName = builder.modelServiceInstanceName;
            this.modelServiceStatus = builder.modelServiceStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
        public Integer getModelServiceInstanceName() {
            return this.modelServiceInstanceName;
        }

        /**
         * @return modelServiceStatus
         */
        public String getModelServiceStatus() {
            return this.modelServiceStatus;
        }

        public static final class Builder {
            private String modelServiceInstanceId; 
            private Integer modelServiceInstanceName; 
            private String modelServiceStatus; 

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
            public Builder modelServiceInstanceName(Integer modelServiceInstanceName) {
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
