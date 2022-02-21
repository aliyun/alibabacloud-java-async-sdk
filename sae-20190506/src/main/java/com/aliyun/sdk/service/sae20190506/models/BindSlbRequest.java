// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindSlbRequest} extends {@link RequestModel}
 *
 * <p>BindSlbRequest</p>
 */
public class BindSlbRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("Internet")
    private String internet;

    @Query
    @NameInMap("InternetSlbId")
    private String internetSlbId;

    @Query
    @NameInMap("Intranet")
    private String intranet;

    @Query
    @NameInMap("IntranetSlbId")
    private String intranetSlbId;

    private BindSlbRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.internet = builder.internet;
        this.internetSlbId = builder.internetSlbId;
        this.intranet = builder.intranet;
        this.intranetSlbId = builder.intranetSlbId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindSlbRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return internet
     */
    public String getInternet() {
        return this.internet;
    }

    /**
     * @return internetSlbId
     */
    public String getInternetSlbId() {
        return this.internetSlbId;
    }

    /**
     * @return intranet
     */
    public String getIntranet() {
        return this.intranet;
    }

    /**
     * @return intranetSlbId
     */
    public String getIntranetSlbId() {
        return this.intranetSlbId;
    }

    public static final class Builder extends Request.Builder<BindSlbRequest, Builder> {
        private String appId; 
        private String internet; 
        private String internetSlbId; 
        private String intranet; 
        private String intranetSlbId; 

        private Builder() {
            super();
        } 

        private Builder(BindSlbRequest response) {
            super(response);
            this.appId = response.appId;
            this.internet = response.internet;
            this.internetSlbId = response.internetSlbId;
            this.intranet = response.intranet;
            this.intranetSlbId = response.intranetSlbId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Internet.
         */
        public Builder internet(String internet) {
            this.putQueryParameter("Internet", internet);
            this.internet = internet;
            return this;
        }

        /**
         * InternetSlbId.
         */
        public Builder internetSlbId(String internetSlbId) {
            this.putQueryParameter("InternetSlbId", internetSlbId);
            this.internetSlbId = internetSlbId;
            return this;
        }

        /**
         * Intranet.
         */
        public Builder intranet(String intranet) {
            this.putQueryParameter("Intranet", intranet);
            this.intranet = intranet;
            return this;
        }

        /**
         * IntranetSlbId.
         */
        public Builder intranetSlbId(String intranetSlbId) {
            this.putQueryParameter("IntranetSlbId", intranetSlbId);
            this.intranetSlbId = intranetSlbId;
            return this;
        }

        @Override
        public BindSlbRequest build() {
            return new BindSlbRequest(this);
        } 

    } 

}
