// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WithStatistics")
    private Boolean withStatistics;

    private GetProjectRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.projectName = builder.projectName;
        this.withStatistics = builder.withStatistics;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return withStatistics
     */
    public Boolean getWithStatistics() {
        return this.withStatistics;
    }

    public static final class Builder extends Request.Builder<GetProjectRequest, Builder> {
        private String regionId; 
        private String projectName; 
        private Boolean withStatistics; 

        private Builder() {
            super();
        } 

        private Builder(GetProjectRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.projectName = request.projectName;
            this.withStatistics = request.withStatistics;
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
         * <p>The name of the project. You can obtain the name from the response of the <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>Specifies whether to enable real-time retrieval of file statistics. Default value: false.</p>
         * <ul>
         * <li>If you set the value to true, the returned values of FileCount and TotalFileSize in the response are valid.</li>
         * <li>If you set the value to false, the returned values of FileCount and TotalFileSize in the response are invalid or equal to 0.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder withStatistics(Boolean withStatistics) {
            this.putQueryParameter("WithStatistics", withStatistics);
            this.withStatistics = withStatistics;
            return this;
        }

        @Override
        public GetProjectRequest build() {
            return new GetProjectRequest(this);
        } 

    } 

}
