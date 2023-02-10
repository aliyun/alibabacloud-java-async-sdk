// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchGetDeviceBindStatusResponseBody} extends {@link TeaModel}
 *
 * <p>BatchGetDeviceBindStatusResponseBody</p>
 */
public class BatchGetDeviceBindStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private BatchGetDeviceBindStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetDeviceBindStatusResponseBody create() {
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
    public java.util.List < Data> getData() {
        return this.data;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

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
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * RequestId.
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

        public BatchGetDeviceBindStatusResponseBody build() {
            return new BatchGetDeviceBindStatusResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BindStatus")
        private Integer bindStatus;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("IotId")
        private String iotId;

        private Data(Builder builder) {
            this.bindStatus = builder.bindStatus;
            this.instanceId = builder.instanceId;
            this.iotId = builder.iotId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bindStatus
         */
        public Integer getBindStatus() {
            return this.bindStatus;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        public static final class Builder {
            private Integer bindStatus; 
            private String instanceId; 
            private String iotId; 

            /**
             * BindStatus.
             */
            public Builder bindStatus(Integer bindStatus) {
                this.bindStatus = bindStatus;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * IotId.
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
