// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link CustomSideLinkConfig} extends {@link TeaModel}
 *
 * <p>CustomSideLinkConfig</p>
 */
public class CustomSideLinkConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("icon")
    private String icon;

    @com.aliyun.core.annotation.NameInMap("link")
    private String link;

    @com.aliyun.core.annotation.NameInMap("text")
    private String text;

    private CustomSideLinkConfig(Builder builder) {
        this.icon = builder.icon;
        this.link = builder.link;
        this.text = builder.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CustomSideLinkConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return icon
     */
    public String getIcon() {
        return this.icon;
    }

    /**
     * @return link
     */
    public String getLink() {
        return this.link;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    public static final class Builder {
        private String icon; 
        private String link; 
        private String text; 

        private Builder() {
        } 

        private Builder(CustomSideLinkConfig model) {
            this.icon = model.icon;
            this.link = model.link;
            this.text = model.text;
        } 

        /**
         * icon.
         */
        public Builder icon(String icon) {
            this.icon = icon;
            return this;
        }

        /**
         * link.
         */
        public Builder link(String link) {
            this.link = link;
            return this;
        }

        /**
         * text.
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }

        public CustomSideLinkConfig build() {
            return new CustomSideLinkConfig(this);
        } 

    } 

}
