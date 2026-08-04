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
 * {@link FindAllContacterRequest} extends {@link RequestModel}
 *
 * <p>FindAllContacterRequest</p>
 */
public class FindAllContacterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocaleString")
    private String localeString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long userId;

    private FindAllContacterRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.localeString = builder.localeString;
        this.type = builder.type;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindAllContacterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return localeString
     */
    public String getLocaleString() {
        return this.localeString;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<FindAllContacterRequest, Builder> {
        private String appName; 
        private String localeString; 
        private String type; 
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(FindAllContacterRequest request) {
            super(request);
            this.appName = request.appName;
            this.localeString = request.localeString;
            this.type = request.type;
            this.userId = request.userId;
        } 

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * LocaleString.
         */
        public Builder localeString(String localeString) {
            this.putQueryParameter("LocaleString", localeString);
            this.localeString = localeString;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder userId(Long userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public FindAllContacterRequest build() {
            return new FindAllContacterRequest(this);
        } 

    } 

}
