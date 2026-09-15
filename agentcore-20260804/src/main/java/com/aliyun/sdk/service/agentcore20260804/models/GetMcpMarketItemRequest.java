// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link GetMcpMarketItemRequest} extends {@link RequestModel}
 *
 * <p>GetMcpMarketItemRequest</p>
 */
public class GetMcpMarketItemRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("marketItemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String marketItemId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private GetMcpMarketItemRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.marketItemId = builder.marketItemId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMcpMarketItemRequest create() {
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
     * @return marketItemId
     */
    public String getMarketItemId() {
        return this.marketItemId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetMcpMarketItemRequest, Builder> {
        private String workspaceId; 
        private String marketItemId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetMcpMarketItemRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.marketItemId = request.marketItemId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The AgentCore workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-id</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The MCP marketplace template ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>market-1</p>
         */
        public Builder marketItemId(String marketItemId) {
            this.putPathParameter("marketItemId", marketItemId);
            this.marketItemId = marketItemId;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetMcpMarketItemRequest build() {
            return new GetMcpMarketItemRequest(this);
        } 

    } 

}
