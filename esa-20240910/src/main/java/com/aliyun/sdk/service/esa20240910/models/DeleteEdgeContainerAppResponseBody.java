// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DeleteEdgeContainerAppResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteEdgeContainerAppResponseBody</p>
 */
public class DeleteEdgeContainerAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    private DeleteEdgeContainerAppResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEdgeContainerAppResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder {
        private String requestId; 
        private String state; 

        private Builder() {
        } 

        private Builder(DeleteEdgeContainerAppResponseBody model) {
            this.requestId = model.requestId;
            this.state = model.state;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Specifies whether the deletion is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public DeleteEdgeContainerAppResponseBody build() {
            return new DeleteEdgeContainerAppResponseBody(this);
        } 

    } 

}
