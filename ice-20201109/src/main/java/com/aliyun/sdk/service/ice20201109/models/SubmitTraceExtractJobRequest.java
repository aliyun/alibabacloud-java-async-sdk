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
 * {@link SubmitTraceExtractJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitTraceExtractJobRequest</p>
 */
public class SubmitTraceExtractJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Input")
    @com.aliyun.core.annotation.Validation(required = true)
    private Input input;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Params")
    private String params;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitTraceExtractJobRequest(Builder builder) {
        super(builder);
        this.input = builder.input;
        this.params = builder.params;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitTraceExtractJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return input
     */
    public Input getInput() {
        return this.input;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitTraceExtractJobRequest, Builder> {
        private Input input; 
        private String params; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitTraceExtractJobRequest request) {
            super(request);
            this.input = request.input;
            this.params = request.params;
            this.userData = request.userData;
        } 

        /**
         * <p>The input video from which to extract the watermark.</p>
         * <blockquote>
         * <ul>
         * <li>The OSS object or media asset must be in the same region as your IMS service.</li>
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
         * <p>Extraction job parameters, specified as a JSON string. The following parameters are supported:</p>
         * <ul>
         * <li><p><code>m3u8Type</code>: The algorithm type. The default value is <code>v1</code>.</p>
         * <ul>
         * <li><p><code>v1</code>: Extracts an m3u8 playlist with absolute paths.</p>
         * </li>
         * <li><p><code>v2</code>: Extracts an m3u8 playlist with relative paths.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;m3u8Type&quot;:&quot;v1&quot;}</p>
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * <p>The user-defined data. Maximum length: 1,024 bytes.</p>
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
        public SubmitTraceExtractJobRequest build() {
            return new SubmitTraceExtractJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitTraceExtractJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitTraceExtractJobRequest</p>
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
             * <p>The input source. Specify an OSS object URL or a media asset ID.</p>
             * <p>An OSS object URL can be in one of the following formats:</p>
             * <p>1\. oss\://bucket/object</p>
             * <p>In these formats, <code>bucket</code> is the name of an OSS bucket in the same region as your IMS service, and <code>object</code> is the path of the OSS object.</p>
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
             * <p>The input type. Valid values:</p>
             * <ul>
             * <li><p>OSS: An OSS object URL.</p>
             * </li>
             * <li><p>Media: A media asset ID.</p>
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

            public Input build() {
                return new Input(this);
            } 

        } 

    }
}
