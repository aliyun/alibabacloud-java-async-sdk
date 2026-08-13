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
 * {@link ListVisibleKnowledgeBasesRequest} extends {@link RequestModel}
 *
 * <p>ListVisibleKnowledgeBasesRequest</p>
 */
public class ListVisibleKnowledgeBasesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operatingObjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operatingObjectName;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ListVisibleKnowledgeBasesRequest(Builder builder) {
        super(builder);
        this.operatingObjectName = builder.operatingObjectName;
        this.requestId = builder.requestId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVisibleKnowledgeBasesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operatingObjectName
     */
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ListVisibleKnowledgeBasesRequest, Builder> {
        private String operatingObjectName; 
        private String requestId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListVisibleKnowledgeBasesRequest request) {
            super(request);
            this.operatingObjectName = request.operatingObjectName;
            this.requestId = request.requestId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>数字员工名称（运营对象 name）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder operatingObjectName(String operatingObjectName) {
            this.putBodyParameter("operatingObjectName", operatingObjectName);
            this.operatingObjectName = operatingObjectName;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>F892C03F-7E12-5F37-A506-1FC3B065EAC6</p>
         */
        public Builder requestId(String requestId) {
            this.putHeaderParameter("requestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
         * 
         * <strong>example:</strong>
         * <p>1729094555111072</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public ListVisibleKnowledgeBasesRequest build() {
            return new ListVisibleKnowledgeBasesRequest(this);
        } 

    } 

}
