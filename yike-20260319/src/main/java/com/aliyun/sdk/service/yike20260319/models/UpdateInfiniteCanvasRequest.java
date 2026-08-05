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
 * {@link UpdateInfiniteCanvasRequest} extends {@link RequestModel}
 *
 * <p>UpdateInfiniteCanvasRequest</p>
 */
public class UpdateInfiniteCanvasRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CanvasId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String canvasId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoverUrl")
    private String coverUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    @com.aliyun.core.annotation.Validation(maxLength = 200)
    private String title;

    private UpdateInfiniteCanvasRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.canvasId = builder.canvasId;
        this.coverUrl = builder.coverUrl;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInfiniteCanvasRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return canvasId
     */
    public String getCanvasId() {
        return this.canvasId;
    }

    /**
     * @return coverUrl
     */
    public String getCoverUrl() {
        return this.coverUrl;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<UpdateInfiniteCanvasRequest, Builder> {
        private String regionId; 
        private String canvasId; 
        private String coverUrl; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInfiniteCanvasRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.canvasId = request.canvasId;
            this.coverUrl = request.coverUrl;
            this.title = request.title;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>canvas_gesad*</p>
         */
        public Builder canvasId(String canvasId) {
            this.putQueryParameter("CanvasId", canvasId);
            this.canvasId = canvasId;
            return this;
        }

        /**
         * CoverUrl.
         */
        public Builder coverUrl(String coverUrl) {
            this.putQueryParameter("CoverUrl", coverUrl);
            this.coverUrl = coverUrl;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public UpdateInfiniteCanvasRequest build() {
            return new UpdateInfiniteCanvasRequest(this);
        } 

    } 

}
