// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpcBindingInput} extends {@link TeaModel}
 *
 * <p>CreateVpcBindingInput</p>
 */
public class CreateVpcBindingInput extends TeaModel {
    @NameInMap("vpcId")
    @Validation(required = true, minLength = 1)
    private String vpcId;

    private CreateVpcBindingInput(Builder builder) {
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpcBindingInput create() {
        return builder().build();
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder {
        private String vpcId; 

        /**
         * vpcId.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public CreateVpcBindingInput build() {
            return new CreateVpcBindingInput(this);
        } 

    } 

}
