// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * The resolution line.
         */
        public Builder line(String line) {
            this.putQueryParameter("Line", line);
            this.line = line;
            return this;
        }

        /**
         * The priority of the mail exchanger (MX) record. Valid values: **1 to 99**.
         * <p>
         * 
         * This parameter is required if the type of the DNS record is MX.
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * The ID of the DNS record.
         */
        public Builder recordId(Long recordId) {
            this.putQueryParameter("RecordId", recordId);
            this.recordId = recordId;
            return this;
        }

        /**
         * The hostname.
         * <p>
         * 
         * For example, you must set this parameter to @ if you want to resolve @.example.com.
         */
        public Builder rr(String rr) {
            this.putQueryParameter("Rr", rr);
            this.rr = rr;
            return this;
        }

        /**
         * The time-to-live (TTL) of the DNS record.
         */
        public Builder ttl(Integer ttl) {
            this.putQueryParameter("Ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        /**
         * The type of the DNS record. Valid values: **A**, **AAAA**, **CNAME**, **TXT**, **MX**, **PTR**, and **SRV**.
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

        /**
         * The weight of the address. Valid values: **1 to 100**.
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
