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
 * {@link DeleteMixStreamResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteMixStreamResponseBody</p>
 */
public class DeleteMixStreamResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MixStreamId")
    private String mixStreamId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteMixStreamResponseBody(Builder builder) {
        this.mixStreamId = builder.mixStreamId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMixStreamResponseBody create() {
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

        private Builder(DeleteMixStreamResponseBody model) {
            this.mixStreamId = model.mixStreamId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the stream mixing task.</p>
         * 
         * <strong>example:</strong>
         * <p>749b7594-86d6-37b1-513b-e1e19845****</p>
         */
        public Builder mixStreamId(String mixStreamId) {
            this.mixStreamId = mixStreamId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BE9407FF-F897-4DBD-338D-98A750AD805F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteMixStreamResponseBody build() {
            return new DeleteMixStreamResponseBody(this);
        } 

    } 

}
