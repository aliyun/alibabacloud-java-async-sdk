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
 * {@link QueryLabelConfigResponseBody} extends {@link TeaModel}
 *
 * <p>QueryLabelConfigResponseBody</p>
 */
public class QueryLabelConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ContentModeration")
    private java.util.List<?> contentModeration;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryLabelConfigResponseBody(Builder builder) {
        this.contentModeration = builder.contentModeration;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryLabelConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contentModeration
     */
    public java.util.List<?> getContentModeration() {
        return this.contentModeration;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<?> contentModeration; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryLabelConfigResponseBody model) {
            this.contentModeration = model.contentModeration;
            this.requestId = model.requestId;
        } 

        /**
         * ContentModeration.
         */
        public Builder contentModeration(java.util.List<?> contentModeration) {
            this.contentModeration = contentModeration;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryLabelConfigResponseBody build() {
            return new QueryLabelConfigResponseBody(this);
        } 

    } 

}
