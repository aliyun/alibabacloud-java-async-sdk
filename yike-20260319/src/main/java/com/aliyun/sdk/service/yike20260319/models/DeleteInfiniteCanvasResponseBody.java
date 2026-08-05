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
 * {@link DeleteInfiniteCanvasResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteInfiniteCanvasResponseBody</p>
 */
public class DeleteInfiniteCanvasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CanvasId")
    private String canvasId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteInfiniteCanvasResponseBody(Builder builder) {
        this.canvasId = builder.canvasId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInfiniteCanvasResponseBody create() {
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

        private Builder(DeleteInfiniteCanvasResponseBody model) {
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

        public DeleteInfiniteCanvasResponseBody build() {
            return new DeleteInfiniteCanvasResponseBody(this);
        } 

    } 

}
