// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyVpcHoneyPotRequest} extends {@link RequestModel}
 *
 * <p>ModifyVpcHoneyPotRequest</p>
 */
public class ModifyVpcHoneyPotRequest extends Request {
    @Query
    @NameInMap("HoneyPotAction")
    private String honeyPotAction;

    @Query
    @NameInMap("VpcId")
    private String vpcId;


    private ModifyVpcHoneyPotRequest(Builder builder) {
        super(builder);
        this.honeyPotAction = builder.honeyPotAction;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVpcHoneyPotRequest create() {
        return builder().build();
    }

    /**
     * @return honeyPotAction
     */
    public String getHoneyPotAction() {
        return this.honeyPotAction;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder {
        private String honeyPotAction; 
        private String vpcId; 

        /**
         * <p>HoneyPotAction.</p>
         */
        public Builder honeyPotAction(String honeyPotAction) {
            this.putQueryParameter("HoneyPotAction", honeyPotAction);
            this.honeyPotAction = honeyPotAction;
            return this;
        }

        /**
         * <p>VpcId.</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        public ModifyVpcHoneyPotRequest build() {
            return new ModifyVpcHoneyPotRequest(this);
        } 

    } 

}
