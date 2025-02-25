// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeClientConfStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClientConfStrategyResponseBody</p>
 */
public class DescribeClientConfStrategyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TargetList")
    private java.util.List<TargetList> targetList;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeClientConfStrategyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.targetList = builder.targetList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClientConfStrategyResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return targetList
     */
    public java.util.List<TargetList> getTargetList() {
        return this.targetList;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TargetList> targetList; 
        private Integer totalCount; 

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>5BD95679-D63A-4151-97D0-188432F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array that consists of the configurations.</p>
         */
        public Builder targetList(java.util.List<TargetList> targetList) {
            this.targetList = targetList;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeClientConfStrategyResponseBody build() {
            return new DescribeClientConfStrategyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClientConfStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClientConfStrategyResponseBody</p>
     */
    public static class TargetList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private TargetList(Builder builder) {
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetList create() {
            return builder().build();
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String uuid; 

            /**
             * <p>The UUID of the Security Center agent.</p>
             * 
             * <strong>example:</strong>
             * <p>2b1753a6-04d9-448e-ad17-7abdf19f****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public TargetList build() {
                return new TargetList(this);
            } 

        } 

    }
}
