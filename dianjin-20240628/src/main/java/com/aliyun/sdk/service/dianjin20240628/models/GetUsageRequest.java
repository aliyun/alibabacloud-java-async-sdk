// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link GetUsageRequest} extends {@link RequestModel}
 *
 * <p>GetUsageRequest</p>
 */
public class GetUsageRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("tenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long tenantId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-Load-Test")
    private Boolean xLoadTest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("externalUserId")
    private String externalUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("redemptionOrderNo")
    private String redemptionOrderNo;

    private GetUsageRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.tenantId = builder.tenantId;
        this.xLoadTest = builder.xLoadTest;
        this.externalUserId = builder.externalUserId;
        this.redemptionOrderNo = builder.redemptionOrderNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUsageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    /**
     * @return xLoadTest
     */
    public Boolean getXLoadTest() {
        return this.xLoadTest;
    }

    /**
     * @return externalUserId
     */
    public String getExternalUserId() {
        return this.externalUserId;
    }

    /**
     * @return redemptionOrderNo
     */
    public String getRedemptionOrderNo() {
        return this.redemptionOrderNo;
    }

    public static final class Builder extends Request.Builder<GetUsageRequest, Builder> {
        private String workspaceId; 
        private Long tenantId; 
        private Boolean xLoadTest; 
        private String externalUserId; 
        private String redemptionOrderNo; 

        private Builder() {
            super();
        } 

        private Builder(GetUsageRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.tenantId = request.tenantId;
            this.xLoadTest = request.xLoadTest;
            this.externalUserId = request.externalUserId;
            this.redemptionOrderNo = request.redemptionOrderNo;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>33412</p>
         */
        public Builder tenantId(Long tenantId) {
            this.putPathParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * X-Load-Test.
         */
        public Builder xLoadTest(Boolean xLoadTest) {
            this.putHeaderParameter("X-Load-Test", xLoadTest);
            this.xLoadTest = xLoadTest;
            return this;
        }

        /**
         * externalUserId.
         */
        public Builder externalUserId(String externalUserId) {
            this.putQueryParameter("externalUserId", externalUserId);
            this.externalUserId = externalUserId;
            return this;
        }

        /**
         * redemptionOrderNo.
         */
        public Builder redemptionOrderNo(String redemptionOrderNo) {
            this.putQueryParameter("redemptionOrderNo", redemptionOrderNo);
            this.redemptionOrderNo = redemptionOrderNo;
            return this;
        }

        @Override
        public GetUsageRequest build() {
            return new GetUsageRequest(this);
        } 

    } 

}
