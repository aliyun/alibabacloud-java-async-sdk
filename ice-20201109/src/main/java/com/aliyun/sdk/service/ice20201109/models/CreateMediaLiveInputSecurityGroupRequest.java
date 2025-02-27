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
 * {@link CreateMediaLiveInputSecurityGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateMediaLiveInputSecurityGroupRequest</p>
 */
public class CreateMediaLiveInputSecurityGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WhitelistRules")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> whitelistRules;

    private CreateMediaLiveInputSecurityGroupRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.whitelistRules = builder.whitelistRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMediaLiveInputSecurityGroupRequest create() {
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
     * @return whitelistRules
     */
    public java.util.List<String> getWhitelistRules() {
        return this.whitelistRules;
    }

    public static final class Builder extends Request.Builder<CreateMediaLiveInputSecurityGroupRequest, Builder> {
        private String name; 
        private java.util.List<String> whitelistRules; 

        private Builder() {
            super();
        } 

        private Builder(CreateMediaLiveInputSecurityGroupRequest request) {
            super(request);
            this.name = request.name;
            this.whitelistRules = request.whitelistRules;
        } 

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;10.1.1.0/24&quot;, &quot;11.11.11.11/0&quot;]</p>
         */
        public Builder whitelistRules(java.util.List<String> whitelistRules) {
            String whitelistRulesShrink = shrink(whitelistRules, "WhitelistRules", "json");
            this.putBodyParameter("WhitelistRules", whitelistRulesShrink);
            this.whitelistRules = whitelistRules;
            return this;
        }

        @Override
        public CreateMediaLiveInputSecurityGroupRequest build() {
            return new CreateMediaLiveInputSecurityGroupRequest(this);
        } 

    } 

}
