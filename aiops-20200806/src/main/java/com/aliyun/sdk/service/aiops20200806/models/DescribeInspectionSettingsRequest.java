// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInspectionSettingsRequest} extends {@link RequestModel}
 *
 * <p>DescribeInspectionSettingsRequest</p>
 */
public class DescribeInspectionSettingsRequest extends Request {
    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    @Body
    @NameInMap("ProductCode")
    private String productCode;

    @Body
    @NameInMap("ProductType")
    private Integer productType;

    @Body
    @NameInMap("RiskDesc")
    private String riskDesc;

    @Body
    @NameInMap("RiskEnableStatus")
    private Integer riskEnableStatus;

    @Body
    @NameInMap("RiskName")
    private String riskName;

    @Body
    @NameInMap("RiskType")
    private Integer riskType;

    private DescribeInspectionSettingsRequest(Builder builder) {
        super(builder);
        this.operaUid = builder.operaUid;
        this.productCode = builder.productCode;
        this.productType = builder.productType;
        this.riskDesc = builder.riskDesc;
        this.riskEnableStatus = builder.riskEnableStatus;
        this.riskName = builder.riskName;
        this.riskType = builder.riskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInspectionSettingsRequest create() {
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
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return productType
     */
    public Integer getProductType() {
        return this.productType;
    }

    /**
     * @return riskDesc
     */
    public String getRiskDesc() {
        return this.riskDesc;
    }

    /**
     * @return riskEnableStatus
     */
    public Integer getRiskEnableStatus() {
        return this.riskEnableStatus;
    }

    /**
     * @return riskName
     */
    public String getRiskName() {
        return this.riskName;
    }

    /**
     * @return riskType
     */
    public Integer getRiskType() {
        return this.riskType;
    }

    public static final class Builder extends Request.Builder<DescribeInspectionSettingsRequest, Builder> {
        private String operaUid; 
        private String productCode; 
        private Integer productType; 
        private String riskDesc; 
        private Integer riskEnableStatus; 
        private String riskName; 
        private Integer riskType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInspectionSettingsRequest request) {
            super(request);
            this.operaUid = request.operaUid;
            this.productCode = request.productCode;
            this.productType = request.productType;
            this.riskDesc = request.riskDesc;
            this.riskEnableStatus = request.riskEnableStatus;
            this.riskName = request.riskName;
            this.riskType = request.riskType;
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
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * ProductType.
         */
        public Builder productType(Integer productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * RiskDesc.
         */
        public Builder riskDesc(String riskDesc) {
            this.putBodyParameter("RiskDesc", riskDesc);
            this.riskDesc = riskDesc;
            return this;
        }

        /**
         * RiskEnableStatus.
         */
        public Builder riskEnableStatus(Integer riskEnableStatus) {
            this.putBodyParameter("RiskEnableStatus", riskEnableStatus);
            this.riskEnableStatus = riskEnableStatus;
            return this;
        }

        /**
         * RiskName.
         */
        public Builder riskName(String riskName) {
            this.putBodyParameter("RiskName", riskName);
            this.riskName = riskName;
            return this;
        }

        /**
         * RiskType.
         */
        public Builder riskType(Integer riskType) {
            this.putBodyParameter("RiskType", riskType);
            this.riskType = riskType;
            return this;
        }

        @Override
        public DescribeInspectionSettingsRequest build() {
            return new DescribeInspectionSettingsRequest(this);
        } 

    } 

}
