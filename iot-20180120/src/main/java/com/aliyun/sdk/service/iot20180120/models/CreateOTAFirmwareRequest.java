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
 * {@link CreateOTAFirmwareRequest} extends {@link RequestModel}
 *
 * <p>CreateOTAFirmwareRequest</p>
 */
public class CreateOTAFirmwareRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirmwareDesc")
    private String firmwareDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirmwareName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String firmwareName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirmwareSign")
    private String firmwareSign;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirmwareSize")
    private Integer firmwareSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirmwareUrl")
    private String firmwareUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModuleName")
    private String moduleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MultiFiles")
    private java.util.List<MultiFiles> multiFiles;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedToVerify")
    private Boolean needToVerify;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignMethod")
    private String signMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcVersion")
    private String srcVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private Integer type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Udi")
    private String udi;

    private CreateOTAFirmwareRequest(Builder builder) {
        super(builder);
        this.destVersion = builder.destVersion;
        this.firmwareDesc = builder.firmwareDesc;
        this.firmwareName = builder.firmwareName;
        this.firmwareSign = builder.firmwareSign;
        this.firmwareSize = builder.firmwareSize;
        this.firmwareUrl = builder.firmwareUrl;
        this.iotInstanceId = builder.iotInstanceId;
        this.moduleName = builder.moduleName;
        this.multiFiles = builder.multiFiles;
        this.needToVerify = builder.needToVerify;
        this.productKey = builder.productKey;
        this.signMethod = builder.signMethod;
        this.srcVersion = builder.srcVersion;
        this.type = builder.type;
        this.udi = builder.udi;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOTAFirmwareRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
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
     * @return needToVerify
     */
    public Boolean getNeedToVerify() {
        return this.needToVerify;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
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

    public static final class Builder extends Request.Builder<CreateOTAFirmwareRequest, Builder> {
        private String destVersion; 
        private String firmwareDesc; 
        private String firmwareName; 
        private String firmwareSign; 
        private Integer firmwareSize; 
        private String firmwareUrl; 
        private String iotInstanceId; 
        private String moduleName; 
        private java.util.List<MultiFiles> multiFiles; 
        private Boolean needToVerify; 
        private String productKey; 
        private String signMethod; 
        private String srcVersion; 
        private Integer type; 
        private String udi; 

        private Builder() {
            super();
        } 

        private Builder(CreateOTAFirmwareRequest request) {
            super(request);
            this.destVersion = request.destVersion;
            this.firmwareDesc = request.firmwareDesc;
            this.firmwareName = request.firmwareName;
            this.firmwareSign = request.firmwareSign;
            this.firmwareSize = request.firmwareSize;
            this.firmwareUrl = request.firmwareUrl;
            this.iotInstanceId = request.iotInstanceId;
            this.moduleName = request.moduleName;
            this.multiFiles = request.multiFiles;
            this.needToVerify = request.needToVerify;
            this.productKey = request.productKey;
            this.signMethod = request.signMethod;
            this.srcVersion = request.srcVersion;
            this.type = request.type;
            this.udi = request.udi;
        } 

        /**
         * <p>The version number of the OTA update package. The value can contain letters, digits, periods (.), hyphens (-), and underscores (_). The version number must be 1 to 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0.0</p>
         */
        public Builder destVersion(String destVersion) {
            this.putQueryParameter("DestVersion", destVersion);
            this.destVersion = destVersion;
            return this;
        }

        /**
         * <p>The description of the OTA update package. The description must be 1 to 100 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>OTA function updated</p>
         */
        public Builder firmwareDesc(String firmwareDesc) {
            this.putQueryParameter("FirmwareDesc", firmwareDesc);
            this.firmwareDesc = firmwareDesc;
            return this;
        }

        /**
         * <p>The name of the OTA update package. The name must be unique within an Alibaba Cloud account. The name cannot be modified after the OTA update package is created. The name must be 1 to 40 characters in length, and can contain letters, digits, hyphens (-), underscores (_), and parentheses (). The name must start with a letter or a digit.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Firmware2</p>
         */
        public Builder firmwareName(String firmwareName) {
            this.putQueryParameter("FirmwareName", firmwareName);
            this.firmwareName = firmwareName;
            return this;
        }

        /**
         * <p>The signature of the OTA update package. The value is calculated by using the specified <strong>signature algorithm</strong> to sign the OTA update package.</p>
         * <blockquote>
         * <p>If you add only one file to the OTA update package, you can configure this parameter. If you do not configure this parameter, the MD5 value of the OTA update package in OSS is used as the package signature.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>93230c3bde425a9d7984a594ac55****</p>
         */
        public Builder firmwareSign(String firmwareSign) {
            this.putQueryParameter("FirmwareSign", firmwareSign);
            this.firmwareSign = firmwareSign;
            return this;
        }

        /**
         * <p>The size of the OTA update package. Unit: bytes.</p>
         * <blockquote>
         * <p>If you add only one file to the OTA update package, you can configure this parameter. If you do not configure this parameter, the size of the OTA update package in OSS is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        public Builder firmwareSize(Integer firmwareSize) {
            this.putQueryParameter("FirmwareSize", firmwareSize);
            this.firmwareSize = firmwareSize;
            return this;
        }

        /**
         * <p>The URL of the OTA update package. This parameter specifies the storage location of the OTA update package in OSS. You can call the <a href="https://help.aliyun.com/document_detail/147310.html">GenerateOTAUploadURL</a> operation to generate a URL for the OTA update package.</p>
         * <blockquote>
         * <p>If you add only one file to the OTA update package, you must configure this parameter.</p>
         * </blockquote>
         */
        public Builder firmwareUrl(String firmwareUrl) {
            this.putQueryParameter("FirmwareUrl", firmwareUrl);
            this.firmwareUrl = firmwareUrl;
            return this;
        }

        /**
         * <p>The ID of the instance. You can view the ID of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</li>
         * <li>If no <strong>Overview</strong> page or <strong>ID</strong> is generated for your instance, you do not need to configure this parameter.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>iot-cn-0pp1n8t****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The name of the OTA module. OTA modules are the updatable units of devices that belong to the same product.</p>
         * <blockquote>
         * <ul>
         * <li>If you do not configure this parameter, the default OTA module is used. The default value indicates that the complete device firmware is updated.</li>
         * <li>You can call the <a href="https://help.aliyun.com/document_detail/186066.html">CreateOTAModule</a> operation to create a custom OTA module. You can call the <a href="https://help.aliyun.com/document_detail/186532.html">ListOTAModuleByProduct</a> operation to query the existing OTA modules of a product.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>WifiConfigModify</p>
         */
        public Builder moduleName(String moduleName) {
            this.putQueryParameter("ModuleName", moduleName);
            this.moduleName = moduleName;
            return this;
        }

        /**
         * MultiFiles.
         */
        public Builder multiFiles(java.util.List<MultiFiles> multiFiles) {
            this.putQueryParameter("MultiFiles", multiFiles);
            this.multiFiles = multiFiles;
            return this;
        }

        /**
         * <p>Specifies whether to verify the OTA update package before you create a batch update task.</p>
         * <ul>
         * <li><strong>true</strong> The system verifies the OTA update package before you create a batch update task. This is the default value.</li>
         * <li><strong>false</strong>: The system does not verify the OTA update package before you create a batch update task.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder needToVerify(Boolean needToVerify) {
            this.putQueryParameter("NeedToVerify", needToVerify);
            this.needToVerify = needToVerify;
            return this;
        }

        /**
         * <p>The <strong>ProductKey</strong> of the product to which the OTA update package belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>a1uctKe****</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>The signature algorithm of the OTA update package. Set the value to <strong>MD5</strong>. The value indicates an MD5 signature.</p>
         * <p>Default value: <strong>MD5</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>MD5</p>
         */
        public Builder signMethod(String signMethod) {
            this.putQueryParameter("SignMethod", signMethod);
            this.signMethod = signMethod;
            return this;
        }

        /**
         * <p>The version number of the OTA module of the device to be updated.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation and view the <strong>FirmwareVersion</strong> parameter in the response.</p>
         * <blockquote>
         * <ul>
         * <li>If you set the <strong>Type</strong> parameter to <strong>1</strong>, you must configure this parameter, and the value cannot be the same as the update package version that is specified by the <strong>DestVersion</strong> parameter.</li>
         * <li>If you set the <strong>Type</strong> parameter to <strong>0</strong>, this parameter is optional.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        public Builder srcVersion(String srcVersion) {
            this.putQueryParameter("SrcVersion", srcVersion);
            this.srcVersion = srcVersion;
            return this;
        }

        /**
         * <p>The type of the OTA update package. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The uploaded file contains a full update package. IoT Platform pushes the full update package to a device for update.</li>
         * <li><strong>1</strong>: The uploaded file contains only the differences between the latest update package and the previous update package. IoT Platform pushes only the differences to a device for update.</li>
         * </ul>
         * <p>Default value: <strong>0</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The custom information that you want to send to a device. The format of the custom information has no limits. However, the information cannot exceed 4,096 characters in length.</p>
         * <p>After you add the OTA update package and create an update task, IoT Platform sends the custom information to the specified device when IoT Platform pushes an update notification.</p>
         */
        public Builder udi(String udi) {
            this.putQueryParameter("Udi", udi);
            this.udi = udi;
            return this;
        }

        @Override
        public CreateOTAFirmwareRequest build() {
            return new CreateOTAFirmwareRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateOTAFirmwareRequest} extends {@link TeaModel}
     *
     * <p>CreateOTAFirmwareRequest</p>
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
             * <p>The MD5 value of the file.</p>
             * <blockquote>
             * <p> If you want to add multiple files to the OTA update package, you can configure this parameter. If you do not configure this parameter, the MD5 value of the file in OSS is used.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>93230c3bde425a9d7984a594ac56***</p>
             */
            public Builder fileMd5(String fileMd5) {
                this.fileMd5 = fileMd5;
                return this;
            }

            /**
             * <p>The name of the file in the update package. The name must be 1 to 32 characters in length. You can specify up to 20 file names. Each name must be unique in the OTA update package.</p>
             * <blockquote>
             * <p>If you want to add multiple files to the OTA update package, you must configure this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Firmware1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The signature of the file. The value is calculated by using the specified <strong>signature algorithm</strong> to sign the file.</p>
             * <blockquote>
             * <p> If you want to add multiple files to the OTA update package, you can configure this parameter. If you do not configure this parameter, the MD5 value of the file in OSS is used as the file signature.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>93230c3bde425a9d7984a594ac45****</p>
             */
            public Builder signValue(String signValue) {
                this.signValue = signValue;
                return this;
            }

            /**
             * <p>The size of the file in the OTA update package. Unit: bytes.</p>
             * <blockquote>
             * <p> If you want to add multiple files to the OTA update package, you can configure this parameter. If you do not configure this parameter, the size of the file in OSS is used.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The URL of the file. This parameter specifies the storage location of the file in OSS. You can call the <a href="https://help.aliyun.com/document_detail/147310.html">GenerateOTAUploadURL</a> operation to generate a URL for each file in the OTA update package.</p>
             * <blockquote>
             * <p>If you want to add multiple files to the OTA update package, you must configure this parameter.</p>
             * </blockquote>
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
}
