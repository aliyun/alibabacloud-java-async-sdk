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
         * <p>The manually confirmed risk conclusion. This parameter is required when <code>Status</code> is set to <code>Processed</code>. Do not specify this parameter when <code>Status</code> is set to <code>Unprocess</code> or <code>Processing</code>. Valid values:</p>
         * <ul>
         * <li><code>Risk</code>: Confirmed as risky.</li>
         * <li><code>Ignore</code>: Confirmed as not risky.</li>
         * <li><code>Invalid</code>: Confirmed as a false positive.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Risk</p>
         */
        public Builder riskConfirm(String riskConfirm) {
            this.putBodyParameter("RiskConfirm", riskConfirm);
            this.riskConfirm = riskConfirm;
            return this;
        }

        /**
         * <p>The description of the risk event processing decision. The value must be 1 to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>After verification, this risk event is a real risk</p>
         */
        public Builder riskConfirmDesc(String riskConfirmDesc) {
            this.putBodyParameter("RiskConfirmDesc", riskConfirmDesc);
            this.riskConfirmDesc = riskConfirmDesc;
            return this;
        }

        /**
         * <p>The risk event ID. You can obtain the value from the following operation:</p>
         * <ul>
         * <li><code>ListRiskItems</code>: Queries the list of risk events.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>69ef648034cf53d7bac7a9c9c912****</p>
         */
        public Builder riskId(String riskId) {
            this.putBodyParameter("RiskId", riskId);
            this.riskId = riskId;
            return this;
        }

        /**
         * <p>The risk scenario. This parameter is optional. If not specified, the system automatically populates it based on RiskId. Valid values:</p>
         * <ul>
         * <li>account_share: Account sharing.</li>
         * <li>account_stolen: Account stolen.</li>
         * <li>device_share: Device sharing.</li>
         * <li>remote_logon: Remote logon.</li>
         * <li>sensitive_data_leakage: Sensitive data leakage.</li>
         * <li><code>compressed_archive_exfil</code>: Internal network data compression and exfiltration.</li>
         * <li>lateral_scanning: Lateral scanning.</li>
         * <li>ai_skill_malware: Malicious skill.</li>
         * <li>ai_config_check: AI configuration check.</li>
         * <li>openclaw_vulnerability: OpenClaw vulnerability.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>account_stolen</p>
         */
        public Builder riskScene(String riskScene) {
            this.putBodyParameter("RiskScene", riskScene);
            this.riskScene = riskScene;
            return this;
        }

        /**
         * <p>The processing status of the risk event. Valid values:</p>
         * <ul>
         * <li><code>Unprocess</code>: Unprocessed.</li>
         * <li><code>Processing</code>: Being processed.</li>
         * <li><code>Processed</code>: Processed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Processed</p>
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
