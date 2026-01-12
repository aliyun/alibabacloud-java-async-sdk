// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20221111.models;

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
 * {@link BuildProjectRequest} extends {@link RequestModel}
 *
 * <p>BuildProjectRequest</p>
 */
public class BuildProjectRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JwtToken")
    private String jwtToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoName")
    private String videoName;

    private BuildProjectRequest(Builder builder) {
        super(builder);
        this.jwtToken = builder.jwtToken;
        this.projectId = builder.projectId;
        this.videoName = builder.videoName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BuildProjectRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return videoName
     */
    public String getVideoName() {
        return this.videoName;
    }

    public static final class Builder extends Request.Builder<BuildProjectRequest, Builder> {
        private String jwtToken; 
        private String projectId; 
        private String videoName; 

        private Builder() {
            super();
        } 

        private Builder(BuildProjectRequest request) {
            super(request);
            this.jwtToken = request.jwtToken;
            this.projectId = request.projectId;
            this.videoName = request.videoName;
        } 

        /**
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putQueryParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
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
         * VideoName.
         */
        public Builder videoName(String videoName) {
            this.putQueryParameter("VideoName", videoName);
            this.videoName = videoName;
            return this;
        }

        @Override
        public BuildProjectRequest build() {
            return new BuildProjectRequest(this);
        } 

    } 

}
