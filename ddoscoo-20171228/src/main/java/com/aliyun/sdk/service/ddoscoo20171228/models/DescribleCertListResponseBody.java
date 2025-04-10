// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

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
 * {@link DescribleCertListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribleCertListResponseBody</p>
 */
public class DescribleCertListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertList")
    private java.util.List<CertList> certList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribleCertListResponseBody(Builder builder) {
        this.certList = builder.certList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribleCertListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certList
     */
    public java.util.List<CertList> getCertList() {
        return this.certList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<CertList> certList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribleCertListResponseBody model) {
            this.certList = model.certList;
            this.requestId = model.requestId;
        } 

        /**
         * CertList.
         */
        public Builder certList(java.util.List<CertList> certList) {
            this.certList = certList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribleCertListResponseBody build() {
            return new DescribleCertListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribleCertListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribleCertListResponseBody</p>
     */
    public static class CertList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertIdentifier")
        private String certIdentifier;

        @com.aliyun.core.annotation.NameInMap("Common")
        private String common;

        @com.aliyun.core.annotation.NameInMap("DomainRelated")
        private Boolean domainRelated;

        @com.aliyun.core.annotation.NameInMap("EndDate")
        private String endDate;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("StartDate")
        private String startDate;

        private CertList(Builder builder) {
            this.certIdentifier = builder.certIdentifier;
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

        public static CertList create() {
            return builder().build();
        }

        /**
         * @return certIdentifier
         */
        public String getCertIdentifier() {
            return this.certIdentifier;
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
            private String certIdentifier; 
            private String common; 
            private Boolean domainRelated; 
            private String endDate; 
            private Integer id; 
            private String issuer; 
            private String name; 
            private String startDate; 

            private Builder() {
            } 

            private Builder(CertList model) {
                this.certIdentifier = model.certIdentifier;
                this.common = model.common;
                this.domainRelated = model.domainRelated;
                this.endDate = model.endDate;
                this.id = model.id;
                this.issuer = model.issuer;
                this.name = model.name;
                this.startDate = model.startDate;
            } 

            /**
             * CertIdentifier.
             */
            public Builder certIdentifier(String certIdentifier) {
                this.certIdentifier = certIdentifier;
                return this;
            }

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

            public CertList build() {
                return new CertList(this);
            } 

        } 

    }
}
