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
 * {@link VideoInsight} extends {@link TeaModel}
 *
 * <p>VideoInsight</p>
 */
public class VideoInsight extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Caption")
    private String caption;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("MultilingualContent")
    private java.util.Map<String, MultilingualContentEntry> multilingualContent;

    private VideoInsight(Builder builder) {
        this.caption = builder.caption;
        this.description = builder.description;
        this.multilingualContent = builder.multilingualContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VideoInsight create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return caption
     */
    public String getCaption() {
        return this.caption;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return multilingualContent
     */
    public java.util.Map<String, MultilingualContentEntry> getMultilingualContent() {
        return this.multilingualContent;
    }

    public static final class Builder {
        private String caption; 
        private String description; 
        private java.util.Map<String, MultilingualContentEntry> multilingualContent; 

        private Builder() {
        } 

        private Builder(VideoInsight model) {
            this.caption = model.caption;
            this.description = model.description;
            this.multilingualContent = model.multilingualContent;
        } 

        /**
         * Caption.
         */
        public Builder caption(String caption) {
            this.caption = caption;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The multilingual video information content.</p>
         */
        public Builder multilingualContent(java.util.Map<String, MultilingualContentEntry> multilingualContent) {
            this.multilingualContent = multilingualContent;
            return this;
        }

        public VideoInsight build() {
            return new VideoInsight(this);
        } 

    } 

}
