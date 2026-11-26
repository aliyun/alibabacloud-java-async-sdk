// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link DeleteRumSymbolFilesRequest} extends {@link RequestModel}
 *
 * <p>DeleteRumSymbolFilesRequest</p>
 */
public class DeleteRumSymbolFilesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("filePaths")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> filePaths;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private DeleteRumSymbolFilesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.filePaths = builder.filePaths;
        this.serviceId = builder.serviceId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRumSymbolFilesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return filePaths
     */
    public java.util.List<String> getFilePaths() {
        return this.filePaths;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<DeleteRumSymbolFilesRequest, Builder> {
        private String regionId; 
        private java.util.List<String> filePaths; 
        private String serviceId; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRumSymbolFilesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.filePaths = request.filePaths;
            this.serviceId = request.serviceId;
            this.workspace = request.workspace;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The list of object paths of the symbol files to delete. This parameter is required and cannot be an empty array. Set the value to the artifactPath returned by GetRumSymbolFiles. Up to 1,000 paths are supported per call. Only user-uploaded symbol files under the current application can be deleted. System symbol files cannot be deleted.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;user/workspace/service-id/3.0.0/build-1/new-app.map&quot;]</p>
         */
        public Builder filePaths(java.util.List<String> filePaths) {
            this.putBodyParameter("filePaths", filePaths);
            this.filePaths = filePaths;
            return this;
        }

        /**
         * <p>The ID of the RUM application service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a1b2c3d4e5@f67890</p>
         */
        public Builder serviceId(String serviceId) {
            this.putBodyParameter("serviceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The name of the workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default-cms-1234567890-cn-hangzhou</p>
         */
        public Builder workspace(String workspace) {
            this.putBodyParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public DeleteRumSymbolFilesRequest build() {
            return new DeleteRumSymbolFilesRequest(this);
        } 

    } 

}
