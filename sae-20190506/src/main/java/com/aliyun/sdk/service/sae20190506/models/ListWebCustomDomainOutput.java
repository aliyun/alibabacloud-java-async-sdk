// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link ListWebCustomDomainOutput} extends {@link TeaModel}
 *
 * <p>ListWebCustomDomainOutput</p>
 */
public class ListWebCustomDomainOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("WebCustomDomains")
    private java.util.List<WebCustomDomain> webCustomDomains;

    private ListWebCustomDomainOutput(Builder builder) {
        this.nextToken = builder.nextToken;
        this.webCustomDomains = builder.webCustomDomains;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWebCustomDomainOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return webCustomDomains
     */
    public java.util.List<WebCustomDomain> getWebCustomDomains() {
        return this.webCustomDomains;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List<WebCustomDomain> webCustomDomains; 

        private Builder() {
        } 

        private Builder(ListWebCustomDomainOutput model) {
            this.nextToken = model.nextToken;
            this.webCustomDomains = model.webCustomDomains;
        } 

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * WebCustomDomains.
         */
        public Builder webCustomDomains(java.util.List<WebCustomDomain> webCustomDomains) {
            this.webCustomDomains = webCustomDomains;
            return this;
        }

        public ListWebCustomDomainOutput build() {
            return new ListWebCustomDomainOutput(this);
        } 

    } 

}
