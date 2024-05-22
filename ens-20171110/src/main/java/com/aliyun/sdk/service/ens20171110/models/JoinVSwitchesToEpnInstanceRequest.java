// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JoinVSwitchesToEpnInstanceRequest} extends {@link RequestModel}
 *
 * <p>JoinVSwitchesToEpnInstanceRequest</p>
 */
public class JoinVSwitchesToEpnInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EPNInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String EPNInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchesInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchesInfo;

    private JoinVSwitchesToEpnInstanceRequest(Builder builder) {
        super(builder);
        this.EPNInstanceId = builder.EPNInstanceId;
        this.vSwitchesInfo = builder.vSwitchesInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JoinVSwitchesToEpnInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return EPNInstanceId
     */
    public String getEPNInstanceId() {
        return this.EPNInstanceId;
    }

    /**
     * @return vSwitchesInfo
     */
    public String getVSwitchesInfo() {
        return this.vSwitchesInfo;
    }

    public static final class Builder extends Request.Builder<JoinVSwitchesToEpnInstanceRequest, Builder> {
        private String EPNInstanceId; 
        private String vSwitchesInfo; 

        private Builder() {
            super();
        } 

        private Builder(JoinVSwitchesToEpnInstanceRequest request) {
            super(request);
            this.EPNInstanceId = request.EPNInstanceId;
            this.vSwitchesInfo = request.vSwitchesInfo;
        } 

        /**
         * The ID of the edge network instance.
         */
        public Builder EPNInstanceId(String EPNInstanceId) {
            this.putQueryParameter("EPNInstanceId", EPNInstanceId);
            this.EPNInstanceId = EPNInstanceId;
            return this;
        }

        /**
         * The information about the internal networking to which you want to add the edge network instance.
         */
        public Builder vSwitchesInfo(String vSwitchesInfo) {
            this.putQueryParameter("VSwitchesInfo", vSwitchesInfo);
            this.vSwitchesInfo = vSwitchesInfo;
            return this;
        }

        @Override
        public JoinVSwitchesToEpnInstanceRequest build() {
            return new JoinVSwitchesToEpnInstanceRequest(this);
        } 

    } 

}
