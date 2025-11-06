// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link GetProjectRequest} extends {@link RequestModel}
 *
 * <p>GetProjectRequest</p>
 */
public class GetProjectRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("verbose")
    private Boolean verbose;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("withQuotaProductType")
    private Boolean withQuotaProductType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("withStorageTierInfo")
    private Boolean withStorageTierInfo;

    private GetProjectRequest(Builder builder) {
        super(builder);
        this.projectName = builder.projectName;
        this.verbose = builder.verbose;
        this.withQuotaProductType = builder.withQuotaProductType;
        this.withStorageTierInfo = builder.withStorageTierInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return verbose
     */
    public Boolean getVerbose() {
        return this.verbose;
    }

    /**
     * @return withQuotaProductType
     */
    public Boolean getWithQuotaProductType() {
        return this.withQuotaProductType;
    }

    /**
     * @return withStorageTierInfo
     */
    public Boolean getWithStorageTierInfo() {
        return this.withStorageTierInfo;
    }

    public static final class Builder extends Request.Builder<GetProjectRequest, Builder> {
        private String projectName; 
        private Boolean verbose; 
        private Boolean withQuotaProductType; 
        private Boolean withStorageTierInfo; 

        private Builder() {
            super();
        } 

        private Builder(GetProjectRequest request) {
            super(request);
            this.projectName = request.projectName;
            this.verbose = request.verbose;
            this.withQuotaProductType = request.withQuotaProductType;
            this.withStorageTierInfo = request.withStorageTierInfo;
        } 

        /**
         * <p>The name of the MaxCompute project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_project</p>
         */
        public Builder projectName(String projectName) {
            this.putPathParameter("projectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>Specifies whether to use additional information.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder verbose(Boolean verbose) {
            this.putQueryParameter("verbose", verbose);
            this.verbose = verbose;
            return this;
        }

        /**
         * withQuotaProductType.
         */
        public Builder withQuotaProductType(Boolean withQuotaProductType) {
            this.putQueryParameter("withQuotaProductType", withQuotaProductType);
            this.withQuotaProductType = withQuotaProductType;
            return this;
        }

        /**
         * withStorageTierInfo.
         */
        public Builder withStorageTierInfo(Boolean withStorageTierInfo) {
            this.putQueryParameter("withStorageTierInfo", withStorageTierInfo);
            this.withStorageTierInfo = withStorageTierInfo;
            return this;
        }

        @Override
        public GetProjectRequest build() {
            return new GetProjectRequest(this);
        } 

    } 

}
