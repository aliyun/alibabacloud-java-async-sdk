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
 * {@link MediaConvertOutputDetail} extends {@link TeaModel}
 *
 * <p>MediaConvertOutputDetail</p>
 */
public class MediaConvertOutputDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("FinishTime")
    private String finishTime;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private MediaConvertOutputDetail(Builder builder) {
        this.code = builder.code;
        this.createTime = builder.createTime;
        this.finishTime = builder.finishTime;
        this.message = builder.message;
        this.name = builder.name;
        this.result = builder.result;
        this.status = builder.status;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MediaConvertOutputDetail create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return finishTime
     */
    public String getFinishTime() {
        return this.finishTime;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String code; 
        private String createTime; 
        private String finishTime; 
        private String message; 
        private String name; 
        private Result result; 
        private String status; 
        private String taskId; 

        private Builder() {
        } 

        private Builder(MediaConvertOutputDetail model) {
            this.code = model.code;
            this.createTime = model.createTime;
            this.finishTime = model.finishTime;
            this.message = model.message;
            this.name = model.name;
            this.result = model.result;
            this.status = model.status;
            this.taskId = model.taskId;
        } 

        /**
         * <p>The error code for a transcoding failure.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter.ResourceContentBad</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The time when the output was created. The time is displayed in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-07T06:06:58Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The time when the output was completed. The time is displayed in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-07T13:01:07Z</p>
         */
        public Builder finishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }

        /**
         * <p>The detailed cause of the transcoding failure.</p>
         * 
         * <strong>example:</strong>
         * <p>The resource operated InputFile is bad</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The name of the transcoding output.</p>
         * 
         * <strong>example:</strong>
         * <p>720P-mp4</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The details of the output result.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>Init: Initialized.</li>
         * <li>Scheduled: Scheduled.</li>
         * <li>Success: Succeeded.</li>
         * <li>Failed: Failed.</li>
         * <li>Skipped: Skipped.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the transcoding output task.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>4215e042b3966ca5441e</strong></strong></strong></p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public MediaConvertOutputDetail build() {
            return new MediaConvertOutputDetail(this);
        } 

    } 

    /**
     * 
     * {@link MediaConvertOutputDetail} extends {@link TeaModel}
     *
     * <p>MediaConvertOutputDetail</p>
     */
    public static class OutputFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Media")
        private String media;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private OutputFile(Builder builder) {
            this.media = builder.media;
            this.type = builder.type;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputFile create() {
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

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String media; 
            private String type; 
            private String url; 

            private Builder() {
            } 

            private Builder(OutputFile model) {
                this.media = model.media;
                this.type = model.type;
                this.url = model.url;
            } 

            /**
             * <p>The media value.</p>
             * <ul>
             * <li>When Type is set to OSS, the URL supports the OSS and HTTP protocols.</li>
             * <li>When Type is set to Media, the value is the media asset ID.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket/path/to/video.mp4</p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>The media object type. Valid values:</p>
             * <ul>
             * <li>OSS: OSS file.</li>
             * <li>Media: Media asset ID.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The actual file URL when Type is set to Media.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket/path/to/video.mp4</p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public OutputFile build() {
                return new OutputFile(this);
            } 

        } 

    }
    /**
     * 
     * {@link MediaConvertOutputDetail} extends {@link TeaModel}
     *
     * <p>MediaConvertOutputDetail</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OutFileMeta")
        private MediaConvertOutputDetailFileMeta outFileMeta;

        @com.aliyun.core.annotation.NameInMap("OutputFile")
        private OutputFile outputFile;

        private Result(Builder builder) {
            this.outFileMeta = builder.outFileMeta;
            this.outputFile = builder.outputFile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return outFileMeta
         */
        public MediaConvertOutputDetailFileMeta getOutFileMeta() {
            return this.outFileMeta;
        }

        /**
         * @return outputFile
         */
        public OutputFile getOutputFile() {
            return this.outputFile;
        }

        public static final class Builder {
            private MediaConvertOutputDetailFileMeta outFileMeta; 
            private OutputFile outputFile; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.outFileMeta = model.outFileMeta;
                this.outputFile = model.outputFile;
            } 

            /**
             * <p>The metadata of the audio and video streams.</p>
             */
            public Builder outFileMeta(MediaConvertOutputDetailFileMeta outFileMeta) {
                this.outFileMeta = outFileMeta;
                return this;
            }

            /**
             * <p>The details of the output file.</p>
             */
            public Builder outputFile(OutputFile outputFile) {
                this.outputFile = outputFile;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
