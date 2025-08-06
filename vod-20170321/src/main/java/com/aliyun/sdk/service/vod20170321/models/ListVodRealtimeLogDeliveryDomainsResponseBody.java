// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link ListVodRealtimeLogDeliveryDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVodRealtimeLogDeliveryDomainsResponseBody</p>
 */
public class ListVodRealtimeLogDeliveryDomainsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListVodRealtimeLogDeliveryDomainsResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVodRealtimeLogDeliveryDomainsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListVodRealtimeLogDeliveryDomainsResponseBody model) {
            this.content = model.content;
            this.requestId = model.requestId;
        } 

        /**
         * Content.
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListVodRealtimeLogDeliveryDomainsResponseBody build() {
            return new ListVodRealtimeLogDeliveryDomainsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVodRealtimeLogDeliveryDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVodRealtimeLogDeliveryDomainsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Domains model) {
                this.domainName = model.domainName;
                this.status = model.status;
            } 

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * Status.
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
     * {@link ListVodRealtimeLogDeliveryDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVodRealtimeLogDeliveryDomainsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Content model) {
                this.domains = model.domains;
            } 

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
