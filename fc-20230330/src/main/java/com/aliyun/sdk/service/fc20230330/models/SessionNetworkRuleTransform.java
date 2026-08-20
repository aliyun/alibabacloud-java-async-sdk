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
 * {@link SessionNetworkRuleTransform} extends {@link TeaModel}
 *
 * <p>SessionNetworkRuleTransform</p>
 */
public class SessionNetworkRuleTransform extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("headerValueReplacements")
    private java.util.List<SessionNetworkHeaderValueReplacement> headerValueReplacements;

    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    private SessionNetworkRuleTransform(Builder builder) {
        this.headerValueReplacements = builder.headerValueReplacements;
        this.headers = builder.headers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SessionNetworkRuleTransform create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return headerValueReplacements
     */
    public java.util.List<SessionNetworkHeaderValueReplacement> getHeaderValueReplacements() {
        return this.headerValueReplacements;
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public static final class Builder {
        private java.util.List<SessionNetworkHeaderValueReplacement> headerValueReplacements; 
        private java.util.Map<String, String> headers; 

        private Builder() {
        } 

        private Builder(SessionNetworkRuleTransform model) {
            this.headerValueReplacements = model.headerValueReplacements;
            this.headers = model.headers;
        } 

        /**
         * headerValueReplacements.
         */
        public Builder headerValueReplacements(java.util.List<SessionNetworkHeaderValueReplacement> headerValueReplacements) {
            this.headerValueReplacements = headerValueReplacements;
            return this;
        }

        /**
         * headers.
         */
        public Builder headers(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        public SessionNetworkRuleTransform build() {
            return new SessionNetworkRuleTransform(this);
        } 

    } 

}
