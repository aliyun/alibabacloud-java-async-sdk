// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link ListFeaturesResponseBody} extends {@link TeaModel}
 *
 * <p>ListFeaturesResponseBody</p>
 */
public class ListFeaturesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Features")
    private java.util.List<String> features;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListFeaturesResponseBody(Builder builder) {
        this.features = builder.features;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFeaturesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return features
     */
    public java.util.List<String> getFeatures() {
        return this.features;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<String> features; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListFeaturesResponseBody model) {
            this.features = model.features;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Features.
         */
        public Builder features(java.util.List<String> features) {
            this.features = features;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListFeaturesResponseBody build() {
            return new ListFeaturesResponseBody(this);
        } 

    } 

}
