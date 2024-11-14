// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePairDrillsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePairDrillsResponseBody</p>
 */
public class DescribePairDrillsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Drills")
    private java.util.List < Drills> drills;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribePairDrillsResponseBody(Builder builder) {
        this.drills = builder.drills;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePairDrillsResponseBody create() {
        return builder().build();
    }

    /**
     * @return drills
     */
    public java.util.List < Drills> getDrills() {
        return this.drills;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private java.util.List < Drills> drills; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The information of disaster recovery drills that were performed on the replication pair.</p>
         */
        public Builder drills(java.util.List < Drills> drills) {
            this.drills = drills;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C46FF5A8-C5F0-4024-8262-B16B6392****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribePairDrillsResponseBody build() {
            return new DescribePairDrillsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePairDrillsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePairDrillsResponseBody</p>
     */
    public static class Drills extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DrillDiskId")
        private String drillDiskId;

        @com.aliyun.core.annotation.NameInMap("DrillDiskStatus")
        private String drillDiskStatus;

        @com.aliyun.core.annotation.NameInMap("DrillId")
        private String drillId;

        @com.aliyun.core.annotation.NameInMap("RecoverPoint")
        private Long recoverPoint;

        @com.aliyun.core.annotation.NameInMap("StartAt")
        private Long startAt;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusMessage")
        private String statusMessage;

        private Drills(Builder builder) {
            this.drillDiskId = builder.drillDiskId;
            this.drillDiskStatus = builder.drillDiskStatus;
            this.drillId = builder.drillId;
            this.recoverPoint = builder.recoverPoint;
            this.startAt = builder.startAt;
            this.status = builder.status;
            this.statusMessage = builder.statusMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Drills create() {
            return builder().build();
        }

        /**
         * @return drillDiskId
         */
        public String getDrillDiskId() {
            return this.drillDiskId;
        }

        /**
         * @return drillDiskStatus
         */
        public String getDrillDiskStatus() {
            return this.drillDiskStatus;
        }

        /**
         * @return drillId
         */
        public String getDrillId() {
            return this.drillId;
        }

        /**
         * @return recoverPoint
         */
        public Long getRecoverPoint() {
            return this.recoverPoint;
        }

        /**
         * @return startAt
         */
        public Long getStartAt() {
            return this.startAt;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusMessage
         */
        public String getStatusMessage() {
            return this.statusMessage;
        }

        public static final class Builder {
            private String drillDiskId; 
            private String drillDiskStatus; 
            private String drillId; 
            private Long recoverPoint; 
            private Long startAt; 
            private String status; 
            private String statusMessage; 

            /**
             * <p>The ID of the drill disk.</p>
             * 
             * <strong>example:</strong>
             * <p>d-xxx</p>
             */
            public Builder drillDiskId(String drillDiskId) {
                this.drillDiskId = drillDiskId;
                return this;
            }

            /**
             * <p>The status of the drill disk. Valid values:</p>
             * <ul>
             * <li>created</li>
             * <li>deleted</li>
             * <li>creating</li>
             * <li>deleting</li>
             * </ul>
             * <blockquote>
             * <p> This parameter can also display error code details if your drill disk fails to be created or deleted.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>created</p>
             */
            public Builder drillDiskStatus(String drillDiskStatus) {
                this.drillDiskStatus = drillDiskStatus;
                return this;
            }

            /**
             * <p>The ID of the drill.</p>
             * 
             * <strong>example:</strong>
             * <p>drill-xxx</p>
             */
            public Builder drillId(String drillId) {
                this.drillId = drillId;
                return this;
            }

            /**
             * <p>The recovery point of the drill. The value of this parameter is a timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1690855931</p>
             */
            public Builder recoverPoint(Long recoverPoint) {
                this.recoverPoint = recoverPoint;
                return this;
            }

            /**
             * <p>The beginning time of the drill. The value of this parameter is a timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1690855888</p>
             */
            public Builder startAt(Long startAt) {
                this.startAt = startAt;
                return this;
            }

            /**
             * <p>The status of the drill. Valid values:</p>
             * <ul>
             * <li>execute_failed</li>
             * <li>executed</li>
             * <li>executing</li>
             * <li>clear_failed</li>
             * <li>clearing</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>executing</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The error message that was displayed if the drill failed to be executed.</p>
             * 
             * <strong>example:</strong>
             * <p>PAIR_SYNCPOINT_NOT_FOUND</p>
             */
            public Builder statusMessage(String statusMessage) {
                this.statusMessage = statusMessage;
                return this;
            }

            public Drills build() {
                return new Drills(this);
            } 

        } 

    }
}
