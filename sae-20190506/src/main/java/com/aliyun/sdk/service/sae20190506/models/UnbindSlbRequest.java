// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UnbindSlbRequest} extends {@link RequestModel}
 *
 * <p>UnbindSlbRequest</p>
 */
public class UnbindSlbRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Internet")
    private Boolean internet;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Intranet")
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

        private Builder(UnbindSlbRequest request) {
            super(request);
            this.appId = request.appId;
            this.internet = request.internet;
            this.intranet = request.intranet;
        } 

        /**
         * <p>true</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0099b7be-5f5b-4512-a7fc-56049ef1****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>true</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder internet(Boolean internet) {
            this.putQueryParameter("Internet", internet);
            this.internet = internet;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
