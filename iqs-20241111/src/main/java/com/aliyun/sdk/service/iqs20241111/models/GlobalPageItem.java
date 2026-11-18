// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

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
 * {@link GlobalPageItem} extends {@link TeaModel}
 *
 * <p>GlobalPageItem</p>
 */
public class GlobalPageItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("link")
    @com.aliyun.core.annotation.Validation(required = true)
    private String link;

    @com.aliyun.core.annotation.NameInMap("snippet")
    private String snippet;

    @com.aliyun.core.annotation.NameInMap("title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    private GlobalPageItem(Builder builder) {
        this.link = builder.link;
        this.snippet = builder.snippet;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GlobalPageItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return link
     */
    public String getLink() {
        return this.link;
    }

    /**
     * @return snippet
     */
    public String getSnippet() {
        return this.snippet;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder {
        private String link; 
        private String snippet; 
        private String title; 

        private Builder() {
        } 

        private Builder(GlobalPageItem model) {
            this.link = model.link;
            this.snippet = model.snippet;
            this.title = model.title;
        } 

        /**
         * <p>The full URL that the search result points to.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://baijiahao.baidu.com/s?id=1787881554557805096">https://baijiahao.baidu.com/s?id=1787881554557805096</a></p>
         */
        public Builder link(String link) {
            this.link = link;
            return this;
        }

        /**
         * <p>The truncated description of the search result in text format.</p>
         * 
         * <strong>example:</strong>
         * <p>In terms of 100 km/h to 0 braking performance, the distance is only 33.3 m. Objectively speaking, the Xiaomi SU7 performs really well in this regard. As for range, it features a 101 kWh battery capacity, achieving a CLTC range of 800 km, and an 800 V high-voltage platform that supports 220 km of range in 5 minutes and 510 km in 15 minutes. And in..</p>
         */
        public Builder snippet(String snippet) {
            this.snippet = snippet;
            return this;
        }

        /**
         * <p>The title of the search result in plain text.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Xiaomi SU7 priced from 229,900 CNY, executive personally dispels rumors: no price will be announced before launch</p>
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public GlobalPageItem build() {
            return new GlobalPageItem(this);
        } 

    } 

}
