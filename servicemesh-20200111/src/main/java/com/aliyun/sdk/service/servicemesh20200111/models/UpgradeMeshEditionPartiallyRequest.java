// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeMeshEditionPartiallyRequest} extends {@link RequestModel}
 *
 * <p>UpgradeMeshEditionPartiallyRequest</p>
 */
public class UpgradeMeshEditionPartiallyRequest extends Request {
    @Body
    @NameInMap("ASMGatewayContinue")
    private Boolean ASMGatewayContinue;

    @Body
    @NameInMap("ExpectedVersion")
    private String expectedVersion;

    @Body
    @NameInMap("PreCheck")
    private Boolean preCheck;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    @Body
    @NameInMap("SwitchToPro")
    @Deprecated
    private Boolean switchToPro;

    @Body
    @NameInMap("UpgradeGatewayRecords")
    private String upgradeGatewayRecords;

    private UpgradeMeshEditionPartiallyRequest(Builder builder) {
        super(builder);
        this.ASMGatewayContinue = builder.ASMGatewayContinue;
        this.expectedVersion = builder.expectedVersion;
        this.preCheck = builder.preCheck;
        this.serviceMeshId = builder.serviceMeshId;
        this.switchToPro = builder.switchToPro;
        this.upgradeGatewayRecords = builder.upgradeGatewayRecords;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeMeshEditionPartiallyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ASMGatewayContinue
     */
    public Boolean getASMGatewayContinue() {
        return this.ASMGatewayContinue;
    }

    /**
     * @return expectedVersion
     */
    public String getExpectedVersion() {
        return this.expectedVersion;
    }

    /**
     * @return preCheck
     */
    public Boolean getPreCheck() {
        return this.preCheck;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    /**
     * @return switchToPro
     */
    public Boolean getSwitchToPro() {
        return this.switchToPro;
    }

    /**
     * @return upgradeGatewayRecords
     */
    public String getUpgradeGatewayRecords() {
        return this.upgradeGatewayRecords;
    }

    public static final class Builder extends Request.Builder<UpgradeMeshEditionPartiallyRequest, Builder> {
        private Boolean ASMGatewayContinue; 
        private String expectedVersion; 
        private Boolean preCheck; 
        private String serviceMeshId; 
        private Boolean switchToPro; 
        private String upgradeGatewayRecords; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeMeshEditionPartiallyRequest request) {
            super(request);
            this.ASMGatewayContinue = request.ASMGatewayContinue;
            this.expectedVersion = request.expectedVersion;
            this.preCheck = request.preCheck;
            this.serviceMeshId = request.serviceMeshId;
            this.switchToPro = request.switchToPro;
            this.upgradeGatewayRecords = request.upgradeGatewayRecords;
        } 

        /**
         * Specifies whether to upgrade the ASM gateways for the ASM instance. Valid values:
         * <p>
         * 
         * *   `true`
         * *   `false`
         */
        public Builder ASMGatewayContinue(Boolean ASMGatewayContinue) {
            this.putBodyParameter("ASMGatewayContinue", ASMGatewayContinue);
            this.ASMGatewayContinue = ASMGatewayContinue;
            return this;
        }

        /**
         * ExpectedVersion.
         */
        public Builder expectedVersion(String expectedVersion) {
            this.putBodyParameter("ExpectedVersion", expectedVersion);
            this.expectedVersion = expectedVersion;
            return this;
        }

        /**
         * 执行升级检查。如果该值设置为true，则只会执行升级检查，并不会实际升级。
         */
        public Builder preCheck(Boolean preCheck) {
            this.putBodyParameter("PreCheck", preCheck);
            this.preCheck = preCheck;
            return this;
        }

        /**
         * The ASM instance ID.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        /**
         * *   ``
         * <p>
         * *   ``
         */
        public Builder switchToPro(Boolean switchToPro) {
            this.putBodyParameter("SwitchToPro", switchToPro);
            this.switchToPro = switchToPro;
            return this;
        }

        /**
         * Specifies the ASM gateways to be upgraded. Separate multiple ASM gateways with commas (,).
         */
        public Builder upgradeGatewayRecords(String upgradeGatewayRecords) {
            this.putBodyParameter("UpgradeGatewayRecords", upgradeGatewayRecords);
            this.upgradeGatewayRecords = upgradeGatewayRecords;
            return this;
        }

        @Override
        public UpgradeMeshEditionPartiallyRequest build() {
            return new UpgradeMeshEditionPartiallyRequest(this);
        } 

    } 

}
