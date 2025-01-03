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
 * {@link CreateConfigDirRequest} extends {@link RequestModel}
 *
 * <p>CreateConfigDirRequest</p>
 */
public class CreateConfigDirRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("configName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dirName")
    private String dirName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parentFullPath")
    private String parentFullPath;

    private CreateConfigDirRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.configName = builder.configName;
        this.dirName = builder.dirName;
        this.parentFullPath = builder.parentFullPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConfigDirRequest create() {
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
     * @return dirName
     */
    public String getDirName() {
        return this.dirName;
    }

    /**
     * @return parentFullPath
     */
    public String getParentFullPath() {
        return this.parentFullPath;
    }

    public static final class Builder extends Request.Builder<CreateConfigDirRequest, Builder> {
        private String instanceId; 
        private String configName; 
        private String dirName; 
        private String parentFullPath; 

        private Builder() {
            super();
        } 

        private Builder(CreateConfigDirRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.configName = request.configName;
            this.dirName = request.dirName;
            this.parentFullPath = request.parentFullPath;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-7mz2iv7sq01</p>
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
         * <p>ha-cn-w6lr44sf3kx@ha-cn-w6lr44sf3kx_kevintest@kevintest@index_config_edit</p>
         */
        public Builder configName(String configName) {
            this.putPathParameter("configName", configName);
            this.configName = configName;
            return this;
        }

        /**
         * <p>The directory name.</p>
         * 
         * <strong>example:</strong>
         * <p>/clusters</p>
         */
        public Builder dirName(String dirName) {
            this.putBodyParameter("dirName", dirName);
            this.dirName = dirName;
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
        public CreateConfigDirRequest build() {
            return new CreateConfigDirRequest(this);
        } 

    } 

}
