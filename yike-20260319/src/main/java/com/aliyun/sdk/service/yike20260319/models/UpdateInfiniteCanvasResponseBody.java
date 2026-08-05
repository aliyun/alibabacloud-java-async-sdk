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
 * {@link UpdateInfiniteCanvasResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateInfiniteCanvasResponseBody</p>
 */
public class UpdateInfiniteCanvasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CanvasId")
    private String canvasId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateInfiniteCanvasResponseBody(Builder builder) {
        this.canvasId = builder.canvasId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInfiniteCanvasResponseBody create() {
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

        private Builder(UpdateInfiniteCanvasResponseBody model) {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateInfiniteCanvasResponseBody build() {
            return new UpdateInfiniteCanvasResponseBody(this);
        } 

    } 

}
