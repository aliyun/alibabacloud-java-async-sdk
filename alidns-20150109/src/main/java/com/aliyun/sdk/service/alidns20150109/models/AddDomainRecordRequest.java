// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDomainRecordRequest} extends {@link RequestModel}
 *
 * <p>AddDomainRecordRequest</p>
 */
public class AddDomainRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Line")
    private String line;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
    private Long priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RR")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TTL")
    @com.aliyun.core.annotation.Validation(maximum = 86400, minimum = 1)
    private Long TTL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Value")
    @com.aliyun.core.annotation.Validation(required = true)
    private String value;

    private AddDomainRecordRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.lang = builder.lang;
        this.line = builder.line;
        this.priority = builder.priority;
        this.rr = builder.rr;
        this.TTL = builder.TTL;
        this.type = builder.type;
        this.userClientIp = builder.userClientIp;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDomainRecordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return line
     */
    public String getLine() {
        return this.line;
    }

    /**
     * @return priority
     */
    public Long getPriority() {
        return this.priority;
    }

    /**
     * @return rr
     */
    public String getRr() {
        return this.rr;
    }

    /**
     * @return TTL
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<AddDomainRecordRequest, Builder> {
        private String domainName; 
        private String lang; 
        private String line; 
        private Long priority; 
        private String rr; 
        private Long TTL; 
        private String type; 
        private String userClientIp; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(AddDomainRecordRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.lang = request.lang;
            this.line = request.line;
            this.priority = request.priority;
            this.rr = request.rr;
            this.TTL = request.TTL;
            this.type = request.type;
            this.userClientIp = request.userClientIp;
            this.value = request.value;
        } 

        /**
         * The domain name.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The language.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The DNS resolution line. Default value: **default**. For more information, see
         * <p>
         * 
         * [DNS lines](https://www.alibabacloud.com/help/zh/doc-detail/29807.htm).
         */
        public Builder line(String line) {
            this.putQueryParameter("Line", line);
            this.line = line;
            return this;
        }

        /**
         * The priority of the mail exchanger (MX) record. Valid values: `1 to 50`.
         * <p>
         * 
         * This parameter must be specified if the type of the DNS record is MX. A smaller value indicates a higher priority.
         */
        public Builder priority(Long priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * The hostname.
         * <p>
         * 
         * For example, if you want to resolve @.example.com, you must set RR to an at sign (@) instead of leaving it empty.
         */
        public Builder rr(String rr) {
            this.putQueryParameter("RR", rr);
            this.rr = rr;
            return this;
        }

        /**
         * The time-to-live (TTL) of the DNS record. Default value: 600. Unit: seconds. For more information, see
         * <p>
         * 
         * [TTL definition](https://www.alibabacloud.com/help/zh/doc-detail/29806.htm).
         */
        public Builder TTL(Long TTL) {
            this.putQueryParameter("TTL", TTL);
            this.TTL = TTL;
            return this;
        }

        /**
         * The type of the DNS record. For more information, see
         * <p>
         * 
         * [DNS record types](https://www.alibabacloud.com/help/zh/doc-detail/29805.htm).
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * The IP address of the client.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        /**
         * The record value.
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public AddDomainRecordRequest build() {
            return new AddDomainRecordRequest(this);
        } 

    } 

}
