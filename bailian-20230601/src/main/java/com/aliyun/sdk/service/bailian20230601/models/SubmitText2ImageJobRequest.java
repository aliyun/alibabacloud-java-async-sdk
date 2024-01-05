// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitText2ImageJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitText2ImageJobRequest</p>
 */
public class SubmitText2ImageJobRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("N")
    private Integer n;

    @Query
    @NameInMap("NegativePrompt")
    private String negativePrompt;

    @Query
    @NameInMap("Prompt")
    @Validation(required = true)
    private String prompt;

    @Query
    @NameInMap("Seed")
    private Integer seed;

    @Query
    @NameInMap("Size")
    private String size;

    @Query
    @NameInMap("Style")
    private String style;

    private SubmitText2ImageJobRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.appId = builder.appId;
        this.n = builder.n;
        this.negativePrompt = builder.negativePrompt;
        this.prompt = builder.prompt;
        this.seed = builder.seed;
        this.size = builder.size;
        this.style = builder.style;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitText2ImageJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
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
     * @return style
     */
    public String getStyle() {
        return this.style;
    }

    public static final class Builder extends Request.Builder<SubmitText2ImageJobRequest, Builder> {
        private String agentKey; 
        private String appId; 
        private Integer n; 
        private String negativePrompt; 
        private String prompt; 
        private Integer seed; 
        private String size; 
        private String style; 

        private Builder() {
            super();
        } 

        private Builder(SubmitText2ImageJobRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.appId = request.appId;
            this.n = request.n;
            this.negativePrompt = request.negativePrompt;
            this.prompt = request.prompt;
            this.seed = request.seed;
            this.size = request.size;
            this.style = request.style;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
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
         * Style.
         */
        public Builder style(String style) {
            this.putQueryParameter("Style", style);
            this.style = style;
            return this;
        }

        @Override
        public SubmitText2ImageJobRequest build() {
            return new SubmitText2ImageJobRequest(this);
        } 

    } 

}
