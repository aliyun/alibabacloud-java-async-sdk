// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunPatrolInspectionRequest} extends {@link RequestModel}
 *
 * <p>RunPatrolInspectionRequest</p>
 */
public class RunPatrolInspectionRequest extends Request {
    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("ProductCodes")
    private String productCodes;

    @Query
    @NameInMap("RiskCodeList")
    @Validation(required = true)
    private String riskCodeList;

    private RunPatrolInspectionRequest(Builder builder) {
        super(builder);
        this.operaUid = builder.operaUid;
        this.productCodes = builder.productCodes;
        this.riskCodeList = builder.riskCodeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunPatrolInspectionRequest create() {
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
     * @return productCodes
     */
    public String getProductCodes() {
        return this.productCodes;
    }

    /**
     * @return riskCodeList
     */
    public String getRiskCodeList() {
        return this.riskCodeList;
    }

    public static final class Builder extends Request.Builder<RunPatrolInspectionRequest, Builder> {
        private String operaUid; 
        private String productCodes; 
        private String riskCodeList; 

        private Builder() {
            super();
        } 

        private Builder(RunPatrolInspectionRequest request) {
            super(request);
            this.operaUid = request.operaUid;
            this.productCodes = request.productCodes;
            this.riskCodeList = request.riskCodeList;
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
         * ProductCodes.
         */
        public Builder productCodes(String productCodes) {
            this.putQueryParameter("ProductCodes", productCodes);
            this.productCodes = productCodes;
            return this;
        }

        /**
         * RiskCodeList.
         */
        public Builder riskCodeList(String riskCodeList) {
            this.putQueryParameter("RiskCodeList", riskCodeList);
            this.riskCodeList = riskCodeList;
            return this;
        }

        @Override
        public RunPatrolInspectionRequest build() {
            return new RunPatrolInspectionRequest(this);
        } 

    } 

}
