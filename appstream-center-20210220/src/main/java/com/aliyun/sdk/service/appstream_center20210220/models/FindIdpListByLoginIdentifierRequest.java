// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210220.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link FindIdpListByLoginIdentifierRequest} extends {@link RequestModel}
 *
 * <p>FindIdpListByLoginIdentifierRequest</p>
 */
public class FindIdpListByLoginIdentifierRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AvailableFeatures")
    private java.util.Map < String, String > availableFeatures;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientChannel")
    private String clientChannel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientId")
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientIp")
    private String clientIp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientOS")
    private String clientOS;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientVersion")
    private String clientVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LoginIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loginIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SupportTypes")
    private java.util.List < String > supportTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private FindIdpListByLoginIdentifierRequest(Builder builder) {
        super(builder);
        this.availableFeatures = builder.availableFeatures;
        this.clientChannel = builder.clientChannel;
        this.clientId = builder.clientId;
        this.clientIp = builder.clientIp;
        this.clientOS = builder.clientOS;
        this.clientVersion = builder.clientVersion;
        this.loginIdentifier = builder.loginIdentifier;
        this.supportTypes = builder.supportTypes;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindIdpListByLoginIdentifierRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return availableFeatures
     */
    public java.util.Map < String, String > getAvailableFeatures() {
        return this.availableFeatures;
    }

    /**
     * @return clientChannel
     */
    public String getClientChannel() {
        return this.clientChannel;
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
     * @return loginIdentifier
     */
    public String getLoginIdentifier() {
        return this.loginIdentifier;
    }

    /**
     * @return supportTypes
     */
    public java.util.List < String > getSupportTypes() {
        return this.supportTypes;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<FindIdpListByLoginIdentifierRequest, Builder> {
        private java.util.Map < String, String > availableFeatures; 
        private String clientChannel; 
        private String clientId; 
        private String clientIp; 
        private String clientOS; 
        private String clientVersion; 
        private String loginIdentifier; 
        private java.util.List < String > supportTypes; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(FindIdpListByLoginIdentifierRequest request) {
            super(request);
            this.availableFeatures = request.availableFeatures;
            this.clientChannel = request.clientChannel;
            this.clientId = request.clientId;
            this.clientIp = request.clientIp;
            this.clientOS = request.clientOS;
            this.clientVersion = request.clientVersion;
            this.loginIdentifier = request.loginIdentifier;
            this.supportTypes = request.supportTypes;
            this.uuid = request.uuid;
        } 

        /**
         * AvailableFeatures.
         */
        public Builder availableFeatures(java.util.Map < String, String > availableFeatures) {
            String availableFeaturesShrink = shrink(availableFeatures, "AvailableFeatures", "json");
            this.putQueryParameter("AvailableFeatures", availableFeaturesShrink);
            this.availableFeatures = availableFeatures;
            return this;
        }

        /**
         * ClientChannel.
         */
        public Builder clientChannel(String clientChannel) {
            this.putBodyParameter("ClientChannel", clientChannel);
            this.clientChannel = clientChannel;
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
            this.putQueryParameter("ClientIp", clientIp);
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun123***</p>
         */
        public Builder loginIdentifier(String loginIdentifier) {
            this.putBodyParameter("LoginIdentifier", loginIdentifier);
            this.loginIdentifier = loginIdentifier;
            return this;
        }

        /**
         * SupportTypes.
         */
        public Builder supportTypes(java.util.List < String > supportTypes) {
            this.putBodyParameter("SupportTypes", supportTypes);
            this.supportTypes = supportTypes;
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
        public FindIdpListByLoginIdentifierRequest build() {
            return new FindIdpListByLoginIdentifierRequest(this);
        } 

    } 

}
