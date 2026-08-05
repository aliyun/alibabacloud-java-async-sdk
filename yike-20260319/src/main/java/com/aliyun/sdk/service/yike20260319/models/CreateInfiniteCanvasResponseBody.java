// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260319.models;

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
 * {@link CreateInfiniteCanvasResponseBody} extends {@link TeaModel}
 *
 * <p>CreateInfiniteCanvasResponseBody</p>
 */
public class CreateInfiniteCanvasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CanvasId")
    private String canvasId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateInfiniteCanvasResponseBody(Builder builder) {
        this.canvasId = builder.canvasId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInfiniteCanvasResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return canvasId
     */
    public String getCanvasId() {
        return this.canvasId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String canvasId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateInfiniteCanvasResponseBody model) {
            this.canvasId = model.canvasId;
            this.requestId = model.requestId;
        } 

        /**
         * CanvasId.
         */
        public Builder canvasId(String canvasId) {
            this.canvasId = canvasId;
            return this;
        }

        /**
         * <p>RequestId</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateInfiniteCanvasResponseBody build() {
            return new CreateInfiniteCanvasResponseBody(this);
        } 

    } 

}
