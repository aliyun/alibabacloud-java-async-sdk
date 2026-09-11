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
 * {@link UpdateGraphInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateGraphInfoRequest</p>
 */
public class UpdateGraphInfoRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("businessProfile")
    private String businessProfile;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayName")
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("graphName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String graphName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private UpdateGraphInfoRequest(Builder builder) {
        super(builder);
        this.businessProfile = builder.businessProfile;
        this.displayName = builder.displayName;
        this.graphName = builder.graphName;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGraphInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessProfile
     */
    public String getBusinessProfile() {
        return this.businessProfile;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return graphName
     */
    public String getGraphName() {
        return this.graphName;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<UpdateGraphInfoRequest, Builder> {
        private String businessProfile; 
        private String displayName; 
        private String graphName; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGraphInfoRequest request) {
            super(request);
            this.businessProfile = request.businessProfile;
            this.displayName = request.displayName;
            this.graphName = request.graphName;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>业务说明（可选；传空串表示清空；与 displayName 至少传其一）</p>
         * 
         * <strong>example:</strong>
         * <p>客户域语义图谱</p>
         */
        public Builder businessProfile(String businessProfile) {
            this.putBodyParameter("businessProfile", businessProfile);
            this.businessProfile = businessProfile;
            return this;
        }

        /**
         * <p>图谱展示名（可选，最多200字；传空串或纯空白会被拒绝；与 businessProfile 至少传其一）</p>
         * 
         * <strong>example:</strong>
         * <p>CRM 图谱</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>图谱名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>crm_graph</p>
         */
        public Builder graphName(String graphName) {
            this.putBodyParameter("graphName", graphName);
            this.graphName = graphName;
            return this;
        }

        /**
         * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
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
        public UpdateGraphInfoRequest build() {
            return new UpdateGraphInfoRequest(this);
        } 

    } 

}
