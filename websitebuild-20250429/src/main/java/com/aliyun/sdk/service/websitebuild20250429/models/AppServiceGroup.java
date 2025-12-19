// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link AppServiceGroup} extends {@link TeaModel}
 *
 * <p>AppServiceGroup</p>
 */
public class AppServiceGroup extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("QrCode")
    private String qrCode;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private AppServiceGroup(Builder builder) {
        this.name = builder.name;
        this.qrCode = builder.qrCode;
        this.type = builder.type;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppServiceGroup create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return qrCode
     */
    public String getQrCode() {
        return this.qrCode;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String name; 
        private String qrCode; 
        private String type; 
        private String url; 

        private Builder() {
        } 

        private Builder(AppServiceGroup model) {
            this.name = model.name;
            this.qrCode = model.qrCode;
            this.type = model.type;
            this.url = model.url;
        } 

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * QrCode.
         */
        public Builder qrCode(String qrCode) {
            this.qrCode = qrCode;
            return this;
        }

        /**
         * <p>例如：dingtalk、wx 等</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public AppServiceGroup build() {
            return new AppServiceGroup(this);
        } 

    } 

}
