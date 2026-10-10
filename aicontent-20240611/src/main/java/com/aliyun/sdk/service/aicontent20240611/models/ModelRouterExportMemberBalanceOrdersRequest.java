// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ModelRouterExportMemberBalanceOrdersRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterExportMemberBalanceOrdersRequest</p>
 */
public class ModelRouterExportMemberBalanceOrdersRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("clientId")
    private Long clientId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("balanceType")
    private String balanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("direction")
    private String direction;

    private ModelRouterExportMemberBalanceOrdersRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.id = builder.id;
        this.balanceType = builder.balanceType;
        this.direction = builder.direction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterExportMemberBalanceOrdersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public Long getClientId() {
        return this.clientId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return balanceType
     */
    public String getBalanceType() {
        return this.balanceType;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    public static final class Builder extends Request.Builder<ModelRouterExportMemberBalanceOrdersRequest, Builder> {
        private Long clientId; 
        private Long id; 
        private String balanceType; 
        private String direction; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterExportMemberBalanceOrdersRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.id = request.id;
            this.balanceType = request.balanceType;
            this.direction = request.direction;
        } 

        /**
         * <p>The department ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder clientId(Long clientId) {
            this.putPathParameter("clientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>The member identifier (member ID within the organization, not the Alibaba Cloud account ID).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder id(Long id) {
            this.putPathParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The balance type filter. Valid values: permanent and monthly.</p>
         * 
         * <strong>example:</strong>
         * <p>permanent</p>
         */
        public Builder balanceType(String balanceType) {
            this.putQueryParameter("balanceType", balanceType);
            this.balanceType = balanceType;
            return this;
        }

        /**
         * <p>The change direction filter. Valid values: in and out.</p>
         * 
         * <strong>example:</strong>
         * <p>in</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("direction", direction);
            this.direction = direction;
            return this;
        }

        @Override
        public ModelRouterExportMemberBalanceOrdersRequest build() {
            return new ModelRouterExportMemberBalanceOrdersRequest(this);
        } 

    } 

}
