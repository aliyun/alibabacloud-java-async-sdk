// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link ListRealtimeLogDeliveryDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRealtimeLogDeliveryDomainsResponseBody</p>
 */
public class ListRealtimeLogDeliveryDomainsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListRealtimeLogDeliveryDomainsResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRealtimeLogDeliveryDomainsResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Content content; 
        private String requestId; 

        /**
         * <p>The information about the accelerated domain names.</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>95D5B69F-8AEC-419B-8F3A-612B35032B0D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListRealtimeLogDeliveryDomainsResponseBody build() {
            return new ListRealtimeLogDeliveryDomainsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRealtimeLogDeliveryDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRealtimeLogDeliveryDomainsResponseBody</p>
     */
    public static class Domains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Domains(Builder builder) {
            this.domainName = builder.domainName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domains create() {
            return builder().build();
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String domainName; 
            private String status; 

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The status. Valid values:</p>
             * <ul>
             * <li><strong>online</strong>: enabled</li>
             * <li><strong>offline</strong>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Domains build() {
                return new Domains(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRealtimeLogDeliveryDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRealtimeLogDeliveryDomainsResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domains")
        private java.util.List<Domains> domains;

        private Content(Builder builder) {
            this.domains = builder.domains;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return domains
         */
        public java.util.List<Domains> getDomains() {
            return this.domains;
        }

        public static final class Builder {
            private java.util.List<Domains> domains; 

            /**
             * Domains.
             */
            public Builder domains(java.util.List<Domains> domains) {
                this.domains = domains;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
