// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateAppKeyStateRequest} extends {@link RequestModel}
 *
 * <p>UpdateAppKeyStateRequest</p>
 */
public class UpdateAppKeyStateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKeyId")
    private String appKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    private UpdateAppKeyStateRequest(Builder builder) {
        super(builder);
        this.appKeyId = builder.appKeyId;
        this.lang = builder.lang;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAppKeyStateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKeyId
     */
    public String getAppKeyId() {
        return this.appKeyId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder extends Request.Builder<UpdateAppKeyStateRequest, Builder> {
        private String appKeyId; 
        private String lang; 
        private String state; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAppKeyStateRequest request) {
            super(request);
            this.appKeyId = request.appKeyId;
            this.lang = request.lang;
            this.state = request.state;
        } 

        /**
         * AppKeyId.
         */
        public Builder appKeyId(String appKeyId) {
            this.putQueryParameter("AppKeyId", appKeyId);
            this.appKeyId = appKeyId;
            return this;
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
         * State.
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        @Override
        public UpdateAppKeyStateRequest build() {
            return new UpdateAppKeyStateRequest(this);
        } 

    } 

}
