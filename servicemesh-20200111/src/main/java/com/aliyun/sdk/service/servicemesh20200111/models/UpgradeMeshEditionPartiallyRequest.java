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
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    @Body
    @NameInMap("SwitchToPro")
    private Boolean switchToPro;

    @Body
    @NameInMap("UpgradeGatewayRecords")
    private String upgradeGatewayRecords;

    private UpgradeMeshEditionPartiallyRequest(Builder builder) {
        super(builder);
        this.ASMGatewayContinue = builder.ASMGatewayContinue;
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
        private String serviceMeshId; 
        private Boolean switchToPro; 
        private String upgradeGatewayRecords; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeMeshEditionPartiallyRequest request) {
            super(request);
            this.ASMGatewayContinue = request.ASMGatewayContinue;
            this.serviceMeshId = request.serviceMeshId;
            this.switchToPro = request.switchToPro;
            this.upgradeGatewayRecords = request.upgradeGatewayRecords;
        } 

        /**
         * ASMGatewayContinue.
         */
        public Builder ASMGatewayContinue(Boolean ASMGatewayContinue) {
            this.putBodyParameter("ASMGatewayContinue", ASMGatewayContinue);
            this.ASMGatewayContinue = ASMGatewayContinue;
            return this;
        }

        /**
         * ServiceMeshId.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        /**
         * SwitchToPro.
         */
        public Builder switchToPro(Boolean switchToPro) {
            this.putBodyParameter("SwitchToPro", switchToPro);
            this.switchToPro = switchToPro;
            return this;
        }

        /**
         * UpgradeGatewayRecords.
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
