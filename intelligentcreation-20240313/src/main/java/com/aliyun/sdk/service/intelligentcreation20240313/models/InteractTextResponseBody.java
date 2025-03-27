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
 * {@link InteractTextResponseBody} extends {@link TeaModel}
 *
 * <p>InteractTextResponseBody</p>
 */
public class InteractTextResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("end")
    private Boolean end;

    @com.aliyun.core.annotation.NameInMap("index")
    private Integer index;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("relatedImages")
    private java.util.List<String> relatedImages;

    @com.aliyun.core.annotation.NameInMap("relatedVideos")
    private java.util.List<String> relatedVideos;

    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("type")
    private Integer type;

    private InteractTextResponseBody(Builder builder) {
        this.end = builder.end;
        this.index = builder.index;
        this.message = builder.message;
        this.relatedImages = builder.relatedImages;
        this.relatedVideos = builder.relatedVideos;
        this.sessionId = builder.sessionId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InteractTextResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return end
     */
    public Boolean getEnd() {
        return this.end;
    }

    /**
     * @return index
     */
    public Integer getIndex() {
        return this.index;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return relatedImages
     */
    public java.util.List<String> getRelatedImages() {
        return this.relatedImages;
    }

    /**
     * @return relatedVideos
     */
    public java.util.List<String> getRelatedVideos() {
        return this.relatedVideos;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder {
        private Boolean end; 
        private Integer index; 
        private String message; 
        private java.util.List<String> relatedImages; 
        private java.util.List<String> relatedVideos; 
        private String sessionId; 
        private Integer type; 

        private Builder() {
        } 

        private Builder(InteractTextResponseBody model) {
            this.end = model.end;
            this.index = model.index;
            this.message = model.message;
            this.relatedImages = model.relatedImages;
            this.relatedVideos = model.relatedVideos;
            this.sessionId = model.sessionId;
            this.type = model.type;
        } 

        /**
         * end.
         */
        public Builder end(Boolean end) {
            this.end = end;
            return this;
        }

        /**
         * index.
         */
        public Builder index(Integer index) {
            this.index = index;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * relatedImages.
         */
        public Builder relatedImages(java.util.List<String> relatedImages) {
            this.relatedImages = relatedImages;
            return this;
        }

        /**
         * relatedVideos.
         */
        public Builder relatedVideos(java.util.List<String> relatedVideos) {
            this.relatedVideos = relatedVideos;
            return this;
        }

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * type.
         */
        public Builder type(Integer type) {
            this.type = type;
            return this;
        }

        public InteractTextResponseBody build() {
            return new InteractTextResponseBody(this);
        } 

    } 

}
