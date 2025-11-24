// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link UpgradeMeshEditionPartiallyRequest} extends {@link RequestModel}
 *
 * <p>UpgradeMeshEditionPartiallyRequest</p>
 */
public class UpgradeMeshEditionPartiallyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ASMGatewayContinue")
    private Boolean ASMGatewayContinue;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExpectedVersion")
    private String expectedVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PreCheck")
    private Boolean preCheck;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceMeshId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SwitchToPro")
    @Deprecated
    private Boolean switchToPro;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpgradeGatewayRecords")
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
         * <p>Specifies whether to upgrade the ASM gateways for the ASM instance. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ASMGatewayContinue(Boolean ASMGatewayContinue) {
            this.putBodyParameter("ASMGatewayContinue", ASMGatewayContinue);
            this.ASMGatewayContinue = ASMGatewayContinue;
            return this;
        }

        /**
         * <p>The expected version that desired to be upgraded to.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.15.3.118-g4712daf0-aliyun</p>
         */
        public Builder expectedVersion(String expectedVersion) {
            this.putBodyParameter("ExpectedVersion", expectedVersion);
            this.expectedVersion = expectedVersion;
            return this;
        }

        /**
         * <p>Specifies whether to perform an upgrade check. If the value of this parameter is set to true, only the upgrade check is performed and the ASM instance is not upgraded.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder preCheck(Boolean preCheck) {
            this.putBodyParameter("PreCheck", preCheck);
            this.preCheck = preCheck;
            return this;
        }

        /**
         * <p>The ASM instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ca04bc38979214bf2882be79d39b4****</p>
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        /**
         * <p>Specifies whether to upgrade the ASM instance to Professional Edition. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder switchToPro(Boolean switchToPro) {
            this.putBodyParameter("SwitchToPro", switchToPro);
            this.switchToPro = switchToPro;
            return this;
        }

        /**
         * <p>Specifies the ASM gateways to be upgraded. Separate multiple ASM gateways with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>ingressgateway1,ingressgateway2</p>
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
