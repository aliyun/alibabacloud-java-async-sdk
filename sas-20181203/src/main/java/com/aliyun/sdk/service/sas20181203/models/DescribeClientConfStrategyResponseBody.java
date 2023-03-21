// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClientConfStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClientConfStrategyResponseBody</p>
 */
public class DescribeClientConfStrategyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TargetList")
    private java.util.List < TargetList> targetList;

    @NameInMap("TotalCount")
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
    public java.util.List < TargetList> getTargetList() {
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
        private java.util.List < TargetList> targetList; 
        private Integer totalCount; 

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array that consists of the configurations.
         */
        public Builder targetList(java.util.List < TargetList> targetList) {
            this.targetList = targetList;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeClientConfStrategyResponseBody build() {
            return new DescribeClientConfStrategyResponseBody(this);
        } 

    } 

    public static class TargetList extends TeaModel {
        @NameInMap("Uuid")
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
             * The UUID of the Security Center agent.
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
