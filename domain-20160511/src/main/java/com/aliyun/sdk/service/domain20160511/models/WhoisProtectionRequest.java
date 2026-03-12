// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20160511.models;

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
 * {@link WhoisProtectionRequest} extends {@link RequestModel}
 *
 * <p>WhoisProtectionRequest</p>
 */
public class WhoisProtectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSource")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer dataSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WhoisProtect")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean whoisProtect;

    private WhoisProtectionRequest(Builder builder) {
        super(builder);
        this.dataContent = builder.dataContent;
        this.dataSource = builder.dataSource;
        this.lang = builder.lang;
        this.userClientIp = builder.userClientIp;
        this.whoisProtect = builder.whoisProtect;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WhoisProtectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataContent
     */
    public String getDataContent() {
        return this.dataContent;
    }

    /**
     * @return dataSource
     */
    public Integer getDataSource() {
        return this.dataSource;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    /**
     * @return whoisProtect
     */
    public Boolean getWhoisProtect() {
        return this.whoisProtect;
    }

    public static final class Builder extends Request.Builder<WhoisProtectionRequest, Builder> {
        private String dataContent; 
        private Integer dataSource; 
        private String lang; 
        private String userClientIp; 
        private Boolean whoisProtect; 

        private Builder() {
            super();
        } 

        private Builder(WhoisProtectionRequest request) {
            super(request);
            this.dataContent = request.dataContent;
            this.dataSource = request.dataSource;
            this.lang = request.lang;
            this.userClientIp = request.userClientIp;
            this.whoisProtect = request.whoisProtect;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder dataContent(String dataContent) {
            this.putQueryParameter("DataContent", dataContent);
            this.dataContent = dataContent;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder dataSource(Integer dataSource) {
            this.putQueryParameter("DataSource", dataSource);
            this.dataSource = dataSource;
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
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder whoisProtect(Boolean whoisProtect) {
            this.putQueryParameter("WhoisProtect", whoisProtect);
            this.whoisProtect = whoisProtect;
            return this;
        }

        @Override
        public WhoisProtectionRequest build() {
            return new WhoisProtectionRequest(this);
        } 

    } 

}
