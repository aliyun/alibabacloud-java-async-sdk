// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link ListQuotaWorkloadsResponseBody} extends {@link TeaModel}
 *
 * <p>ListQuotaWorkloadsResponseBody</p>
 */
public class ListQuotaWorkloadsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("Workloads")
    private java.util.List<QueueInfo> workloads;

    private ListQuotaWorkloadsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.workloads = builder.workloads;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQuotaWorkloadsResponseBody create() {
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return workloads
     */
    public java.util.List<QueueInfo> getWorkloads() {
        return this.workloads;
    }

    public static final class Builder {
        private String requestId; 
        private Long totalCount; 
        private java.util.List<QueueInfo> workloads; 

        private Builder() {
        } 

        private Builder(ListQuotaWorkloadsResponseBody model) {
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.workloads = model.workloads;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>42F23B58-3684-5443-848A-8DA81FF99712</p>
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

        /**
         * Workloads.
         */
        public Builder workloads(java.util.List<QueueInfo> workloads) {
            this.workloads = workloads;
            return this;
        }

        public ListQuotaWorkloadsResponseBody build() {
            return new ListQuotaWorkloadsResponseBody(this);
        } 

    } 

}
