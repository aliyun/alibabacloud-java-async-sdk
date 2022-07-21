// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTensorboardsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTensorboardsResponseBody</p>
 */
public class ListTensorboardsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Tensorboards")
    private java.util.List < Tensorboard > tensorboards;

    @NameInMap("TotalCount")
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
    public java.util.List < Tensorboard > getTensorboards() {
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
        private java.util.List < Tensorboard > tensorboards; 
        private Long totalCount; 

        /**
         * 请求Id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Tensorboard 列表
         */
        public Builder tensorboards(java.util.List < Tensorboard > tensorboards) {
            this.tensorboards = tensorboards;
            return this;
        }

        /**
         * 符合条件的数据源总数量
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
