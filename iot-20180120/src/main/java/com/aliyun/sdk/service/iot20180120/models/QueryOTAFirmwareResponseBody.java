// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryOTAFirmwareResponseBody} extends {@link TeaModel}
 *
 * <p>QueryOTAFirmwareResponseBody</p>
 */
public class QueryOTAFirmwareResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("FirmwareInfo")
    private FirmwareInfo firmwareInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryOTAFirmwareResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorMessage = builder.errorMessage;
        this.firmwareInfo = builder.firmwareInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOTAFirmwareResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
        private String errorMessage; 
        private FirmwareInfo firmwareInfo; 
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

        public QueryOTAFirmwareResponseBody build() {
            return new QueryOTAFirmwareResponseBody(this);
        } 

    } 

    public static class MultiFiles extends TeaModel {
        @NameInMap("FileMd5")
        private String fileMd5;

        @NameInMap("Name")
        private String name;

        @NameInMap("SignValue")
        private String signValue;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("Url")
        private String url;

        private MultiFiles(Builder builder) {
            this.fileMd5 = builder.fileMd5;
            this.name = builder.name;
            this.signValue = builder.signValue;
            this.size = builder.size;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultiFiles create() {
            return builder().build();
        }

        /**
         * @return fileMd5
         */
        public String getFileMd5() {
            return this.fileMd5;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return signValue
         */
        public String getSignValue() {
            return this.signValue;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String fileMd5; 
            private String name; 
            private String signValue; 
            private Integer size; 
            private String url; 

            /**
             * FileMd5.
             */
            public Builder fileMd5(String fileMd5) {
                this.fileMd5 = fileMd5;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SignValue.
             */
            public Builder signValue(String signValue) {
                this.signValue = signValue;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public MultiFiles build() {
                return new MultiFiles(this);
            } 

        } 

    }
    public static class FirmwareInfo extends TeaModel {
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

        @NameInMap("FirmwareUrl")
        private String firmwareUrl;

        @NameInMap("ModuleName")
        private String moduleName;

        @NameInMap("MultiFiles")
        private java.util.List < MultiFiles> multiFiles;

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

        @NameInMap("Udi")
        private String udi;

        @NameInMap("UtcCreate")
        private String utcCreate;

        @NameInMap("UtcModified")
        private String utcModified;

        @NameInMap("VerifyProgress")
        private Integer verifyProgress;

        private FirmwareInfo(Builder builder) {
            this.destVersion = builder.destVersion;
            this.firmwareDesc = builder.firmwareDesc;
            this.firmwareId = builder.firmwareId;
            this.firmwareName = builder.firmwareName;
            this.firmwareSign = builder.firmwareSign;
            this.firmwareSize = builder.firmwareSize;
            this.firmwareUrl = builder.firmwareUrl;
            this.moduleName = builder.moduleName;
            this.multiFiles = builder.multiFiles;
            this.productKey = builder.productKey;
            this.productName = builder.productName;
            this.signMethod = builder.signMethod;
            this.srcVersion = builder.srcVersion;
            this.status = builder.status;
            this.type = builder.type;
            this.udi = builder.udi;
            this.utcCreate = builder.utcCreate;
            this.utcModified = builder.utcModified;
            this.verifyProgress = builder.verifyProgress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FirmwareInfo create() {
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
         * @return firmwareUrl
         */
        public String getFirmwareUrl() {
            return this.firmwareUrl;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        /**
         * @return multiFiles
         */
        public java.util.List < MultiFiles> getMultiFiles() {
            return this.multiFiles;
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
         * @return udi
         */
        public String getUdi() {
            return this.udi;
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

        /**
         * @return verifyProgress
         */
        public Integer getVerifyProgress() {
            return this.verifyProgress;
        }

        public static final class Builder {
            private String destVersion; 
            private String firmwareDesc; 
            private String firmwareId; 
            private String firmwareName; 
            private String firmwareSign; 
            private Integer firmwareSize; 
            private String firmwareUrl; 
            private String moduleName; 
            private java.util.List < MultiFiles> multiFiles; 
            private String productKey; 
            private String productName; 
            private String signMethod; 
            private String srcVersion; 
            private Integer status; 
            private Integer type; 
            private String udi; 
            private String utcCreate; 
            private String utcModified; 
            private Integer verifyProgress; 

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
             * FirmwareUrl.
             */
            public Builder firmwareUrl(String firmwareUrl) {
                this.firmwareUrl = firmwareUrl;
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
             * MultiFiles.
             */
            public Builder multiFiles(java.util.List < MultiFiles> multiFiles) {
                this.multiFiles = multiFiles;
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
             * Udi.
             */
            public Builder udi(String udi) {
                this.udi = udi;
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

            /**
             * VerifyProgress.
             */
            public Builder verifyProgress(Integer verifyProgress) {
                this.verifyProgress = verifyProgress;
                return this;
            }

            public FirmwareInfo build() {
                return new FirmwareInfo(this);
            } 

        } 

    }
}
