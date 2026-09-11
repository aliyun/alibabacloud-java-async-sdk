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
 * {@link MoveResourceRequest} extends {@link RequestModel}
 *
 * <p>MoveResourceRequest</p>
 */
public class MoveResourceRequest extends Request {
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

    private MoveResourceRequest(Builder builder) {
        super(builder);
        this.sourceDirectoryId = builder.sourceDirectoryId;
        this.sourceId = builder.sourceId;
        this.targetDirectoryId = builder.targetDirectoryId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MoveResourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<MoveResourceRequest, Builder> {
        private String sourceDirectoryId; 
        private String sourceId; 
        private String targetDirectoryId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(MoveResourceRequest request) {
            super(request);
            this.sourceDirectoryId = request.sourceDirectoryId;
            this.sourceId = request.sourceId;
            this.targetDirectoryId = request.targetDirectoryId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The source directory ID, which is the personal directory where the resource currently resides.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSourceDirectoryId</p>
         */
        public Builder sourceDirectoryId(String sourceDirectoryId) {
            this.putBodyParameter("sourceDirectoryId", sourceDirectoryId);
            this.sourceDirectoryId = sourceDirectoryId;
            return this;
        }

        /**
         * <p>The ID of the resource to be moved.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder sourceId(String sourceId) {
            this.putBodyParameter("sourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>The target directory ID, which is the personal directory to which the resource will be moved.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleTargetDirectoryId</p>
         */
        public Builder targetDirectoryId(String targetDirectoryId) {
            this.putBodyParameter("targetDirectoryId", targetDirectoryId);
            this.targetDirectoryId = targetDirectoryId;
            return this;
        }

        /**
         * <p>The tenant ID. You can view the tenant ID by logging on to the MaxCompute console and choosing <strong>Tenant Management</strong> &gt; <strong>Tenant Properties</strong> in the left-side navigation pane.</p>
         * 
         * <strong>example:</strong>
         * <p>PiPklI1iSRTm6VFFqlY9VzbgiEiE</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public MoveResourceRequest build() {
            return new MoveResourceRequest(this);
        } 

    } 

}
