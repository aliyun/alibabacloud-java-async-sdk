// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260319.models;

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
 * {@link CreateYikeEditingProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateYikeEditingProjectRequest</p>
 */
public class CreateYikeEditingProjectRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoverURL")
    private String coverURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaterialMaps")
    private String materialMaps;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Timeline")
    private String timeline;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    private CreateYikeEditingProjectRequest(Builder builder) {
        super(builder);
        this.coverURL = builder.coverURL;
        this.materialMaps = builder.materialMaps;
        this.timeline = builder.timeline;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateYikeEditingProjectRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return coverURL
     */
    public String getCoverURL() {
        return this.coverURL;
    }

    /**
     * @return materialMaps
     */
    public String getMaterialMaps() {
        return this.materialMaps;
    }

    /**
     * @return timeline
     */
    public String getTimeline() {
        return this.timeline;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<CreateYikeEditingProjectRequest, Builder> {
        private String coverURL; 
        private String materialMaps; 
        private String timeline; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(CreateYikeEditingProjectRequest request) {
            super(request);
            this.coverURL = request.coverURL;
            this.materialMaps = request.materialMaps;
            this.timeline = request.timeline;
            this.title = request.title;
        } 

        /**
         * CoverURL.
         */
        public Builder coverURL(String coverURL) {
            this.putQueryParameter("CoverURL", coverURL);
            this.coverURL = coverURL;
            return this;
        }

        /**
         * MaterialMaps.
         */
        public Builder materialMaps(String materialMaps) {
            this.putQueryParameter("MaterialMaps", materialMaps);
            this.materialMaps = materialMaps;
            return this;
        }

        /**
         * Timeline.
         */
        public Builder timeline(String timeline) {
            this.putBodyParameter("Timeline", timeline);
            this.timeline = timeline;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public CreateYikeEditingProjectRequest build() {
            return new CreateYikeEditingProjectRequest(this);
        } 

    } 

}
