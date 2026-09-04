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
 * {@link BatchRemoveOperatingObjectFavoritesRequest} extends {@link RequestModel}
 *
 * <p>BatchRemoveOperatingObjectFavoritesRequest</p>
 */
public class BatchRemoveOperatingObjectFavoritesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("graphName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String graphName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("objectIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> objectIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("objectType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String objectType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operatingObjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operatingObjectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private BatchRemoveOperatingObjectFavoritesRequest(Builder builder) {
        super(builder);
        this.graphName = builder.graphName;
        this.objectIds = builder.objectIds;
        this.objectType = builder.objectType;
        this.operatingObjectName = builder.operatingObjectName;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchRemoveOperatingObjectFavoritesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return graphName
     */
    public String getGraphName() {
        return this.graphName;
    }

    /**
     * @return objectIds
     */
    public java.util.List<String> getObjectIds() {
        return this.objectIds;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
    }

    /**
     * @return operatingObjectName
     */
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<BatchRemoveOperatingObjectFavoritesRequest, Builder> {
        private String graphName; 
        private java.util.List<String> objectIds; 
        private String objectType; 
        private String operatingObjectName; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(BatchRemoveOperatingObjectFavoritesRequest request) {
            super(request);
            this.graphName = request.graphName;
            this.objectIds = request.objectIds;
            this.objectType = request.objectType;
            this.operatingObjectName = request.operatingObjectName;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>数字员工所属图谱技术名</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>crm</p>
         */
        public Builder graphName(String graphName) {
            this.putBodyParameter("graphName", graphName);
            this.graphName = graphName;
            return this;
        }

        /**
         * <p>待取消关注的对象业务 ID，原始数组 1 至 200 项，每项为最长 128 字符的非空字符串</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>contract-001</p>
         */
        public Builder objectIds(java.util.List<String> objectIds) {
            String objectIdsShrink = shrink(objectIds, "objectIds", "json");
            this.putBodyParameter("objectIds", objectIdsShrink);
            this.objectIds = objectIds;
            return this;
        }

        /**
         * <p>数字员工配置的主对象或显式一级关联对象类型</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>contract</p>
         */
        public Builder objectType(String objectType) {
            this.putBodyParameter("objectType", objectType);
            this.objectType = objectType;
            return this;
        }

        /**
         * <p>数字员工技术名；不得用 objectType 替代</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customer_assistant</p>
         */
        public Builder operatingObjectName(String operatingObjectName) {
            this.putBodyParameter("operatingObjectName", operatingObjectName);
            this.operatingObjectName = operatingObjectName;
            return this;
        }

        /**
         * <p>租户ID，公共参数；缺省时使用调用方默认租户</p>
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
        public BatchRemoveOperatingObjectFavoritesRequest build() {
            return new BatchRemoveOperatingObjectFavoritesRequest(this);
        } 

    } 

}
