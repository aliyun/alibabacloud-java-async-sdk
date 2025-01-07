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
 * {@link DeleteLoginBaseConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteLoginBaseConfigRequest</p>
 */
public class DeleteLoginBaseConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Target")
    private String target;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private DeleteLoginBaseConfigRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.target = builder.target;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLoginBaseConfigRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteLoginBaseConfigRequest, Builder> {
        private String config; 
        private String target; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLoginBaseConfigRequest request) {
            super(request);
            this.config = request.config;
            this.target = request.target;
            this.type = request.type;
        } 

        /**
         * <p>The content of the logon security settings to delete. The content varies based on the type of the logon security settings. Valid values:</p>
         * <ul>
         * <li><strong>login_common_ip</strong>: approved logon IP addresses</li>
         * </ul>
         * <p>Example: {&quot;ip&quot;:&quot;10.23.23.23&quot;}.</p>
         * <ul>
         * <li><strong>login_common_time</strong>: approved logon time ranges</li>
         * </ul>
         * <p>Example: {&quot;startTime&quot;:&quot;06:00:00&quot;,&quot;endTime&quot;:&quot;16:00:00&quot;}.</p>
         * <ul>
         * <li><strong>login_common_account</strong>: approved logon accounts</li>
         * </ul>
         * <p>Example: {&quot;account&quot;:&quot;test_account_001&quot;}.</p>
         * <ul>
         * <li><strong>login_common_location</strong>: approved logon locations</li>
         * </ul>
         * <p>Example: {&quot;location&quot;:&quot;Shanghai&quot;}.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;startTime&quot;:&quot;06:00:00&quot;,&quot;endTime&quot;:&quot;16:00:00&quot;}</p>
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The UUID of the server whose logon security settings you want to delete.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4fe8e1cd-3c37-4851-b9de-124da32c****</p>
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * <p>The type of the logon security settings to delete. Valid values:</p>
         * <ul>
         * <li><strong>login_common_ip</strong>: approved logon IP addresses</li>
         * <li><strong>login_common_time</strong>: approved logon time ranges</li>
         * <li><strong>login_common_account</strong>: approved logon accounts</li>
         * <li><strong>login_common_location</strong>: approved logon locations</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>login_common_time</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DeleteLoginBaseConfigRequest build() {
            return new DeleteLoginBaseConfigRequest(this);
        } 

    } 

}
