// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.httpdns20160201.models;

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
 * {@link SdnsListRuleCategoriesRequest} extends {@link RequestModel}
 *
 * <p>SdnsListRuleCategoriesRequest</p>
 */
public class SdnsListRuleCategoriesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    private SdnsListRuleCategoriesRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SdnsListRuleCategoriesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    public static final class Builder extends Request.Builder<SdnsListRuleCategoriesRequest, Builder> {
        private String domainName; 

        private Builder() {
            super();
        } 

        private Builder(SdnsListRuleCategoriesRequest request) {
            super(request);
            this.domainName = request.domainName;
        } 

        /**
         * <p>The domain name that is connected to HTTPDNS under the current account. This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>api.example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        @Override
        public SdnsListRuleCategoriesRequest build() {
            return new SdnsListRuleCategoriesRequest(this);
        } 

    } 

}
