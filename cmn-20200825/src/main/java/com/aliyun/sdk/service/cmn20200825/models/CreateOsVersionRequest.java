// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOsVersionRequest} extends {@link RequestModel}
 *
 * <p>CreateOsVersionRequest</p>
 */
public class CreateOsVersionRequest extends Request {
    @Body
    @NameInMap("BootPatch")
    private String bootPatch;

    @Body
    @NameInMap("ClientToken")
    @Validation(required = true)
    private String clientToken;

    @Body
    @NameInMap("CreateTime")
    private String createTime;

    @Body
    @NameInMap("FeaturePatch")
    private String featurePatch;

    @Body
    @NameInMap("FileName")
    @Validation(required = true)
    private String fileName;

    @Body
    @NameInMap("FilePath")
    @Validation(required = true)
    private String filePath;

    @Body
    @NameInMap("InstanceId")
    private String instanceId;

    @Body
    @NameInMap("Model")
    @Validation(required = true)
    private String model;

    @Body
    @NameInMap("OsVersion")
    @Validation(required = true)
    private String osVersion;

    @Body
    @NameInMap("Status")
    @Validation(required = true)
    private String status;

    @Body
    @NameInMap("SystemPatch")
    private String systemPatch;

    @Body
    @NameInMap("Vendor")
    @Validation(required = true)
    private String vendor;

    private CreateOsVersionRequest(Builder builder) {
        super(builder);
        this.bootPatch = builder.bootPatch;
        this.clientToken = builder.clientToken;
        this.createTime = builder.createTime;
        this.featurePatch = builder.featurePatch;
        this.fileName = builder.fileName;
        this.filePath = builder.filePath;
        this.instanceId = builder.instanceId;
        this.model = builder.model;
        this.osVersion = builder.osVersion;
        this.status = builder.status;
        this.systemPatch = builder.systemPatch;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOsVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bootPatch
     */
    public String getBootPatch() {
        return this.bootPatch;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return featurePatch
     */
    public String getFeaturePatch() {
        return this.featurePatch;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return osVersion
     */
    public String getOsVersion() {
        return this.osVersion;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return systemPatch
     */
    public String getSystemPatch() {
        return this.systemPatch;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<CreateOsVersionRequest, Builder> {
        private String bootPatch; 
        private String clientToken; 
        private String createTime; 
        private String featurePatch; 
        private String fileName; 
        private String filePath; 
        private String instanceId; 
        private String model; 
        private String osVersion; 
        private String status; 
        private String systemPatch; 
        private String vendor; 

        private Builder() {
            super();
        } 

        private Builder(CreateOsVersionRequest request) {
            super(request);
            this.bootPatch = request.bootPatch;
            this.clientToken = request.clientToken;
            this.createTime = request.createTime;
            this.featurePatch = request.featurePatch;
            this.fileName = request.fileName;
            this.filePath = request.filePath;
            this.instanceId = request.instanceId;
            this.model = request.model;
            this.osVersion = request.osVersion;
            this.status = request.status;
            this.systemPatch = request.systemPatch;
            this.vendor = request.vendor;
        } 

        /**
         * BootPatch.
         */
        public Builder bootPatch(String bootPatch) {
            this.putBodyParameter("BootPatch", bootPatch);
            this.bootPatch = bootPatch;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 代表创建时间的资源属性字段
         */
        public Builder createTime(String createTime) {
            this.putBodyParameter("CreateTime", createTime);
            this.createTime = createTime;
            return this;
        }

        /**
         * FeaturePatch.
         */
        public Builder featurePatch(String featurePatch) {
            this.putBodyParameter("FeaturePatch", featurePatch);
            this.featurePatch = featurePatch;
            return this;
        }

        /**
         * 文件名
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * 文件路径
         */
        public Builder filePath(String filePath) {
            this.putBodyParameter("FilePath", filePath);
            this.filePath = filePath;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 型号
         */
        public Builder model(String model) {
            this.putBodyParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * 系统版本
         */
        public Builder osVersion(String osVersion) {
            this.putBodyParameter("OsVersion", osVersion);
            this.osVersion = osVersion;
            return this;
        }

        /**
         * 状态
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * SystemPatch.
         */
        public Builder systemPatch(String systemPatch) {
            this.putBodyParameter("SystemPatch", systemPatch);
            this.systemPatch = systemPatch;
            return this;
        }

        /**
         * 厂商
         */
        public Builder vendor(String vendor) {
            this.putBodyParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public CreateOsVersionRequest build() {
            return new CreateOsVersionRequest(this);
        } 

    } 

}
