// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunRiskPatrolRequest} extends {@link RequestModel}
 *
 * <p>RunRiskPatrolRequest</p>
 */
public class RunRiskPatrolRequest extends Request {
    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("RiskPatrolTypes")
    private String riskPatrolTypes;

    private RunRiskPatrolRequest(Builder builder) {
        super(builder);
        this.operaUid = builder.operaUid;
        this.riskPatrolTypes = builder.riskPatrolTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunRiskPatrolRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return riskPatrolTypes
     */
    public String getRiskPatrolTypes() {
        return this.riskPatrolTypes;
    }

    public static final class Builder extends Request.Builder<RunRiskPatrolRequest, Builder> {
        private String operaUid; 
        private String riskPatrolTypes; 

        private Builder() {
            super();
        } 

        private Builder(RunRiskPatrolRequest request) {
            super(request);
            this.operaUid = request.operaUid;
            this.riskPatrolTypes = request.riskPatrolTypes;
        } 

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * RiskPatrolTypes.
         */
        public Builder riskPatrolTypes(String riskPatrolTypes) {
            this.putQueryParameter("RiskPatrolTypes", riskPatrolTypes);
            this.riskPatrolTypes = riskPatrolTypes;
            return this;
        }

        @Override
        public RunRiskPatrolRequest build() {
            return new RunRiskPatrolRequest(this);
        } 

    } 

}
