// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDomainRecordRemarkRequest} extends {@link RequestModel}
 *
 * <p>UpdateDomainRecordRemarkRequest</p>
 */
public class UpdateDomainRecordRemarkRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("RecordId")
    @Validation(required = true)
    private String recordId;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private UpdateDomainRecordRemarkRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.recordId = builder.recordId;
        this.remark = builder.remark;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDomainRecordRemarkRequest create() {
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
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<UpdateDomainRecordRemarkRequest, Builder> {
        private String lang; 
        private String recordId; 
        private String remark; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDomainRecordRemarkRequest request) {
            super(request);
            this.lang = request.lang;
            this.recordId = request.recordId;
            this.remark = request.remark;
            this.userClientIp = request.userClientIp;
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
         * The ID of the DNS record.
         */
        public Builder recordId(String recordId) {
            this.putQueryParameter("RecordId", recordId);
            this.recordId = recordId;
            return this;
        }

        /**
         * The description of your DNS record.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
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

        @Override
        public UpdateDomainRecordRemarkRequest build() {
            return new UpdateDomainRecordRemarkRequest(this);
        } 

    } 

}
