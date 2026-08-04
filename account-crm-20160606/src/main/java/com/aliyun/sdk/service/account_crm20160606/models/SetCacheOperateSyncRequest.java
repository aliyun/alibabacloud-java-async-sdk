// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetCacheOperateSyncRequest} extends {@link RequestModel}
 *
 * <p>SetCacheOperateSyncRequest</p>
 */
public class SetCacheOperateSyncRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExceptVersion")
    private Integer exceptVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireSeconds")
    private Integer expireSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SetType")
    private String setType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValueClazz")
    private String valueClazz;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValueString")
    private String valueString;

    private SetCacheOperateSyncRequest(Builder builder) {
        super(builder);
        this.exceptVersion = builder.exceptVersion;
        this.expireSeconds = builder.expireSeconds;
        this.key = builder.key;
        this.setType = builder.setType;
        this.valueClazz = builder.valueClazz;
        this.valueString = builder.valueString;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetCacheOperateSyncRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exceptVersion
     */
    public Integer getExceptVersion() {
        return this.exceptVersion;
    }

    /**
     * @return expireSeconds
     */
    public Integer getExpireSeconds() {
        return this.expireSeconds;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return setType
     */
    public String getSetType() {
        return this.setType;
    }

    /**
     * @return valueClazz
     */
    public String getValueClazz() {
        return this.valueClazz;
    }

    /**
     * @return valueString
     */
    public String getValueString() {
        return this.valueString;
    }

    public static final class Builder extends Request.Builder<SetCacheOperateSyncRequest, Builder> {
        private Integer exceptVersion; 
        private Integer expireSeconds; 
        private String key; 
        private String setType; 
        private String valueClazz; 
        private String valueString; 

        private Builder() {
            super();
        } 

        private Builder(SetCacheOperateSyncRequest request) {
            super(request);
            this.exceptVersion = request.exceptVersion;
            this.expireSeconds = request.expireSeconds;
            this.key = request.key;
            this.setType = request.setType;
            this.valueClazz = request.valueClazz;
            this.valueString = request.valueString;
        } 

        /**
         * ExceptVersion.
         */
        public Builder exceptVersion(Integer exceptVersion) {
            this.putQueryParameter("ExceptVersion", exceptVersion);
            this.exceptVersion = exceptVersion;
            return this;
        }

        /**
         * ExpireSeconds.
         */
        public Builder expireSeconds(Integer expireSeconds) {
            this.putQueryParameter("ExpireSeconds", expireSeconds);
            this.expireSeconds = expireSeconds;
            return this;
        }

        /**
         * Key.
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * SetType.
         */
        public Builder setType(String setType) {
            this.putQueryParameter("SetType", setType);
            this.setType = setType;
            return this;
        }

        /**
         * ValueClazz.
         */
        public Builder valueClazz(String valueClazz) {
            this.putQueryParameter("ValueClazz", valueClazz);
            this.valueClazz = valueClazz;
            return this;
        }

        /**
         * ValueString.
         */
        public Builder valueString(String valueString) {
            this.putQueryParameter("ValueString", valueString);
            this.valueString = valueString;
            return this;
        }

        @Override
        public SetCacheOperateSyncRequest build() {
            return new SetCacheOperateSyncRequest(this);
        } 

    } 

}
