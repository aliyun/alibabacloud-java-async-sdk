// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateInspectionThresholdRequest} extends {@link RequestModel}
 *
 * <p>UpdateInspectionThresholdRequest</p>
 */
public class UpdateInspectionThresholdRequest extends Request {
    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    @Body
    @NameInMap("RiskCode")
    private String riskCode;

    @Body
    @NameInMap("ThresholdItemListJson")
    private String thresholdItemListJson;

    private UpdateInspectionThresholdRequest(Builder builder) {
        super(builder);
        this.operaUid = builder.operaUid;
        this.riskCode = builder.riskCode;
        this.thresholdItemListJson = builder.thresholdItemListJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInspectionThresholdRequest create() {
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
     * @return thresholdItemListJson
     */
    public String getThresholdItemListJson() {
        return this.thresholdItemListJson;
    }

    public static final class Builder extends Request.Builder<UpdateInspectionThresholdRequest, Builder> {
        private String operaUid; 
        private String riskCode; 
        private String thresholdItemListJson; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInspectionThresholdRequest request) {
            super(request);
            this.operaUid = request.operaUid;
            this.riskCode = request.riskCode;
            this.thresholdItemListJson = request.thresholdItemListJson;
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
         * ThresholdItemListJson.
         */
        public Builder thresholdItemListJson(String thresholdItemListJson) {
            this.putBodyParameter("ThresholdItemListJson", thresholdItemListJson);
            this.thresholdItemListJson = thresholdItemListJson;
            return this;
        }

        @Override
        public UpdateInspectionThresholdRequest build() {
            return new UpdateInspectionThresholdRequest(this);
        } 

    } 

}
