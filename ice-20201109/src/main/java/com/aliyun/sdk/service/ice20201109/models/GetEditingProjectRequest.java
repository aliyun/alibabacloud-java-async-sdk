// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEditingProjectRequest} extends {@link RequestModel}
 *
 * <p>GetEditingProjectRequest</p>
 */
public class GetEditingProjectRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestSource")
    private String requestSource;

    private GetEditingProjectRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.projectId = builder.projectId;
        this.requestSource = builder.requestSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEditingProjectRequest create() {
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
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return requestSource
     */
    public String getRequestSource() {
        return this.requestSource;
    }

    public static final class Builder extends Request.Builder<GetEditingProjectRequest, Builder> {
        private String regionId; 
        private String projectId; 
        private String requestSource; 

        private Builder() {
            super();
        } 

        private Builder(GetEditingProjectRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.projectId = request.projectId;
            this.requestSource = request.requestSource;
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
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RequestSource.
         */
        public Builder requestSource(String requestSource) {
            this.putQueryParameter("RequestSource", requestSource);
            this.requestSource = requestSource;
            return this;
        }

        @Override
        public GetEditingProjectRequest build() {
            return new GetEditingProjectRequest(this);
        } 

    } 

}
