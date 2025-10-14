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
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The maximum number of functions supported by the billing plan.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder quotaRoutineNumber(Long quotaRoutineNumber) {
            this.quotaRoutineNumber = quotaRoutineNumber;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890ABCDEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The functions.</p>
         */
        public Builder routines(java.util.List<Routines> routines) {
            this.routines = routines;
            return this;
        }

        /**
         * <p>The total count.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The number of functions that were already created.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
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

        @com.aliyun.core.annotation.NameInMap("DefaultRelatedRecord")
        private String defaultRelatedRecord;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("HasAssets")
        private Boolean hasAssets;

        @com.aliyun.core.annotation.NameInMap("RoutineName")
        private String routineName;

        private Routines(Builder builder) {
            this.createTime = builder.createTime;
            this.defaultRelatedRecord = builder.defaultRelatedRecord;
            this.description = builder.description;
            this.hasAssets = builder.hasAssets;
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
         * @return defaultRelatedRecord
         */
        public String getDefaultRelatedRecord() {
            return this.defaultRelatedRecord;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return hasAssets
         */
        public Boolean getHasAssets() {
            return this.hasAssets;
        }

        /**
         * @return routineName
         */
        public String getRoutineName() {
            return this.routineName;
        }

        public static final class Builder {
            private String createTime; 
            private String defaultRelatedRecord; 
            private String description; 
            private Boolean hasAssets; 
            private String routineName; 

            private Builder() {
            } 

            private Builder(Routines model) {
                this.createTime = model.createTime;
                this.defaultRelatedRecord = model.defaultRelatedRecord;
                this.description = model.description;
                this.hasAssets = model.hasAssets;
                this.routineName = model.routineName;
            } 

            /**
             * <p>The time when the function was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-11T01:23:02.883361712Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The default record name to access.</p>
             * 
             * <strong>example:</strong>
             * <p>serverless-test-2.154edaf6.er.aliyun-esa.net</p>
             */
            public Builder defaultRelatedRecord(String defaultRelatedRecord) {
                this.defaultRelatedRecord = defaultRelatedRecord;
                return this;
            }

            /**
             * <p>The function description.</p>
             * 
             * <strong>example:</strong>
             * <p>ZWRpdCByb3V0aW5lIGNvbmZpZyBkZXNjcmlwdGlvbg==</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Specifies whether to include the Assets file tag.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasAssets(Boolean hasAssets) {
                this.hasAssets = hasAssets;
                return this;
            }

            /**
             * <p>The function name.</p>
             * 
             * <strong>example:</strong>
             * <p>hello</p>
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
