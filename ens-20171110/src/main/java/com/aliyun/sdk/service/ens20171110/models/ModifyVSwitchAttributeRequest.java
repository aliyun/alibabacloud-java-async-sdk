// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVSwitchAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyVSwitchAttributeRequest</p>
 */
public class ModifyVSwitchAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 256, minLength = 2)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchName")
    @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 2)
    private String vSwitchName;

    private ModifyVSwitchAttributeRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.vSwitchId = builder.vSwitchId;
        this.vSwitchName = builder.vSwitchName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVSwitchAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vSwitchName
     */
    public String getVSwitchName() {
        return this.vSwitchName;
    }

    public static final class Builder extends Request.Builder<ModifyVSwitchAttributeRequest, Builder> {
        private String description; 
        private String vSwitchId; 
        private String vSwitchName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVSwitchAttributeRequest request) {
            super(request);
            this.description = request.description;
            this.vSwitchId = request.vSwitchId;
            this.vSwitchName = request.vSwitchName;
        } 

        /**
         * The description of the vSwitch.
         * <p>
         * 
         * *   The description must be 2 to 256 characters in length.
         * *   The description cannot start with http:// or https://.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the vSwitch.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The name of the vSwitch.
         * <p>
         * 
         * *   The name must be 2 to 128 characters in length.
         * *   The name must start with a letter and cannot start with http:// or https://.
         */
        public Builder vSwitchName(String vSwitchName) {
            this.putQueryParameter("VSwitchName", vSwitchName);
            this.vSwitchName = vSwitchName;
            return this;
        }

        @Override
        public ModifyVSwitchAttributeRequest build() {
            return new ModifyVSwitchAttributeRequest(this);
        } 

    } 

}
