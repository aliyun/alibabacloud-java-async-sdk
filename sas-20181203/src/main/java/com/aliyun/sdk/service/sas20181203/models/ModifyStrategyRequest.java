// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyStrategyRequest} extends {@link RequestModel}
 *
 * <p>ModifyStrategyRequest</p>
 */
public class ModifyStrategyRequest extends Request {
    @Query
    @NameInMap("CustomType")
    @Validation(required = true)
    private String customType;

    @Query
    @NameInMap("CycleDays")
    @Validation(required = true)
    private String cycleDays;

    @Query
    @NameInMap("CycleStartTime")
    @Validation(required = true)
    private String cycleStartTime;

    @Query
    @NameInMap("Id")
    private String id;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("RiskCustomParams")
    @Validation(required = true)
    private String riskCustomParams;

    @Query
    @NameInMap("RiskSubTypeName")
    @Validation(required = true)
    private String riskSubTypeName;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private ModifyStrategyRequest(Builder builder) {
        super(builder);
        this.customType = builder.customType;
        this.cycleDays = builder.cycleDays;
        this.cycleStartTime = builder.cycleStartTime;
        this.id = builder.id;
        this.name = builder.name;
        this.riskCustomParams = builder.riskCustomParams;
        this.riskSubTypeName = builder.riskSubTypeName;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyStrategyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customType
     */
    public String getCustomType() {
        return this.customType;
    }

    /**
     * @return cycleDays
     */
    public String getCycleDays() {
        return this.cycleDays;
    }

    /**
     * @return cycleStartTime
     */
    public String getCycleStartTime() {
        return this.cycleStartTime;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return riskCustomParams
     */
    public String getRiskCustomParams() {
        return this.riskCustomParams;
    }

    /**
     * @return riskSubTypeName
     */
    public String getRiskSubTypeName() {
        return this.riskSubTypeName;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<ModifyStrategyRequest, Builder> {
        private String customType; 
        private String cycleDays; 
        private String cycleStartTime; 
        private String id; 
        private String name; 
        private String riskCustomParams; 
        private String riskSubTypeName; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(ModifyStrategyRequest request) {
            super(request);
            this.customType = request.customType;
            this.cycleDays = request.cycleDays;
            this.cycleStartTime = request.cycleStartTime;
            this.id = request.id;
            this.name = request.name;
            this.riskCustomParams = request.riskCustomParams;
            this.riskSubTypeName = request.riskSubTypeName;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * CustomType.
         */
        public Builder customType(String customType) {
            this.putQueryParameter("CustomType", customType);
            this.customType = customType;
            return this;
        }

        /**
         * CycleDays.
         */
        public Builder cycleDays(String cycleDays) {
            this.putQueryParameter("CycleDays", cycleDays);
            this.cycleDays = cycleDays;
            return this;
        }

        /**
         * CycleStartTime.
         */
        public Builder cycleStartTime(String cycleStartTime) {
            this.putQueryParameter("CycleStartTime", cycleStartTime);
            this.cycleStartTime = cycleStartTime;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * RiskCustomParams.
         */
        public Builder riskCustomParams(String riskCustomParams) {
            this.putQueryParameter("RiskCustomParams", riskCustomParams);
            this.riskCustomParams = riskCustomParams;
            return this;
        }

        /**
         * RiskSubTypeName.
         */
        public Builder riskSubTypeName(String riskSubTypeName) {
            this.putQueryParameter("RiskSubTypeName", riskSubTypeName);
            this.riskSubTypeName = riskSubTypeName;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public ModifyStrategyRequest build() {
            return new ModifyStrategyRequest(this);
        } 

    } 

}
