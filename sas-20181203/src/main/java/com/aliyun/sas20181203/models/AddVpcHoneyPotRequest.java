// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddVpcHoneyPotRequest} extends {@link RequestModel}
 *
 * <p>AddVpcHoneyPotRequest</p>
 */
public class AddVpcHoneyPotRequest extends Request {
    @Query
    @NameInMap("VpcId")
    private String vpcId;

    @Query
    @NameInMap("VpcSwitchId")
    private String vpcSwitchId;

    private AddVpcHoneyPotRequest(Builder builder) {
        super(builder);
        this.vpcId = builder.vpcId;
        this.vpcSwitchId = builder.vpcSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddVpcHoneyPotRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vpcSwitchId
     */
    public String getVpcSwitchId() {
        return this.vpcSwitchId;
    }

    public static final class Builder extends Request.Builder<AddVpcHoneyPotRequest, Builder> {
        private String vpcId; 
        private String vpcSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(AddVpcHoneyPotRequest response) {
            super(response);
            this.vpcId = response.vpcId;
            this.vpcSwitchId = response.vpcSwitchId;
        } 

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * VpcSwitchId.
         */
        public Builder vpcSwitchId(String vpcSwitchId) {
            this.putQueryParameter("VpcSwitchId", vpcSwitchId);
            this.vpcSwitchId = vpcSwitchId;
            return this;
        }

        @Override
        public AddVpcHoneyPotRequest build() {
            return new AddVpcHoneyPotRequest(this);
        } 

    } 

}
