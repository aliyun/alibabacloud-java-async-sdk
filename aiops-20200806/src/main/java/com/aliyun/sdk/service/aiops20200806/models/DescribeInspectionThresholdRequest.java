// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInspectionThresholdRequest} extends {@link RequestModel}
 *
 * <p>DescribeInspectionThresholdRequest</p>
 */
public class DescribeInspectionThresholdRequest extends Request {
    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    @Body
    @NameInMap("RiskCode")
    private String riskCode;

    private DescribeInspectionThresholdRequest(Builder builder) {
        super(builder);
        this.operaUid = builder.operaUid;
        this.riskCode = builder.riskCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInspectionThresholdRequest create() {
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
     * @return riskCode
     */
    public String getRiskCode() {
        return this.riskCode;
    }

    public static final class Builder extends Request.Builder<DescribeInspectionThresholdRequest, Builder> {
        private String operaUid; 
        private String riskCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInspectionThresholdRequest request) {
            super(request);
            this.operaUid = request.operaUid;
            this.riskCode = request.riskCode;
        } 

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putBodyParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * RiskCode.
         */
        public Builder riskCode(String riskCode) {
            this.putBodyParameter("RiskCode", riskCode);
            this.riskCode = riskCode;
            return this;
        }

        @Override
        public DescribeInspectionThresholdRequest build() {
            return new DescribeInspectionThresholdRequest(this);
        } 

    } 

}
