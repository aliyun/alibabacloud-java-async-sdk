// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20210728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitImageCopyrightRequest} extends {@link RequestModel}
 *
 * <p>SubmitImageCopyrightRequest</p>
 */
public class SubmitImageCopyrightRequest extends Request {
    @Body
    @NameInMap("Input")
    private String input;

    @Body
    @NameInMap("Level")
    @Validation(required = true)
    private Long level;

    @Body
    @NameInMap("Message")
    @Validation(required = true)
    private String message;

    @Body
    @NameInMap("Output")
    private String output;

    @Body
    @NameInMap("Url")
    private String url;

    private SubmitImageCopyrightRequest(Builder builder) {
        super(builder);
        this.input = builder.input;
        this.level = builder.level;
        this.message = builder.message;
        this.output = builder.output;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitImageCopyrightRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return input
     */
    public String getInput() {
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
    public String getOutput() {
        return this.output;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<SubmitImageCopyrightRequest, Builder> {
        private String input; 
        private Long level; 
        private String message; 
        private String output; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(SubmitImageCopyrightRequest request) {
            super(request);
            this.input = request.input;
            this.level = request.level;
            this.message = request.message;
            this.output = request.output;
            this.url = request.url;
        } 

        /**
         * 需要加水印的图片oss地址(Input和url二选一)
         */
        public Builder input(String input) {
            this.putBodyParameter("Input", input);
            this.input = input;
            return this;
        }

        /**
         * 水印强度
         */
        public Builder level(Long level) {
            this.putBodyParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * 水印信息
         */
        public Builder message(String message) {
            this.putBodyParameter("Message", message);
            this.message = message;
            return this;
        }

        /**
         * 水印图片输出oss地址
         */
        public Builder output(String output) {
            this.putBodyParameter("Output", output);
            this.output = output;
            return this;
        }

        /**
         * 外部url链接(Input和url二选一)
         */
        public Builder url(String url) {
            this.putBodyParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public SubmitImageCopyrightRequest build() {
            return new SubmitImageCopyrightRequest(this);
        } 

    } 

}
