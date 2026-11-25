// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

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
 * {@link SetHBaseQuotasRequest} extends {@link RequestModel}
 *
 * <p>SetHBaseQuotasRequest</p>
 */
public class SetHBaseQuotasRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dimension")
    private String dimension;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private String limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeUnit")
    private String timeUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Unit")
    private String unit;

    private SetHBaseQuotasRequest(Builder builder) {
        super(builder);
        this.dimension = builder.dimension;
        this.instanceId = builder.instanceId;
        this.limit = builder.limit;
        this.regionId = builder.regionId;
        this.scope = builder.scope;
        this.securityToken = builder.securityToken;
        this.timeUnit = builder.timeUnit;
        this.type = builder.type;
        this.unit = builder.unit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetHBaseQuotasRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dimension
     */
    public String getDimension() {
        return this.dimension;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return limit
     */
    public String getLimit() {
        return this.limit;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return timeUnit
     */
    public String getTimeUnit() {
        return this.timeUnit;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return unit
     */
    public String getUnit() {
        return this.unit;
    }

    public static final class Builder extends Request.Builder<SetHBaseQuotasRequest, Builder> {
        private String dimension; 
        private String instanceId; 
        private String limit; 
        private String regionId; 
        private String scope; 
        private String securityToken; 
        private String timeUnit; 
        private String type; 
        private String unit; 

        private Builder() {
            super();
        } 

        private Builder(SetHBaseQuotasRequest request) {
            super(request);
            this.dimension = request.dimension;
            this.instanceId = request.instanceId;
            this.limit = request.limit;
            this.regionId = request.regionId;
            this.scope = request.scope;
            this.securityToken = request.securityToken;
            this.timeUnit = request.timeUnit;
            this.type = request.type;
            this.unit = request.unit;
        } 

        /**
         * Dimension.
         */
        public Builder dimension(String dimension) {
            this.putQueryParameter("Dimension", dimension);
            this.dimension = dimension;
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
         * Limit.
         */
        public Builder limit(String limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Scope.
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * TimeUnit.
         */
        public Builder timeUnit(String timeUnit) {
            this.putQueryParameter("TimeUnit", timeUnit);
            this.timeUnit = timeUnit;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * Unit.
         */
        public Builder unit(String unit) {
            this.putQueryParameter("Unit", unit);
            this.unit = unit;
            return this;
        }

        @Override
        public SetHBaseQuotasRequest build() {
            return new SetHBaseQuotasRequest(this);
        } 

    } 

}
