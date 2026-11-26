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
 * {@link GetRumSymbolFilesRequest} extends {@link RequestModel}
 *
 * <p>GetRumSymbolFilesRequest</p>
 */
public class GetRumSymbolFilesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("artifactType")
    private String artifactType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("keywords")
    private java.util.List<String> keywords;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("platform")
    private String platform;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private GetRumSymbolFilesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.artifactType = builder.artifactType;
        this.keywords = builder.keywords;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.platform = builder.platform;
        this.serviceId = builder.serviceId;
        this.version = builder.version;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRumSymbolFilesRequest create() {
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
     * @return artifactType
     */
    public String getArtifactType() {
        return this.artifactType;
    }

    /**
     * @return keywords
     */
    public java.util.List<String> getKeywords() {
        return this.keywords;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
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

    public static final class Builder extends Request.Builder<GetRumSymbolFilesRequest, Builder> {
        private String regionId; 
        private String artifactType; 
        private java.util.List<String> keywords; 
        private String nextToken; 
        private Long pageSize; 
        private String platform; 
        private String serviceId; 
        private String version; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(GetRumSymbolFilesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.artifactType = request.artifactType;
            this.keywords = request.keywords;
            this.nextToken = request.nextToken;
            this.pageSize = request.pageSize;
            this.platform = request.platform;
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
         * <p>The filter for the symbol file type. Valid values: map, dsym, txt, so, sym, pdb, and json. This parameter is used for query filtering and differs from the fileKind dimension in the upload API GetRumSymbolFileParams: uploading dsym (.dSYM.zip) corresponds to artifactType=dsym; standard symbol-zip (.zip) is not currently supported for filtering by artifactType.</p>
         * 
         * <strong>example:</strong>
         * <p>txt</p>
         */
        public Builder artifactType(String artifactType) {
            this.putBodyParameter("artifactType", artifactType);
            this.artifactType = artifactType;
            return this;
        }

        /**
         * <p>The list of search keywords. You can specify up to 50 keywords to match file names, UUIDs, version numbers, and more.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;new-app&quot;]</p>
         */
        public Builder keywords(java.util.List<String> keywords) {
            this.putBodyParameter("keywords", keywords);
            this.keywords = keywords;
            return this;
        }

        /**
         * <p>The paging token. To query the next page, specify the nextToken value returned in the previous response. The example is for illustration purposes only and cannot be used for actual queries.</p>
         * 
         * <strong>example:</strong>
         * <p>next</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Valid values: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The filter for the platform type. Valid values: web, miniapp, minigame, uniapp, android, ios, harmonyos, windows, macos, and linux.</p>
         * 
         * <strong>example:</strong>
         * <p>android</p>
         */
        public Builder platform(String platform) {
            this.putBodyParameter("platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * <p>The service ID of the RUM application. This parameter is required, cannot be an empty string, and must be used together with workspace to locate the application.</p>
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
         * <p>The filter for the application version number.</p>
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
         * <p>The name of the workspace to which the RUM application belongs. This parameter is required, cannot be an empty string, and must be used together with serviceId to locate the application.</p>
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
        public GetRumSymbolFilesRequest build() {
            return new GetRumSymbolFilesRequest(this);
        } 

    } 

}
