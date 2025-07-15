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
 * {@link UpdateMixStreamResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateMixStreamResponseBody</p>
 */
public class UpdateMixStreamResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MixStreamId")
    private String mixStreamId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateMixStreamResponseBody(Builder builder) {
        this.mixStreamId = builder.mixStreamId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMixStreamResponseBody create() {
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

        private Builder(UpdateMixStreamResponseBody model) {
            this.mixStreamId = model.mixStreamId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the stream mixing task. You can specify this parameter in a request to delete the stream mixing task or query stream mixing tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>5b2a046e-74d7-385e-d2d7-8a5b87e4****</p>
         */
        public Builder mixStreamId(String mixStreamId) {
            this.mixStreamId = mixStreamId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1A8CDDFF-0121-4ABB-DA60-AEF095A8W34F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateMixStreamResponseBody build() {
            return new UpdateMixStreamResponseBody(this);
        } 

    } 

}
