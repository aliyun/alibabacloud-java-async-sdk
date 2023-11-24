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

        private Builder(BindSlbRequest request) {
            super(request);
            this.appId = request.appId;
            this.internet = request.internet;
            this.internetSlbId = request.internetSlbId;
            this.intranet = request.intranet;
            this.intranetSlbId = request.intranetSlbId;
        } 

        /**
         * 0099b7be-5f5b-4512-a7fc-56049ef1\*\*\*\*
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * \[{"port":80,"targetPort":8080,"protocol":"TCP"}]
         */
        public Builder internet(String internet) {
            this.putQueryParameter("Internet", internet);
            this.internet = internet;
            return this;
        }

        /**
         * lb-bp1tg0k6d9nqaw7l1\*\*\*\*
         */
        public Builder internetSlbId(String internetSlbId) {
            this.putQueryParameter("InternetSlbId", internetSlbId);
            this.internetSlbId = internetSlbId;
            return this;
        }

        /**
         * \[{"port":80,"targetPort":8080,"protocol":"TCP"}]
         */
        public Builder intranet(String intranet) {
            this.putQueryParameter("Intranet", intranet);
            this.intranet = intranet;
            return this;
        }

        /**
         * lb-bp1tg0k6d9nqaw7l1\*\*\*\*
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
