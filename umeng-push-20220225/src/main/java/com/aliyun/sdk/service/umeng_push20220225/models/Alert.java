// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_push20220225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Alert} extends {@link TeaModel}
 *
 * <p>Alert</p>
 */
public class Alert extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    @com.aliyun.core.annotation.NameInMap("subtitle")
    private String subtitle;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    private Alert(Builder builder) {
        this.body = builder.body;
        this.subtitle = builder.subtitle;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Alert create() {
        return builder().build();
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return subtitle
     */
    public String getSubtitle() {
        return this.subtitle;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder {
        private String body; 
        private String subtitle; 
        private String title; 

        /**
         * body.
         */
        public Builder body(String body) {
            this.body = body;
            return this;
        }

        /**
         * subtitle.
         */
        public Builder subtitle(String subtitle) {
            this.subtitle = subtitle;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Alert build() {
            return new Alert(this);
        } 

    } 

}
