// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IntlFlightSegmentAvailableCertRequest} extends {@link RequestModel}
 *
 * <p>IntlFlightSegmentAvailableCertRequest</p>
 */
public class IntlFlightSegmentAvailableCertRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ota_item_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String otaItemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("isv_name")
    private String isvName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("user_id")
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("user_name")
    private String userName;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private IntlFlightSegmentAvailableCertRequest(Builder builder) {
        super(builder);
        this.otaItemId = builder.otaItemId;
        this.isvName = builder.isvName;
        this.language = builder.language;
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IntlFlightSegmentAvailableCertRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return otaItemId
     */
    public String getOtaItemId() {
        return this.otaItemId;
    }

    /**
     * @return isvName
     */
    public String getIsvName() {
        return this.isvName;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<IntlFlightSegmentAvailableCertRequest, Builder> {
        private String otaItemId; 
        private String isvName; 
        private String language; 
        private String userId; 
        private String userName; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(IntlFlightSegmentAvailableCertRequest request) {
            super(request);
            this.otaItemId = request.otaItemId;
            this.isvName = request.isvName;
            this.language = request.language;
            this.userId = request.userId;
            this.userName = request.userName;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * ota_item_id.
         */
        public Builder otaItemId(String otaItemId) {
            this.putPathParameter("ota_item_id", otaItemId);
            this.otaItemId = otaItemId;
            return this;
        }

        /**
         * isv_name.
         */
        public Builder isvName(String isvName) {
            this.putQueryParameter("isv_name", isvName);
            this.isvName = isvName;
            return this;
        }

        /**
         * language.
         */
        public Builder language(String language) {
            this.putQueryParameter("language", language);
            this.language = language;
            return this;
        }

        /**
         * user_id.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        /**
         * user_name.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("user_name", userName);
            this.userName = userName;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public IntlFlightSegmentAvailableCertRequest build() {
            return new IntlFlightSegmentAvailableCertRequest(this);
        } 

    } 

}
