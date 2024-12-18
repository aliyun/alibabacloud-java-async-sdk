// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link ModifyRCInstanceChargeTypeRequest} extends {@link RequestModel}
 *
 * <p>ModifyRCInstanceChargeTypeRequest</p>
 */
public class ModifyRCInstanceChargeTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeDataDisks")
    private Boolean includeDataDisks;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ModifyRCInstanceChargeTypeRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.dryRun = builder.dryRun;
        this.includeDataDisks = builder.includeDataDisks;
        this.instanceChargeType = builder.instanceChargeType;
        this.instanceIds = builder.instanceIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRCInstanceChargeTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return includeDataDisks
     */
    public Boolean getIncludeDataDisks() {
        return this.includeDataDisks;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyRCInstanceChargeTypeRequest, Builder> {
        private Boolean autoPay; 
        private Boolean dryRun; 
        private Boolean includeDataDisks; 
        private String instanceChargeType; 
        private String instanceIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRCInstanceChargeTypeRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.dryRun = request.dryRun;
            this.includeDataDisks = request.includeDataDisks;
            this.instanceChargeType = request.instanceChargeType;
            this.instanceIds = request.instanceIds;
            this.regionId = request.regionId;
        } 

        /**
         * AutoPay.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * IncludeDataDisks.
         */
        public Builder includeDataDisks(Boolean includeDataDisks) {
            this.putQueryParameter("IncludeDataDisks", includeDataDisks);
            this.includeDataDisks = includeDataDisks;
            return this;
        }

        /**
         * InstanceChargeType.
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyRCInstanceChargeTypeRequest build() {
            return new ModifyRCInstanceChargeTypeRequest(this);
        } 

    } 

}
