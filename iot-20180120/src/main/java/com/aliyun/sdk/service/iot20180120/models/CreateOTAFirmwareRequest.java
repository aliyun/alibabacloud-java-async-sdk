// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOTAFirmwareRequest} extends {@link RequestModel}
 *
 * <p>CreateOTAFirmwareRequest</p>
 */
public class CreateOTAFirmwareRequest extends Request {
    @Query
    @NameInMap("DestVersion")
    @Validation(required = true)
    private String destVersion;

    @Query
    @NameInMap("FirmwareDesc")
    private String firmwareDesc;

    @Query
    @NameInMap("FirmwareName")
    @Validation(required = true)
    private String firmwareName;

    @Query
    @NameInMap("FirmwareSign")
    private String firmwareSign;

    @Query
    @NameInMap("FirmwareSize")
    private Integer firmwareSize;

    @Query
    @NameInMap("FirmwareUrl")
    private String firmwareUrl;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("ModuleName")
    private String moduleName;

    @Query
    @NameInMap("MultiFiles")
    private java.util.List < MultiFiles> multiFiles;

    @Query
    @NameInMap("NeedToVerify")
    private Boolean needToVerify;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    @Query
    @NameInMap("SignMethod")
    private String signMethod;

    @Query
    @NameInMap("SrcVersion")
    private String srcVersion;

    @Query
    @NameInMap("Type")
    private Integer type;

    @Query
    @NameInMap("Udi")
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
    public java.util.List < MultiFiles> getMultiFiles() {
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
        private java.util.List < MultiFiles> multiFiles; 
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
         * DestVersion.
         */
        public Builder destVersion(String destVersion) {
            this.putQueryParameter("DestVersion", destVersion);
            this.destVersion = destVersion;
            return this;
        }

        /**
         * FirmwareDesc.
         */
        public Builder firmwareDesc(String firmwareDesc) {
            this.putQueryParameter("FirmwareDesc", firmwareDesc);
            this.firmwareDesc = firmwareDesc;
            return this;
        }

        /**
         * FirmwareName.
         */
        public Builder firmwareName(String firmwareName) {
            this.putQueryParameter("FirmwareName", firmwareName);
            this.firmwareName = firmwareName;
            return this;
        }

        /**
         * FirmwareSign.
         */
        public Builder firmwareSign(String firmwareSign) {
            this.putQueryParameter("FirmwareSign", firmwareSign);
            this.firmwareSign = firmwareSign;
            return this;
        }

        /**
         * FirmwareSize.
         */
        public Builder firmwareSize(Integer firmwareSize) {
            this.putQueryParameter("FirmwareSize", firmwareSize);
            this.firmwareSize = firmwareSize;
            return this;
        }

        /**
         * FirmwareUrl.
         */
        public Builder firmwareUrl(String firmwareUrl) {
            this.putQueryParameter("FirmwareUrl", firmwareUrl);
            this.firmwareUrl = firmwareUrl;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * ModuleName.
         */
        public Builder moduleName(String moduleName) {
            this.putQueryParameter("ModuleName", moduleName);
            this.moduleName = moduleName;
            return this;
        }

        /**
         * MultiFiles.
         */
        public Builder multiFiles(java.util.List < MultiFiles> multiFiles) {
            this.putQueryParameter("MultiFiles", multiFiles);
            this.multiFiles = multiFiles;
            return this;
        }

        /**
         * NeedToVerify.
         */
        public Builder needToVerify(Boolean needToVerify) {
            this.putQueryParameter("NeedToVerify", needToVerify);
            this.needToVerify = needToVerify;
            return this;
        }

        /**
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * SignMethod.
         */
        public Builder signMethod(String signMethod) {
            this.putQueryParameter("SignMethod", signMethod);
            this.signMethod = signMethod;
            return this;
        }

        /**
         * SrcVersion.
         */
        public Builder srcVersion(String srcVersion) {
            this.putQueryParameter("SrcVersion", srcVersion);
            this.srcVersion = srcVersion;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * Udi.
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
}
