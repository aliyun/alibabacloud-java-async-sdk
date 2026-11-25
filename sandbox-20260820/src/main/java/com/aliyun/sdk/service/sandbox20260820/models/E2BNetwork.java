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
 * {@link E2BNetwork} extends {@link TeaModel}
 *
 * <p>E2BNetwork</p>
 */
public class E2BNetwork extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("allowOut")
    private java.util.List<String> allowOut;

    @com.aliyun.core.annotation.NameInMap("allowPublicTraffic")
    private Boolean allowPublicTraffic;

    @com.aliyun.core.annotation.NameInMap("denyOut")
    private java.util.List<String> denyOut;

    @com.aliyun.core.annotation.NameInMap("maskRequestHost")
    private String maskRequestHost;

    @com.aliyun.core.annotation.NameInMap("rules")
    private java.util.Map<String, java.util.List<java.util.Map<String, ?>>> rules;

    private E2BNetwork(Builder builder) {
        this.allowOut = builder.allowOut;
        this.allowPublicTraffic = builder.allowPublicTraffic;
        this.denyOut = builder.denyOut;
        this.maskRequestHost = builder.maskRequestHost;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static E2BNetwork create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowOut
     */
    public java.util.List<String> getAllowOut() {
        return this.allowOut;
    }

    /**
     * @return allowPublicTraffic
     */
    public Boolean getAllowPublicTraffic() {
        return this.allowPublicTraffic;
    }

    /**
     * @return denyOut
     */
    public java.util.List<String> getDenyOut() {
        return this.denyOut;
    }

    /**
     * @return maskRequestHost
     */
    public String getMaskRequestHost() {
        return this.maskRequestHost;
    }

    /**
     * @return rules
     */
    public java.util.Map<String, java.util.List<java.util.Map<String, ?>>> getRules() {
        return this.rules;
    }

    public static final class Builder {
        private java.util.List<String> allowOut; 
        private Boolean allowPublicTraffic; 
        private java.util.List<String> denyOut; 
        private String maskRequestHost; 
        private java.util.Map<String, java.util.List<java.util.Map<String, ?>>> rules; 

        private Builder() {
        } 

        private Builder(E2BNetwork model) {
            this.allowOut = model.allowOut;
            this.allowPublicTraffic = model.allowPublicTraffic;
            this.denyOut = model.denyOut;
            this.maskRequestHost = model.maskRequestHost;
            this.rules = model.rules;
        } 

        /**
         * <p>The allowlist for outbound access from the sandbox. After configuration, the sandbox can only access the destinations in the list.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;api.example.com&quot;,&quot;10.0.0.0/8&quot;]</p>
         */
        public Builder allowOut(java.util.List<String> allowOut) {
            this.allowOut = allowOut;
            return this;
        }

        /**
         * <p>Specifies whether Direct Internet Access to the sandbox is allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder allowPublicTraffic(Boolean allowPublicTraffic) {
            this.allowPublicTraffic = allowPublicTraffic;
            return this;
        }

        /**
         * <p>The denylist for outbound access from the sandbox. After configuration, the sandbox cannot access the destinations in the list.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;blocked.example.com&quot;,&quot;192.168.0.0/16&quot;]</p>
         */
        public Builder denyOut(java.util.List<String> denyOut) {
            this.denyOut = denyOut;
            return this;
        }

        /**
         * <p>The domain name used to rewrite the request Host header when accessing the sandbox. If not configured, the original Host header remains unchanged.</p>
         * 
         * <strong>example:</strong>
         * <p>sandbox.example.com</p>
         */
        public Builder maskRequestHost(String maskRequestHost) {
            this.maskRequestHost = maskRequestHost;
            return this;
        }

        /**
         * <p>The key is the exact destination hostname or the E2B reserved key @fc.sandbox.identity, and the value is a list of rule objects. The number of hostnames and replacement entries is subject to account quota limits. GetSandboxInner echoes the current hostname rules and configured OAuth options in the same format. User tokens are only used during writes.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;api.example.com&quot;:[{&quot;transform&quot;:{&quot;headers&quot;:{&quot;X-Example&quot;:&quot;demo&quot;}}}]}</p>
         */
        public Builder rules(java.util.Map<String, java.util.List<java.util.Map<String, ?>>> rules) {
            this.rules = rules;
            return this;
        }

        public E2BNetwork build() {
            return new E2BNetwork(this);
        } 

    } 

}
