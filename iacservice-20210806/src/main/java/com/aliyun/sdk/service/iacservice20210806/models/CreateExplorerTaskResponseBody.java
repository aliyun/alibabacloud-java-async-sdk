// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link CreateExplorerTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateExplorerTaskResponseBody</p>
 */
public class CreateExplorerTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("explorerTaskId")
    private String explorerTaskId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateExplorerTaskResponseBody(Builder builder) {
        this.explorerTaskId = builder.explorerTaskId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExplorerTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return explorerTaskId
     */
    public String getExplorerTaskId() {
        return this.explorerTaskId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String explorerTaskId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateExplorerTaskResponseBody model) {
            this.explorerTaskId = model.explorerTaskId;
            this.requestId = model.requestId;
        } 

        /**
         * explorerTaskId.
         */
        public Builder explorerTaskId(String explorerTaskId) {
            this.explorerTaskId = explorerTaskId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateExplorerTaskResponseBody build() {
            return new CreateExplorerTaskResponseBody(this);
        } 

    } 

}
