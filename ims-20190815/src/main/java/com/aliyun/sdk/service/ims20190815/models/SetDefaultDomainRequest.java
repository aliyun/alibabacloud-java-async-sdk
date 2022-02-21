// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDefaultDomainRequest} extends {@link RequestModel}
 *
 * <p>SetDefaultDomainRequest</p>
 */
public class SetDefaultDomainRequest extends Request {
    @Query
    @NameInMap("DefaultDomainName")
    @Validation(required = true)
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

        private Builder(SetDefaultDomainRequest response) {
            super(response);
            this.defaultDomainName = response.defaultDomainName;
        } 

        /**
         * DefaultDomainName.
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
