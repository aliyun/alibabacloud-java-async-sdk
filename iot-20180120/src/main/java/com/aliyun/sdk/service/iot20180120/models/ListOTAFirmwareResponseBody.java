// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOTAFirmwareResponseBody} extends {@link TeaModel}
 *
 * <p>ListOTAFirmwareResponseBody</p>
 */
public class ListOTAFirmwareResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("FirmwareInfo")
    private FirmwareInfo firmwareInfo;

    @NameInMap("PageCount")
    private Integer pageCount;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
    private Integer total;

    private ListOTAFirmwareResponseBody(Builder builder) {
        this.code = builder.code;
        this.currentPage = builder.currentPage;
        this.errorMessage = builder.errorMessage;
        this.firmwareInfo = builder.firmwareInfo;
        this.pageCount = builder.pageCount;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOTAFirmwareResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return firmwareInfo
     */
    public FirmwareInfo getFirmwareInfo() {
        return this.firmwareInfo;
    }

    /**
     * @return pageCount
     */
    public Integer getPageCount() {
        return this.pageCount;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private Integer currentPage; 
        private String errorMessage; 
        private FirmwareInfo firmwareInfo; 
        private Integer pageCount; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
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
         * FirmwareInfo.
         */
        public Builder firmwareInfo(FirmwareInfo firmwareInfo) {
            this.firmwareInfo = firmwareInfo;
            return this;
        }

        /**
         * PageCount.
         */
        public Builder pageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListOTAFirmwareResponseBody build() {
            return new ListOTAFirmwareResponseBody(this);
        } 

    } 

    public static class SimpleFirmwareInfo extends TeaModel {
        @NameInMap("DestVersion")
        private String destVersion;

        @NameInMap("FirmwareDesc")
        private String firmwareDesc;

        @NameInMap("FirmwareId")
        private String firmwareId;

        @NameInMap("FirmwareName")
        private String firmwareName;

        @NameInMap("FirmwareSign")
        private String firmwareSign;

        @NameInMap("FirmwareSize")
        private Integer firmwareSize;

        @NameInMap("ModuleName")
        private String moduleName;

        @NameInMap("ProductKey")
        private String productKey;

        @NameInMap("ProductName")
        private String productName;

        @NameInMap("SignMethod")
        private String signMethod;

        @NameInMap("SrcVersion")
        private String srcVersion;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Type")
        private Integer type;

        @NameInMap("UtcCreate")
        private String utcCreate;

        @NameInMap("UtcModified")
        private String utcModified;

        private SimpleFirmwareInfo(Builder builder) {
            this.destVersion = builder.destVersion;
            this.firmwareDesc = builder.firmwareDesc;
            this.firmwareId = builder.firmwareId;
            this.firmwareName = builder.firmwareName;
            this.firmwareSign = builder.firmwareSign;
            this.firmwareSize = builder.firmwareSize;
            this.moduleName = builder.moduleName;
            this.productKey = builder.productKey;
            this.productName = builder.productName;
            this.signMethod = builder.signMethod;
            this.srcVersion = builder.srcVersion;
            this.status = builder.status;
            this.type = builder.type;
            this.utcCreate = builder.utcCreate;
            this.utcModified = builder.utcModified;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SimpleFirmwareInfo create() {
            return builder().build();
        }

        /**
         * @return destVersion
         */
        public String getDestVersion() {
            return this.destVersion;
        }

        /**
         * @return firmwareDesc
         */
        public String getFirmwareDesc() {
            return this.firmwareDesc;
        }

        /**
         * @return firmwareId
         */
        public String getFirmwareId() {
            return this.firmwareId;
        }

        /**
         * @return firmwareName
         */
        public String getFirmwareName() {
            return this.firmwareName;
        }

        /**
         * @return firmwareSign
         */
        public String getFirmwareSign() {
            return this.firmwareSign;
        }

        /**
         * @return firmwareSize
         */
        public Integer getFirmwareSize() {
            return this.firmwareSize;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return signMethod
         */
        public String getSignMethod() {
            return this.signMethod;
        }

        /**
         * @return srcVersion
         */
        public String getSrcVersion() {
            return this.srcVersion;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return utcCreate
         */
        public String getUtcCreate() {
            return this.utcCreate;
        }

        /**
         * @return utcModified
         */
        public String getUtcModified() {
            return this.utcModified;
        }

        public static final class Builder {
            private String destVersion; 
            private String firmwareDesc; 
            private String firmwareId; 
            private String firmwareName; 
            private String firmwareSign; 
            private Integer firmwareSize; 
            private String moduleName; 
            private String productKey; 
            private String productName; 
            private String signMethod; 
            private String srcVersion; 
            private Integer status; 
            private Integer type; 
            private String utcCreate; 
            private String utcModified; 

            /**
             * DestVersion.
             */
            public Builder destVersion(String destVersion) {
                this.destVersion = destVersion;
                return this;
            }

            /**
             * FirmwareDesc.
             */
            public Builder firmwareDesc(String firmwareDesc) {
                this.firmwareDesc = firmwareDesc;
                return this;
            }

            /**
             * FirmwareId.
             */
            public Builder firmwareId(String firmwareId) {
                this.firmwareId = firmwareId;
                return this;
            }

            /**
             * FirmwareName.
             */
            public Builder firmwareName(String firmwareName) {
                this.firmwareName = firmwareName;
                return this;
            }

            /**
             * FirmwareSign.
             */
            public Builder firmwareSign(String firmwareSign) {
                this.firmwareSign = firmwareSign;
                return this;
            }

            /**
             * FirmwareSize.
             */
            public Builder firmwareSize(Integer firmwareSize) {
                this.firmwareSize = firmwareSize;
                return this;
            }

            /**
             * ModuleName.
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * ProductKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * ProductName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * SignMethod.
             */
            public Builder signMethod(String signMethod) {
                this.signMethod = signMethod;
                return this;
            }

            /**
             * SrcVersion.
             */
            public Builder srcVersion(String srcVersion) {
                this.srcVersion = srcVersion;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * UtcCreate.
             */
            public Builder utcCreate(String utcCreate) {
                this.utcCreate = utcCreate;
                return this;
            }

            /**
             * UtcModified.
             */
            public Builder utcModified(String utcModified) {
                this.utcModified = utcModified;
                return this;
            }

            public SimpleFirmwareInfo build() {
                return new SimpleFirmwareInfo(this);
            } 

        } 

    }
    public static class FirmwareInfo extends TeaModel {
        @NameInMap("SimpleFirmwareInfo")
        private java.util.List < SimpleFirmwareInfo> simpleFirmwareInfo;

        private FirmwareInfo(Builder builder) {
            this.simpleFirmwareInfo = builder.simpleFirmwareInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FirmwareInfo create() {
            return builder().build();
        }

        /**
         * @return simpleFirmwareInfo
         */
        public java.util.List < SimpleFirmwareInfo> getSimpleFirmwareInfo() {
            return this.simpleFirmwareInfo;
        }

        public static final class Builder {
            private java.util.List < SimpleFirmwareInfo> simpleFirmwareInfo; 

            /**
             * SimpleFirmwareInfo.
             */
            public Builder simpleFirmwareInfo(java.util.List < SimpleFirmwareInfo> simpleFirmwareInfo) {
                this.simpleFirmwareInfo = simpleFirmwareInfo;
                return this;
            }

            public FirmwareInfo build() {
                return new FirmwareInfo(this);
            } 

        } 

    }
}
