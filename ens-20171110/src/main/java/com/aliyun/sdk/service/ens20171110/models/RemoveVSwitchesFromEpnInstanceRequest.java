// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveVSwitchesFromEpnInstanceRequest} extends {@link RequestModel}
 *
 * <p>RemoveVSwitchesFromEpnInstanceRequest</p>
 */
public class RemoveVSwitchesFromEpnInstanceRequest extends Request {
    @Query
    @NameInMap("EPNInstanceId")
    @Validation(required = true)
    private String EPNInstanceId;

    @Query
    @NameInMap("VSwitchesInfo")
    @Validation(required = true)
    private String vSwitchesInfo;

    private RemoveVSwitchesFromEpnInstanceRequest(Builder builder) {
        super(builder);
        this.EPNInstanceId = builder.EPNInstanceId;
        this.vSwitchesInfo = builder.vSwitchesInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveVSwitchesFromEpnInstanceRequest create() {
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

    public static final class Builder extends Request.Builder<RemoveVSwitchesFromEpnInstanceRequest, Builder> {
        private String EPNInstanceId; 
        private String vSwitchesInfo; 

        private Builder() {
            super();
        } 

        private Builder(RemoveVSwitchesFromEpnInstanceRequest request) {
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
        public RemoveVSwitchesFromEpnInstanceRequest build() {
            return new RemoveVSwitchesFromEpnInstanceRequest(this);
        } 

    } 

}
