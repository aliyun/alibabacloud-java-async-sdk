// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link IllustrationTaskResult} extends {@link TeaModel}
 *
 * <p>IllustrationTaskResult</p>
 */
public class IllustrationTaskResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("illustrationTask")
    private IllustrationTask illustrationTask;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private IllustrationTaskResult(Builder builder) {
        this.illustrationTask = builder.illustrationTask;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IllustrationTaskResult create() {
        return builder().build();
    }

    /**
     * @return illustrationTask
     */
    public IllustrationTask getIllustrationTask() {
        return this.illustrationTask;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private IllustrationTask illustrationTask; 
        private String requestId; 

        /**
         * illustrationTask.
         */
        public Builder illustrationTask(IllustrationTask illustrationTask) {
            this.illustrationTask = illustrationTask;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public IllustrationTaskResult build() {
            return new IllustrationTaskResult(this);
        } 

    } 

}
