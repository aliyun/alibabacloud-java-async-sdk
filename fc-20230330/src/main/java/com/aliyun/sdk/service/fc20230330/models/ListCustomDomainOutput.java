// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link ListCustomDomainOutput} extends {@link TeaModel}
 *
 * <p>ListCustomDomainOutput</p>
 */
public class ListCustomDomainOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("customDomains")
    private java.util.List<CustomDomain> customDomains;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    private ListCustomDomainOutput(Builder builder) {
        this.customDomains = builder.customDomains;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomDomainOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customDomains
     */
    public java.util.List<CustomDomain> getCustomDomains() {
        return this.customDomains;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder {
        private java.util.List<CustomDomain> customDomains; 
        private String nextToken; 

        private Builder() {
        } 

        private Builder(ListCustomDomainOutput model) {
            this.customDomains = model.customDomains;
            this.nextToken = model.nextToken;
        } 

        /**
         * <p>The custom domain names.</p>
         */
        public Builder customDomains(java.util.List<CustomDomain> customDomains) {
            this.customDomains = customDomains;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
         * 
         * <strong>example:</strong>
         * <p>next_domain_name</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        public ListCustomDomainOutput build() {
            return new ListCustomDomainOutput(this);
        } 

    } 

}
