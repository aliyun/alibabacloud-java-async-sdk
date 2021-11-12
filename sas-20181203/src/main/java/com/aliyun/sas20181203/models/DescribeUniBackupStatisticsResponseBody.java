// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeUniBackupStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUniBackupStatisticsResponseBody</p>
 */
public class DescribeUniBackupStatisticsResponseBody extends TeaModel {
    @NameInMap("ProtectedDatabaseCount")
    private Integer protectedDatabaseCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RestoringTaskCount")
    private Integer restoringTaskCount;

    @NameInMap("TotalRecoverableCount")
    private Integer totalRecoverableCount;

    @NameInMap("TotalRestoreTaskCount")
    private Integer totalRestoreTaskCount;

    @NameInMap("UnprotectedDatabaseCount")
    private Integer unprotectedDatabaseCount;


    private DescribeUniBackupStatisticsResponseBody(Builder builder) {
        this.protectedDatabaseCount = builder.protectedDatabaseCount;
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
        private String requestId; 
        private Integer restoringTaskCount; 
        private Integer totalRecoverableCount; 
        private Integer totalRestoreTaskCount; 
        private Integer unprotectedDatabaseCount; 

        /**
         * <p>ProtectedDatabaseCount.</p>
         */
        public Builder protectedDatabaseCount(Integer protectedDatabaseCount) {
            this.protectedDatabaseCount = protectedDatabaseCount;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>RestoringTaskCount.</p>
         */
        public Builder restoringTaskCount(Integer restoringTaskCount) {
            this.restoringTaskCount = restoringTaskCount;
            return this;
        }

        /**
         * <p>TotalRecoverableCount.</p>
         */
        public Builder totalRecoverableCount(Integer totalRecoverableCount) {
            this.totalRecoverableCount = totalRecoverableCount;
            return this;
        }

        /**
         * <p>TotalRestoreTaskCount.</p>
         */
        public Builder totalRestoreTaskCount(Integer totalRestoreTaskCount) {
            this.totalRestoreTaskCount = totalRestoreTaskCount;
            return this;
        }

        /**
         * <p>UnprotectedDatabaseCount.</p>
         */
        public Builder unprotectedDatabaseCount(Integer unprotectedDatabaseCount) {
            this.unprotectedDatabaseCount = unprotectedDatabaseCount;
            return this;
        }

        public DescribeUniBackupStatisticsResponseBody build() {
            return new DescribeUniBackupStatisticsResponseBody(this);
        } 

    } 

}
