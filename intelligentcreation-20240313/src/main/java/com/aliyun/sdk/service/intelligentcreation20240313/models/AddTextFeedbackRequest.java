// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link AddTextFeedbackRequest} extends {@link RequestModel}
 *
 * <p>AddTextFeedbackRequest</p>
 */
public class AddTextFeedbackRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("quality")
    private Integer quality;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("textId")
    private Long textId;

    private AddTextFeedbackRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.quality = builder.quality;
        this.textId = builder.textId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddTextFeedbackRequest create() {
        return builder().build();
    }

@Override
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
     * @return quality
     */
    public Integer getQuality() {
        return this.quality;
    }

    /**
     * @return textId
     */
    public Long getTextId() {
        return this.textId;
    }

    public static final class Builder extends Request.Builder<AddTextFeedbackRequest, Builder> {
        private String content; 
        private Integer quality; 
        private Long textId; 

        private Builder() {
            super();
        } 

        private Builder(AddTextFeedbackRequest request) {
            super(request);
            this.content = request.content;
            this.quality = request.quality;
            this.textId = request.textId;
        } 

        /**
         * content.
         */
        public Builder content(String content) {
            this.putBodyParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * quality.
         */
        public Builder quality(Integer quality) {
            this.putBodyParameter("quality", quality);
            this.quality = quality;
            return this;
        }

        /**
         * textId.
         */
        public Builder textId(Long textId) {
            this.putBodyParameter("textId", textId);
            this.textId = textId;
            return this;
        }

        @Override
        public AddTextFeedbackRequest build() {
            return new AddTextFeedbackRequest(this);
        } 

    } 

}
