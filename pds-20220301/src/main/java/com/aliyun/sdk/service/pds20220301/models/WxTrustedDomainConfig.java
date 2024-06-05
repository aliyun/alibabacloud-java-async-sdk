// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link WxTrustedDomainConfig} extends {@link TeaModel}
 *
 * <p>WxTrustedDomainConfig</p>
 */
public class WxTrustedDomainConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("show")
    private Boolean show;

    private WxTrustedDomainConfig(Builder builder) {
        this.content = builder.content;
        this.name = builder.name;
        this.show = builder.show;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WxTrustedDomainConfig create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return show
     */
    public Boolean getShow() {
        return this.show;
    }

    public static final class Builder {
        private String content; 
        private String name; 
        private Boolean show; 

        /**
         * content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * show.
         */
        public Builder show(Boolean show) {
            this.show = show;
            return this;
        }

        public WxTrustedDomainConfig build() {
            return new WxTrustedDomainConfig(this);
        } 

    } 

}
