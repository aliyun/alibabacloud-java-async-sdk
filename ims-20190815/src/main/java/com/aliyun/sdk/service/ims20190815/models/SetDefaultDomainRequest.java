// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The default domain name.
         * <p>
         * 
         * The name is in the format of `<AccountAlias>.onaliyun.com`. `<AccountAlias>` indicates the account alias. By default, the value of AccountAlias is the ID of the Alibaba Cloud account. The default domain name must end with `.onaliyun.com`.
         * 
         * The default domain name can contain up to 64 characters in length. The name can contain letters, digits, periods (.), underscores (\_), and hyphens (-).
         * 
         * >  The default domain name cannot start or end with a hyphen (-) and cannot have two consecutive hyphens (-).
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
