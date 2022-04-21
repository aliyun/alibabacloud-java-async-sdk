// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveAntOpenPlatformConfigRequest} extends {@link RequestModel}
 *
 * <p>SaveAntOpenPlatformConfigRequest</p>
 */
public class SaveAntOpenPlatformConfigRequest extends Request {
    @Body
    @NameInMap("AppCert")
    private String appCert;

    @Body
    @NameInMap("AppId")
    @Validation(required = true, maxLength = 64)
    private String appId;

    @Body
    @NameInMap("PrivateKey")
    @Validation(required = true)
    private String privateKey;

    @Body
    @NameInMap("PublicCert")
    private String publicCert;

    @Body
    @NameInMap("PublicKey")
    private String publicKey;

    @Body
    @NameInMap("RootCert")
    private String rootCert;

    @Body
    @NameInMap("SignMode")
    @Validation(required = true)
    private String signMode;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private SaveAntOpenPlatformConfigRequest(Builder builder) {
        super(builder);
        this.appCert = builder.appCert;
        this.appId = builder.appId;
        this.privateKey = builder.privateKey;
        this.publicCert = builder.publicCert;
        this.publicKey = builder.publicKey;
        this.rootCert = builder.rootCert;
        this.signMode = builder.signMode;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveAntOpenPlatformConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appCert
     */
    public String getAppCert() {
        return this.appCert;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return privateKey
     */
    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * @return publicCert
     */
    public String getPublicCert() {
        return this.publicCert;
    }

    /**
     * @return publicKey
     */
    public String getPublicKey() {
        return this.publicKey;
    }

    /**
     * @return rootCert
     */
    public String getRootCert() {
        return this.rootCert;
    }

    /**
     * @return signMode
     */
    public String getSignMode() {
        return this.signMode;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<SaveAntOpenPlatformConfigRequest, Builder> {
        private String appCert; 
        private String appId; 
        private String privateKey; 
        private String publicCert; 
        private String publicKey; 
        private String rootCert; 
        private String signMode; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(SaveAntOpenPlatformConfigRequest request) {
            super(request);
            this.appCert = request.appCert;
            this.appId = request.appId;
            this.privateKey = request.privateKey;
            this.publicCert = request.publicCert;
            this.publicKey = request.publicKey;
            this.rootCert = request.rootCert;
            this.signMode = request.signMode;
            this.spaceId = request.spaceId;
        } 

        /**
         * AppCert.
         */
        public Builder appCert(String appCert) {
            this.putBodyParameter("AppCert", appCert);
            this.appCert = appCert;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * PrivateKey.
         */
        public Builder privateKey(String privateKey) {
            this.putBodyParameter("PrivateKey", privateKey);
            this.privateKey = privateKey;
            return this;
        }

        /**
         * PublicCert.
         */
        public Builder publicCert(String publicCert) {
            this.putBodyParameter("PublicCert", publicCert);
            this.publicCert = publicCert;
            return this;
        }

        /**
         * PublicKey.
         */
        public Builder publicKey(String publicKey) {
            this.putBodyParameter("PublicKey", publicKey);
            this.publicKey = publicKey;
            return this;
        }

        /**
         * RootCert.
         */
        public Builder rootCert(String rootCert) {
            this.putBodyParameter("RootCert", rootCert);
            this.rootCert = rootCert;
            return this;
        }

        /**
         * SignMode.
         */
        public Builder signMode(String signMode) {
            this.putBodyParameter("SignMode", signMode);
            this.signMode = signMode;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public SaveAntOpenPlatformConfigRequest build() {
            return new SaveAntOpenPlatformConfigRequest(this);
        } 

    } 

}
