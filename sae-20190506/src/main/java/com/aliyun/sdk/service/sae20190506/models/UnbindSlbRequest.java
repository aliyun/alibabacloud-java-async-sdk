// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindSlbRequest} extends {@link RequestModel}
 *
 * <p>UnbindSlbRequest</p>
 */
public class UnbindSlbRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("Internet")
    private Boolean internet;

    @Query
    @NameInMap("Intranet")
    private Boolean intranet;

    private UnbindSlbRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.internet = builder.internet;
        this.intranet = builder.intranet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindSlbRequest create() {
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
    public Boolean getInternet() {
        return this.internet;
    }

    /**
     * @return intranet
     */
    public Boolean getIntranet() {
        return this.intranet;
    }

    public static final class Builder extends Request.Builder<UnbindSlbRequest, Builder> {
        private String appId; 
        private Boolean internet; 
        private Boolean intranet; 

        private Builder() {
            super();
        } 

        private Builder(UnbindSlbRequest response) {
            super(response);
            this.appId = response.appId;
            this.internet = response.internet;
            this.intranet = response.intranet;
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
        public Builder internet(Boolean internet) {
            this.putQueryParameter("Internet", internet);
            this.internet = internet;
            return this;
        }

        /**
         * Intranet.
         */
        public Builder intranet(Boolean intranet) {
            this.putQueryParameter("Intranet", intranet);
            this.intranet = intranet;
            return this;
        }

        @Override
        public UnbindSlbRequest build() {
            return new UnbindSlbRequest(this);
        } 

    } 

}
