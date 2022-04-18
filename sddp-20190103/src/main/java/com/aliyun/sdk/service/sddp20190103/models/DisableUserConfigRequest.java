// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableUserConfigRequest} extends {@link RequestModel}
 *
 * <p>DisableUserConfigRequest</p>
 */
public class DisableUserConfigRequest extends Request {
    @Query
    @NameInMap("Code")
    private String code;

    @Query
    @NameInMap("Lang")
    private String lang;

    private DisableUserConfigRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableUserConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<DisableUserConfigRequest, Builder> {
        private String code; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DisableUserConfigRequest request) {
            super(request);
            this.code = request.code;
            this.lang = request.lang;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.putQueryParameter("Code", code);
            this.code = code;
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

        @Override
        public DisableUserConfigRequest build() {
            return new DisableUserConfigRequest(this);
        } 

    } 

}
