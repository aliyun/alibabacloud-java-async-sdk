// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDomainRecordRequest} extends {@link RequestModel}
 *
 * <p>UpdateDomainRecordRequest</p>
 */
public class UpdateDomainRecordRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Line")
    private String line;

    @Query
    @NameInMap("Priority")
    @Validation(maximum = 50, minimum = 1)
    private Long priority;

    @Query
    @NameInMap("RR")
    @Validation(required = true)
    private String rr;

    @Query
    @NameInMap("RecordId")
    @Validation(required = true)
    private String recordId;

    @Query
    @NameInMap("TTL")
    @Validation(maximum = 86400, minimum = 1)
    private Long TTL;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    @Query
    @NameInMap("Value")
    @Validation(required = true)
    private String value;

    private UpdateDomainRecordRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.line = builder.line;
        this.priority = builder.priority;
        this.rr = builder.rr;
        this.recordId = builder.recordId;
        this.TTL = builder.TTL;
        this.type = builder.type;
        this.userClientIp = builder.userClientIp;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDomainRecordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return recordId
     */
    public String getRecordId() {
        return this.recordId;
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

    public static final class Builder extends Request.Builder<UpdateDomainRecordRequest, Builder> {
        private String lang; 
        private String line; 
        private Long priority; 
        private String rr; 
        private String recordId; 
        private Long TTL; 
        private String type; 
        private String userClientIp; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDomainRecordRequest request) {
            super(request);
            this.lang = request.lang;
            this.line = request.line;
            this.priority = request.priority;
            this.rr = request.rr;
            this.recordId = request.recordId;
            this.TTL = request.TTL;
            this.type = request.type;
            this.userClientIp = request.userClientIp;
            this.value = request.value;
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
         * The resolution line. Default value: **default**.
         */
        public Builder line(String line) {
            this.putQueryParameter("Line", line);
            this.line = line;
            return this;
        }

        /**
         * The priority of an MX-type DNS record. Valid values: `[1,50]`.
         * <p>
         * 
         * This parameter must be specified if the type of the DNS record is MX.
         */
        public Builder priority(Long priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * The host record.
         * <p>
         * 
         * For example, to resolve @.example.com, you must set RR to an at sign (@) instead of leaving it blank.
         */
        public Builder rr(String rr) {
            this.putQueryParameter("RR", rr);
            this.rr = rr;
            return this;
        }

        /**
         * The ID of the DNS record.
         */
        public Builder recordId(String recordId) {
            this.putQueryParameter("RecordId", recordId);
            this.recordId = recordId;
            return this;
        }

        /**
         * The TTL of the resolution. Default value: 600. Unit: seconds.
         */
        public Builder TTL(Long TTL) {
            this.putQueryParameter("TTL", TTL);
            this.TTL = TTL;
            return this;
        }

        /**
         * The type of the DNS record.
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
         * The value of the DNS record.
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public UpdateDomainRecordRequest build() {
            return new UpdateDomainRecordRequest(this);
        } 

    } 

}
