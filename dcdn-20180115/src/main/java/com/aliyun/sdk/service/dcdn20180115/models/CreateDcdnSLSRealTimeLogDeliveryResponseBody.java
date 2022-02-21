// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDcdnSLSRealTimeLogDeliveryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDcdnSLSRealTimeLogDeliveryResponseBody</p>
 */
public class CreateDcdnSLSRealTimeLogDeliveryResponseBody extends TeaModel {
    @NameInMap("Content")
    private Content content;

    @NameInMap("RequestId")
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

        public CreateDcdnSLSRealTimeLogDeliveryResponseBody build() {
            return new CreateDcdnSLSRealTimeLogDeliveryResponseBody(this);
        } 

    } 

    public static class Domains extends TeaModel {
        @NameInMap("Desc")
        private String desc;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("Region")
        private String region;

        @NameInMap("Status")
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
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
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
    public static class Content extends TeaModel {
        @NameInMap("Domains")
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
