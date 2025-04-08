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
         * snippet.
         */
        public Builder snippet(String snippet) {
            this.snippet = snippet;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>小米SU7售价22.99万元起 高管亲自辟谣：发布前不会有价格</p>
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
