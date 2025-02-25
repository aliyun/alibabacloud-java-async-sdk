// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateZoneRecordRequest} extends {@link RequestModel}
 *
 * <p>UpdateZoneRecordRequest</p>
 */
public class UpdateZoneRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Line")
    private String line;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    @com.aliyun.core.annotation.Validation(maximum = 99, minimum = 1)
    private Integer priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long recordId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ttl")
    @com.aliyun.core.annotation.Validation(maximum = 86400, minimum = 5)
    private Integer ttl;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Weight")
    private Integer weight;

    private UpdateZoneRecordRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.lang = builder.lang;
        this.line = builder.line;
        this.priority = builder.priority;
        this.recordId = builder.recordId;
        this.rr = builder.rr;
        this.ttl = builder.ttl;
        this.type = builder.type;
        this.userClientIp = builder.userClientIp;
        this.value = builder.value;
        this.weight = builder.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateZoneRecordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return recordId
     */
    public Long getRecordId() {
        return this.recordId;
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

    /**
     * @return weight
     */
    public Integer getWeight() {
        return this.weight;
    }

    public static final class Builder extends Request.Builder<UpdateZoneRecordRequest, Builder> {
        private String clientToken; 
        private String lang; 
        private String line; 
        private Integer priority; 
        private Long recordId; 
        private String rr; 
        private Integer ttl; 
        private String type; 
        private String userClientIp; 
        private String value; 
        private Integer weight; 

        private Builder() {
            super();
        } 

        private Builder(UpdateZoneRecordRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.lang = request.lang;
            this.line = request.line;
            this.priority = request.priority;
            this.recordId = request.recordId;
            this.rr = request.rr;
            this.ttl = request.ttl;
            this.type = request.type;
            this.userClientIp = request.userClientIp;
            this.value = request.value;
            this.weight = request.weight;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>6447728c8578e66aacf062d2df4446dc</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * <p>Default value: en.</p>
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
         * <p>The resolution line. Default value: default.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder line(String line) {
            this.putQueryParameter("Line", line);
            this.line = line;
            return this;
        }

        /**
         * <p>The priority of the MX record. You can set priorities for different email servers. Valid values: 1 to 99. A smaller value indicates a higher priority.</p>
         * <blockquote>
         * <p> This parameter is required if the type of the DNS record is MX.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The ID of the DNS record. You can call the DescribeZoneRecords operation to query a list of DNS records.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>172223****</p>
         */
        public Builder recordId(Long recordId) {
            this.putQueryParameter("RecordId", recordId);
            this.recordId = recordId;
            return this;
        }

        /**
         * <p>The hostname. The hostname is the prefix of the subdomain name for zone. Example: www, @, * (used for wildcard DNS resolution), and mail (used for specifying the mail server that receives emails).</p>
         * <p>For example, if you want to resolve the domain name @.exmaple.com, you must set Rr to @ instead of leaving Rr empty.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>www</p>
         */
        public Builder rr(String rr) {
            this.putQueryParameter("Rr", rr);
            this.rr = rr;
            return this;
        }

        /**
         * <p>The TTL period. Valid values: 5, 30, 60, 3600, 43200, and 86400. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder ttl(Integer ttl) {
            this.putQueryParameter("Ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        /**
         * <p>The type of the DNS record. Valid values:</p>
         * <ul>
         * <li><strong>A</strong>: An A record maps a domain name to an IPv4 address in the dotted decimal notation format.</li>
         * <li><strong>AAAA</strong>: An AAAA record maps a domain name to an IPv6 address.</li>
         * <li><strong>CNAME</strong>: A canonical name (CNAME) record maps a domain name to another domain name.</li>
         * <li><strong>TXT</strong>: A text (TXT) record usually serves as a Sender Policy Framework (SPF) record to prevent email spam. The record value of the TXT record can be up to 255 characters in length.</li>
         * <li><strong>MX</strong>: A mail exchanger (MX) record maps a domain name to the domain name of a mail server.</li>
         * <li><strong>PTR</strong>: A pointer (PTR) record maps an IP address to a domain name.</li>
         * <li><strong>SRV</strong>: A service (SRV) record specifies a server that hosts a specific service. Enter a record value in the format of Priority Weight Port Destination domain name. Separate these items with spaces.</li>
         * </ul>
         * <blockquote>
         * <p> Before you add a PTR record, you must configure a reverse lookup zone. For more information, see <a href="https://help.aliyun.com/document_detail/2592976.html">Add PTR records</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>A</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The IP address of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.XX.XX</p>
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        /**
         * <p>The record value. You need to enter the record value based on the DNS record type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.16.XX.XX</p>
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        /**
         * <p>The weight value of the address. You can set a different weight value for each address. This way, addresses are returned based on the weight values for DNS requests. A weight value must be an integer that ranges from 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder weight(Integer weight) {
            this.putQueryParameter("Weight", weight);
            this.weight = weight;
            return this;
        }

        @Override
        public UpdateZoneRecordRequest build() {
            return new UpdateZoneRecordRequest(this);
        } 

    } 

}
