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
 * {@link CreateGraphRequest} extends {@link RequestModel}
 *
 * <p>CreateGraphRequest</p>
 */
public class CreateGraphRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("businessProfile")
    private String businessProfile;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dataSourceId;

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

    private CreateGraphRequest(Builder builder) {
        super(builder);
        this.businessProfile = builder.businessProfile;
        this.dataSourceId = builder.dataSourceId;
        this.displayName = builder.displayName;
        this.graphName = builder.graphName;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGraphRequest create() {
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
     * @return dataSourceId
     */
    public Long getDataSourceId() {
        return this.dataSourceId;
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

    public static final class Builder extends Request.Builder<CreateGraphRequest, Builder> {
        private String businessProfile; 
        private Long dataSourceId; 
        private String displayName; 
        private String graphName; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreateGraphRequest request) {
            super(request);
            this.businessProfile = request.businessProfile;
            this.dataSourceId = request.dataSourceId;
            this.displayName = request.displayName;
            this.graphName = request.graphName;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>业务说明（可选）</p>
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
         * <p>绑定的数据源 ID（控制台已创建的 RDB 类数据源）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>198001</p>
         */
        public Builder dataSourceId(Long dataSourceId) {
            this.putBodyParameter("dataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * <p>图谱展示名（可选，租户内大小写不敏感唯一，最多200字）</p>
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
         * <p>图谱名称，字母开头+字母/数字/下划线，长度不超过64，租户内唯一</p>
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
        public CreateGraphRequest build() {
            return new CreateGraphRequest(this);
        } 

    } 

}
