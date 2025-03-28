// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link GetQualityFollowerRequest} extends {@link RequestModel}
 *
 * <p>GetQualityFollowerRequest</p>
 */
public class GetQualityFollowerRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long entityId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    private GetQualityFollowerRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.entityId = builder.entityId;
        this.projectId = builder.projectId;
        this.projectName = builder.projectName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQualityFollowerRequest create() {
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
     * @return entityId
     */
    public Long getEntityId() {
        return this.entityId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    public static final class Builder extends Request.Builder<GetQualityFollowerRequest, Builder> {
        private String regionId; 
        private Long entityId; 
        private Long projectId; 
        private String projectName; 

        private Builder() {
            super();
        } 

        private Builder(GetQualityFollowerRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.entityId = request.entityId;
            this.projectId = request.projectId;
            this.projectName = request.projectName;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the partition filter expression.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder entityId(Long entityId) {
            this.putBodyParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * <p>The ID of the DataWorks workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>27</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The name of the engine or data source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>autotest</p>
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        @Override
        public GetQualityFollowerRequest build() {
            return new GetQualityFollowerRequest(this);
        } 

    } 

}
