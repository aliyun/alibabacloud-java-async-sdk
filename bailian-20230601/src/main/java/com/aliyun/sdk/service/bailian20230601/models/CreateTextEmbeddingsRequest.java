// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTextEmbeddingsRequest} extends {@link RequestModel}
 *
 * <p>CreateTextEmbeddingsRequest</p>
 */
public class CreateTextEmbeddingsRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("Input")
    private java.util.List < String > input;

    @Query
    @NameInMap("TextType")
    private String textType;

    private CreateTextEmbeddingsRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.input = builder.input;
        this.textType = builder.textType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTextEmbeddingsRequest create() {
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
     * @return input
     */
    public java.util.List < String > getInput() {
        return this.input;
    }

    /**
     * @return textType
     */
    public String getTextType() {
        return this.textType;
    }

    public static final class Builder extends Request.Builder<CreateTextEmbeddingsRequest, Builder> {
        private String agentKey; 
        private java.util.List < String > input; 
        private String textType; 

        private Builder() {
            super();
        } 

        private Builder(CreateTextEmbeddingsRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.input = request.input;
            this.textType = request.textType;
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
         * Input.
         */
        public Builder input(java.util.List < String > input) {
            String inputShrink = shrink(input, "Input", "json");
            this.putQueryParameter("Input", inputShrink);
            this.input = input;
            return this;
        }

        /**
         * TextType.
         */
        public Builder textType(String textType) {
            this.putQueryParameter("TextType", textType);
            this.textType = textType;
            return this;
        }

        @Override
        public CreateTextEmbeddingsRequest build() {
            return new CreateTextEmbeddingsRequest(this);
        } 

    } 

}
