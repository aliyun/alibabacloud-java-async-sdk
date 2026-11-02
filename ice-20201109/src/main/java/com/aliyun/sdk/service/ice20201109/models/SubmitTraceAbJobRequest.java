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
 * {@link SubmitTraceAbJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitTraceAbJobRequest</p>
 */
public class SubmitTraceAbJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CipherBase64ed")
    private String cipherBase64ed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Input")
    @com.aliyun.core.annotation.Validation(required = true)
    private Input input;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Level")
    private Long level;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Output")
    @com.aliyun.core.annotation.Validation(required = true)
    private Output output;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TotalTime")
    private Long totalTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitTraceAbJobRequest(Builder builder) {
        super(builder);
        this.cipherBase64ed = builder.cipherBase64ed;
        this.input = builder.input;
        this.level = builder.level;
        this.output = builder.output;
        this.startTime = builder.startTime;
        this.totalTime = builder.totalTime;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitTraceAbJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cipherBase64ed
     */
    public String getCipherBase64ed() {
        return this.cipherBase64ed;
    }

    /**
     * @return input
     */
    public Input getInput() {
        return this.input;
    }

    /**
     * @return level
     */
    public Long getLevel() {
        return this.level;
    }

    /**
     * @return output
     */
    public Output getOutput() {
        return this.output;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return totalTime
     */
    public Long getTotalTime() {
        return this.totalTime;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitTraceAbJobRequest, Builder> {
        private String cipherBase64ed; 
        private Input input; 
        private Long level; 
        private Output output; 
        private Long startTime; 
        private Long totalTime; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitTraceAbJobRequest request) {
            super(request);
            this.cipherBase64ed = request.cipherBase64ed;
            this.input = request.input;
            this.level = request.level;
            this.output = request.output;
            this.startTime = request.startTime;
            this.totalTime = request.totalTime;
            this.userData = request.userData;
        } 

        /**
         * <p>The Base64-encoded encryption key.</p>
         * 
         * <strong>example:</strong>
         * <p>Qh6OdgIMcliQSI1fReOw****</p>
         */
        public Builder cipherBase64ed(String cipherBase64ed) {
            this.putQueryParameter("CipherBase64ed", cipherBase64ed);
            this.cipherBase64ed = cipherBase64ed;
            return this;
        }

        /**
         * <p>The input video for the A/B stream forensic watermarking job.</p>
         * <blockquote>
         * <ul>
         * <li><p>The Object Storage Service (OSS) file or media asset must be in the same region where Intelligent Media Services (IMS) is deployed.</p>
         * </li>
         * <li><p>This operation supports only videos that are three minutes or longer. Using a shorter video may cause the API call to fail or produce no output.</p>
         * </li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        public Builder input(Input input) {
            String inputShrink = shrink(input, "Input", "json");
            this.putQueryParameter("Input", inputShrink);
            this.input = input;
            return this;
        }

        /**
         * <p>The watermark level, which specifies the embedding channel. Valid values: <code>0</code> (U channel), <code>1</code> (UV channels), and <code>2</code> (YUV channels).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder level(Long level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * <p>The output location for the A/B stream job. This must be an OSS directory.</p>
         * <p>This parameter is required.</p>
         */
        public Builder output(Output output) {
            String outputShrink = shrink(output, "Output", "json");
            this.putQueryParameter("Output", outputShrink);
            this.output = output;
            return this;
        }

        /**
         * <p>The start time for watermark embedding, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The total duration for watermark embedding, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>360</p>
         */
        public Builder totalTime(Long totalTime) {
            this.putQueryParameter("TotalTime", totalTime);
            this.totalTime = totalTime;
            return this;
        }

        /**
         * <p>User data to include in the request. The maximum length is 1,024 bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitTraceAbJobRequest build() {
            return new SubmitTraceAbJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitTraceAbJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitTraceAbJobRequest</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Media")
        @com.aliyun.core.annotation.Validation(required = true)
        private String media;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The location of the input file. This can be an OSS URL or a media asset ID.
             * The supported OSS URL formats are:</p>
             * <p>1\. <code>oss://&lt;bucket&gt;/&lt;object&gt;</code></p>
             * <p>2\. <code>http(s)://&lt;bucket&gt;.oss-[regionId].aliyuncs.com/&lt;object&gt;</code></p>
             * <p>In these formats, <code>&lt;bucket&gt;</code> is the name of the OSS bucket, which must be in the same region as your project, and <code>&lt;object&gt;</code> is the path to the file.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket/object</p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>The type of the input file. Valid values:</p>
             * <ol>
             * <li><p><code>OSS</code>: The file is specified by an OSS URL.</p>
             * </li>
             * <li><p><code>Media</code>: The file is specified by a media asset ID.</p>
             * </li>
             * </ol>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
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
     * {@link SubmitTraceAbJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitTraceAbJobRequest</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Media")
        @com.aliyun.core.annotation.Validation(required = true)
        private String media;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Output(Builder builder) {
            this.media = builder.media;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
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

            private Builder(Output model) {
                this.media = model.media;
                this.type = model.type;
            } 

            /**
             * <p>The output path. Specify an OSS directory URL or a media asset ID. If you specify an OSS URL, use one of the following formats for the output directory:</p>
             * <p>1\. <code>oss://&lt;bucket&gt;/&lt;dir&gt;/</code></p>
             * <p>2\. <code>http(s)://&lt;bucket&gt;.oss-[regionId].aliyuncs.com/&lt;dir&gt;/</code></p>
             * <p>In these formats, <code>&lt;bucket&gt;</code> is the name of the OSS bucket, which must be in the same region as your project, and <code>&lt;dir&gt;</code> is the output directory path.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket/dir/</p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>The type of the output object.
             * Valid values:</p>
             * <ul>
             * <li><p><code>OSS</code>: An OSS object.</p>
             * </li>
             * <li><p><code>Media</code>: A media asset ID.</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Output build() {
                return new Output(this);
            } 

        } 

    }
}
