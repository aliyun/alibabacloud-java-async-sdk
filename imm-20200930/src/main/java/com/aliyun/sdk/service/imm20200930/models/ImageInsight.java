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
 * {@link ImageInsight} extends {@link TeaModel}
 *
 * <p>ImageInsight</p>
 */
public class ImageInsight extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Caption")
    private String caption;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("MultilingualContent")
    private java.util.Map<String, MultilingualContentEntry> multilingualContent;

    private ImageInsight(Builder builder) {
        this.caption = builder.caption;
        this.description = builder.description;
        this.multilingualContent = builder.multilingualContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageInsight create() {
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

        private Builder(ImageInsight model) {
            this.caption = model.caption;
            this.description = model.description;
            this.multilingualContent = model.multilingualContent;
        } 

        /**
         * <p>The short description of the image content.</p>
         * 
         * <strong>example:</strong>
         * <p>An orange tabby cat lying on the living room sofa with sunlight streaming in through the window</p>
         */
        public Builder caption(String caption) {
            this.caption = caption;
            return this;
        }

        /**
         * <p>The image description.</p>
         * 
         * <strong>example:</strong>
         * <p>The image shows a person wearing a dark suit jacket over a white shirt. The background features a gradient from light blue to gray</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The multilingual image information content.</p>
         */
        public Builder multilingualContent(java.util.Map<String, MultilingualContentEntry> multilingualContent) {
            this.multilingualContent = multilingualContent;
            return this;
        }

        public ImageInsight build() {
            return new ImageInsight(this);
        } 

    } 

}
