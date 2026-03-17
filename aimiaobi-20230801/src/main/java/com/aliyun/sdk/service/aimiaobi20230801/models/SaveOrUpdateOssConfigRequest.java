// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link SaveOrUpdateOssConfigRequest} extends {@link RequestModel}
 *
 * <p>SaveOrUpdateOssConfigRequest</p>
 */
public class SaveOrUpdateOssConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BucketName")
    private String bucketName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndPoint")
    private String endPoint;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private SaveOrUpdateOssConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bucketName = builder.bucketName;
        this.endPoint = builder.endPoint;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveOrUpdateOssConfigRequest create() {
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
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * @return endPoint
     */
    public String getEndPoint() {
        return this.endPoint;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<SaveOrUpdateOssConfigRequest, Builder> {
        private String regionId; 
        private String bucketName; 
        private String endPoint; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(SaveOrUpdateOssConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bucketName = request.bucketName;
            this.endPoint = request.endPoint;
            this.workspaceId = request.workspaceId;
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
         * BucketName.
         */
        public Builder bucketName(String bucketName) {
            this.putBodyParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * EndPoint.
         */
        public Builder endPoint(String endPoint) {
            this.putBodyParameter("EndPoint", endPoint);
            this.endPoint = endPoint;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public SaveOrUpdateOssConfigRequest build() {
            return new SaveOrUpdateOssConfigRequest(this);
        } 

    } 

}
