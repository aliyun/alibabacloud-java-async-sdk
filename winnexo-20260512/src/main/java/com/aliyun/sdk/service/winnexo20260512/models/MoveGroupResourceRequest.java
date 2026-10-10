// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link MoveGroupResourceRequest} extends {@link RequestModel}
 *
 * <p>MoveGroupResourceRequest</p>
 */
public class MoveGroupResourceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("groupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceDirectoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceDirectoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetDirectoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetDirectoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private MoveGroupResourceRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.sourceDirectoryId = builder.sourceDirectoryId;
        this.sourceId = builder.sourceId;
        this.targetDirectoryId = builder.targetDirectoryId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MoveGroupResourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return sourceDirectoryId
     */
    public String getSourceDirectoryId() {
        return this.sourceDirectoryId;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return targetDirectoryId
     */
    public String getTargetDirectoryId() {
        return this.targetDirectoryId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<MoveGroupResourceRequest, Builder> {
        private String groupId; 
        private String sourceDirectoryId; 
        private String sourceId; 
        private String targetDirectoryId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(MoveGroupResourceRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.sourceDirectoryId = request.sourceDirectoryId;
            this.sourceId = request.sourceId;
            this.targetDirectoryId = request.targetDirectoryId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The collaboration space ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>group_example</p>
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("groupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The real ID of the physical directory in the space where the resource currently resides. The root sentinel is not supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder sourceDirectoryId(String sourceDirectoryId) {
            this.putBodyParameter("sourceDirectoryId", sourceDirectoryId);
            this.sourceDirectoryId = sourceDirectoryId;
            return this;
        }

        /**
         * <p>The physical GROUP resource ID to be moved. Referenced resources are read-only.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder sourceId(String sourceId) {
            this.putBodyParameter("sourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>The real ID of the target physical directory in the same space. This value must be different from the source directory ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder targetDirectoryId(String targetDirectoryId) {
            this.putBodyParameter("targetDirectoryId", targetDirectoryId);
            this.targetDirectoryId = targetDirectoryId;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter. If this parameter is not specified, the default tenant of the caller is used.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public MoveGroupResourceRequest build() {
            return new MoveGroupResourceRequest(this);
        } 

    } 

}
