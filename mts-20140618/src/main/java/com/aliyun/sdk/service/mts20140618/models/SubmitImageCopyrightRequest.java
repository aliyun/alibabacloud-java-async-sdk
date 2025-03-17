// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

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
 * {@link SubmitImageCopyrightRequest} extends {@link RequestModel}
 *
 * <p>SubmitImageCopyrightRequest</p>
 */
public class SubmitImageCopyrightRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Message")
    @com.aliyun.core.annotation.Validation(required = true)
    private String message;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Output")
    private String output;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Params")
    private String params;

    private SubmitImageCopyrightRequest(Builder builder) {
        super(builder);
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
        private String message; 
        private String output; 
        private String params; 

        private Builder() {
            super();
        } 

        private Builder(SubmitImageCopyrightRequest request) {
            super(request);
            this.message = request.message;
            this.output = request.output;
            this.params = request.params;
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
         * Output.
         */
        public Builder output(String output) {
            this.putQueryParameter("Output", output);
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

        @Override
        public SubmitImageCopyrightRequest build() {
            return new SubmitImageCopyrightRequest(this);
        } 

    } 

}
