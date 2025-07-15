// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link CreateMixStreamResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMixStreamResponseBody</p>
 */
public class CreateMixStreamResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MixStreamId")
    private String mixStreamId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateMixStreamResponseBody(Builder builder) {
        this.mixStreamId = builder.mixStreamId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMixStreamResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mixStreamId
     */
    public String getMixStreamId() {
        return this.mixStreamId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String mixStreamId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateMixStreamResponseBody model) {
            this.mixStreamId = model.mixStreamId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the stream mixing task. You can specify this parameter in a request to delete the stream mixing task or query stream mixing tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>5b2a046e-74d7-385e-253f-8a5b87e4****</p>
         */
        public Builder mixStreamId(String mixStreamId) {
            this.mixStreamId = mixStreamId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0D715397-2E66-4AE1-694h-C546628AD145</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateMixStreamResponseBody build() {
            return new CreateMixStreamResponseBody(this);
        } 

    } 

}
