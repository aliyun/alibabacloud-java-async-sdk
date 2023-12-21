// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopVideoSaveSourceRequest} extends {@link RequestModel}
 *
 * <p>PopVideoSaveSourceRequest</p>
 */
public class PopVideoSaveSourceRequest extends Request {
    @Body
    @NameInMap("JwtToken")
    private String jwtToken;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("SourceType")
    private String sourceType;

    private PopVideoSaveSourceRequest(Builder builder) {
        super(builder);
        this.jwtToken = builder.jwtToken;
        this.projectId = builder.projectId;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PopVideoSaveSourceRequest create() {
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
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<PopVideoSaveSourceRequest, Builder> {
        private String jwtToken; 
        private String projectId; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(PopVideoSaveSourceRequest request) {
            super(request);
            this.jwtToken = request.jwtToken;
            this.projectId = request.projectId;
            this.sourceType = request.sourceType;
        } 

        /**
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putBodyParameter("JwtToken", jwtToken);
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
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public PopVideoSaveSourceRequest build() {
            return new PopVideoSaveSourceRequest(this);
        } 

    } 

}
