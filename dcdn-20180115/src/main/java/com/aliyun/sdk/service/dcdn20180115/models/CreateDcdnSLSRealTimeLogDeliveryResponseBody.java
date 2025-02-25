// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDcdnSLSRealTimeLogDeliveryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDcdnSLSRealTimeLogDeliveryResponseBody</p>
 */
public class CreateDcdnSLSRealTimeLogDeliveryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDcdnSLSRealTimeLogDeliveryResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDcdnSLSRealTimeLogDeliveryResponseBody create() {
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
         * <p>The configuration results of the domain name.</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F32C57AA-7BF8-49AE-A2CC-9F42390F5A19</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDcdnSLSRealTimeLogDeliveryResponseBody build() {
            return new CreateDcdnSLSRealTimeLogDeliveryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateDcdnSLSRealTimeLogDeliveryResponseBody} extends {@link TeaModel}
     *
     * <p>CreateDcdnSLSRealTimeLogDeliveryResponseBody</p>
     */
    public static class Domains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Domains(Builder builder) {
            this.desc = builder.desc;
            this.domainName = builder.domainName;
            this.region = builder.region;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domains create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String desc; 
            private String domainName; 
            private String region; 
            private String status; 

            /**
             * <p>The description of the returned result.</p>
             * 
             * <strong>example:</strong>
             * <p>ok</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>The domain name from which real-time logs were collected.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The region to which real-time logs were delivered.</p>
             * 
             * <strong>example:</strong>
             * <p>cn</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The status of real-time logs.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
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
     * {@link CreateDcdnSLSRealTimeLogDeliveryResponseBody} extends {@link TeaModel}
     *
     * <p>CreateDcdnSLSRealTimeLogDeliveryResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domains")
        private java.util.List < Domains> domains;

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
        public java.util.List < Domains> getDomains() {
            return this.domains;
        }

        public static final class Builder {
            private java.util.List < Domains> domains; 

            /**
             * Domains.
             */
            public Builder domains(java.util.List < Domains> domains) {
                this.domains = domains;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
