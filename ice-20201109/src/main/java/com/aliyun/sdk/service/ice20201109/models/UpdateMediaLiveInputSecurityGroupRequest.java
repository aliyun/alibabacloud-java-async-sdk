// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link UpdateMediaLiveInputSecurityGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateMediaLiveInputSecurityGroupRequest</p>
 */
public class UpdateMediaLiveInputSecurityGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WhitelistRules")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> whitelistRules;

    private UpdateMediaLiveInputSecurityGroupRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.securityGroupId = builder.securityGroupId;
        this.whitelistRules = builder.whitelistRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMediaLiveInputSecurityGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return whitelistRules
     */
    public java.util.List<String> getWhitelistRules() {
        return this.whitelistRules;
    }

    public static final class Builder extends Request.Builder<UpdateMediaLiveInputSecurityGroupRequest, Builder> {
        private String name; 
        private String securityGroupId; 
        private java.util.List<String> whitelistRules; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMediaLiveInputSecurityGroupRequest request) {
            super(request);
            this.name = request.name;
            this.securityGroupId = request.securityGroupId;
            this.whitelistRules = request.whitelistRules;
        } 

        /**
         * <p>The name of the security group. Letters, digits, hyphens (-), and underscores (_) are supported. It can be up to 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mysg</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the security group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SEGK5KA6KYKAWQQH</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putBodyParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>The security group rules.</p>
         * <p>This parameter is required.</p>
         */
        public Builder whitelistRules(java.util.List<String> whitelistRules) {
            String whitelistRulesShrink = shrink(whitelistRules, "WhitelistRules", "json");
            this.putBodyParameter("WhitelistRules", whitelistRulesShrink);
            this.whitelistRules = whitelistRules;
            return this;
        }

        @Override
        public UpdateMediaLiveInputSecurityGroupRequest build() {
            return new UpdateMediaLiveInputSecurityGroupRequest(this);
        } 

    } 

}
