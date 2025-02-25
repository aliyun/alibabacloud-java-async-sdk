// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetDevObjectDependencyRequest} extends {@link RequestModel}
 *
 * <p>GetDevObjectDependencyRequest</p>
 */
public class GetDevObjectDependencyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectFrom")
    @com.aliyun.core.annotation.Validation(required = true)
    private String objectFrom;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String objectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String objectType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    private GetDevObjectDependencyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.objectFrom = builder.objectFrom;
        this.objectId = builder.objectId;
        this.objectType = builder.objectType;
        this.opTenantId = builder.opTenantId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDevObjectDependencyRequest create() {
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
     * @return objectFrom
     */
    public String getObjectFrom() {
        return this.objectFrom;
    }

    /**
     * @return objectId
     */
    public String getObjectId() {
        return this.objectId;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<GetDevObjectDependencyRequest, Builder> {
        private String regionId; 
        private String objectFrom; 
        private String objectId; 
        private String objectType; 
        private Long opTenantId; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(GetDevObjectDependencyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.objectFrom = request.objectFrom;
            this.objectId = request.objectId;
            this.objectType = request.objectType;
            this.opTenantId = request.opTenantId;
            this.projectId = request.projectId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DATA_PROCESS</p>
         */
        public Builder objectFrom(String objectFrom) {
            this.putQueryParameter("ObjectFrom", objectFrom);
            this.objectFrom = objectFrom;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7026498387616064</p>
         */
        public Builder objectId(String objectId) {
            this.putQueryParameter("ObjectId", objectId);
            this.objectId = objectId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7026498387616064</p>
         */
        public Builder objectType(String objectType) {
            this.putQueryParameter("ObjectType", objectType);
            this.objectType = objectType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7021037162911616L</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public GetDevObjectDependencyRequest build() {
            return new GetDevObjectDependencyRequest(this);
        } 

    } 

}
