// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210220.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetStsTokenRequest} extends {@link RequestModel}
 *
 * <p>GetStsTokenRequest</p>
 */
public class GetStsTokenRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientId")
    private String clientId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientIp")
    private String clientIp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientOS")
    private String clientOS;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientVersion")
    private String clientVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private GetStsTokenRequest(Builder builder) {
        super(builder);
        this.authCode = builder.authCode;
        this.clientId = builder.clientId;
        this.clientIp = builder.clientIp;
        this.clientOS = builder.clientOS;
        this.clientVersion = builder.clientVersion;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStsTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authCode
     */
    public String getAuthCode() {
        return this.authCode;
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return clientIp
     */
    public String getClientIp() {
        return this.clientIp;
    }

    /**
     * @return clientOS
     */
    public String getClientOS() {
        return this.clientOS;
    }

    /**
     * @return clientVersion
     */
    public String getClientVersion() {
        return this.clientVersion;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<GetStsTokenRequest, Builder> {
        private String authCode; 
        private String clientId; 
        private String clientIp; 
        private String clientOS; 
        private String clientVersion; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(GetStsTokenRequest request) {
            super(request);
            this.authCode = request.authCode;
            this.clientId = request.clientId;
            this.clientIp = request.clientIp;
            this.clientOS = request.clientOS;
            this.clientVersion = request.clientVersion;
            this.uuid = request.uuid;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e4e169bea1cc48e8afac53**********</p>
         */
        public Builder authCode(String authCode) {
            this.putBodyParameter("AuthCode", authCode);
            this.authCode = authCode;
            return this;
        }

        /**
         * ClientId.
         */
        public Builder clientId(String clientId) {
            this.putBodyParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * ClientIp.
         */
        public Builder clientIp(String clientIp) {
            this.putBodyParameter("ClientIp", clientIp);
            this.clientIp = clientIp;
            return this;
        }

        /**
         * ClientOS.
         */
        public Builder clientOS(String clientOS) {
            this.putBodyParameter("ClientOS", clientOS);
            this.clientOS = clientOS;
            return this;
        }

        /**
         * ClientVersion.
         */
        public Builder clientVersion(String clientVersion) {
            this.putBodyParameter("ClientVersion", clientVersion);
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putBodyParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public GetStsTokenRequest build() {
            return new GetStsTokenRequest(this);
        } 

    } 

}
