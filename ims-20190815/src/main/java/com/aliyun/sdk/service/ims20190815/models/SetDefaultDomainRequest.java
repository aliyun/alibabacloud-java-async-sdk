// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link SetDefaultDomainRequest} extends {@link RequestModel}
 *
 * <p>SetDefaultDomainRequest</p>
 */
public class SetDefaultDomainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultDomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String defaultDomainName;

    private SetDefaultDomainRequest(Builder builder) {
        super(builder);
        this.defaultDomainName = builder.defaultDomainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDefaultDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defaultDomainName
     */
    public String getDefaultDomainName() {
        return this.defaultDomainName;
    }

    public static final class Builder extends Request.Builder<SetDefaultDomainRequest, Builder> {
        private String defaultDomainName; 

        private Builder() {
            super();
        } 

        private Builder(SetDefaultDomainRequest request) {
            super(request);
            this.defaultDomainName = request.defaultDomainName;
        } 

        /**
         * <p>The default domain name.</p>
         * <p>The default domain name is in the format of <code>&lt;AccountAlias&gt;.onaliyun.com</code>. <code>&lt;AccountAlias&gt;</code> indicates the account alias. By default, the value of AccountAlias is the ID of the Alibaba Cloud account. The default domain name must end with <code>.onaliyun.com</code>.</p>
         * <p>The default domain name can contain up to 64 characters in length. The default domain name can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
         * <blockquote>
         * <p> The default domain name cannot start or end with a hyphen (-) and cannot contain two consecutive hyphens (-).</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>examplecompany.onaliyun.com</p>
         */
        public Builder defaultDomainName(String defaultDomainName) {
            this.putQueryParameter("DefaultDomainName", defaultDomainName);
            this.defaultDomainName = defaultDomainName;
            return this;
        }

        @Override
        public SetDefaultDomainRequest build() {
            return new SetDefaultDomainRequest(this);
        } 

    } 

}
