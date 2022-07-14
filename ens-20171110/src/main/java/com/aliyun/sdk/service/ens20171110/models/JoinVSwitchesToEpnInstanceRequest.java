// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JoinVSwitchesToEpnInstanceRequest} extends {@link RequestModel}
 *
 * <p>JoinVSwitchesToEpnInstanceRequest</p>
 */
public class JoinVSwitchesToEpnInstanceRequest extends Request {
    @Query
    @NameInMap("EPNInstanceId")
    @Validation(required = true)
    private String EPNInstanceId;

    @Query
    @NameInMap("VSwitchesInfo")
    @Validation(required = true)
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
         * EPNInstanceId.
         */
        public Builder EPNInstanceId(String EPNInstanceId) {
            this.putQueryParameter("EPNInstanceId", EPNInstanceId);
            this.EPNInstanceId = EPNInstanceId;
            return this;
        }

        /**
         * VSwitchesInfo.
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
