// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAppKeyStateRequest} extends {@link RequestModel}
 *
 * <p>UpdateAppKeyStateRequest</p>
 */
public class UpdateAppKeyStateRequest extends Request {
    @Query
    @NameInMap("AppKeyId")
    private String appKeyId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("State")
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

        private Builder(UpdateAppKeyStateRequest response) {
            super(response);
            this.appKeyId = response.appKeyId;
            this.lang = response.lang;
            this.state = response.state;
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
