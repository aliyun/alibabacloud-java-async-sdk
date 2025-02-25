// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cd2021127.models;

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
 * {@link BaiLianSseChatRequest} extends {@link RequestModel}
 *
 * <p>BaiLianSseChatRequest</p>
 */
public class BaiLianSseChatRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Input")
    private Input input;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private Parameters parameters;

    private BaiLianSseChatRequest(Builder builder) {
        super(builder);
        this.input = builder.input;
        this.parameters = builder.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BaiLianSseChatRequest create() {
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
     * @return parameters
     */
    public Parameters getParameters() {
        return this.parameters;
    }

    public static final class Builder extends Request.Builder<BaiLianSseChatRequest, Builder> {
        private Input input; 
        private Parameters parameters; 

        private Builder() {
            super();
        } 

        private Builder(BaiLianSseChatRequest request) {
            super(request);
            this.input = request.input;
            this.parameters = request.parameters;
        } 

        /**
         * Input.
         */
        public Builder input(Input input) {
            String inputShrink = shrink(input, "Input", "json");
            this.putBodyParameter("Input", inputShrink);
            this.input = input;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(Parameters parameters) {
            String parametersShrink = shrink(parameters, "Parameters", "json");
            this.putBodyParameter("Parameters", parametersShrink);
            this.parameters = parameters;
            return this;
        }

        @Override
        public BaiLianSseChatRequest build() {
            return new BaiLianSseChatRequest(this);
        } 

    } 

    /**
     * 
     * {@link BaiLianSseChatRequest} extends {@link TeaModel}
     *
     * <p>BaiLianSseChatRequest</p>
     */
    public static class Images extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Images(Builder builder) {
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Images create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String type; 
            private String value; 

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
    /**
     * 
     * {@link BaiLianSseChatRequest} extends {@link TeaModel}
     *
     * <p>BaiLianSseChatRequest</p>
     */
    public static class BizParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Images")
        private java.util.List<Images> images;

        private BizParams(Builder builder) {
            this.images = builder.images;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizParams create() {
            return builder().build();
        }

        /**
         * @return images
         */
        public java.util.List<Images> getImages() {
            return this.images;
        }

        public static final class Builder {
            private java.util.List<Images> images; 

            /**
             * Images.
             */
            public Builder images(java.util.List<Images> images) {
                this.images = images;
                return this;
            }

            public BizParams build() {
                return new BizParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link BaiLianSseChatRequest} extends {@link TeaModel}
     *
     * <p>BaiLianSseChatRequest</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizParams")
        private BizParams bizParams;

        @com.aliyun.core.annotation.NameInMap("Prompt")
        private String prompt;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        private Input(Builder builder) {
            this.bizParams = builder.bizParams;
            this.prompt = builder.prompt;
            this.requestId = builder.requestId;
            this.sessionId = builder.sessionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return bizParams
         */
        public BizParams getBizParams() {
            return this.bizParams;
        }

        /**
         * @return prompt
         */
        public String getPrompt() {
            return this.prompt;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        public static final class Builder {
            private BizParams bizParams; 
            private String prompt; 
            private String requestId; 
            private String sessionId; 

            /**
             * BizParams.
             */
            public Builder bizParams(BizParams bizParams) {
                this.bizParams = bizParams;
                return this;
            }

            /**
             * Prompt.
             */
            public Builder prompt(String prompt) {
                this.prompt = prompt;
                return this;
            }

            /**
             * RequestId.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * SessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    /**
     * 
     * {@link BaiLianSseChatRequest} extends {@link TeaModel}
     *
     * <p>BaiLianSseChatRequest</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Incremental_output")
        private Boolean incrementalOutput;

        @com.aliyun.core.annotation.NameInMap("vendorId")
        private String vendorId;

        private Parameters(Builder builder) {
            this.incrementalOutput = builder.incrementalOutput;
            this.vendorId = builder.vendorId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return incrementalOutput
         */
        public Boolean getIncrementalOutput() {
            return this.incrementalOutput;
        }

        /**
         * @return vendorId
         */
        public String getVendorId() {
            return this.vendorId;
        }

        public static final class Builder {
            private Boolean incrementalOutput; 
            private String vendorId; 

            /**
             * Incremental_output.
             */
            public Builder incrementalOutput(Boolean incrementalOutput) {
                this.incrementalOutput = incrementalOutput;
                return this;
            }

            /**
             * vendorId.
             */
            public Builder vendorId(String vendorId) {
                this.vendorId = vendorId;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
}
