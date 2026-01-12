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
 * {@link ListProjectsByDependencyIdRequest} extends {@link RequestModel}
 *
 * <p>ListProjectsByDependencyIdRequest</p>
 */
public class ListProjectsByDependencyIdRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DependencyProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dependencyProjectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JwtToken")
    private String jwtToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MapUuid")
    private String mapUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WithDataset")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean withDataset;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WithSource")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean withSource;

    private ListProjectsByDependencyIdRequest(Builder builder) {
        super(builder);
        this.dependencyProjectId = builder.dependencyProjectId;
        this.jwtToken = builder.jwtToken;
        this.mapUuid = builder.mapUuid;
        this.withDataset = builder.withDataset;
        this.withSource = builder.withSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectsByDependencyIdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dependencyProjectId
     */
    public Long getDependencyProjectId() {
        return this.dependencyProjectId;
    }

    /**
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    /**
     * @return mapUuid
     */
    public String getMapUuid() {
        return this.mapUuid;
    }

    /**
     * @return withDataset
     */
    public Boolean getWithDataset() {
        return this.withDataset;
    }

    /**
     * @return withSource
     */
    public Boolean getWithSource() {
        return this.withSource;
    }

    public static final class Builder extends Request.Builder<ListProjectsByDependencyIdRequest, Builder> {
        private Long dependencyProjectId; 
        private String jwtToken; 
        private String mapUuid; 
        private Boolean withDataset; 
        private Boolean withSource; 

        private Builder() {
            super();
        } 

        private Builder(ListProjectsByDependencyIdRequest request) {
            super(request);
            this.dependencyProjectId = request.dependencyProjectId;
            this.jwtToken = request.jwtToken;
            this.mapUuid = request.mapUuid;
            this.withDataset = request.withDataset;
            this.withSource = request.withSource;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder dependencyProjectId(Long dependencyProjectId) {
            this.putBodyParameter("DependencyProjectId", dependencyProjectId);
            this.dependencyProjectId = dependencyProjectId;
            return this;
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
         * MapUuid.
         */
        public Builder mapUuid(String mapUuid) {
            this.putBodyParameter("MapUuid", mapUuid);
            this.mapUuid = mapUuid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder withDataset(Boolean withDataset) {
            this.putBodyParameter("WithDataset", withDataset);
            this.withDataset = withDataset;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder withSource(Boolean withSource) {
            this.putBodyParameter("WithSource", withSource);
            this.withSource = withSource;
            return this;
        }

        @Override
        public ListProjectsByDependencyIdRequest build() {
            return new ListProjectsByDependencyIdRequest(this);
        } 

    } 

}
