// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSafStartStepsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSafStartStepsRequest</p>
 */
public class DescribeSafStartStepsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("aliyunServer")
    private Boolean aliyunServer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("deviceTypesStr")
    private String deviceTypesStr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCode")
    private String eventCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("serverRegion")
    private String serverRegion;

    private DescribeSafStartStepsRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.aliyunServer = builder.aliyunServer;
        this.deviceTypesStr = builder.deviceTypesStr;
        this.eventCode = builder.eventCode;
        this.language = builder.language;
        this.regId = builder.regId;
        this.serverRegion = builder.serverRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSafStartStepsRequest create() {
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
     * @return aliyunServer
     */
    public Boolean getAliyunServer() {
        return this.aliyunServer;
    }

    /**
     * @return deviceTypesStr
     */
    public String getDeviceTypesStr() {
        return this.deviceTypesStr;
    }

    /**
     * @return eventCode
     */
    public String getEventCode() {
        return this.eventCode;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return serverRegion
     */
    public String getServerRegion() {
        return this.serverRegion;
    }

    public static final class Builder extends Request.Builder<DescribeSafStartStepsRequest, Builder> {
        private String lang; 
        private Boolean aliyunServer; 
        private String deviceTypesStr; 
        private String eventCode; 
        private String language; 
        private String regId; 
        private String serverRegion; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSafStartStepsRequest request) {
            super(request);
            this.lang = request.lang;
            this.aliyunServer = request.aliyunServer;
            this.deviceTypesStr = request.deviceTypesStr;
            this.eventCode = request.eventCode;
            this.language = request.language;
            this.regId = request.regId;
            this.serverRegion = request.serverRegion;
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
         * aliyunServer.
         */
        public Builder aliyunServer(Boolean aliyunServer) {
            this.putQueryParameter("aliyunServer", aliyunServer);
            this.aliyunServer = aliyunServer;
            return this;
        }

        /**
         * deviceTypesStr.
         */
        public Builder deviceTypesStr(String deviceTypesStr) {
            this.putQueryParameter("deviceTypesStr", deviceTypesStr);
            this.deviceTypesStr = deviceTypesStr;
            return this;
        }

        /**
         * eventCode.
         */
        public Builder eventCode(String eventCode) {
            this.putQueryParameter("eventCode", eventCode);
            this.eventCode = eventCode;
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
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * serverRegion.
         */
        public Builder serverRegion(String serverRegion) {
            this.putQueryParameter("serverRegion", serverRegion);
            this.serverRegion = serverRegion;
            return this;
        }

        @Override
        public DescribeSafStartStepsRequest build() {
            return new DescribeSafStartStepsRequest(this);
        } 

    } 

}
