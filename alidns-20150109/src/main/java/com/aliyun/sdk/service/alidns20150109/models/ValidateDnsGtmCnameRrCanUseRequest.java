// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateDnsGtmCnameRrCanUseRequest} extends {@link RequestModel}
 *
 * <p>ValidateDnsGtmCnameRrCanUseRequest</p>
 */
public class ValidateDnsGtmCnameRrCanUseRequest extends Request {
    @Query
    @NameInMap("CnameMode")
    @Validation(required = true)
    private String cnameMode;

    @Query
    @NameInMap("CnameRr")
    @Validation(required = true)
    private String cnameRr;

    @Query
    @NameInMap("CnameType")
    @Validation(required = true)
    private String cnameType;

    @Query
    @NameInMap("CnameZone")
    @Validation(required = true)
    private String cnameZone;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Lang")
    private String lang;

    private ValidateDnsGtmCnameRrCanUseRequest(Builder builder) {
        super(builder);
        this.cnameMode = builder.cnameMode;
        this.cnameRr = builder.cnameRr;
        this.cnameType = builder.cnameType;
        this.cnameZone = builder.cnameZone;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateDnsGtmCnameRrCanUseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cnameMode
     */
    public String getCnameMode() {
        return this.cnameMode;
    }

    /**
     * @return cnameRr
     */
    public String getCnameRr() {
        return this.cnameRr;
    }

    /**
     * @return cnameType
     */
    public String getCnameType() {
        return this.cnameType;
    }

    /**
     * @return cnameZone
     */
    public String getCnameZone() {
        return this.cnameZone;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<ValidateDnsGtmCnameRrCanUseRequest, Builder> {
        private String cnameMode; 
        private String cnameRr; 
        private String cnameType; 
        private String cnameZone; 
        private String instanceId; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(ValidateDnsGtmCnameRrCanUseRequest response) {
            super(response);
            this.cnameMode = response.cnameMode;
            this.cnameRr = response.cnameRr;
            this.cnameType = response.cnameType;
            this.cnameZone = response.cnameZone;
            this.instanceId = response.instanceId;
            this.lang = response.lang;
        } 

        /**
         * CnameMode.
         */
        public Builder cnameMode(String cnameMode) {
            this.putQueryParameter("CnameMode", cnameMode);
            this.cnameMode = cnameMode;
            return this;
        }

        /**
         * CnameRr.
         */
        public Builder cnameRr(String cnameRr) {
            this.putQueryParameter("CnameRr", cnameRr);
            this.cnameRr = cnameRr;
            return this;
        }

        /**
         * CnameType.
         */
        public Builder cnameType(String cnameType) {
            this.putQueryParameter("CnameType", cnameType);
            this.cnameType = cnameType;
            return this;
        }

        /**
         * CnameZone.
         */
        public Builder cnameZone(String cnameZone) {
            this.putQueryParameter("CnameZone", cnameZone);
            this.cnameZone = cnameZone;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public ValidateDnsGtmCnameRrCanUseRequest build() {
            return new ValidateDnsGtmCnameRrCanUseRequest(this);
        } 

    } 

}
