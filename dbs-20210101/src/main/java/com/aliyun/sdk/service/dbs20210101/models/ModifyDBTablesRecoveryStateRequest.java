// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBTablesRecoveryStateRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBTablesRecoveryStateRequest</p>
 */
public class ModifyDBTablesRecoveryStateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionCode")
    private String regionCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Retention")
    private String retention;

    private ModifyDBTablesRecoveryStateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.category = builder.category;
        this.instanceId = builder.instanceId;
        this.regionCode = builder.regionCode;
        this.retention = builder.retention;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBTablesRecoveryStateRequest create() {
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
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionCode
     */
    public String getRegionCode() {
        return this.regionCode;
    }

    /**
     * @return retention
     */
    public String getRetention() {
        return this.retention;
    }

    public static final class Builder extends Request.Builder<ModifyDBTablesRecoveryStateRequest, Builder> {
        private String regionId; 
        private String category; 
        private String instanceId; 
        private String regionCode; 
        private String retention; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBTablesRecoveryStateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.category = request.category;
            this.instanceId = request.instanceId;
            this.regionCode = request.regionCode;
            this.retention = request.retention;
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
         * Category.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RegionCode.
         */
        public Builder regionCode(String regionCode) {
            this.putQueryParameter("RegionCode", regionCode);
            this.regionCode = regionCode;
            return this;
        }

        /**
         * Retention.
         */
        public Builder retention(String retention) {
            this.putQueryParameter("Retention", retention);
            this.retention = retention;
            return this;
        }

        @Override
        public ModifyDBTablesRecoveryStateRequest build() {
            return new ModifyDBTablesRecoveryStateRequest(this);
        } 

    } 

}
