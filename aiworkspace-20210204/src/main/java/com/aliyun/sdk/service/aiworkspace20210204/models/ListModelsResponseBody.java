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
 * {@link ListModelsResponseBody} extends {@link TeaModel}
 *
 * <p>ListModelsResponseBody</p>
 */
public class ListModelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Models")
    private java.util.List<Model> models;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListModelsResponseBody(Builder builder) {
        this.models = builder.models;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return models
     */
    public java.util.List<Model> getModels() {
        return this.models;
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
        private java.util.List<Model> models; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListModelsResponseBody model) {
            this.models = model.models;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Models.
         */
        public Builder models(java.util.List<Model> models) {
            this.models = models;
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

        public ListModelsResponseBody build() {
            return new ListModelsResponseBody(this);
        } 

    } 

}
