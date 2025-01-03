// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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
 * {@link CreateConfigFileRequest} extends {@link RequestModel}
 *
 * <p>CreateConfigFileRequest</p>
 */
public class CreateConfigFileRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("configName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fileName")
    private String fileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ossPath")
    private String ossPath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parentFullPath")
    private String parentFullPath;

    private CreateConfigFileRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.configName = builder.configName;
        this.fileName = builder.fileName;
        this.ossPath = builder.ossPath;
        this.parentFullPath = builder.parentFullPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConfigFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return configName
     */
    public String getConfigName() {
        return this.configName;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return ossPath
     */
    public String getOssPath() {
        return this.ossPath;
    }

    /**
     * @return parentFullPath
     */
    public String getParentFullPath() {
        return this.parentFullPath;
    }

    public static final class Builder extends Request.Builder<CreateConfigFileRequest, Builder> {
        private String instanceId; 
        private String configName; 
        private String fileName; 
        private String ossPath; 
        private String parentFullPath; 

        private Builder() {
            super();
        } 

        private Builder(CreateConfigFileRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.configName = request.configName;
            this.fileName = request.fileName;
            this.ossPath = request.ossPath;
            this.parentFullPath = request.parentFullPath;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-2r42ostoc01</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The configuration name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-wuz014xlq5o_table_ha-cn-wuz014xlq5o_test_api_edit</p>
         */
        public Builder configName(String configName) {
            this.putPathParameter("configName", configName);
            this.configName = configName;
            return this;
        }

        /**
         * <p>The name of the directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/schemas/device_event_xt_schema.json</p>
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("fileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The Object Storage Service (OSS) URL of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://xxx/xxxx/xxx</p>
         */
        public Builder ossPath(String ossPath) {
            this.putBodyParameter("ossPath", ossPath);
            this.ossPath = ossPath;
            return this;
        }

        /**
         * <p>The path of the parent directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder parentFullPath(String parentFullPath) {
            this.putBodyParameter("parentFullPath", parentFullPath);
            this.parentFullPath = parentFullPath;
            return this;
        }

        @Override
        public CreateConfigFileRequest build() {
            return new CreateConfigFileRequest(this);
        } 

    } 

}
