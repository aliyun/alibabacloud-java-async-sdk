// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link MarketingGenerationDay} extends {@link TeaModel}
 *
 * <p>MarketingGenerationDay</p>
 */
public class MarketingGenerationDay extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ArticleTasks")
    private Long articleTasks;

    @com.aliyun.core.annotation.NameInMap("Date")
    private String date;

    @com.aliyun.core.annotation.NameInMap("ImageTasks")
    private Long imageTasks;

    @com.aliyun.core.annotation.NameInMap("VideoTasks")
    private Long videoTasks;

    private MarketingGenerationDay(Builder builder) {
        this.articleTasks = builder.articleTasks;
        this.date = builder.date;
        this.imageTasks = builder.imageTasks;
        this.videoTasks = builder.videoTasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MarketingGenerationDay create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return articleTasks
     */
    public Long getArticleTasks() {
        return this.articleTasks;
    }

    /**
     * @return date
     */
    public String getDate() {
        return this.date;
    }

    /**
     * @return imageTasks
     */
    public Long getImageTasks() {
        return this.imageTasks;
    }

    /**
     * @return videoTasks
     */
    public Long getVideoTasks() {
        return this.videoTasks;
    }

    public static final class Builder {
        private Long articleTasks; 
        private String date; 
        private Long imageTasks; 
        private Long videoTasks; 

        private Builder() {
        } 

        private Builder(MarketingGenerationDay model) {
            this.articleTasks = model.articleTasks;
            this.date = model.date;
            this.imageTasks = model.imageTasks;
            this.videoTasks = model.videoTasks;
        } 

        /**
         * <p>The number of article generation tasks on the day.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder articleTasks(Long articleTasks) {
            this.articleTasks = articleTasks;
            return this;
        }

        /**
         * <p>The statistical date. Format: yyyy-MM-dd.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-26</p>
         */
        public Builder date(String date) {
            this.date = date;
            return this;
        }

        /**
         * <p>The number of image generation tasks on the day.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder imageTasks(Long imageTasks) {
            this.imageTasks = imageTasks;
            return this;
        }

        /**
         * <p>The number of video generation tasks on the day.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder videoTasks(Long videoTasks) {
            this.videoTasks = videoTasks;
            return this;
        }

        public MarketingGenerationDay build() {
            return new MarketingGenerationDay(this);
        } 

    } 

}
