// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCertsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCertsResponseBody</p>
 */
public class DescribeCertsResponseBody extends TeaModel {
    @NameInMap("Certs")
    private java.util.List < Certs> certs;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeCertsResponseBody(Builder builder) {
        this.certs = builder.certs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCertsResponseBody create() {
        return builder().build();
    }

    /**
     * @return certs
     */
    public java.util.List < Certs> getCerts() {
        return this.certs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Certs> certs; 
        private String requestId; 

        /**
         * Certs.
         */
        public Builder certs(java.util.List < Certs> certs) {
            this.certs = certs;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCertsResponseBody build() {
            return new DescribeCertsResponseBody(this);
        } 

    } 

    public static class Certs extends TeaModel {
        @NameInMap("Common")
        private String common;

        @NameInMap("DomainRelated")
        private Boolean domainRelated;

        @NameInMap("EndDate")
        private String endDate;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("Issuer")
        private String issuer;

        @NameInMap("Name")
        private String name;

        @NameInMap("StartDate")
        private String startDate;

        private Certs(Builder builder) {
            this.common = builder.common;
            this.domainRelated = builder.domainRelated;
            this.endDate = builder.endDate;
            this.id = builder.id;
            this.issuer = builder.issuer;
            this.name = builder.name;
            this.startDate = builder.startDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Certs create() {
            return builder().build();
        }

        /**
         * @return common
         */
        public String getCommon() {
            return this.common;
        }

        /**
         * @return domainRelated
         */
        public Boolean getDomainRelated() {
            return this.domainRelated;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        public static final class Builder {
            private String common; 
            private Boolean domainRelated; 
            private String endDate; 
            private Integer id; 
            private String issuer; 
            private String name; 
            private String startDate; 

            /**
             * Common.
             */
            public Builder common(String common) {
                this.common = common;
                return this;
            }

            /**
             * DomainRelated.
             */
            public Builder domainRelated(Boolean domainRelated) {
                this.domainRelated = domainRelated;
                return this;
            }

            /**
             * EndDate.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * Issuer.
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * StartDate.
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            public Certs build() {
                return new Certs(this);
            } 

        } 

    }
}
