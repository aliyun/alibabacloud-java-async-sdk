// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link CreateStageModelResponseBody} extends {@link TeaModel}
 *
 * <p>CreateStageModelResponseBody</p>
 */
public class CreateStageModelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StageModelId")
    private String stageModelId;

    private CreateStageModelResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.stageModelId = builder.stageModelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStageModelResponseBody create() {
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
     * @return stageModelId
     */
    public String getStageModelId() {
        return this.stageModelId;
    }

    public static final class Builder {
        private String requestId; 
        private String stageModelId; 

        private Builder() {
        } 

        private Builder(CreateStageModelResponseBody model) {
            this.requestId = model.requestId;
            this.stageModelId = model.stageModelId;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StageModelId.
         */
        public Builder stageModelId(String stageModelId) {
            this.stageModelId = stageModelId;
            return this;
        }

        public CreateStageModelResponseBody build() {
            return new CreateStageModelResponseBody(this);
        } 

    } 

}
