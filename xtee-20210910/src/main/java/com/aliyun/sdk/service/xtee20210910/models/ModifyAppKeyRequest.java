// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAppKeyRequest} extends {@link RequestModel}
 *
 * <p>ModifyAppKeyRequest</p>
 */
public class ModifyAppKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("appKey")
    private String appKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("memo")
    private String memo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private ModifyAppKeyRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.appKey = builder.appKey;
        this.memo = builder.memo;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAppKeyRequest create() {
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
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return memo
     */
    public String getMemo() {
        return this.memo;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<ModifyAppKeyRequest, Builder> {
        private String lang; 
        private String appKey; 
        private String memo; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAppKeyRequest request) {
            super(request);
            this.lang = request.lang;
            this.appKey = request.appKey;
            this.memo = request.memo;
            this.regId = request.regId;
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
         * appKey.
         */
        public Builder appKey(String appKey) {
            this.putQueryParameter("appKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * memo.
         */
        public Builder memo(String memo) {
            this.putQueryParameter("memo", memo);
            this.memo = memo;
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

        @Override
        public ModifyAppKeyRequest build() {
            return new ModifyAppKeyRequest(this);
        } 

    } 

}
