// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link UpdateRiskStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateRiskStatusRequest</p>
 */
public class UpdateRiskStatusRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RiskConfirm")
    private String riskConfirm;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RiskConfirmDesc")
    private String riskConfirmDesc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RiskId")
    private String riskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RiskScene")
    private String riskScene;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private UpdateRiskStatusRequest(Builder builder) {
        super(builder);
        this.riskConfirm = builder.riskConfirm;
        this.riskConfirmDesc = builder.riskConfirmDesc;
        this.riskId = builder.riskId;
        this.riskScene = builder.riskScene;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRiskStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return riskConfirm
     */
    public String getRiskConfirm() {
        return this.riskConfirm;
    }

    /**
     * @return riskConfirmDesc
     */
    public String getRiskConfirmDesc() {
        return this.riskConfirmDesc;
    }

    /**
     * @return riskId
     */
    public String getRiskId() {
        return this.riskId;
    }

    /**
     * @return riskScene
     */
    public String getRiskScene() {
        return this.riskScene;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateRiskStatusRequest, Builder> {
        private String riskConfirm; 
        private String riskConfirmDesc; 
        private String riskId; 
        private String riskScene; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRiskStatusRequest request) {
            super(request);
            this.riskConfirm = request.riskConfirm;
            this.riskConfirmDesc = request.riskConfirmDesc;
            this.riskId = request.riskId;
            this.riskScene = request.riskScene;
            this.status = request.status;
        } 

        /**
         * RiskConfirm.
         */
        public Builder riskConfirm(String riskConfirm) {
            this.putBodyParameter("RiskConfirm", riskConfirm);
            this.riskConfirm = riskConfirm;
            return this;
        }

        /**
         * RiskConfirmDesc.
         */
        public Builder riskConfirmDesc(String riskConfirmDesc) {
            this.putBodyParameter("RiskConfirmDesc", riskConfirmDesc);
            this.riskConfirmDesc = riskConfirmDesc;
            return this;
        }

        /**
         * RiskId.
         */
        public Builder riskId(String riskId) {
            this.putBodyParameter("RiskId", riskId);
            this.riskId = riskId;
            return this;
        }

        /**
         * RiskScene.
         */
        public Builder riskScene(String riskScene) {
            this.putBodyParameter("RiskScene", riskScene);
            this.riskScene = riskScene;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateRiskStatusRequest build() {
            return new UpdateRiskStatusRequest(this);
        } 

    } 

}
