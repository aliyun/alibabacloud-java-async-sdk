// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUniBackupStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUniBackupStatisticsResponseBody</p>
 */
public class DescribeUniBackupStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProtectedDatabaseCount")
    private Integer protectedDatabaseCount;

    @com.aliyun.core.annotation.NameInMap("RegionCountList")
    private java.util.List < RegionCountList> regionCountList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RestoringTaskCount")
    private Integer restoringTaskCount;

    @com.aliyun.core.annotation.NameInMap("TotalRecoverableCount")
    private Integer totalRecoverableCount;

    @com.aliyun.core.annotation.NameInMap("TotalRestoreTaskCount")
    private Integer totalRestoreTaskCount;

    @com.aliyun.core.annotation.NameInMap("UnprotectedDatabaseCount")
    private Integer unprotectedDatabaseCount;

    private DescribeUniBackupStatisticsResponseBody(Builder builder) {
        this.protectedDatabaseCount = builder.protectedDatabaseCount;
        this.regionCountList = builder.regionCountList;
        this.requestId = builder.requestId;
        this.restoringTaskCount = builder.restoringTaskCount;
        this.totalRecoverableCount = builder.totalRecoverableCount;
        this.totalRestoreTaskCount = builder.totalRestoreTaskCount;
        this.unprotectedDatabaseCount = builder.unprotectedDatabaseCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUniBackupStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return protectedDatabaseCount
     */
    public Integer getProtectedDatabaseCount() {
        return this.protectedDatabaseCount;
    }

    /**
     * @return regionCountList
     */
    public java.util.List < RegionCountList> getRegionCountList() {
        return this.regionCountList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return restoringTaskCount
     */
    public Integer getRestoringTaskCount() {
        return this.restoringTaskCount;
    }

    /**
     * @return totalRecoverableCount
     */
    public Integer getTotalRecoverableCount() {
        return this.totalRecoverableCount;
    }

    /**
     * @return totalRestoreTaskCount
     */
    public Integer getTotalRestoreTaskCount() {
        return this.totalRestoreTaskCount;
    }

    /**
     * @return unprotectedDatabaseCount
     */
    public Integer getUnprotectedDatabaseCount() {
        return this.unprotectedDatabaseCount;
    }

    public static final class Builder {
        private Integer protectedDatabaseCount; 
        private java.util.List < RegionCountList> regionCountList; 
        private String requestId; 
        private Integer restoringTaskCount; 
        private Integer totalRecoverableCount; 
        private Integer totalRestoreTaskCount; 
        private Integer unprotectedDatabaseCount; 

        /**
         * <p>The number of protected database instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder protectedDatabaseCount(Integer protectedDatabaseCount) {
            this.protectedDatabaseCount = protectedDatabaseCount;
            return this;
        }

        /**
         * <p>The regions of the database instances.</p>
         */
        public Builder regionCountList(java.util.List < RegionCountList> regionCountList) {
            this.regionCountList = regionCountList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7532B7EE-7CE7-5F4D-BF04-B12447DD****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of the restoration tasks that are running.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder restoringTaskCount(Integer restoringTaskCount) {
            this.restoringTaskCount = restoringTaskCount;
            return this;
        }

        /**
         * <p>The total number of database instances that can be restored.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalRecoverableCount(Integer totalRecoverableCount) {
            this.totalRecoverableCount = totalRecoverableCount;
            return this;
        }

        /**
         * <p>The total number of the restoration tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalRestoreTaskCount(Integer totalRestoreTaskCount) {
            this.totalRestoreTaskCount = totalRestoreTaskCount;
            return this;
        }

        /**
         * <p>The number of unprotected database instances.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder unprotectedDatabaseCount(Integer unprotectedDatabaseCount) {
            this.unprotectedDatabaseCount = unprotectedDatabaseCount;
            return this;
        }

        public DescribeUniBackupStatisticsResponseBody build() {
            return new DescribeUniBackupStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUniBackupStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUniBackupStatisticsResponseBody</p>
     */
    public static class RegionCountList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutomaticCount")
        private String automaticCount;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private RegionCountList(Builder builder) {
            this.automaticCount = builder.automaticCount;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionCountList create() {
            return builder().build();
        }

        /**
         * @return automaticCount
         */
        public String getAutomaticCount() {
            return this.automaticCount;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String automaticCount; 
            private String regionId; 

            /**
             * <p>The number of database instances that are automatically scanned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder automaticCount(String automaticCount) {
                this.automaticCount = automaticCount;
                return this;
            }

            /**
             * <p>The ID of the region in which the database instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public RegionCountList build() {
                return new RegionCountList(this);
            } 

        } 

    }
}
