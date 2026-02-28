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
 * {@link QueryOTAFirmwareResponseBody} extends {@link TeaModel}
 *
 * <p>QueryOTAFirmwareResponseBody</p>
 */
public class QueryOTAFirmwareResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("FirmwareInfo")
    private FirmwareInfo firmwareInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

        private Builder() {
        } 

        private Builder(QueryOTAFirmwareResponseBody model) {
            this.code = model.code;
            this.errorMessage = model.errorMessage;
            this.firmwareInfo = model.firmwareInfo;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The update package information returned if the call succeeds. For more information, see <strong>FirmwareInfo</strong>.</p>
         */
        public Builder firmwareInfo(FirmwareInfo firmwareInfo) {
            this.firmwareInfo = firmwareInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A01829CE-75A1-4920-B775-921146A1AB79</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryOTAFirmwareResponseBody build() {
            return new QueryOTAFirmwareResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryOTAFirmwareResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOTAFirmwareResponseBody</p>
     */
    public static class MultiFiles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileMd5")
        private String fileMd5;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SignValue")
        private String signValue;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("Url")
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

            private Builder() {
            } 

            private Builder(MultiFiles model) {
                this.fileMd5 = model.fileMd5;
                this.name = model.name;
                this.signValue = model.signValue;
                this.size = model.size;
                this.url = model.url;
            } 

            /**
             * <p>The MD5 value of the OTA update package file.</p>
             * 
             * <strong>example:</strong>
             * <p>3d04ab6462633508606e5f3d****</p>
             */
            public Builder fileMd5(String fileMd5) {
                this.fileMd5 = fileMd5;
                return this;
            }

            /**
             * <p>The name of the OTA update package file.</p>
             * 
             * <strong>example:</strong>
             * <p>firmware1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The signature of the OTA update package file.</p>
             * 
             * <strong>example:</strong>
             * <p>3d04ab6462633508606e5f3d****</p>
             */
            public Builder signValue(String signValue) {
                this.signValue = signValue;
                return this;
            }

            /**
             * <p>The size of the OTA update package file. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The URL of the update package file that is stored in Object Storage Service (OSS).</p>
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
    /**
     * 
     * {@link QueryOTAFirmwareResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOTAFirmwareResponseBody</p>
     */
    public static class FirmwareInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestVersion")
        private String destVersion;

        @com.aliyun.core.annotation.NameInMap("FirmwareDesc")
        private String firmwareDesc;

        @com.aliyun.core.annotation.NameInMap("FirmwareId")
        private String firmwareId;

        @com.aliyun.core.annotation.NameInMap("FirmwareName")
        private String firmwareName;

        @com.aliyun.core.annotation.NameInMap("FirmwareSign")
        private String firmwareSign;

        @com.aliyun.core.annotation.NameInMap("FirmwareSize")
        private Integer firmwareSize;

        @com.aliyun.core.annotation.NameInMap("FirmwareUrl")
        private String firmwareUrl;

        @com.aliyun.core.annotation.NameInMap("ModuleName")
        private String moduleName;

        @com.aliyun.core.annotation.NameInMap("MultiFiles")
        private java.util.List<MultiFiles> multiFiles;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("SignMethod")
        private String signMethod;

        @com.aliyun.core.annotation.NameInMap("SrcVersion")
        private String srcVersion;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("Udi")
        private String udi;

        @com.aliyun.core.annotation.NameInMap("UtcCreate")
        private String utcCreate;

        @com.aliyun.core.annotation.NameInMap("UtcModified")
        private String utcModified;

        @com.aliyun.core.annotation.NameInMap("VerifyProgress")
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
        public java.util.List<MultiFiles> getMultiFiles() {
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
            private java.util.List<MultiFiles> multiFiles; 
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

            private Builder() {
            } 

            private Builder(FirmwareInfo model) {
                this.destVersion = model.destVersion;
                this.firmwareDesc = model.firmwareDesc;
                this.firmwareId = model.firmwareId;
                this.firmwareName = model.firmwareName;
                this.firmwareSign = model.firmwareSign;
                this.firmwareSize = model.firmwareSize;
                this.firmwareUrl = model.firmwareUrl;
                this.moduleName = model.moduleName;
                this.multiFiles = model.multiFiles;
                this.productKey = model.productKey;
                this.productName = model.productName;
                this.signMethod = model.signMethod;
                this.srcVersion = model.srcVersion;
                this.status = model.status;
                this.type = model.type;
                this.udi = model.udi;
                this.utcCreate = model.utcCreate;
                this.utcModified = model.utcModified;
                this.verifyProgress = model.verifyProgress;
            } 

            /**
             * <p>The version number of the OTA update package.</p>
             * 
             * <strong>example:</strong>
             * <p>4.0.0</p>
             */
            public Builder destVersion(String destVersion) {
                this.destVersion = destVersion;
                return this;
            }

            /**
             * <p>The description of the OTA update package.</p>
             * 
             * <strong>example:</strong>
             * <p>modified-WiFi-module</p>
             */
            public Builder firmwareDesc(String firmwareDesc) {
                this.firmwareDesc = firmwareDesc;
                return this;
            }

            /**
             * <p>The unique ID of the OTA update package.</p>
             * 
             * <strong>example:</strong>
             * <p>UfuxnwygsuSkVE0VCN****0100</p>
             */
            public Builder firmwareId(String firmwareId) {
                this.firmwareId = firmwareId;
                return this;
            }

            /**
             * <p>The name of the OTA update package.</p>
             * 
             * <strong>example:</strong>
             * <p>t3q5rkNm</p>
             */
            public Builder firmwareName(String firmwareName) {
                this.firmwareName = firmwareName;
                return this;
            }

            /**
             * <p>The signature of the OTA update package.</p>
             * <blockquote>
             * <p> This parameter is available if the OTA update package contains a single file.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3d04ab6462633508606e5f3daac8****</p>
             */
            public Builder firmwareSign(String firmwareSign) {
                this.firmwareSign = firmwareSign;
                return this;
            }

            /**
             * <p>The size of the OTA update package file. Unit: bytes.</p>
             * <blockquote>
             * <p> This parameter is available if the OTA update package contains a single file.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>924</p>
             */
            public Builder firmwareSize(Integer firmwareSize) {
                this.firmwareSize = firmwareSize;
                return this;
            }

            /**
             * <p>The URL of the update package file that is stored in Object Storage Service (OSS).</p>
             * <blockquote>
             * <p> This parameter is available if the OTA update package contains a single file.</p>
             * </blockquote>
             */
            public Builder firmwareUrl(String firmwareUrl) {
                this.firmwareUrl = firmwareUrl;
                return this;
            }

            /**
             * <p>The name of the module.</p>
             * <p>OTA updates are based on the firmware modules of a device. For more information, see <a href="https://help.aliyun.com/document_detail/202664.html">Add a custom OTA module to an update package</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>WifiConfigModify</p>
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * <p>The information about the OTA update package files. This parameter is available if the OTA update package contains multiple files.</p>
             */
            public Builder multiFiles(java.util.List<MultiFiles> multiFiles) {
                this.multiFiles = multiFiles;
                return this;
            }

            /**
             * <p>The <strong>ProductKey</strong> of the product to which the OTA update package belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>a19mzPZ****</p>
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * <p>The name of the product to which the OTA update package belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>MyProduct</p>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * <p>The signature method of the OTA update package.</p>
             * 
             * <strong>example:</strong>
             * <p>MD5</p>
             */
            public Builder signMethod(String signMethod) {
                this.signMethod = signMethod;
                return this;
            }

            /**
             * <p>The version number of the original update package to be updated.</p>
             * <blockquote>
             * <p> This parameter is returned if you perform a delta update. For more information about update package types, see the description of the <strong>Type</strong> parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder srcVersion(String srcVersion) {
                this.srcVersion = srcVersion;
                return this;
            }

            /**
             * <p>The status of the OTA update package. Valid values:</p>
             * <ul>
             * <li><strong>-1</strong>: no verification is required</li>
             * <li><strong>0</strong>: unverified</li>
             * <li><strong>1</strong>: verified</li>
             * <li><strong>2</strong>: verifying</li>
             * <li><strong>3</strong>: failed to be verified</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the OTA update package. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The uploaded file contains a full update package. IoT Platform pushes the full update package to a device for update.</li>
             * <li><strong>1</strong>: The uploaded file contains only the differences between the latest update package and previous update package. IoT Platform pushes only the differences to a device for update.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The custom information that was pushed to the device. The information can be up to 4,096 characters in length. No limit is applies to the content format.</p>
             * <p>After you add the update package and create an update task, IoT Platform sends the custom information to the specified device when IoT Platform pushes the update notification.</p>
             */
            public Builder udi(String udi) {
                this.udi = udi;
                return this;
            }

            /**
             * <p>The time when the OTA update package was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-28T02:42:22.000Z</p>
             */
            public Builder utcCreate(String utcCreate) {
                this.utcCreate = utcCreate;
                return this;
            }

            /**
             * <p>The time when the update task was last modified. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-28T02:42:41.000Z</p>
             */
            public Builder utcModified(String utcModified) {
                this.utcModified = utcModified;
                return this;
            }

            /**
             * <p>The verification status of the OTA update package. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: unverified</li>
             * <li><strong>100</strong>: verified</li>
             * <li>A value N between 0 and 100 indicates that the update task is N percent completed. You can check the response parameter <strong>Status</strong> to see the verification status.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
