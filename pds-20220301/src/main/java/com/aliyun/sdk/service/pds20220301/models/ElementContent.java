// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ElementContent} extends {@link TeaModel}
 *
 * <p>ElementContent</p>
 */
public class ElementContent extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("time_range")
    private java.util.List < Long > timeRange;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("url")
    private String url;

    private ElementContent(Builder builder) {
        this.content = builder.content;
        this.timeRange = builder.timeRange;
        this.type = builder.type;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ElementContent create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return timeRange
     */
    public java.util.List < Long > getTimeRange() {
        return this.timeRange;
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
        private String content; 
        private java.util.List < Long > timeRange; 
        private String type; 
        private String url; 

        /**
         * content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * time_range.
         */
        public Builder timeRange(java.util.List < Long > timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public ElementContent build() {
            return new ElementContent(this);
        } 

    } 

}
