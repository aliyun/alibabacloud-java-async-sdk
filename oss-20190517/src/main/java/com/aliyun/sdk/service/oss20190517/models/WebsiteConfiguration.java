// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link WebsiteConfiguration} extends {@link TeaModel}
 *
 * <p>WebsiteConfiguration</p>
 */
public class WebsiteConfiguration extends TeaModel {
    @NameInMap("ErrorDocument")
    private ErrorDocument errorDocument;

    @NameInMap("IndexDocument")
    private IndexDocument indexDocument;

    @NameInMap("RoutingRules")
    private RoutingRules routingRules;

    private WebsiteConfiguration(Builder builder) {
        this.errorDocument = builder.errorDocument;
        this.indexDocument = builder.indexDocument;
        this.routingRules = builder.routingRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebsiteConfiguration create() {
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
    public RoutingRules getRoutingRules() {
        return this.routingRules;
    }

    public static final class Builder {
        private ErrorDocument errorDocument; 
        private IndexDocument indexDocument; 
        private RoutingRules routingRules; 

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
         * description
         */
        public Builder routingRules(RoutingRules routingRules) {
            this.routingRules = routingRules;
            return this;
        }

        public WebsiteConfiguration build() {
            return new WebsiteConfiguration(this);
        } 

    } 

    public static class RoutingRules extends TeaModel {
        @NameInMap("RoutingRule")
        private java.util.List < RoutingRule > routingRule;

        private RoutingRules(Builder builder) {
            this.routingRule = builder.routingRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoutingRules create() {
            return builder().build();
        }

        /**
         * @return routingRule
         */
        public java.util.List < RoutingRule > getRoutingRule() {
            return this.routingRule;
        }

        public static final class Builder {
            private java.util.List < RoutingRule > routingRule; 

            /**
             * description
             */
            public Builder routingRule(java.util.List < RoutingRule > routingRule) {
                this.routingRule = routingRule;
                return this;
            }

            public RoutingRules build() {
                return new RoutingRules(this);
            } 

        } 

    }
}
