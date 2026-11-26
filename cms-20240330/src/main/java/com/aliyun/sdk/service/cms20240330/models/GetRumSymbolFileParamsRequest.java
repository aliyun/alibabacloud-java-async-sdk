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
 * {@link GetRumSymbolFileParamsRequest} extends {@link RequestModel}
 *
 * <p>GetRumSymbolFileParamsRequest</p>
 */
public class GetRumSymbolFileParamsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("debugId")
    private String debugId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fileKind")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileKind;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("version")
    @com.aliyun.core.annotation.Validation(required = true)
    private String version;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private GetRumSymbolFileParamsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.debugId = builder.debugId;
        this.fileKind = builder.fileKind;
        this.fileName = builder.fileName;
        this.serviceId = builder.serviceId;
        this.version = builder.version;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRumSymbolFileParamsRequest create() {
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
     * @return debugId
     */
    public String getDebugId() {
        return this.debugId;
    }

    /**
     * @return fileKind
     */
    public String getFileKind() {
        return this.fileKind;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<GetRumSymbolFileParamsRequest, Builder> {
        private String regionId; 
        private String debugId; 
        private String fileKind; 
        private String fileName; 
        private String serviceId; 
        private String version; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(GetRumSymbolFileParamsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.debugId = request.debugId;
            this.fileKind = request.fileKind;
            this.fileName = request.fileName;
            this.serviceId = request.serviceId;
            this.version = request.version;
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
         * <p>The debug identifier of the symbol file, such as a UUID or Debug ID. This parameter is required for all file types except dsym.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426614174000</p>
         */
        public Builder debugId(String debugId) {
            this.putBodyParameter("debugId", debugId);
            this.debugId = debugId;
            return this;
        }

        /**
         * <p>The type of the file to upload. Valid values: sourcemap (.map), dsym (.dSYM.zip), proguard (.txt), native-symbol (.so), name-cache (.json/.txt), pdb (.pdb), sym (.sym), and symbol-zip (.zip). This parameter is used to apply for upload signature parameters. The value dimension differs from the artifactType filter parameter in the GetRumSymbolFiles query operation. Specifically, dsym (.dSYM.zip) is classified as artifactType=dsym during queries. symbol-zip (.zip) files are directly uploaded and archived with their original file names, and the current query operation does not support filtering by zip for artifactType.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>proguard</p>
         */
        public Builder fileKind(String fileKind) {
            this.putBodyParameter("fileKind", fileKind);
            this.fileKind = fileKind;
            return this;
        }

        /**
         * <p>The name of the symbol file to upload. The file extension must match the fileKind.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mapping.txt</p>
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("fileName", fileName);
            this.fileName = fileName;
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
         * <p>The version number of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        public Builder version(String version) {
            this.putBodyParameter("version", version);
            this.version = version;
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
        public GetRumSymbolFileParamsRequest build() {
            return new GetRumSymbolFileParamsRequest(this);
        } 

    } 

}
