// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListUserRoutinesResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserRoutinesResponseBody</p>
 */
public class ListUserRoutinesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("QuotaRoutineNumber")
    private Long quotaRoutineNumber;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Routines")
    private java.util.List<Routines> routines;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("UsedRoutineNumber")
    private Long usedRoutineNumber;

    private ListUserRoutinesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.quotaRoutineNumber = builder.quotaRoutineNumber;
        this.requestId = builder.requestId;
        this.routines = builder.routines;
        this.totalCount = builder.totalCount;
        this.usedRoutineNumber = builder.usedRoutineNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserRoutinesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return quotaRoutineNumber
     */
    public Long getQuotaRoutineNumber() {
        return this.quotaRoutineNumber;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return routines
     */
    public java.util.List<Routines> getRoutines() {
        return this.routines;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return usedRoutineNumber
     */
    public Long getUsedRoutineNumber() {
        return this.usedRoutineNumber;
    }

    public static final class Builder {
        private Long pageNumber; 
        private Long pageSize; 
        private Long quotaRoutineNumber; 
        private String requestId; 
        private java.util.List<Routines> routines; 
        private Long totalCount; 
        private Long usedRoutineNumber; 

        private Builder() {
        } 

        private Builder(ListUserRoutinesResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.quotaRoutineNumber = model.quotaRoutineNumber;
            this.requestId = model.requestId;
            this.routines = model.routines;
            this.totalCount = model.totalCount;
            this.usedRoutineNumber = model.usedRoutineNumber;
        } 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * QuotaRoutineNumber.
         */
        public Builder quotaRoutineNumber(Long quotaRoutineNumber) {
            this.quotaRoutineNumber = quotaRoutineNumber;
            return this;
        }

        /**
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Routines.
         */
        public Builder routines(java.util.List<Routines> routines) {
            this.routines = routines;
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
         * UsedRoutineNumber.
         */
        public Builder usedRoutineNumber(Long usedRoutineNumber) {
            this.usedRoutineNumber = usedRoutineNumber;
            return this;
        }

        public ListUserRoutinesResponseBody build() {
            return new ListUserRoutinesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserRoutinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserRoutinesResponseBody</p>
     */
    public static class Routines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("RoutineName")
        private String routineName;

        private Routines(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.routineName = builder.routineName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Routines create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return routineName
         */
        public String getRoutineName() {
            return this.routineName;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String routineName; 

            private Builder() {
            } 

            private Builder(Routines model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.routineName = model.routineName;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * RoutineName.
             */
            public Builder routineName(String routineName) {
                this.routineName = routineName;
                return this;
            }

            public Routines build() {
                return new Routines(this);
            } 

        } 

    }
}
