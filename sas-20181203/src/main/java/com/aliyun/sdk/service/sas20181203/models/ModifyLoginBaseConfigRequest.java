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
         * <p>The details of the configuration that is used to detect unusual logons to your servers. The value of this parameter is in the JSON format and contains the following fields:</p>
         * <ul>
         * <li><strong>totalCount</strong>: the total number of servers.</li>
         * <li><strong>uuidCount</strong>: the number of servers to which the configuration is applied.</li>
         * <li><strong>id</strong>: the ID of the configuration.</li>
         * <li><strong>location</strong>: the common logon location.</li>
         * </ul>
         * <blockquote>
         * <p>You must specify this field if the Type parameter is set to login_common_location.</p>
         * </blockquote>
         * <ul>
         * <li><strong>ip</strong>: the common logon IP address.</li>
         * </ul>
         * <blockquote>
         * <p>You must specify this field if the Type parameter is set to login_common_ip.</p>
         * </blockquote>
         * <ul>
         * <li><strong>endTime</strong>: the end time of the common logon time range.</li>
         * </ul>
         * <blockquote>
         * <p>You must specify this field if the Type parameter is set to login_common_time.</p>
         * </blockquote>
         * <ul>
         * <li><strong>startTime</strong>: the start time of the common logon time range.</li>
         * </ul>
         * <blockquote>
         * <p>You must specify this field if the Type parameter is set to login_common_time.</p>
         * </blockquote>
         * <ul>
         * <li><strong>account</strong>: the common logon account.</li>
         * </ul>
         * <blockquote>
         * <p>You must specify this field if the Type parameter is set to login_common_account.</p>
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
         * <p>The details of the server to which the configuration is applied. The value of this parameter is in the JSON format and contains the following fields:</p>
         * <ul>
         * <li><p><strong>Target</strong>: the UUID of the server.</p>
         * </li>
         * <li><p><strong>targetType</strong>: the type of the server to which the configuration is applied. Valid values:</p>
         * <ul>
         * <li><strong>uuid</strong>: a server</li>
         * <li><strong>groupId</strong>: a server group</li>
         * </ul>
         * </li>
         * <li><p><strong>flag</strong>: the operation that you want to perform on the server. Valid values:</p>
         * <ul>
         * <li><strong>del</strong>: removes the server from the configuration.</li>
         * <li><strong>add</strong>: adds the server to the configuration.</li>
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
         * <p>The logon type of the configuration to modify. Valid values:</p>
         * <ul>
         * <li><strong>login_common_location</strong>: common logon location</li>
         * <li><strong>login_common_ip</strong>: common logon IP address</li>
         * <li><strong>login_common_time</strong>: common logon time range</li>
         * <li><strong>login_common_account</strong>: common logon account</li>
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
