// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link UpdateNetworkRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateNetworkRuleRequest</p>
 */
public class UpdateNetworkRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourcePrivateIp")
    private String sourcePrivateIp;

    private UpdateNetworkRuleRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.name = builder.name;
        this.sourcePrivateIp = builder.sourcePrivateIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNetworkRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return sourcePrivateIp
     */
    public String getSourcePrivateIp() {
        return this.sourcePrivateIp;
    }

    public static final class Builder extends Request.Builder<UpdateNetworkRuleRequest, Builder> {
        private String description; 
        private String name; 
        private String sourcePrivateIp; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNetworkRuleRequest request) {
            super(request);
            this.description = request.description;
            this.name = request.name;
            this.sourcePrivateIp = request.sourcePrivateIp;
        } 

        /**
         * <p>The description after the update.</p>
         * 
         * <strong>example:</strong>
         * <p>Creat by kst-hzz62ee817bvyyr5****</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the access control rule that you want to update.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>networkrule_test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The private IP address or CIDR block after the update. Separate multiple items with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;192.10.XX.XX&quot;,&quot;192.168.XX.XX/24&quot;]</p>
         */
        public Builder sourcePrivateIp(String sourcePrivateIp) {
            this.putQueryParameter("SourcePrivateIp", sourcePrivateIp);
            this.sourcePrivateIp = sourcePrivateIp;
            return this;
        }

        @Override
        public UpdateNetworkRuleRequest build() {
            return new UpdateNetworkRuleRequest(this);
        } 

    } 

}
