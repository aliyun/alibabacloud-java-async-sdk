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
 * {@link ListOperatingObjectFavoritesRequest} extends {@link RequestModel}
 *
 * <p>ListOperatingObjectFavoritesRequest</p>
 */
public class ListOperatingObjectFavoritesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("graphName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String graphName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("objectType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String objectType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operatingObjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operatingObjectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 1)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ListOperatingObjectFavoritesRequest(Builder builder) {
        super(builder);
        this.graphName = builder.graphName;
        this.nextToken = builder.nextToken;
        this.objectType = builder.objectType;
        this.operatingObjectName = builder.operatingObjectName;
        this.pageSize = builder.pageSize;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperatingObjectFavoritesRequest create() {
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
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ListOperatingObjectFavoritesRequest, Builder> {
        private String graphName; 
        private String nextToken; 
        private String objectType; 
        private String operatingObjectName; 
        private Long pageSize; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListOperatingObjectFavoritesRequest request) {
            super(request);
            this.graphName = request.graphName;
            this.nextToken = request.nextToken;
            this.objectType = request.objectType;
            this.operatingObjectName = request.operatingObjectName;
            this.pageSize = request.pageSize;
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
         * <p>上一页返回的签名不透明游标，首屏不传；不得自行解析或拼接</p>
         * 
         * <strong>example:</strong>
         * <p>eyJ2IjoxLCJpZCI6MTAwMX0.c2lnbmF0dXJlX2V4YW1wbGU</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("nextToken", nextToken);
            this.nextToken = nextToken;
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
         * <p>每页数量，范围 1 至 200，默认 100</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
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
        public ListOperatingObjectFavoritesRequest build() {
            return new ListOperatingObjectFavoritesRequest(this);
        } 

    } 

}
