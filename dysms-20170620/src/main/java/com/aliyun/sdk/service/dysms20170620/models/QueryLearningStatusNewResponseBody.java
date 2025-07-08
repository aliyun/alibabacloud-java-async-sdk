// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link QueryLearningStatusNewResponseBody} extends {@link TeaModel}
 *
 * <p>QueryLearningStatusNewResponseBody</p>
 */
public class QueryLearningStatusNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LearningStatus")
    private String learningStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryLearningStatusNewResponseBody(Builder builder) {
        this.learningStatus = builder.learningStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryLearningStatusNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return learningStatus
     */
    public String getLearningStatus() {
        return this.learningStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String learningStatus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryLearningStatusNewResponseBody model) {
            this.learningStatus = model.learningStatus;
            this.requestId = model.requestId;
        } 

        /**
         * LearningStatus.
         */
        public Builder learningStatus(String learningStatus) {
            this.learningStatus = learningStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryLearningStatusNewResponseBody build() {
            return new QueryLearningStatusNewResponseBody(this);
        } 

    } 

}
