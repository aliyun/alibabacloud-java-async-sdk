// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link GetUserDeviceWorkloadTrendResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserDeviceWorkloadTrendResponseBody</p>
 */
public class GetUserDeviceWorkloadTrendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TitleEn")
    private String titleEn;

    @com.aliyun.core.annotation.NameInMap("TitleZh")
    private String titleZh;

    @com.aliyun.core.annotation.NameInMap("WorkloadList")
    private java.util.List<WorkloadList> workloadList;

    private GetUserDeviceWorkloadTrendResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.titleEn = builder.titleEn;
        this.titleZh = builder.titleZh;
        this.workloadList = builder.workloadList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserDeviceWorkloadTrendResponseBody create() {
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
     * @return titleEn
     */
    public String getTitleEn() {
        return this.titleEn;
    }

    /**
     * @return titleZh
     */
    public String getTitleZh() {
        return this.titleZh;
    }

    /**
     * @return workloadList
     */
    public java.util.List<WorkloadList> getWorkloadList() {
        return this.workloadList;
    }

    public static final class Builder {
        private String requestId; 
        private String titleEn; 
        private String titleZh; 
        private java.util.List<WorkloadList> workloadList; 

        private Builder() {
        } 

        private Builder(GetUserDeviceWorkloadTrendResponseBody model) {
            this.requestId = model.requestId;
            this.titleEn = model.titleEn;
            this.titleZh = model.titleZh;
            this.workloadList = model.workloadList;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>102350E7-1A20-58F5-9D63-ABEA820AE6E1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TitleEn.
         */
        public Builder titleEn(String titleEn) {
            this.titleEn = titleEn;
            return this;
        }

        /**
         * TitleZh.
         */
        public Builder titleZh(String titleZh) {
            this.titleZh = titleZh;
            return this;
        }

        /**
         * WorkloadList.
         */
        public Builder workloadList(java.util.List<WorkloadList> workloadList) {
            this.workloadList = workloadList;
            return this;
        }

        public GetUserDeviceWorkloadTrendResponseBody build() {
            return new GetUserDeviceWorkloadTrendResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserDeviceWorkloadTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserDeviceWorkloadTrendResponseBody</p>
     */
    public static class WorkloadList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("Workload")
        private Double workload;

        private WorkloadList(Builder builder) {
            this.timestamp = builder.timestamp;
            this.workload = builder.workload;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkloadList create() {
            return builder().build();
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return workload
         */
        public Double getWorkload() {
            return this.workload;
        }

        public static final class Builder {
            private Long timestamp; 
            private Double workload; 

            private Builder() {
            } 

            private Builder(WorkloadList model) {
                this.timestamp = model.timestamp;
                this.workload = model.workload;
            } 

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * Workload.
             */
            public Builder workload(Double workload) {
                this.workload = workload;
                return this;
            }

            public WorkloadList build() {
                return new WorkloadList(this);
            } 

        } 

    }
}
