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
 * {@link DeleteConfigFileRequest} extends {@link RequestModel}
 *
 * <p>DeleteConfigFileRequest</p>
 */
public class DeleteConfigFileRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("configName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("fileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("parentFullPath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parentFullPath;

    private DeleteConfigFileRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.configName = builder.configName;
        this.fileName = builder.fileName;
        this.parentFullPath = builder.parentFullPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteConfigFileRequest create() {
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
     * @return parentFullPath
     */
    public String getParentFullPath() {
        return this.parentFullPath;
    }

    public static final class Builder extends Request.Builder<DeleteConfigFileRequest, Builder> {
        private String instanceId; 
        private String configName; 
        private String fileName; 
        private String parentFullPath; 

        private Builder() {
            super();
        } 

        private Builder(DeleteConfigFileRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.configName = request.configName;
            this.fileName = request.fileName;
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
         * <p>ha-cn-lbj39bhay03@ha-cn-lbj39bhay03_api_data@vpc_sh_domain_1@api_index@index_config_edit</p>
         */
        public Builder configName(String configName) {
            this.putPathParameter("configName", configName);
            this.configName = configName;
            return this;
        }

        /**
         * <p>The file name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/schemas/automobile_vector_schema.json</p>
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("fileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The path of the parent directory.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder parentFullPath(String parentFullPath) {
            this.putQueryParameter("parentFullPath", parentFullPath);
            this.parentFullPath = parentFullPath;
            return this;
        }

        @Override
        public DeleteConfigFileRequest build() {
            return new DeleteConfigFileRequest(this);
        } 

    } 

}
