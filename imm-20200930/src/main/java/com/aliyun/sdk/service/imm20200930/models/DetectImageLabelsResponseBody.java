// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link DetectImageLabelsResponseBody} extends {@link TeaModel}
 *
 * <p>DetectImageLabelsResponseBody</p>
 */
public class DetectImageLabelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Label> labels;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DetectImageLabelsResponseBody(Builder builder) {
        this.labels = builder.labels;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectImageLabelsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return labels
     */
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Label> labels; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DetectImageLabelsResponseBody model) {
            this.labels = model.labels;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of labels detected.</p>
         */
        public Builder labels(java.util.List<Label> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>91AC8C98-0F36-49D2-8290-742E24DF1F69</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DetectImageLabelsResponseBody build() {
            return new DetectImageLabelsResponseBody(this);
        } 

    } 

}
