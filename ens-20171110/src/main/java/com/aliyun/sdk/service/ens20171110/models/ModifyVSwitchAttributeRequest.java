// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
    @com.aliyun.core.annotation.NameInMap("EnableIPv6")
    private Boolean enableIPv6;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6CidrBlock")
    private String ipv6CidrBlock;

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
        this.enableIPv6 = builder.enableIPv6;
        this.ipv6CidrBlock = builder.ipv6CidrBlock;
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
     * @return enableIPv6
     */
    public Boolean getEnableIPv6() {
        return this.enableIPv6;
    }

    /**
     * @return ipv6CidrBlock
     */
    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
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
        private Boolean enableIPv6; 
        private String ipv6CidrBlock; 
        private String vSwitchId; 
        private String vSwitchName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVSwitchAttributeRequest request) {
            super(request);
            this.description = request.description;
            this.enableIPv6 = request.enableIPv6;
            this.ipv6CidrBlock = request.ipv6CidrBlock;
            this.vSwitchId = request.vSwitchId;
            this.vSwitchName = request.vSwitchName;
        } 

        /**
         * <p>Description.</p>
         * <ul>
         * <li><p>Must be 2 to 256 characters in length and can contain English or Chinese characters.</p>
         * </li>
         * <li><p>Cannot start with http\:// or https\://.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>this is my first vswitch</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EnableIPv6.
         */
        public Builder enableIPv6(Boolean enableIPv6) {
            this.putQueryParameter("EnableIPv6", enableIPv6);
            this.enableIPv6 = enableIPv6;
            return this;
        }

        /**
         * Ipv6CidrBlock.
         */
        public Builder ipv6CidrBlock(String ipv6CidrBlock) {
            this.putQueryParameter("Ipv6CidrBlock", ipv6CidrBlock);
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }

        /**
         * <p>vSwitch ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>n-****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>vSwitch name.</p>
         * <ul>
         * <li><p>Must be 2 to 128 characters long. Can contain letters, digits, Chinese characters, underscores (_), and hyphens (-).</p>
         * </li>
         * <li><p>Must start with a letter or a Chinese character. Cannot start with http\:// or https\://.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Test-switch</p>
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
