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
 * {@link SubmitCopyrightExtractJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitCopyrightExtractJobRequest</p>
 */
public class SubmitCopyrightExtractJobRequest extends Request {
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

    private SubmitCopyrightExtractJobRequest(Builder builder) {
        super(builder);
        this.input = builder.input;
        this.params = builder.params;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitCopyrightExtractJobRequest create() {
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

    public static final class Builder extends Request.Builder<SubmitCopyrightExtractJobRequest, Builder> {
        private Input input; 
        private String params; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitCopyrightExtractJobRequest request) {
            super(request);
            this.input = request.input;
            this.params = request.params;
            this.userData = request.userData;
        } 

        /**
         * <p>The video file from which the watermark is to be extracted.</p>
         * <blockquote>
         * <ul>
         * <li>The region of the OSS file or media asset must be the same as the region of the current IMS instance.</li>
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
         * <p>The watermark job parameters in JSON string format. The following parameters are supported:</p>
         * <ul>
         * <li><p>algoType: the algorithm type. Default value: v1. The extraction algorithm type must be the same as the algorithm type used for embedding.</p>
         * <ul>
         * <li>v1: the copyright extraction API operation for long videos.</li>
         * <li>v2: the copyright extraction API operation for short videos.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;algoType&quot;:&quot;v2&quot;}</p>
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * <p>The custom user data. The maximum length is 1,024 bytes.</p>
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
        public SubmitCopyrightExtractJobRequest build() {
            return new SubmitCopyrightExtractJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitCopyrightExtractJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitCopyrightExtractJobRequest</p>
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
             * <p>The information about the input file. Both OSS URLs and media asset IDs are supported.
             * The OSS URL must be in one of the following formats:</p>
             * <ol>
             * <li><p>oss://bucket/object</p>
             * </li>
             * <li><p>http(s)://bucket.oss-[regionId].aliyuncs.com/object</p>
             * </li>
             * </ol>
             * <p>where bucket is the name of the OSS bucket that resides in the same region as the current project, and object is the file path.</p>
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
             * <ul>
             * <li>OSS: the URL of an OSS file.</li>
             * <li>Media: the ID of a media asset.</li>
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
