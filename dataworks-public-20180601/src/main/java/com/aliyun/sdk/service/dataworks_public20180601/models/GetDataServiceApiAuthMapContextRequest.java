// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20180601.models;

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
 * {@link GetDataServiceApiAuthMapContextRequest} extends {@link RequestModel}
 *
 * <p>GetDataServiceApiAuthMapContextRequest</p>
 */
public class GetDataServiceApiAuthMapContextRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiId")
    private Long apiId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiPath")
    private String apiPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Verbose")
    private Boolean verbose;

    private GetDataServiceApiAuthMapContextRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.apiId = builder.apiId;
        this.apiPath = builder.apiPath;
        this.projectId = builder.projectId;
        this.verbose = builder.verbose;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataServiceApiAuthMapContextRequest create() {
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
     * @return apiId
     */
    public Long getApiId() {
        return this.apiId;
    }

    /**
     * @return apiPath
     */
    public String getApiPath() {
        return this.apiPath;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return verbose
     */
    public Boolean getVerbose() {
        return this.verbose;
    }

    public static final class Builder extends Request.Builder<GetDataServiceApiAuthMapContextRequest, Builder> {
        private String regionId; 
        private Long apiId; 
        private String apiPath; 
        private Long projectId; 
        private Boolean verbose; 

        private Builder() {
            super();
        } 

        private Builder(GetDataServiceApiAuthMapContextRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.apiId = request.apiId;
            this.apiPath = request.apiPath;
            this.projectId = request.projectId;
            this.verbose = request.verbose;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>API ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder apiId(Long apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * ApiPath.
         */
        public Builder apiPath(String apiPath) {
            this.putQueryParameter("ApiPath", apiPath);
            this.apiPath = apiPath;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * Verbose.
         */
        public Builder verbose(Boolean verbose) {
            this.putQueryParameter("Verbose", verbose);
            this.verbose = verbose;
            return this;
        }

        @Override
        public GetDataServiceApiAuthMapContextRequest build() {
            return new GetDataServiceApiAuthMapContextRequest(this);
        } 

    } 

}
