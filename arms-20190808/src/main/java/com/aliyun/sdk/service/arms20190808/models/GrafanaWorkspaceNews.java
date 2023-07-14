// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrafanaWorkspaceNews} extends {@link TeaModel}
 *
 * <p>GrafanaWorkspaceNews</p>
 */
public class GrafanaWorkspaceNews extends TeaModel {
    @NameInMap("date")
    private Long date;

    @NameInMap("description")
    private String description;

    @NameInMap("image")
    private String image;

    @NameInMap("link")
    private String link;

    @NameInMap("title")
    private String title;

    private GrafanaWorkspaceNews(Builder builder) {
        this.date = builder.date;
        this.description = builder.description;
        this.image = builder.image;
        this.link = builder.link;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrafanaWorkspaceNews create() {
        return builder().build();
    }

    /**
     * @return date
     */
    public Long getDate() {
        return this.date;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    /**
     * @return link
     */
    public String getLink() {
        return this.link;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder {
        private Long date; 
        private String description; 
        private String image; 
        private String link; 
        private String title; 

        /**
         * date.
         */
        public Builder date(Long date) {
            this.date = date;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
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
         * link.
         */
        public Builder link(String link) {
            this.link = link;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public GrafanaWorkspaceNews build() {
            return new GrafanaWorkspaceNews(this);
        } 

    } 

}
