// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetZoneRecordStatusRequest} extends {@link RequestModel}
 *
 * <p>SetZoneRecordStatusRequest</p>
 */
public class SetZoneRecordStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long recordId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private SetZoneRecordStatusRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.lang = builder.lang;
        this.recordId = builder.recordId;
        this.status = builder.status;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetZoneRecordStatusRequest create() {
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
     * @return recordId
     */
    public Long getRecordId() {
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

    public static final class Builder extends Request.Builder<SetZoneRecordStatusRequest, Builder> {
        private String clientToken; 
        private String lang; 
        private Long recordId; 
        private String status; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SetZoneRecordStatusRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.lang = request.lang;
            this.recordId = request.recordId;
            this.status = request.status;
            this.userClientIp = request.userClientIp;
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
         * The ID of the DNS record.
         */
        public Builder recordId(Long recordId) {
            this.putQueryParameter("RecordId", recordId);
            this.recordId = recordId;
            return this;
        }

        /**
         * The state of the DNS record. Valid values:
         * <p>
         * 
         * *   ENABLE: enables the DNS record.
         * *   DISABLE: suspends the DNS record.
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
        public SetZoneRecordStatusRequest build() {
            return new SetZoneRecordStatusRequest(this);
        } 

    } 

}
