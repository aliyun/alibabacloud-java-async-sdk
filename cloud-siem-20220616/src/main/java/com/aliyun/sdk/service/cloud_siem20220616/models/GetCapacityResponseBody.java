// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCapacityResponseBody} extends {@link TeaModel}
 *
 * <p>GetCapacityResponseBody</p>
 */
public class GetCapacityResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("DyCode")
    private String dyCode;

    @NameInMap("DyMessage")
    private String dyMessage;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetCapacityResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.dyCode = builder.dyCode;
        this.dyMessage = builder.dyMessage;
        this.errCode = builder.errCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCapacityResponseBody create() {
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
     * @return dyCode
     */
    public String getDyCode() {
        return this.dyCode;
    }

    /**
     * @return dyMessage
     */
    public String getDyMessage() {
        return this.dyMessage;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
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
        private String dyCode; 
        private String dyMessage; 
        private String errCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
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
         * DyCode.
         */
        public Builder dyCode(String dyCode) {
            this.dyCode = dyCode;
            return this;
        }

        /**
         * DyMessage.
         */
        public Builder dyMessage(String dyMessage) {
            this.dyMessage = dyMessage;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
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

        public GetCapacityResponseBody build() {
            return new GetCapacityResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ExistLogStore")
        private Boolean existLogStore;

        @NameInMap("PreservedCapacity")
        private Long preservedCapacity;

        @NameInMap("UsedCapacity")
        private Double usedCapacity;

        private Data(Builder builder) {
            this.existLogStore = builder.existLogStore;
            this.preservedCapacity = builder.preservedCapacity;
            this.usedCapacity = builder.usedCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return existLogStore
         */
        public Boolean getExistLogStore() {
            return this.existLogStore;
        }

        /**
         * @return preservedCapacity
         */
        public Long getPreservedCapacity() {
            return this.preservedCapacity;
        }

        /**
         * @return usedCapacity
         */
        public Double getUsedCapacity() {
            return this.usedCapacity;
        }

        public static final class Builder {
            private Boolean existLogStore; 
            private Long preservedCapacity; 
            private Double usedCapacity; 

            /**
             * ExistLogStore.
             */
            public Builder existLogStore(Boolean existLogStore) {
                this.existLogStore = existLogStore;
                return this;
            }

            /**
             * PreservedCapacity.
             */
            public Builder preservedCapacity(Long preservedCapacity) {
                this.preservedCapacity = preservedCapacity;
                return this;
            }

            /**
             * UsedCapacity.
             */
            public Builder usedCapacity(Double usedCapacity) {
                this.usedCapacity = usedCapacity;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
