// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateInspectionSettingStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateInspectionSettingStatusRequest</p>
 */
public class UpdateInspectionSettingStatusRequest extends Request {
    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    @Body
    @NameInMap("RiskCode")
    private String riskCode;

    @Body
    @NameInMap("RiskEnableStatus")
    private Integer riskEnableStatus;

    private UpdateInspectionSettingStatusRequest(Builder builder) {
        super(builder);
        this.operaUid = builder.operaUid;
        this.riskCode = builder.riskCode;
        this.riskEnableStatus = builder.riskEnableStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInspectionSettingStatusRequest create() {
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

    /**
     * @return riskEnableStatus
     */
    public Integer getRiskEnableStatus() {
        return this.riskEnableStatus;
    }

    public static final class Builder extends Request.Builder<UpdateInspectionSettingStatusRequest, Builder> {
        private String operaUid; 
        private String riskCode; 
        private Integer riskEnableStatus; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInspectionSettingStatusRequest request) {
            super(request);
            this.operaUid = request.operaUid;
            this.riskCode = request.riskCode;
            this.riskEnableStatus = request.riskEnableStatus;
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

        /**
         * RiskEnableStatus.
         */
        public Builder riskEnableStatus(Integer riskEnableStatus) {
            this.putBodyParameter("RiskEnableStatus", riskEnableStatus);
            this.riskEnableStatus = riskEnableStatus;
            return this;
        }

        @Override
        public UpdateInspectionSettingStatusRequest build() {
            return new UpdateInspectionSettingStatusRequest(this);
        } 

    } 

}
