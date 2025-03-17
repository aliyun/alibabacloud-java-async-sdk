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
         * <p>The live comments of the video.</p>
         * <blockquote>
         * <p> If this parameter is specified, the system checks the live comments specified by this parameter instead of the live comments of the input file specified by Media.</p>
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
         * <p>The Object Storage Service (OSS) objects that are used as the thumbnails. Specify the thumbnails in a JSON array. A maximum of five thumbnails are supported.</p>
         * <blockquote>
         * <p> If this parameter is specified, the system checks the thumbnails specified by this parameter instead of the thumbnails of the input file specified by <strong>Media</strong>.</p>
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
         * <p>The video description, which can be up to 128 bytes in length.</p>
         * <blockquote>
         * <p> If this parameter is specified, the system checks the description specified by this parameter instead of the description of the input file specified by Media.</p>
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
         * <p>The information about the file to be moderated.</p>
         */
        public Builder input(Input input) {
            String inputShrink = shrink(input, "Input", "json");
            this.putQueryParameter("Input", inputShrink);
            this.input = input;
            return this;
        }

        /**
         * <p>The callback URL. Simple Message Queue (SMQ, formerly MNS) and HTTP callbacks are supported.</p>
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
         * <p>The output snapshots. The moderation job generates output snapshots and the result JSON file in the path corresponding to the input file.</p>
         * <ul>
         * <li>File name format of output snapshots: oss://bucket/snapshot-{Count}.jpg. In the path, bucket indicates an OSS bucket that resides in the same region as the current project, and {Count} is the sequence number of the snapshot.</li>
         * <li>The detailed moderation results are stored in the {jobId}.output file in the same OSS folder as the output snapshots. For more information about the parameters in the output file, see <a href="https://help.aliyun.com/document_detail/609211.html">Output parameters of media moderation jobs</a>.</li>
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
         * <p>The scheduling configurations.</p>
         */
        public Builder scheduleConfig(ScheduleConfig scheduleConfig) {
            String scheduleConfigShrink = shrink(scheduleConfig, "ScheduleConfig", "json");
            this.putQueryParameter("ScheduleConfig", scheduleConfigShrink);
            this.scheduleConfig = scheduleConfig;
            return this;
        }

        /**
         * <p>The template ID. If this parameter is not specified, the default template is used for moderation.</p>
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
         * <p>The video title, which can be up to 64 bytes in length.</p>
         * <blockquote>
         * <p> If this parameter is specified, the system checks the title specified by this parameter instead of the title of the input file specified by Media.</p>
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
         * <p>The user-defined data, which can be up to 128 bytes in length.</p>
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
             * <p>The input file. The file can be an OSS object or a media asset. You can specify the path of an OSS object in one of the following formats:</p>
             * <p>1. oss://bucket/object</p>
             * <p>2. http(s)://bucket.oss-[regionId].aliyuncs.com/object</p>
             * <p>In the preceding paths, bucket indicates an OSS bucket that resides in the same region as the current project, and object indicates the path of the object in the bucket.</p>
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
             * <p>OSS: OSS object.</p>
             * <p>Media: media asset.</p>
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
             * <p>The ID of the ApsaraVideo Media Processing (MPS) queue to which the job is submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>5246b8d12a62433ab77845074039****</p>
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * <p>The job priority. A larger value indicates a higher priority. Valid values: 1 to 10.</p>
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
