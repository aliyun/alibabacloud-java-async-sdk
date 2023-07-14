// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrafanaWorkspaceIntegrationPreview} extends {@link TeaModel}
 *
 * <p>GrafanaWorkspaceIntegrationPreview</p>
 */
public class GrafanaWorkspaceIntegrationPreview extends TeaModel {
    @NameInMap("id")
    private String id;

    @NameInMap("image")
    private String image;

    @NameInMap("name")
    private String name;

    @NameInMap("thumbnail")
    private String thumbnail;

    private GrafanaWorkspaceIntegrationPreview(Builder builder) {
        this.id = builder.id;
        this.image = builder.image;
        this.name = builder.name;
        this.thumbnail = builder.thumbnail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrafanaWorkspaceIntegrationPreview create() {
        return builder().build();
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return thumbnail
     */
    public String getThumbnail() {
        return this.thumbnail;
    }

    public static final class Builder {
        private String id; 
        private String image; 
        private String name; 
        private String thumbnail; 

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * image.
         */
        public Builder image(String image) {
            this.image = image;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * thumbnail.
         */
        public Builder thumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }

        public GrafanaWorkspaceIntegrationPreview build() {
            return new GrafanaWorkspaceIntegrationPreview(this);
        } 

    } 

}
