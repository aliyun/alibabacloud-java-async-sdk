// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link BatchImportVehicleDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>BatchImportVehicleDeviceResponseBody</p>
 */
public class BatchImportVehicleDeviceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private BatchImportVehicleDeviceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchImportVehicleDeviceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(BatchImportVehicleDeviceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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

        public BatchImportVehicleDeviceResponseBody build() {
            return new BatchImportVehicleDeviceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchImportVehicleDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>BatchImportVehicleDeviceResponseBody</p>
     */
    public static class InvalidDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("DeviceModel")
        private String deviceModel;

        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("Manufacturer")
        private String manufacturer;

        private InvalidDetailList(Builder builder) {
            this.deviceId = builder.deviceId;
            this.deviceModel = builder.deviceModel;
            this.deviceName = builder.deviceName;
            this.errorMsg = builder.errorMsg;
            this.manufacturer = builder.manufacturer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvalidDetailList create() {
            return builder().build();
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return deviceModel
         */
        public String getDeviceModel() {
            return this.deviceModel;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return manufacturer
         */
        public String getManufacturer() {
            return this.manufacturer;
        }

        public static final class Builder {
            private String deviceId; 
            private String deviceModel; 
            private String deviceName; 
            private String errorMsg; 
            private String manufacturer; 

            private Builder() {
            } 

            private Builder(InvalidDetailList model) {
                this.deviceId = model.deviceId;
                this.deviceModel = model.deviceModel;
                this.deviceName = model.deviceName;
                this.errorMsg = model.errorMsg;
                this.manufacturer = model.manufacturer;
            } 

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * DeviceModel.
             */
            public Builder deviceModel(String deviceModel) {
                this.deviceModel = deviceModel;
                return this;
            }

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * ErrorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * Manufacturer.
             */
            public Builder manufacturer(String manufacturer) {
                this.manufacturer = manufacturer;
                return this;
            }

            public InvalidDetailList build() {
                return new InvalidDetailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchImportVehicleDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>BatchImportVehicleDeviceResponseBody</p>
     */
    public static class DataInvalidDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InvalidDetailList")
        private java.util.List<InvalidDetailList> invalidDetailList;

        private DataInvalidDetailList(Builder builder) {
            this.invalidDetailList = builder.invalidDetailList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataInvalidDetailList create() {
            return builder().build();
        }

        /**
         * @return invalidDetailList
         */
        public java.util.List<InvalidDetailList> getInvalidDetailList() {
            return this.invalidDetailList;
        }

        public static final class Builder {
            private java.util.List<InvalidDetailList> invalidDetailList; 

            private Builder() {
            } 

            private Builder(DataInvalidDetailList model) {
                this.invalidDetailList = model.invalidDetailList;
            } 

            /**
             * InvalidDetailList.
             */
            public Builder invalidDetailList(java.util.List<InvalidDetailList> invalidDetailList) {
                this.invalidDetailList = invalidDetailList;
                return this;
            }

            public DataInvalidDetailList build() {
                return new DataInvalidDetailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchImportVehicleDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>BatchImportVehicleDeviceResponseBody</p>
     */
    public static class InvalidDeviceIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("invalidDeviceIdList")
        private java.util.List<String> invalidDeviceIdList;

        private InvalidDeviceIdList(Builder builder) {
            this.invalidDeviceIdList = builder.invalidDeviceIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvalidDeviceIdList create() {
            return builder().build();
        }

        /**
         * @return invalidDeviceIdList
         */
        public java.util.List<String> getInvalidDeviceIdList() {
            return this.invalidDeviceIdList;
        }

        public static final class Builder {
            private java.util.List<String> invalidDeviceIdList; 

            private Builder() {
            } 

            private Builder(InvalidDeviceIdList model) {
                this.invalidDeviceIdList = model.invalidDeviceIdList;
            } 

            /**
             * invalidDeviceIdList.
             */
            public Builder invalidDeviceIdList(java.util.List<String> invalidDeviceIdList) {
                this.invalidDeviceIdList = invalidDeviceIdList;
                return this;
            }

            public InvalidDeviceIdList build() {
                return new InvalidDeviceIdList(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchImportVehicleDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>BatchImportVehicleDeviceResponseBody</p>
     */
    public static class InvalidDeviceModelList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("invalidDeviceModelList")
        private java.util.List<String> invalidDeviceModelList;

        private InvalidDeviceModelList(Builder builder) {
            this.invalidDeviceModelList = builder.invalidDeviceModelList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvalidDeviceModelList create() {
            return builder().build();
        }

        /**
         * @return invalidDeviceModelList
         */
        public java.util.List<String> getInvalidDeviceModelList() {
            return this.invalidDeviceModelList;
        }

        public static final class Builder {
            private java.util.List<String> invalidDeviceModelList; 

            private Builder() {
            } 

            private Builder(InvalidDeviceModelList model) {
                this.invalidDeviceModelList = model.invalidDeviceModelList;
            } 

            /**
             * invalidDeviceModelList.
             */
            public Builder invalidDeviceModelList(java.util.List<String> invalidDeviceModelList) {
                this.invalidDeviceModelList = invalidDeviceModelList;
                return this;
            }

            public InvalidDeviceModelList build() {
                return new InvalidDeviceModelList(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchImportVehicleDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>BatchImportVehicleDeviceResponseBody</p>
     */
    public static class InvalidDeviceNameList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InvalidDeviceNameList")
        private java.util.List<String> invalidDeviceNameList;

        private InvalidDeviceNameList(Builder builder) {
            this.invalidDeviceNameList = builder.invalidDeviceNameList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvalidDeviceNameList create() {
            return builder().build();
        }

        /**
         * @return invalidDeviceNameList
         */
        public java.util.List<String> getInvalidDeviceNameList() {
            return this.invalidDeviceNameList;
        }

        public static final class Builder {
            private java.util.List<String> invalidDeviceNameList; 

            private Builder() {
            } 

            private Builder(InvalidDeviceNameList model) {
                this.invalidDeviceNameList = model.invalidDeviceNameList;
            } 

            /**
             * InvalidDeviceNameList.
             */
            public Builder invalidDeviceNameList(java.util.List<String> invalidDeviceNameList) {
                this.invalidDeviceNameList = invalidDeviceNameList;
                return this;
            }

            public InvalidDeviceNameList build() {
                return new InvalidDeviceNameList(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchImportVehicleDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>BatchImportVehicleDeviceResponseBody</p>
     */
    public static class InvalidManufacturerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("invalidManufacturerList")
        private java.util.List<String> invalidManufacturerList;

        private InvalidManufacturerList(Builder builder) {
            this.invalidManufacturerList = builder.invalidManufacturerList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvalidManufacturerList create() {
            return builder().build();
        }

        /**
         * @return invalidManufacturerList
         */
        public java.util.List<String> getInvalidManufacturerList() {
            return this.invalidManufacturerList;
        }

        public static final class Builder {
            private java.util.List<String> invalidManufacturerList; 

            private Builder() {
            } 

            private Builder(InvalidManufacturerList model) {
                this.invalidManufacturerList = model.invalidManufacturerList;
            } 

            /**
             * invalidManufacturerList.
             */
            public Builder invalidManufacturerList(java.util.List<String> invalidManufacturerList) {
                this.invalidManufacturerList = invalidManufacturerList;
                return this;
            }

            public InvalidManufacturerList build() {
                return new InvalidManufacturerList(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchImportVehicleDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>BatchImportVehicleDeviceResponseBody</p>
     */
    public static class RepeatedDeviceIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("repeatedDeviceIdList")
        private java.util.List<String> repeatedDeviceIdList;

        private RepeatedDeviceIdList(Builder builder) {
            this.repeatedDeviceIdList = builder.repeatedDeviceIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RepeatedDeviceIdList create() {
            return builder().build();
        }

        /**
         * @return repeatedDeviceIdList
         */
        public java.util.List<String> getRepeatedDeviceIdList() {
            return this.repeatedDeviceIdList;
        }

        public static final class Builder {
            private java.util.List<String> repeatedDeviceIdList; 

            private Builder() {
            } 

            private Builder(RepeatedDeviceIdList model) {
                this.repeatedDeviceIdList = model.repeatedDeviceIdList;
            } 

            /**
             * repeatedDeviceIdList.
             */
            public Builder repeatedDeviceIdList(java.util.List<String> repeatedDeviceIdList) {
                this.repeatedDeviceIdList = repeatedDeviceIdList;
                return this;
            }

            public RepeatedDeviceIdList build() {
                return new RepeatedDeviceIdList(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchImportVehicleDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>BatchImportVehicleDeviceResponseBody</p>
     */
    public static class RepeatedDeviceNameList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RepeatedDeviceNameList")
        private java.util.List<String> repeatedDeviceNameList;

        private RepeatedDeviceNameList(Builder builder) {
            this.repeatedDeviceNameList = builder.repeatedDeviceNameList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RepeatedDeviceNameList create() {
            return builder().build();
        }

        /**
         * @return repeatedDeviceNameList
         */
        public java.util.List<String> getRepeatedDeviceNameList() {
            return this.repeatedDeviceNameList;
        }

        public static final class Builder {
            private java.util.List<String> repeatedDeviceNameList; 

            private Builder() {
            } 

            private Builder(RepeatedDeviceNameList model) {
                this.repeatedDeviceNameList = model.repeatedDeviceNameList;
            } 

            /**
             * RepeatedDeviceNameList.
             */
            public Builder repeatedDeviceNameList(java.util.List<String> repeatedDeviceNameList) {
                this.repeatedDeviceNameList = repeatedDeviceNameList;
                return this;
            }

            public RepeatedDeviceNameList build() {
                return new RepeatedDeviceNameList(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchImportVehicleDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>BatchImportVehicleDeviceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplyId")
        private Long applyId;

        @com.aliyun.core.annotation.NameInMap("InvalidDetailList")
        private DataInvalidDetailList invalidDetailList;

        @com.aliyun.core.annotation.NameInMap("InvalidDeviceIdList")
        private InvalidDeviceIdList invalidDeviceIdList;

        @com.aliyun.core.annotation.NameInMap("InvalidDeviceModelList")
        private InvalidDeviceModelList invalidDeviceModelList;

        @com.aliyun.core.annotation.NameInMap("InvalidDeviceNameList")
        private InvalidDeviceNameList invalidDeviceNameList;

        @com.aliyun.core.annotation.NameInMap("InvalidManufacturerList")
        private InvalidManufacturerList invalidManufacturerList;

        @com.aliyun.core.annotation.NameInMap("RepeatedDeviceIdList")
        private RepeatedDeviceIdList repeatedDeviceIdList;

        @com.aliyun.core.annotation.NameInMap("RepeatedDeviceNameList")
        private RepeatedDeviceNameList repeatedDeviceNameList;

        private Data(Builder builder) {
            this.applyId = builder.applyId;
            this.invalidDetailList = builder.invalidDetailList;
            this.invalidDeviceIdList = builder.invalidDeviceIdList;
            this.invalidDeviceModelList = builder.invalidDeviceModelList;
            this.invalidDeviceNameList = builder.invalidDeviceNameList;
            this.invalidManufacturerList = builder.invalidManufacturerList;
            this.repeatedDeviceIdList = builder.repeatedDeviceIdList;
            this.repeatedDeviceNameList = builder.repeatedDeviceNameList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return applyId
         */
        public Long getApplyId() {
            return this.applyId;
        }

        /**
         * @return invalidDetailList
         */
        public DataInvalidDetailList getInvalidDetailList() {
            return this.invalidDetailList;
        }

        /**
         * @return invalidDeviceIdList
         */
        public InvalidDeviceIdList getInvalidDeviceIdList() {
            return this.invalidDeviceIdList;
        }

        /**
         * @return invalidDeviceModelList
         */
        public InvalidDeviceModelList getInvalidDeviceModelList() {
            return this.invalidDeviceModelList;
        }

        /**
         * @return invalidDeviceNameList
         */
        public InvalidDeviceNameList getInvalidDeviceNameList() {
            return this.invalidDeviceNameList;
        }

        /**
         * @return invalidManufacturerList
         */
        public InvalidManufacturerList getInvalidManufacturerList() {
            return this.invalidManufacturerList;
        }

        /**
         * @return repeatedDeviceIdList
         */
        public RepeatedDeviceIdList getRepeatedDeviceIdList() {
            return this.repeatedDeviceIdList;
        }

        /**
         * @return repeatedDeviceNameList
         */
        public RepeatedDeviceNameList getRepeatedDeviceNameList() {
            return this.repeatedDeviceNameList;
        }

        public static final class Builder {
            private Long applyId; 
            private DataInvalidDetailList invalidDetailList; 
            private InvalidDeviceIdList invalidDeviceIdList; 
            private InvalidDeviceModelList invalidDeviceModelList; 
            private InvalidDeviceNameList invalidDeviceNameList; 
            private InvalidManufacturerList invalidManufacturerList; 
            private RepeatedDeviceIdList repeatedDeviceIdList; 
            private RepeatedDeviceNameList repeatedDeviceNameList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.applyId = model.applyId;
                this.invalidDetailList = model.invalidDetailList;
                this.invalidDeviceIdList = model.invalidDeviceIdList;
                this.invalidDeviceModelList = model.invalidDeviceModelList;
                this.invalidDeviceNameList = model.invalidDeviceNameList;
                this.invalidManufacturerList = model.invalidManufacturerList;
                this.repeatedDeviceIdList = model.repeatedDeviceIdList;
                this.repeatedDeviceNameList = model.repeatedDeviceNameList;
            } 

            /**
             * ApplyId.
             */
            public Builder applyId(Long applyId) {
                this.applyId = applyId;
                return this;
            }

            /**
             * InvalidDetailList.
             */
            public Builder invalidDetailList(DataInvalidDetailList invalidDetailList) {
                this.invalidDetailList = invalidDetailList;
                return this;
            }

            /**
             * InvalidDeviceIdList.
             */
            public Builder invalidDeviceIdList(InvalidDeviceIdList invalidDeviceIdList) {
                this.invalidDeviceIdList = invalidDeviceIdList;
                return this;
            }

            /**
             * InvalidDeviceModelList.
             */
            public Builder invalidDeviceModelList(InvalidDeviceModelList invalidDeviceModelList) {
                this.invalidDeviceModelList = invalidDeviceModelList;
                return this;
            }

            /**
             * InvalidDeviceNameList.
             */
            public Builder invalidDeviceNameList(InvalidDeviceNameList invalidDeviceNameList) {
                this.invalidDeviceNameList = invalidDeviceNameList;
                return this;
            }

            /**
             * InvalidManufacturerList.
             */
            public Builder invalidManufacturerList(InvalidManufacturerList invalidManufacturerList) {
                this.invalidManufacturerList = invalidManufacturerList;
                return this;
            }

            /**
             * RepeatedDeviceIdList.
             */
            public Builder repeatedDeviceIdList(RepeatedDeviceIdList repeatedDeviceIdList) {
                this.repeatedDeviceIdList = repeatedDeviceIdList;
                return this;
            }

            /**
             * RepeatedDeviceNameList.
             */
            public Builder repeatedDeviceNameList(RepeatedDeviceNameList repeatedDeviceNameList) {
                this.repeatedDeviceNameList = repeatedDeviceNameList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
