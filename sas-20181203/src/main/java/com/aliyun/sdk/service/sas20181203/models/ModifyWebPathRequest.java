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
 * {@link ModifyWebPathRequest} extends {@link RequestModel}
 *
 * <p>ModifyWebPathRequest</p>
 */
public class ModifyWebPathRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Target")
    private String target;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ModifyWebPathRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.target = builder.target;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWebPathRequest create() {
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ModifyWebPathRequest, Builder> {
        private String config; 
        private String target; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ModifyWebPathRequest request) {
            super(request);
            this.config = request.config;
            this.target = request.target;
            this.type = request.type;
        } 

        /**
         * <p>The configuration of the web directory. The value of this parameter is in the JSON format and contains the following fields:</p>
         * <ul>
         * <li><strong>webPathType</strong>: the type of the web directory</li>
         * <li><strong>webPath</strong>: the web directory</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;webPathType&quot;: &quot;customize&quot;,
         *       &quot;webPath&quot;: &quot;/root/www****&quot;
         * }</p>
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The protected asset to which the web directory belongs. The value of this parameter is in the JSON format and contains the following fields:</p>
         * <ul>
         * <li><strong>target</strong>: the protected asset.</li>
         * <li><strong>targetType</strong>: the type of the asset. Set the value to uuid.</li>
         * <li><strong>flag</strong>: the type of the operation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;target&quot;:&quot;0186127a-d33e-4d0c-94fb-8f25f87bc69f&quot;,&quot;targetType&quot;:&quot;uuid&quot;,&quot;flag&quot;:&quot;add&quot;}]</p>
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * <p>The type of the configuration item. Set the value to <strong>web_path</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>web_path</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ModifyWebPathRequest build() {
            return new ModifyWebPathRequest(this);
        } 

    } 

}
