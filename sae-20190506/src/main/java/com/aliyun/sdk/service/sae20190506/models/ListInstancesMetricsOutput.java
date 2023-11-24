// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstancesMetricsOutput} extends {@link TeaModel}
 *
 * <p>ListInstancesMetricsOutput</p>
 */
public class ListInstancesMetricsOutput extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("metricsList")
    private java.util.List < InstanceMetricInfo > metricsList;

    @NameInMap("pageNumber")
    private Integer pageNumber;

    @NameInMap("pageSize")
    private Integer pageSize;

    @NameInMap("totalCount")
    private Integer totalCount;

    private ListInstancesMetricsOutput(Builder builder) {
        this.requestId = builder.requestId;
        this.metricsList = builder.metricsList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesMetricsOutput create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return metricsList
     */
    public java.util.List < InstanceMetricInfo > getMetricsList() {
        return this.metricsList;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < InstanceMetricInfo > metricsList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Integer totalCount; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * metricsList.
         */
        public Builder metricsList(java.util.List < InstanceMetricInfo > metricsList) {
            this.metricsList = metricsList;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListInstancesMetricsOutput build() {
            return new ListInstancesMetricsOutput(this);
        } 

    } 

}
