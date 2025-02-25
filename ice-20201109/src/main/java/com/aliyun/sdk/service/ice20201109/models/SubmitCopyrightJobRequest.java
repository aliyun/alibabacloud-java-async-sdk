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
 * {@link SubmitCopyrightJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitCopyrightJobRequest</p>
 */
public class SubmitCopyrightJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Input")
    @com.aliyun.core.annotation.Validation(required = true)
    private Input input;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Level")
    private Long level;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Message")
    @com.aliyun.core.annotation.Validation(required = true)
    private String message;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Output")
    @com.aliyun.core.annotation.Validation(required = true)
    private Output output;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Params")
    private String params;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TotalTime")
    private String totalTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitCopyrightJobRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.input = builder.input;
        this.level = builder.level;
        this.message = builder.message;
        this.output = builder.output;
        this.params = builder.params;
        this.startTime = builder.startTime;
        this.totalTime = builder.totalTime;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitCopyrightJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return level
     */
    public Long getLevel() {
        return this.level;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return output
     */
    public Output getOutput() {
        return this.output;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return totalTime
     */
    public String getTotalTime() {
        return this.totalTime;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitCopyrightJobRequest, Builder> {
        private String description; 
        private Input input; 
        private Long level; 
        private String message; 
        private Output output; 
        private String params; 
        private String startTime; 
        private String totalTime; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitCopyrightJobRequest request) {
            super(request);
            this.description = request.description;
            this.input = request.input;
            this.level = request.level;
            this.message = request.message;
            this.output = request.output;
            this.params = request.params;
            this.startTime = request.startTime;
            this.totalTime = request.totalTime;
            this.userData = request.userData;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Bucket&quot;:&quot;example-bucket&quot;,&quot;Location&quot;:&quot;oss-cn-shanghai&quot;,&quot;Object&quot;:&quot;example.mp4&quot;}</p>
         */
        public Builder input(Input input) {
            String inputShrink = shrink(input, "Input", "json");
            this.putQueryParameter("Input", inputShrink);
            this.input = input;
            return this;
        }

        /**
         * Level.
         */
        public Builder level(Long level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder message(String message) {
            this.putQueryParameter("Message", message);
            this.message = message;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Bucket&quot;:&quot;example-bucket&quot;,&quot;Location&quot;:&quot;oss-cn-shanghai&quot;,&quot;Object&quot;:&quot;example_result.mp4&quot;}</p>
         */
        public Builder output(Output output) {
            String outputShrink = shrink(output, "Output", "json");
            this.putQueryParameter("Output", outputShrink);
            this.output = output;
            return this;
        }

        /**
         * Params.
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TotalTime.
         */
        public Builder totalTime(String totalTime) {
            this.putQueryParameter("TotalTime", totalTime);
            this.totalTime = totalTime;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitCopyrightJobRequest build() {
            return new SubmitCopyrightJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitCopyrightJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitCopyrightJobRequest</p>
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

            /**
             * <p>This parameter is required.</p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
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
     * {@link SubmitCopyrightJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitCopyrightJobRequest</p>
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

            /**
             * <p>This parameter is required.</p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
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
