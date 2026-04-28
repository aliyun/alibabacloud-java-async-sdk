// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240529.models;

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
 * {@link GetImageObjectDetectionRequest} extends {@link RequestModel}
 *
 * <p>GetImageObjectDetectionRequest</p>
 */
public class GetImageObjectDetectionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace_name")
    private String workspaceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("service_id")
    private String serviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("image")
    private Image image;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("options")
    private java.util.Map<String, ?> options;

    private GetImageObjectDetectionRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.serviceId = builder.serviceId;
        this.image = builder.image;
        this.options = builder.options;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageObjectDetectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return image
     */
    public Image getImage() {
        return this.image;
    }

    /**
     * @return options
     */
    public java.util.Map<String, ?> getOptions() {
        return this.options;
    }

    public static final class Builder extends Request.Builder<GetImageObjectDetectionRequest, Builder> {
        private String workspaceName; 
        private String serviceId; 
        private Image image; 
        private java.util.Map<String, ?> options; 

        private Builder() {
            super();
        } 

        private Builder(GetImageObjectDetectionRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.serviceId = request.serviceId;
            this.image = request.image;
            this.options = request.options;
        } 

        /**
         * workspace_name.
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspace_name", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * service_id.
         */
        public Builder serviceId(String serviceId) {
            this.putPathParameter("service_id", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * image.
         */
        public Builder image(Image image) {
            this.putBodyParameter("image", image);
            this.image = image;
            return this;
        }

        /**
         * options.
         */
        public Builder options(java.util.Map<String, ?> options) {
            this.putBodyParameter("options", options);
            this.options = options;
            return this;
        }

        @Override
        public GetImageObjectDetectionRequest build() {
            return new GetImageObjectDetectionRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetImageObjectDetectionRequest} extends {@link TeaModel}
     *
     * <p>GetImageObjectDetectionRequest</p>
     */
    public static class Image extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Image(Builder builder) {
            this.content = builder.content;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Image create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String content; 
            private String url; 

            private Builder() {
            } 

            private Builder(Image model) {
                this.content = model.content;
                this.url = model.url;
            } 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Image build() {
                return new Image(this);
            } 

        } 

    }
}
