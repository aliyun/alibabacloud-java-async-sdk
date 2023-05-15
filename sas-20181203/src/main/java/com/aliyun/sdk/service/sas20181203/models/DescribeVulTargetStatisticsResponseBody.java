// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulTargetStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVulTargetStatisticsResponseBody</p>
 */
public class DescribeVulTargetStatisticsResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TargetStats")
    private java.util.List < TargetStats> targetStats;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeVulTargetStatisticsResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.targetStats = builder.targetStats;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulTargetStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return targetStats
     */
    public java.util.List < TargetStats> getTargetStats() {
        return this.targetStats;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer currentPage; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List < TargetStats> targetStats; 
        private Integer totalCount; 

        /**
         * The ID of the request.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The configurations of the vulnerability scan feature.
         */
        public Builder targetStats(java.util.List < TargetStats> targetStats) {
            this.targetStats = targetStats;
            return this;
        }

        /**
         * An array that consists of the configurations of the vulnerability scan feature.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeVulTargetStatisticsResponseBody build() {
            return new DescribeVulTargetStatisticsResponseBody(this);
        } 

    } 

    public static class Targets extends TeaModel {
        @NameInMap("Flag")
        private String flag;

        @NameInMap("Target")
        private String target;

        @NameInMap("TargetType")
        private String targetType;

        private Targets(Builder builder) {
            this.flag = builder.flag;
            this.target = builder.target;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Targets create() {
            return builder().build();
        }

        /**
         * @return flag
         */
        public String getFlag() {
            return this.flag;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String flag; 
            private String target; 
            private String targetType; 

            /**
             * The group ID or UUID of the server to which the configurations are applied.
             */
            public Builder flag(String flag) {
                this.flag = flag;
                return this;
            }

            /**
             * The condition by which the configurations are applied to the server. Valid values:
             * <p>
             * 
             * *   **uuid**: the UUID of the server
             * *   **groupId**: the ID of the server group
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * TargetType.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public Targets build() {
                return new Targets(this);
            } 

        } 

    }
    public static class TargetStats extends TeaModel {
        @NameInMap("Targets")
        private java.util.List < Targets> targets;

        @NameInMap("TotalCount")
        private Integer totalCount;

        @NameInMap("UuidCount")
        private Integer uuidCount;

        @NameInMap("VulType")
        private String vulType;

        private TargetStats(Builder builder) {
            this.targets = builder.targets;
            this.totalCount = builder.totalCount;
            this.uuidCount = builder.uuidCount;
            this.vulType = builder.vulType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetStats create() {
            return builder().build();
        }

        /**
         * @return targets
         */
        public java.util.List < Targets> getTargets() {
            return this.targets;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return uuidCount
         */
        public Integer getUuidCount() {
            return this.uuidCount;
        }

        /**
         * @return vulType
         */
        public String getVulType() {
            return this.vulType;
        }

        public static final class Builder {
            private java.util.List < Targets> targets; 
            private Integer totalCount; 
            private Integer uuidCount; 
            private String vulType; 

            /**
             * The information about the server.
             */
            public Builder targets(java.util.List < Targets> targets) {
                this.targets = targets;
                return this;
            }

            /**
             * The number of servers to which the configurations are applied.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * An array that consists of available servers.
             */
            public Builder uuidCount(Integer uuidCount) {
                this.uuidCount = uuidCount;
                return this;
            }

            /**
             * The total number of servers.
             */
            public Builder vulType(String vulType) {
                this.vulType = vulType;
                return this;
            }

            public TargetStats build() {
                return new TargetStats(this);
            } 

        } 

    }
}
