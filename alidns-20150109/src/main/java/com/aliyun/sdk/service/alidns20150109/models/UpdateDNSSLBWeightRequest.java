// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDNSSLBWeightRequest} extends {@link RequestModel}
 *
 * <p>UpdateDNSSLBWeightRequest</p>
 */
public class UpdateDNSSLBWeightRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("RecordId")
    @Validation(required = true)
    private String recordId;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    @Query
    @NameInMap("Weight")
    @Validation(required = true)
    private Integer weight;

    private UpdateDNSSLBWeightRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.recordId = builder.recordId;
        this.userClientIp = builder.userClientIp;
        this.weight = builder.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDNSSLBWeightRequest create() {
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
     * @return recordId
     */
    public String getRecordId() {
        return this.recordId;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    /**
     * @return weight
     */
    public Integer getWeight() {
        return this.weight;
    }

    public static final class Builder extends Request.Builder<UpdateDNSSLBWeightRequest, Builder> {
        private String lang; 
        private String recordId; 
        private String userClientIp; 
        private Integer weight; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDNSSLBWeightRequest response) {
            super(response);
            this.lang = response.lang;
            this.recordId = response.recordId;
            this.userClientIp = response.userClientIp;
            this.weight = response.weight;
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
         * RecordId.
         */
        public Builder recordId(String recordId) {
            this.putQueryParameter("RecordId", recordId);
            this.recordId = recordId;
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
         * Weight.
         */
        public Builder weight(Integer weight) {
            this.putQueryParameter("Weight", weight);
            this.weight = weight;
            return this;
        }

        @Override
        public UpdateDNSSLBWeightRequest build() {
            return new UpdateDNSSLBWeightRequest(this);
        } 

    } 

}
