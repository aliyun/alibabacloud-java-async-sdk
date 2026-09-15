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
         * <p>The configuration target. This parameter is in JSON format and contains the following fields:</p>
         * <ul>
         * <li><strong>vulType</strong>: The vulnerability type. Valid values:<ul>
         * <li><strong>cve</strong>: Linux software vulnerability.</li>
         * <li><strong>sys</strong>: Windows system vulnerability.</li>
         * <li><strong>cms</strong>: Web-CMS vulnerability.</li>
         * <li><strong>emg</strong>: Emergency vulnerability.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;vulType\&quot;:\&quot;sys\&quot;}</p>
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The operation target. This parameter is in JSON format and contains the following fields:</p>
         * <ul>
         * <li><strong>target</strong>: The UUID of the target machine.</li>
         * <li><strong>targetType</strong>: The target type. Fixed value: uuid.</li>
         * <li><strong>flag</strong>: The flag. Valid values:<ul>
         * <li><strong>add</strong>: Selected.</li>
         * <li><strong>del</strong>: Deselected.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;target\&quot;: \&quot;9cd5c684-7201-4de5-ad2c-cea89a5e****\&quot;, \&quot;targetType\&quot;: \&quot;uuid\&quot;, \&quot;flag\&quot;: \&quot;add\&quot;}]</p>
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
