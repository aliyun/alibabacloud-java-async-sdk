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
 * {@link ModifyLoginBaseConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyLoginBaseConfigRequest</p>
 */
public class ModifyLoginBaseConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Target")
    @com.aliyun.core.annotation.Validation(required = true)
    private String target;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private ModifyLoginBaseConfigRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.target = builder.target;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLoginBaseConfigRequest create() {
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

    public static final class Builder extends Request.Builder<ModifyLoginBaseConfigRequest, Builder> {
        private String config; 
        private String target; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ModifyLoginBaseConfigRequest request) {
            super(request);
            this.config = request.config;
            this.target = request.target;
            this.type = request.type;
        } 

        /**
         * <p>The detailed configuration of the unusual logon detection rule for servers. This parameter is in JSON format and includes the following fields:</p>
         * <ul>
         * <li><strong>totalCount</strong>: The total number of assets.</li>
         * <li><strong>uuidCount</strong>: The number of assets to which the rule applies.</li>
         * <li><strong>id</strong>: The ID of the unusual logon rule for servers.</li>
         * <li><strong>location</strong>: The name of the common logon location.</li>
         * </ul>
         * <blockquote>
         * <p>You must set this parameter only when the Type parameter is set to login_common_location.</p>
         * </blockquote>
         * <ul>
         * <li><strong>ip</strong>: The common logon IP address.</li>
         * </ul>
         * <blockquote>
         * <p>You must set this parameter only when the Type parameter is set to login_common_ip.</p>
         * </blockquote>
         * <ul>
         * <li><strong>endTime</strong>: The end time of the common logon period.</li>
         * </ul>
         * <blockquote>
         * <p>You must set this parameter only when the Type parameter is set to login_common_time.</p>
         * </blockquote>
         * <ul>
         * <li><strong>startTime</strong>: The start time of the common logon period.</li>
         * </ul>
         * <blockquote>
         * <p>You must set this parameter only when the Type parameter is set to login_common_time.</p>
         * </blockquote>
         * <ul>
         * <li><strong>account</strong>: The common logon account.</li>
         * </ul>
         * <blockquote>
         * <p>You must set this parameter only when the Type parameter is set to login_common_account.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;totalCount&quot;:174,&quot;uuidCount&quot;:4,&quot;location&quot;:&quot;Montenegro&quot;,&quot;id&quot;:0}</p>
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The configuration of the servers to which the unusual logon detection rule applies. This parameter is in JSON format and includes the following fields:</p>
         * <ul>
         * <li><strong>Target</strong>: The UUID of the server to add or remove.</li>
         * <li><strong>targetType</strong>: The mode in which assets are added. Valid values:<ul>
         * <li><strong>uuid</strong>: Add by individual server.</li>
         * <li><strong>groupId</strong>: Add by server group.</li>
         * </ul>
         * </li>
         * <li><strong>flag</strong>: The specific operation on the asset. Valid values:<ul>
         * <li><strong>del</strong>: Remove the server from the rule.</li>
         * <li><strong>add</strong>: Add the server to the rule.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;target&quot;:&quot;inet-7c676676-06fa-442e-90fb-b802e5d6****&quot;,&quot;targetType&quot;:&quot;uuid&quot;,&quot;flag&quot;:&quot;add&quot;}]</p>
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * <p>The type of unusual logon detection for servers to modify. Valid values:</p>
         * <ul>
         * <li><strong>login_common_location</strong>: Common logon location.</li>
         * <li><strong>login_common_ip</strong>: Common logon IP address.</li>
         * <li><strong>login_common_time</strong>: Common logon time.</li>
         * <li><strong>login_common_account</strong>: Common logon account.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>login_common_location</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ModifyLoginBaseConfigRequest build() {
            return new ModifyLoginBaseConfigRequest(this);
        } 

    } 

}
