// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OperateBatchDomainRequest} extends {@link RequestModel}
 *
 * <p>OperateBatchDomainRequest</p>
 */
public class OperateBatchDomainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainRecordInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < DomainRecordInfo> domainRecordInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The Domain Name System (DNS) records. You can submit up to 1,000 DNS records.</p>
         * <p>This parameter is required.</p>
         */
        public Builder domainRecordInfo(java.util.List < DomainRecordInfo> domainRecordInfo) {
            this.putQueryParameter("DomainRecordInfo", domainRecordInfo);
            this.domainRecordInfo = domainRecordInfo;
            return this;
        }

        /**
         * <p>The language.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The type of the batch operation. Valid values:</p>
         * <ul>
         * <li><strong>DOMAIN_ADD</strong>: adds domain names in batches.</li>
         * <li><strong>DOMAIN_DEL</strong>: deletes domain names in batches.</li>
         * <li><strong>RR_ADD</strong>: adds DNS records in batches.</li>
         * <li><strong>RR_DEL</strong>: deletes DNS records in batches. This operation deletes the DNS records with the specified hostname or record value. If you do not specify the Rr and Value parameters, this operation deletes the DNS records that are added for the specified domain names.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RR_ADD</p>
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

    /**
     * 
     * {@link OperateBatchDomainRequest} extends {@link TeaModel}
     *
     * <p>OperateBatchDomainRequest</p>
     */
    public static class DomainRecordInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        @com.aliyun.core.annotation.Validation(required = true)
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Line")
        private String line;

        @com.aliyun.core.annotation.NameInMap("NewRr")
        private String newRr;

        @com.aliyun.core.annotation.NameInMap("NewType")
        private String newType;

        @com.aliyun.core.annotation.NameInMap("NewValue")
        private String newValue;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("Rr")
        private String rr;

        @com.aliyun.core.annotation.NameInMap("Ttl")
        private Integer ttl;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The domain name.</p>
             * <blockquote>
             * <p> You can submit 1 to 1,000 domain names. Due to the limit on the length of HTTP request headers, excessive domain names are ignored. Do not enter more than 1,000 domain names.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The DNS request source. Default value: default.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
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
             * <p>The priority of the mail exchanger (MX) record.</p>
             * <p>This parameter is required if the type of the DNS record is MX. Default value: 10.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The hostname.</p>
             * <blockquote>
             * <p> This parameter is required if you set Type to <strong>RR_ADD</strong> or <strong>RR_DEL</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>zhaohui</p>
             */
            public Builder rr(String rr) {
                this.rr = rr;
                return this;
            }

            /**
             * <p>The time-to-live (TTL) value of the cached DNS record. Unit: seconds. Default value: <em><strong>600</strong></em>.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder ttl(Integer ttl) {
                this.ttl = ttl;
                return this;
            }

            /**
             * <p>The type of the DNS record. Valid values: A, AAAA, TXT, MX, and CNAME.</p>
             * <blockquote>
             * <p> This parameter is required if you set Type to <strong>RR_ADD</strong> or <strong>RR_DEL</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>MX</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The record value.</p>
             * <blockquote>
             * <p> This parameter is required if you set Type to <strong>RR_ADD</strong> or <strong>RR_DEL</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>fd87da3c4528844d45af39200155a905</p>
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
