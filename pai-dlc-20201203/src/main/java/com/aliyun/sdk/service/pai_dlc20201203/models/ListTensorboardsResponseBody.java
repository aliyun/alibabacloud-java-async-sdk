// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link ListTensorboardsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTensorboardsResponseBody</p>
 */
public class ListTensorboardsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tensorboards")
    private java.util.List<Tensorboard> tensorboards;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListTensorboardsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tensorboards = builder.tensorboards;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTensorboardsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tensorboards
     */
    public java.util.List<Tensorboard> getTensorboards() {
        return this.tensorboards;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Tensorboard> tensorboards; 
        private Long totalCount; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Tensorboards.
         */
        public Builder tensorboards(java.util.List<Tensorboard> tensorboards) {
            this.tensorboards = tensorboards;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTensorboardsResponseBody build() {
            return new ListTensorboardsResponseBody(this);
        } 

    } 

}
