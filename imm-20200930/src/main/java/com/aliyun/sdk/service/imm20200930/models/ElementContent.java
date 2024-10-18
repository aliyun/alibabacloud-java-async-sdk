// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ElementContent} extends {@link TeaModel}
 *
 * <p>ElementContent</p>
 */
public class ElementContent extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("TimeRange")
    private java.util.List < Long > timeRange;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("URL")
    private String URL;

    private ElementContent(Builder builder) {
        this.content = builder.content;
        this.timeRange = builder.timeRange;
        this.type = builder.type;
        this.URL = builder.URL;
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
     * @return URL
     */
    public String getURL() {
        return this.URL;
    }

    public static final class Builder {
        private String content; 
        private java.util.List < Long > timeRange; 
        private String type; 
        private String URL; 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * TimeRange.
         */
        public Builder timeRange(java.util.List < Long > timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * URL.
         */
        public Builder URL(String URL) {
            this.URL = URL;
            return this;
        }

        public ElementContent build() {
            return new ElementContent(this);
        } 

    } 

}
