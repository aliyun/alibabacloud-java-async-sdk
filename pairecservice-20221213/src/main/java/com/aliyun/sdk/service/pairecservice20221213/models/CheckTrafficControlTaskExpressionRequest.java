// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link CheckTrafficControlTaskExpressionRequest} extends {@link RequestModel}
 *
 * <p>CheckTrafficControlTaskExpressionRequest</p>
 */
public class CheckTrafficControlTaskExpressionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expression")
    @com.aliyun.core.annotation.Validation(required = true)
    private String expression;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableMetaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableMetaId;

    private CheckTrafficControlTaskExpressionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.expression = builder.expression;
        this.instanceId = builder.instanceId;
        this.tableMetaId = builder.tableMetaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckTrafficControlTaskExpressionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return expression
     */
    public String getExpression() {
        return this.expression;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return tableMetaId
     */
    public String getTableMetaId() {
        return this.tableMetaId;
    }

    public static final class Builder extends Request.Builder<CheckTrafficControlTaskExpressionRequest, Builder> {
        private String regionId; 
        private String expression; 
        private String instanceId; 
        private String tableMetaId; 

        private Builder() {
            super();
        } 

        private Builder(CheckTrafficControlTaskExpressionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.expression = request.expression;
            this.instanceId = request.instanceId;
            this.tableMetaId = request.tableMetaId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder expression(String expression) {
            this.putQueryParameter("Expression", expression);
            this.expression = expression;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder tableMetaId(String tableMetaId) {
            this.putQueryParameter("TableMetaId", tableMetaId);
            this.tableMetaId = tableMetaId;
            return this;
        }

        @Override
        public CheckTrafficControlTaskExpressionRequest build() {
            return new CheckTrafficControlTaskExpressionRequest(this);
        } 

    } 

}
