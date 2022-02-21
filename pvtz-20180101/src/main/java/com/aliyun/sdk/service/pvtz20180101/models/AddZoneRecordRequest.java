// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddZoneRecordRequest} extends {@link RequestModel}
 *
 * <p>AddZoneRecordRequest</p>
 */
public class AddZoneRecordRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Priority")
    @Validation(maximum = 99, minimum = 1)
    private Integer priority;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("Rr")
    @Validation(required = true)
    private String rr;

    @Query
    @NameInMap("Ttl")
    @Validation(maximum = 86400, minimum = 5)
    private Integer ttl;

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

    @Query
    @NameInMap("ZoneId")
    @Validation(required = true)
    private String zoneId;

    private AddZoneRecordRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.priority = builder.priority;
        this.remark = builder.remark;
        this.rr = builder.rr;
        this.ttl = builder.ttl;
        this.type = builder.type;
        this.userClientIp = builder.userClientIp;
        this.value = builder.value;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddZoneRecordRequest create() {
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
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
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
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<AddZoneRecordRequest, Builder> {
        private String lang; 
        private Integer priority; 
        private String remark; 
        private String rr; 
        private Integer ttl; 
        private String type; 
        private String userClientIp; 
        private String value; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(AddZoneRecordRequest response) {
            super(response);
            this.lang = response.lang;
            this.priority = response.priority;
            this.remark = response.remark;
            this.rr = response.rr;
            this.ttl = response.ttl;
            this.type = response.type;
            this.userClientIp = response.userClientIp;
            this.value = response.value;
            this.zoneId = response.zoneId;
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
         * Priority.
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * Rr.
         */
        public Builder rr(String rr) {
            this.putQueryParameter("Rr", rr);
            this.rr = rr;
            return this;
        }

        /**
         * Ttl.
         */
        public Builder ttl(Integer ttl) {
            this.putQueryParameter("Ttl", ttl);
            this.ttl = ttl;
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

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public AddZoneRecordRequest build() {
            return new AddZoneRecordRequest(this);
        } 

    } 

}
