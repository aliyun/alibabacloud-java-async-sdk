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
    @NameInMap("Level")
    private Long level;

    @Body
    @NameInMap("Message")
    @Validation(required = true)
    private String message;

    @Body
    @NameInMap("Output")
    private String output;

    @Body
    @NameInMap("Params")
    private String params;

    private SubmitImageCopyrightRequest(Builder builder) {
        super(builder);
        this.level = builder.level;
        this.message = builder.message;
        this.output = builder.output;
        this.params = builder.params;
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
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    public static final class Builder extends Request.Builder<SubmitImageCopyrightRequest, Builder> {
        private Long level; 
        private String message; 
        private String output; 
        private String params; 

        private Builder() {
            super();
        } 

        private Builder(SubmitImageCopyrightRequest request) {
            super(request);
            this.level = request.level;
            this.message = request.message;
            this.output = request.output;
            this.params = request.params;
        } 

        /**
         * Level.
         */
        public Builder level(Long level) {
            this.putBodyParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.putBodyParameter("Message", message);
            this.message = message;
            return this;
        }

        /**
         * Output.
         */
        public Builder output(String output) {
            this.putBodyParameter("Output", output);
            this.output = output;
            return this;
        }

        /**
         * Params.
         */
        public Builder params(String params) {
            this.putBodyParameter("Params", params);
            this.params = params;
            return this;
        }

        @Override
        public SubmitImageCopyrightRequest build() {
            return new SubmitImageCopyrightRequest(this);
        } 

    } 

}
