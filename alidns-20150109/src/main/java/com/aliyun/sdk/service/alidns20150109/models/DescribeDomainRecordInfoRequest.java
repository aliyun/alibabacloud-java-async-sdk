// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainRecordInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainRecordInfoRequest</p>
 */
public class DescribeDomainRecordInfoRequest extends Request {
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

    private DescribeDomainRecordInfoRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.recordId = builder.recordId;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainRecordInfoRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDomainRecordInfoRequest, Builder> {
        private String lang; 
        private String recordId; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainRecordInfoRequest response) {
            super(response);
            this.lang = response.lang;
            this.recordId = response.recordId;
            this.userClientIp = response.userClientIp;
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

        @Override
        public DescribeDomainRecordInfoRequest build() {
            return new DescribeDomainRecordInfoRequest(this);
        } 

    } 

}
