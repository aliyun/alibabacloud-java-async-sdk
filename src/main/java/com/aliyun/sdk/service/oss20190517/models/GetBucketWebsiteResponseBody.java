// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetBucketWebsiteResponseBody} extends {@link TeaModel}
 *
 * <p>GetBucketWebsiteResponseBody</p>
 */
public class GetBucketWebsiteResponseBody extends TeaModel {
    @ParentIgnore("WebsiteConfiguration")
    @NameInMap("ErrorDocument")
    private ErrorDocument errorDocument;

    @ParentIgnore("WebsiteConfiguration")
    @NameInMap("IndexDocument")
    private IndexDocument indexDocument;

    @ParentIgnore("WebsiteConfiguration,RoutingRules")
    @NameInMap("RoutingRule")
    private java.util.List < RoutingRule > routingRules;

    private GetBucketWebsiteResponseBody(Builder builder) {
        this.errorDocument = builder.errorDocument;
        this.indexDocument = builder.indexDocument;
        this.routingRules = builder.routingRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketWebsiteResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorDocument
     */
    public ErrorDocument getErrorDocument() {
        return this.errorDocument;
    }

    /**
     * @return indexDocument
     */
    public IndexDocument getIndexDocument() {
        return this.indexDocument;
    }

    /**
     * @return routingRules
     */
    public java.util.List < RoutingRule > getRoutingRules() {
        return this.routingRules;
    }

    public static final class Builder {
        private ErrorDocument errorDocument; 
        private IndexDocument indexDocument; 
        private java.util.List < RoutingRule > routingRules; 

        /**
         * ErrorDocument.
         */
        public Builder errorDocument(ErrorDocument errorDocument) {
            this.errorDocument = errorDocument;
            return this;
        }

        /**
         * IndexDocument.
         */
        public Builder indexDocument(IndexDocument indexDocument) {
            this.indexDocument = indexDocument;
            return this;
        }

        /**
         * RoutingRule.
         */
        public Builder routingRules(java.util.List < RoutingRule > routingRules) {
            this.routingRules = routingRules;
            return this;
        }

        public GetBucketWebsiteResponseBody build() {
            return new GetBucketWebsiteResponseBody(this);
        } 

    } 

}
