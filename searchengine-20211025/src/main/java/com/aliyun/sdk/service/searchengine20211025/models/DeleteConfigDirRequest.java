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
 * {@link DeleteConfigDirRequest} extends {@link RequestModel}
 *
 * <p>DeleteConfigDirRequest</p>
 */
public class DeleteConfigDirRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("configName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dirName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dirName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("parentFullPath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parentFullPath;

    private DeleteConfigDirRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.configName = builder.configName;
        this.dirName = builder.dirName;
        this.parentFullPath = builder.parentFullPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteConfigDirRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteConfigDirRequest, Builder> {
        private String instanceId; 
        private String configName; 
        private String dirName; 
        private String parentFullPath; 

        private Builder() {
            super();
        } 

        private Builder(DeleteConfigDirRequest request) {
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
         * <p>ha-cn-18qug6zlc1r</p>
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
         * <p>The directory name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/clusters</p>
         */
        public Builder dirName(String dirName) {
            this.putQueryParameter("dirName", dirName);
            this.dirName = dirName;
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
        public DeleteConfigDirRequest build() {
            return new DeleteConfigDirRequest(this);
        } 

    } 

}
