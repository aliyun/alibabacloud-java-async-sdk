// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link InnerUpdateSandboxNetworkInput} extends {@link TeaModel}
 *
 * <p>InnerUpdateSandboxNetworkInput</p>
 */
public class InnerUpdateSandboxNetworkInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("allowInternetAccess")
    private Boolean allowInternetAccess;

    @com.aliyun.core.annotation.NameInMap("allowOut")
    private java.util.List<String> allowOut;

    @com.aliyun.core.annotation.NameInMap("denyOut")
    private java.util.List<String> denyOut;

    @com.aliyun.core.annotation.NameInMap("rules")
    private java.util.Map<String, java.util.List<java.util.Map<String, ?>>> rules;

    private InnerUpdateSandboxNetworkInput(Builder builder) {
        this.allowInternetAccess = builder.allowInternetAccess;
        this.allowOut = builder.allowOut;
        this.denyOut = builder.denyOut;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InnerUpdateSandboxNetworkInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowInternetAccess
     */
    public Boolean getAllowInternetAccess() {
        return this.allowInternetAccess;
    }

    /**
     * @return allowOut
     */
    public java.util.List<String> getAllowOut() {
        return this.allowOut;
    }

    /**
     * @return denyOut
     */
    public java.util.List<String> getDenyOut() {
        return this.denyOut;
    }

    /**
     * @return rules
     */
    public java.util.Map<String, java.util.List<java.util.Map<String, ?>>> getRules() {
        return this.rules;
    }

    public static final class Builder {
        private Boolean allowInternetAccess; 
        private java.util.List<String> allowOut; 
        private java.util.List<String> denyOut; 
        private java.util.Map<String, java.util.List<java.util.Map<String, ?>>> rules; 

        private Builder() {
        } 

        private Builder(InnerUpdateSandboxNetworkInput model) {
            this.allowInternetAccess = model.allowInternetAccess;
            this.allowOut = model.allowOut;
            this.denyOut = model.denyOut;
            this.rules = model.rules;
        } 

        /**
         * <p>The switch for outbound public network access from the sandbox. When set to false, it collapses to the default deny policy of the platform and shares the same outbound policy with allowOut and denyOut. This field is included in the full replacement. If omitted, no deny entries are appended based on this switch. However, if allowOut is not empty and denyOut is empty, denyOut is automatically set to 0.0.0.0/0, and IPv4 outbound traffic to destinations other than those in allowOut is denied.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder allowInternetAccess(Boolean allowInternetAccess) {
            this.allowInternetAccess = allowInternetAccess;
            return this;
        }

        /**
         * <p>The destinations allowed for outbound access, which can be IP addresses, CIDR blocks, exact domain names, or domain names with a wildcard only in the leftmost label (such as *.example.com). allowOut takes precedence over denyOut. The maximum list length depends on the account quota. If omitted, the existing allow list is cleared.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;api.example.com&quot;,&quot;10.0.0.0/8&quot;]</p>
         */
        public Builder allowOut(java.util.List<String> allowOut) {
            this.allowOut = allowOut;
            return this;
        }

        /**
         * <p>The destinations denied for outbound access, in the same format as allowOut. If a destination matches both allow and deny rules, the allow rule takes precedence. The maximum list length depends on the account quota. If omitted, the existing deny list is cleared.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;blocked.example.com&quot;,&quot;192.168.0.0/16&quot;]</p>
         */
        public Builder denyOut(java.util.List<String> denyOut) {
            this.denyOut = denyOut;
            return this;
        }

        /**
         * <p>The outbound network rules where the key is an exact destination hostname or the E2B reserved key @fc.sandbox.identity, and the value is a list of rule objects. The number of hosts and replacement entries is subject to the account quota limit. Omitting rules or passing a null object clears the standard host rules. OAuth options tables are updated individually. Omitting the corresponding reserved header retains the original table, while passing the character string &quot;{}&quot; clears the table.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;api.example.com&quot;:[{&quot;transform&quot;:{&quot;headers&quot;:{&quot;X-Example&quot;:&quot;demo&quot;}}}]}</p>
         */
        public Builder rules(java.util.Map<String, java.util.List<java.util.Map<String, ?>>> rules) {
            this.rules = rules;
            return this;
        }

        public InnerUpdateSandboxNetworkInput build() {
            return new InnerUpdateSandboxNetworkInput(this);
        } 

    } 

}
