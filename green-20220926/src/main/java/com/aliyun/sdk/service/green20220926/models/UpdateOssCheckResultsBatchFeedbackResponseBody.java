// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link UpdateOssCheckResultsBatchFeedbackResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateOssCheckResultsBatchFeedbackResponseBody</p>
 */
public class UpdateOssCheckResultsBatchFeedbackResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InvalidCount")
    private Integer invalidCount;

    @com.aliyun.core.annotation.NameInMap("RepeatCount")
    private Integer repeatCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuccessCount")
    private Integer successCount;

    @com.aliyun.core.annotation.NameInMap("Tips")
    private String tips;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private UpdateOssCheckResultsBatchFeedbackResponseBody(Builder builder) {
        this.invalidCount = builder.invalidCount;
        this.repeatCount = builder.repeatCount;
        this.requestId = builder.requestId;
        this.successCount = builder.successCount;
        this.tips = builder.tips;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOssCheckResultsBatchFeedbackResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return invalidCount
     */
    public Integer getInvalidCount() {
        return this.invalidCount;
    }

    /**
     * @return repeatCount
     */
    public Integer getRepeatCount() {
        return this.repeatCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successCount
     */
    public Integer getSuccessCount() {
        return this.successCount;
    }

    /**
     * @return tips
     */
    public String getTips() {
        return this.tips;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer invalidCount; 
        private Integer repeatCount; 
        private String requestId; 
        private Integer successCount; 
        private String tips; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(UpdateOssCheckResultsBatchFeedbackResponseBody model) {
            this.invalidCount = model.invalidCount;
            this.repeatCount = model.repeatCount;
            this.requestId = model.requestId;
            this.successCount = model.successCount;
            this.tips = model.tips;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The number of invalid items.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder invalidCount(Integer invalidCount) {
            this.invalidCount = invalidCount;
            return this;
        }

        /**
         * <p>The number of duplicate items.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder repeatCount(Integer repeatCount) {
            this.repeatCount = repeatCount;
            return this;
        }

        /**
         * <p>The ID assigned by the backend to uniquely identify a request. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of successful items.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder successCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }

        /**
         * <p>The prompt information.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx</p>
         */
        public Builder tips(String tips) {
            this.tips = tips;
            return this;
        }

        /**
         * <p>The total count.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public UpdateOssCheckResultsBatchFeedbackResponseBody build() {
            return new UpdateOssCheckResultsBatchFeedbackResponseBody(this);
        } 

    } 

}
