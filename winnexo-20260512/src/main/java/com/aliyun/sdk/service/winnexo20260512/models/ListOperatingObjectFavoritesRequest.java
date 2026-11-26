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
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("appToken")
    private String appToken;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserCode")
    private String opsUserCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserId")
    private String opsUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 1)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ListOperatingObjectFavoritesRequest(Builder builder) {
        super(builder);
        this.appToken = builder.appToken;
        this.graphName = builder.graphName;
        this.nextToken = builder.nextToken;
        this.objectType = builder.objectType;
        this.operatingObjectName = builder.operatingObjectName;
        this.opsUserCode = builder.opsUserCode;
        this.opsUserId = builder.opsUserId;
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
     * @return appToken
     */
    public String getAppToken() {
        return this.appToken;
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
     * @return opsUserCode
     */
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    /**
     * @return opsUserId
     */
    public String getOpsUserId() {
        return this.opsUserId;
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
        private String appToken; 
        private String graphName; 
        private String nextToken; 
        private String objectType; 
        private String operatingObjectName; 
        private String opsUserCode; 
        private String opsUserId; 
        private Long pageSize; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListOperatingObjectFavoritesRequest request) {
            super(request);
            this.appToken = request.appToken;
            this.graphName = request.graphName;
            this.nextToken = request.nextToken;
            this.objectType = request.objectType;
            this.operatingObjectName = request.operatingObjectName;
            this.opsUserCode = request.opsUserCode;
            this.opsUserId = request.opsUserId;
            this.pageSize = request.pageSize;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The platform application token issued by the console. If specified, the operation is executed as the user identified by opsUserId or opsUserCode.</p>
         * 
         * <strong>example:</strong>
         * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        public Builder appToken(String appToken) {
            this.putQueryParameter("appToken", appToken);
            this.appToken = appToken;
            return this;
        }

        /**
         * <p>The name of the graph. You can call the listGraphs operation to obtain the graph name.</p>
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
         * <p>The pagination cursor.</p>
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
         * <p>The object type, such as customer. This parameter has a value when type is set to mention.</p>
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
         * <p>The name of the digital worker, which is the name of the operating object. This parameter is optional.</p>
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
         * <p>The proxy user code, which is unique within the tenant. This parameter is used only when the application credential is configured as source_uid.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder opsUserCode(String opsUserCode) {
            this.putQueryParameter("opsUserCode", opsUserCode);
            this.opsUserCode = opsUserCode;
            return this;
        }

        /**
         * <p>The proxy user ID, which is the WINNEXO platform user ID. This parameter is used only when the application credential is configured as winnexo_uid.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder opsUserId(String opsUserId) {
            this.putQueryParameter("opsUserId", opsUserId);
            this.opsUserId = opsUserId;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
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
         * <p>The ID of the effective tenant.</p>
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
