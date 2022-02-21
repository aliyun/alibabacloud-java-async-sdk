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
    private String RR;

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
        this.RR = builder.RR;
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
     * @return RR
     */
    public String getRR() {
        return this.RR;
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
        private String RR; 
        private String recordId; 
        private Long TTL; 
        private String type; 
        private String userClientIp; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDomainRecordRequest response) {
            super(response);
            this.lang = response.lang;
            this.line = response.line;
            this.priority = response.priority;
            this.RR = response.RR;
            this.recordId = response.recordId;
            this.TTL = response.TTL;
            this.type = response.type;
            this.userClientIp = response.userClientIp;
            this.value = response.value;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Line.
         */
        public Builder line(String line) {
            this.putQueryParameter("Line", line);
            this.line = line;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(Long priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * RR.
         */
        public Builder RR(String RR) {
            this.putQueryParameter("RR", RR);
            this.RR = RR;
            return this;
        }

        /**
         * RecordId.
         */
        public Builder recordId(String recordId) {
            this.putQueryParameter("RecordId", recordId);
            this.recordId = recordId;
            return this;
        }

        /**
         * TTL.
         */
        public Builder TTL(Long TTL) {
            this.putQueryParameter("TTL", TTL);
            this.TTL = TTL;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        /**
         * Value.
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
