// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ModifyVulTargetRequest} extends {@link RequestModel}
 *
 * <p>ModifyVulTargetRequest</p>
 */
public class ModifyVulTargetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Target")
    private String target;

    private ModifyVulTargetRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.target = builder.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVulTargetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    public static final class Builder extends Request.Builder<ModifyVulTargetRequest, Builder> {
        private String config; 
        private String target; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVulTargetRequest request) {
            super(request);
            this.config = request.config;
            this.target = request.target;
        } 

        /**
         * <p>The configurations. The value of this parameter is in the JSON format and contains the following fields:</p>
         * <ul>
         * <li><p><strong>vulType</strong>: the type of the vulnerabilities to scan. Valid values:</p>
         * <ul>
         * <li><strong>cve</strong>: Linux software vulnerabilities</li>
         * <li><strong>sys</strong>: Windows system vulnerabilities</li>
         * <li><strong>cms</strong>: Web-CMS vulnerabilities</li>
         * <li><strong>emg</strong>: urgent vulnerabilities</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;vulType&quot;:&quot;sys&quot;}</p>
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The operation. The value of this parameter is in the JSON format and contains the following fields:</p>
         * <ul>
         * <li><p><strong>target</strong>: the UUID of the server.</p>
         * </li>
         * <li><p><strong>targetType</strong>: the application scope of the operation. Set the value to uuid.</p>
         * </li>
         * <li><p><strong>flag</strong>: the type of the operation. Valid values:</p>
         * <ul>
         * <li><strong>add</strong>: select</li>
         * <li><strong>del</strong>: deselect</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;target&quot;: &quot;9cd5c684-7201-4de5-ad2c-cea89a5e****&quot;, &quot;targetType&quot;: &quot;uuid&quot;, &quot;flag&quot;: &quot;add&quot;}]</p>
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        @Override
        public ModifyVulTargetRequest build() {
            return new ModifyVulTargetRequest(this);
        } 

    } 

}
