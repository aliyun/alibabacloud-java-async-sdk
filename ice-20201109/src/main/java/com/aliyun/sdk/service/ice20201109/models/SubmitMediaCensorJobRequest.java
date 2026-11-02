// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link SubmitMediaCensorJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitMediaCensorJobRequest</p>
 */
public class SubmitMediaCensorJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Barrages")
    private String barrages;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoverImages")
    private String coverImages;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Input")
    private Input input;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotifyUrl")
    private String notifyUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Output")
    private String output;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleConfig")
    private ScheduleConfig scheduleConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitMediaCensorJobRequest(Builder builder) {
        super(builder);
        this.barrages = builder.barrages;
        this.coverImages = builder.coverImages;
        this.description = builder.description;
        this.input = builder.input;
        this.notifyUrl = builder.notifyUrl;
        this.output = builder.output;
        this.scheduleConfig = builder.scheduleConfig;
        this.templateId = builder.templateId;
        this.title = builder.title;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitMediaCensorJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return barrages
     */
    public String getBarrages() {
        return this.barrages;
    }

    /**
     * @return coverImages
     */
    public String getCoverImages() {
        return this.coverImages;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return input
     */
    public Input getInput() {
        return this.input;
    }

    /**
     * @return notifyUrl
     */
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    /**
     * @return output
     */
    public String getOutput() {
        return this.output;
    }

    /**
     * @return scheduleConfig
     */
    public ScheduleConfig getScheduleConfig() {
        return this.scheduleConfig;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitMediaCensorJobRequest, Builder> {
        private String barrages; 
        private String coverImages; 
        private String description; 
        private Input input; 
        private String notifyUrl; 
        private String output; 
        private ScheduleConfig scheduleConfig; 
        private String templateId; 
        private String title; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitMediaCensorJobRequest request) {
            super(request);
            this.barrages = request.barrages;
            this.coverImages = request.coverImages;
            this.description = request.description;
            this.input = request.input;
            this.notifyUrl = request.notifyUrl;
            this.output = request.output;
            this.scheduleConfig = request.scheduleConfig;
            this.templateId = request.templateId;
            this.title = request.title;
            this.userData = request.userData;
        } 

        /**
         * <p>The video barrages (on-screen comments).</p>
         * <blockquote>
         * <p>If specified, it overrides the barrages specified in the Media object.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hello world</p>
         */
        public Builder barrages(String barrages) {
            this.putQueryParameter("Barrages", barrages);
            this.barrages = barrages;
            return this;
        }

        /**
         * <p>The Object Storage Service (OSS) files for the cover images, specified as a JSON array. You can specify up to five cover images.</p>
         * <blockquote>
         * <p>If specified, this parameter overrides the cover image information in the <strong>Media</strong> object.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Bucket&quot;:&quot;example-bucket-<strong><strong>&quot;,&quot;Location&quot;:&quot;oss-cn-shanghai&quot;,&quot;Object&quot;:&quot;example-</strong></strong>.jpeg&quot;,&quot;RoleArn&quot;:&quot;acs:ram::1997018457688683:role/AliyunICEDefaultRole&quot;}]</p>
         */
        public Builder coverImages(String coverImages) {
            this.putQueryParameter("CoverImages", coverImages);
            this.coverImages = coverImages;
            return this;
        }

        /**
         * <p>The video description. The maximum length is 128 bytes.</p>
         * <blockquote>
         * <p>If specified, this parameter overrides the description specified in the Media object.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>example description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The input file to censor.</p>
         */
        public Builder input(Input input) {
            String inputShrink = shrink(input, "Input", "json");
            this.putQueryParameter("Input", inputShrink);
            this.input = input;
            return this;
        }

        /**
         * <p>The callback path. Both Message Service (MNS) and HTTP callbacks are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>mns://125340688170****.oss-cn-shanghai.aliyuncs.com/queues/example-pipeline</p>
         */
        public Builder notifyUrl(String notifyUrl) {
            this.putQueryParameter("NotifyUrl", notifyUrl);
            this.notifyUrl = notifyUrl;
            return this;
        }

        /**
         * <p>The output location for screenshots. The censor job generates screenshots and a result JSON file in the OSS location specified by this parameter.</p>
         * <ul>
         * <li><p>Example format: <code>oss://bucket/snapshot-{Count}.jpg</code>, where <code>bucket</code> is the name of an OSS bucket in the same region as the project, and <code>{Count}</code> is a placeholder for the screenshot sequence number.</p>
         * </li>
         * <li><p>The detailed censor results are saved to a file named <code>{jobId}.output</code> in the same OSS folder as the value of <code>Output</code>. For information about the fields in the output file, see <a href="https://help.aliyun.com/document_detail/609211.html">Media censor result file fields</a>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss://sashimi-cn-shanghai/censor/snapshot-{Count}.jpg</p>
         */
        public Builder output(String output) {
            this.putQueryParameter("Output", output);
            this.output = output;
            return this;
        }

        /**
         * <p>The scheduling configuration.</p>
         */
        public Builder scheduleConfig(ScheduleConfig scheduleConfig) {
            String scheduleConfigShrink = shrink(scheduleConfig, "ScheduleConfig", "json");
            this.putQueryParameter("ScheduleConfig", scheduleConfigShrink);
            this.scheduleConfig = scheduleConfig;
            return this;
        }

        /**
         * <p>The template ID. If this parameter is left empty, the service uses the default template for the censor job.</p>
         * 
         * <strong>example:</strong>
         * <p>S00000001-100060</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The video title. The maximum length is 64 bytes.</p>
         * <blockquote>
         * <p>If specified, this parameter overrides the title specified in the Media object.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Hello World</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>The user-defined data. The maximum length is 128 bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>UserDatatestid-001-****</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitMediaCensorJobRequest build() {
            return new SubmitMediaCensorJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitMediaCensorJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitMediaCensorJobRequest</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Media")
        private String media;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Input(Builder builder) {
            this.media = builder.media;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return media
         */
        public String getMedia() {
            return this.media;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String media; 
            private String type; 

            private Builder() {
            } 

            private Builder(Input model) {
                this.media = model.media;
                this.type = model.type;
            } 

            /**
             * <p>The identifier for the input file. You can specify either an OSS URL or a media ID.
             * Valid OSS URL formats:</p>
             * <p>1\. <code>oss://bucket/object</code></p>
             * <p>2\. <code>http(s)://bucket.oss-[regionId].aliyuncs.com/object</code></p>
             * <p>The <code>bucket</code> must be in the same region as the project, and <code>object</code> is the path to the file.</p>
             * 
             * <strong>example:</strong>
             * <p>1b1b9cd148034739af413150fded****</p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>The type of the input file. Valid values:</p>
             * <p><code>OSS</code>: an OSS URL</p>
             * <p><code>Media</code>: a media ID</p>
             * 
             * <strong>example:</strong>
             * <p>Media</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitMediaCensorJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitMediaCensorJobRequest</p>
     */
    public static class ScheduleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PipelineId")
        private String pipelineId;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        private ScheduleConfig(Builder builder) {
            this.pipelineId = builder.pipelineId;
            this.priority = builder.priority;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduleConfig create() {
            return builder().build();
        }

        /**
         * @return pipelineId
         */
        public String getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        public static final class Builder {
            private String pipelineId; 
            private Integer priority; 

            private Builder() {
            } 

            private Builder(ScheduleConfig model) {
                this.pipelineId = model.pipelineId;
                this.priority = model.priority;
            } 

            /**
             * <p>The pipeline ID.</p>
             * 
             * <strong>example:</strong>
             * <p>5246b8d12a62433ab77845074039****</p>
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * <p>The task priority. A higher value indicates a higher priority. Valid values range from 1 to 10.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            public ScheduleConfig build() {
                return new ScheduleConfig(this);
            } 

        } 

    }
}
