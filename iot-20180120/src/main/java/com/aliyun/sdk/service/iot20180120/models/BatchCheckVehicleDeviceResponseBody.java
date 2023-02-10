// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchCheckVehicleDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>BatchCheckVehicleDeviceResponseBody</p>
 */
public class BatchCheckVehicleDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private BatchCheckVehicleDeviceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCheckVehicleDeviceResponseBody create() {
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
        private Data data; 
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
        public Builder data(Data data) {
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

        public BatchCheckVehicleDeviceResponseBody build() {
            return new BatchCheckVehicleDeviceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("InvalidDeviceIdList")
        private java.util.List < String > invalidDeviceIdList;

        @NameInMap("InvalidDeviceModelList")
        private java.util.List < String > invalidDeviceModelList;

        @NameInMap("InvalidManufacturerList")
        private java.util.List < String > invalidManufacturerList;

        @NameInMap("RepeatedDeviceIdList")
        private java.util.List < String > repeatedDeviceIdList;

        private Data(Builder builder) {
            this.invalidDeviceIdList = builder.invalidDeviceIdList;
            this.invalidDeviceModelList = builder.invalidDeviceModelList;
            this.invalidManufacturerList = builder.invalidManufacturerList;
            this.repeatedDeviceIdList = builder.repeatedDeviceIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return invalidDeviceIdList
         */
        public java.util.List < String > getInvalidDeviceIdList() {
            return this.invalidDeviceIdList;
        }

        /**
         * @return invalidDeviceModelList
         */
        public java.util.List < String > getInvalidDeviceModelList() {
            return this.invalidDeviceModelList;
        }

        /**
         * @return invalidManufacturerList
         */
        public java.util.List < String > getInvalidManufacturerList() {
            return this.invalidManufacturerList;
        }

        /**
         * @return repeatedDeviceIdList
         */
        public java.util.List < String > getRepeatedDeviceIdList() {
            return this.repeatedDeviceIdList;
        }

        public static final class Builder {
            private java.util.List < String > invalidDeviceIdList; 
            private java.util.List < String > invalidDeviceModelList; 
            private java.util.List < String > invalidManufacturerList; 
            private java.util.List < String > repeatedDeviceIdList; 

            /**
             * InvalidDeviceIdList.
             */
            public Builder invalidDeviceIdList(java.util.List < String > invalidDeviceIdList) {
                this.invalidDeviceIdList = invalidDeviceIdList;
                return this;
            }

            /**
             * InvalidDeviceModelList.
             */
            public Builder invalidDeviceModelList(java.util.List < String > invalidDeviceModelList) {
                this.invalidDeviceModelList = invalidDeviceModelList;
                return this;
            }

            /**
             * InvalidManufacturerList.
             */
            public Builder invalidManufacturerList(java.util.List < String > invalidManufacturerList) {
                this.invalidManufacturerList = invalidManufacturerList;
                return this;
            }

            /**
             * RepeatedDeviceIdList.
             */
            public Builder repeatedDeviceIdList(java.util.List < String > repeatedDeviceIdList) {
                this.repeatedDeviceIdList = repeatedDeviceIdList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
