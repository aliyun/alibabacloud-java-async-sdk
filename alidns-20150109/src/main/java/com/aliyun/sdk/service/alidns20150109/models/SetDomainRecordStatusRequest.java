// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDomainRecordStatusRequest} extends {@link RequestModel}
 *
 * <p>SetDomainRecordStatusRequest</p>
 */
public class SetDomainRecordStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String recordId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private SetDomainRecordStatusRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.recordId = builder.recordId;
        this.status = builder.status;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDomainRecordStatusRequest create() {
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<SetDomainRecordStatusRequest, Builder> {
        private String lang; 
        private String recordId; 
        private String status; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SetDomainRecordStatusRequest request) {
            super(request);
            this.lang = request.lang;
            this.recordId = request.recordId;
            this.status = request.status;
            this.userClientIp = request.userClientIp;
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
         * The ID of the DNS record.
         */
        public Builder recordId(String recordId) {
            this.putQueryParameter("RecordId", recordId);
            this.recordId = recordId;
            return this;
        }

        /**
         * The state of the DNS record. Valid values:
         * <p>
         * 
         * *   **Enable**: enables the DNS record.
         * *   **Disable**: disables the DNS record.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
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
        public SetDomainRecordStatusRequest build() {
            return new SetDomainRecordStatusRequest(this);
        } 

    } 

}
