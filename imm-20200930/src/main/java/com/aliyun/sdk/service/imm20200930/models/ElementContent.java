// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link ElementContent} extends {@link TeaModel}
 *
 * <p>ElementContent</p>
 */
public class ElementContent extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("TimeRange")
    private java.util.List<Long> timeRange;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Long> getTimeRange() {
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
        private java.util.List<Long> timeRange; 
        private String type; 
        private String URL; 

        private Builder() {
        } 

        private Builder(ElementContent model) {
            this.content = model.content;
            this.timeRange = model.timeRange;
            this.type = model.type;
            this.URL = model.URL;
        } 

        /**
         * <p>The content of the element.</p>
         * <p>If the value of the Type parameter is image or link, this parameter indicates the placeholder text.</p>
         * 
         * <strong>example:</strong>
         * <p>文本片段</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The time range. The array length is fixed to 2. One element indicates the start time and the other one indicates the end time. Unit: milliseconds.</p>
         */
        public Builder timeRange(java.util.List<Long> timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        /**
         * <p>The type of the element content.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>text</li>
         * <li>image</li>
         * <li>link</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The link to the element content. This parameter takes effect only if the Type parameter is set to image or link.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://aliyun.com">http://aliyun.com</a></p>
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
