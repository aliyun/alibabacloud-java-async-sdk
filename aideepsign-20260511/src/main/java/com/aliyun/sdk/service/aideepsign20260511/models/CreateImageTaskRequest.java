// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aideepsign20260511.models;

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
 * {@link CreateImageTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateImageTaskRequest</p>
 */
public class CreateImageTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("N")
    private Integer n;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NegativePrompt")
    private String negativePrompt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Prompt")
    private String prompt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromptExtend")
    private Boolean promptExtend;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Seed")
    private Integer seed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Size")
    private String size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Watermark")
    private Boolean watermark;

    private CreateImageTaskRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.model = builder.model;
        this.n = builder.n;
        this.negativePrompt = builder.negativePrompt;
        this.prompt = builder.prompt;
        this.promptExtend = builder.promptExtend;
        this.seed = builder.seed;
        this.size = builder.size;
        this.watermark = builder.watermark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateImageTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return n
     */
    public Integer getN() {
        return this.n;
    }

    /**
     * @return negativePrompt
     */
    public String getNegativePrompt() {
        return this.negativePrompt;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return promptExtend
     */
    public Boolean getPromptExtend() {
        return this.promptExtend;
    }

    /**
     * @return seed
     */
    public Integer getSeed() {
        return this.seed;
    }

    /**
     * @return size
     */
    public String getSize() {
        return this.size;
    }

    /**
     * @return watermark
     */
    public Boolean getWatermark() {
        return this.watermark;
    }

    public static final class Builder extends Request.Builder<CreateImageTaskRequest, Builder> {
        private String clientToken; 
        private String model; 
        private Integer n; 
        private String negativePrompt; 
        private String prompt; 
        private Boolean promptExtend; 
        private Integer seed; 
        private String size; 
        private Boolean watermark; 

        private Builder() {
            super();
        } 

        private Builder(CreateImageTaskRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.model = request.model;
            this.n = request.n;
            this.negativePrompt = request.negativePrompt;
            this.prompt = request.prompt;
            this.promptExtend = request.promptExtend;
            this.seed = request.seed;
            this.size = request.size;
            this.watermark = request.watermark;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.putQueryParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * N.
         */
        public Builder n(Integer n) {
            this.putQueryParameter("N", n);
            this.n = n;
            return this;
        }

        /**
         * NegativePrompt.
         */
        public Builder negativePrompt(String negativePrompt) {
            this.putQueryParameter("NegativePrompt", negativePrompt);
            this.negativePrompt = negativePrompt;
            return this;
        }

        /**
         * Prompt.
         */
        public Builder prompt(String prompt) {
            this.putQueryParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * PromptExtend.
         */
        public Builder promptExtend(Boolean promptExtend) {
            this.putQueryParameter("PromptExtend", promptExtend);
            this.promptExtend = promptExtend;
            return this;
        }

        /**
         * Seed.
         */
        public Builder seed(Integer seed) {
            this.putQueryParameter("Seed", seed);
            this.seed = seed;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(String size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * Watermark.
         */
        public Builder watermark(Boolean watermark) {
            this.putQueryParameter("Watermark", watermark);
            this.watermark = watermark;
            return this;
        }

        @Override
        public CreateImageTaskRequest build() {
            return new CreateImageTaskRequest(this);
        } 

    } 

}
