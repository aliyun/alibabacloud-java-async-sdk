// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateBatchDomainRequest} extends {@link RequestModel}
 *
 * <p>OperateBatchDomainRequest</p>
 */
public class OperateBatchDomainRequest extends Request {
    @Query
    @NameInMap("DomainRecordInfo")
    @Validation(required = true)
    private java.util.List < DomainRecordInfo> domainRecordInfo;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private OperateBatchDomainRequest(Builder builder) {
        super(builder);
        this.domainRecordInfo = builder.domainRecordInfo;
        this.lang = builder.lang;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateBatchDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainRecordInfo
     */
    public java.util.List < DomainRecordInfo> getDomainRecordInfo() {
        return this.domainRecordInfo;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<OperateBatchDomainRequest, Builder> {
        private java.util.List < DomainRecordInfo> domainRecordInfo; 
        private String lang; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(OperateBatchDomainRequest request) {
            super(request);
            this.domainRecordInfo = request.domainRecordInfo;
            this.lang = request.lang;
            this.type = request.type;
        } 

        /**
         * DomainRecordInfo.
         */
        public Builder domainRecordInfo(java.util.List < DomainRecordInfo> domainRecordInfo) {
            this.putQueryParameter("DomainRecordInfo", domainRecordInfo);
            this.domainRecordInfo = domainRecordInfo;
            return this;
        }

        /**
         * The language type.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The type of the batch operation. Valid values:
         * <p>
         * 
         * *   **DOMAIN_ADD**: adds domain names in batches.
         * *   **DOMAIN_DEL**: deletes domain names in batches.
         * *   **RR_ADD**: adds DNS records in batches.
         * *   **RR_DEL**: deletes DNS records in batches. (If RR or VALUE exists, DNS records corresponding to the specified RR or VALUE are deleted. If both of them exist, DNS records corresponding to the specified RR and VALUE are deleted. If no RR or VALUE is specified, the DNS records corresponding to the DomainName parameter are deleted.)
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public OperateBatchDomainRequest build() {
            return new OperateBatchDomainRequest(this);
        } 

    } 

    public static class DomainRecordInfo extends TeaModel {
        @NameInMap("Domain")
        @Validation(required = true)
        private String domain;

        @NameInMap("Line")
        private String line;

        @NameInMap("NewRr")
        private String newRr;

        @NameInMap("NewType")
        private String newType;

        @NameInMap("NewValue")
        private String newValue;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("Rr")
        private String rr;

        @NameInMap("Ttl")
        private Integer ttl;

        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        private DomainRecordInfo(Builder builder) {
            this.domain = builder.domain;
            this.line = builder.line;
            this.newRr = builder.newRr;
            this.newType = builder.newType;
            this.newValue = builder.newValue;
            this.priority = builder.priority;
            this.rr = builder.rr;
            this.ttl = builder.ttl;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainRecordInfo create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return line
         */
        public String getLine() {
            return this.line;
        }

        /**
         * @return newRr
         */
        public String getNewRr() {
            return this.newRr;
        }

        /**
         * @return newType
         */
        public String getNewType() {
            return this.newType;
        }

        /**
         * @return newValue
         */
        public String getNewValue() {
            return this.newValue;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return rr
         */
        public String getRr() {
            return this.rr;
        }

        /**
         * @return ttl
         */
        public Integer getTtl() {
            return this.ttl;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String domain; 
            private String line; 
            private String newRr; 
            private String newType; 
            private String newValue; 
            private Integer priority; 
            private String rr; 
            private Integer ttl; 
            private String type; 
            private String value; 

            /**
             * The domain name corresponding to DNS record N.
             * <p>
             * 
             * >  N is specified by users. **N** starts from **1**. The maximum value of N is **1000**. Extra data entries are ignored.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The resolution line of DNS record N. Default value: default.
             * <p>
             * 
             * For more information, see [Resolution line enumeration](https://www.alibabacloud.com/help/zh/doc-detail/29807.htm).
             */
            public Builder line(String line) {
                this.line = line;
                return this;
            }

            /**
             * NewRr.
             */
            public Builder newRr(String newRr) {
                this.newRr = newRr;
                return this;
            }

            /**
             * NewType.
             */
            public Builder newType(String newType) {
                this.newType = newType;
                return this;
            }

            /**
             * NewValue.
             */
            public Builder newValue(String newValue) {
                this.newValue = newValue;
                return this;
            }

            /**
             * The priority of MX-type DNS record N.
             * <p>
             * 
             * This parameter must be specified if the type of the DNS record is MX. Default value: 10.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The host record corresponding to DNS record N.
             * <p>
             * 
             * >  If you set the Type parameter to **RR_ADD**, you must also specify this parameter.
             */
            public Builder rr(String rr) {
                this.rr = rr;
                return this;
            }

            /**
             * The TTL of DNS record N. Unit: seconds. Default value: **600**.
             */
            public Builder ttl(Integer ttl) {
                this.ttl = ttl;
                return this;
            }

            /**
             * The type of DNS record N. For the DNS record types supported by Alibaba Cloud DNS, see [Resolution record type formats](https://www.alibabacloud.com/help/zh/doc-detail/29805.htm).
             * <p>
             * 
             * >  If you set the Type parameter to **RR_ADD**, you must also specify this parameter.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The value of DNS record N.
             * <p>
             * 
             * >  If you set the Type parameter to **RR_ADD**, you must also specify this parameter.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DomainRecordInfo build() {
                return new DomainRecordInfo(this);
            } 

        } 

    }
}
