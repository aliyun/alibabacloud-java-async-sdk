// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
         * <p>The ID of the online editing project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>fb2101bf24b2754cb318787dc</strong></strong></p>
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The ID of the request source. Valid values:</p>
         * <p>- OpenAPI (default): Timeline conversion is not performed.</p>
         * <p>- WebSDK: If you specify this value, the project timeline is automatically converted into the frontend style, and the materials in the timeline are associated with the project to enable preview by using frontend web SDKs.</p>
         * 
         * <strong>example:</strong>
         * <p>WebSDK</p>
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
