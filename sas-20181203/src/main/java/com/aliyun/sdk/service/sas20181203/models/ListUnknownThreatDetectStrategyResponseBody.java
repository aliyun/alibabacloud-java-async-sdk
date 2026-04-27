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
 * {@link ListUnknownThreatDetectStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>ListUnknownThreatDetectStrategyResponseBody</p>
 */
public class ListUnknownThreatDetectStrategyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListUnknownThreatDetectStrategyResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUnknownThreatDetectStrategyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private PageInfo pageInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListUnknownThreatDetectStrategyResponseBody model) {
            this.data = model.data;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * PageInfo.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>898F7AA7-CECD-5EC7-AF4D-664C601B****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListUnknownThreatDetectStrategyResponseBody build() {
            return new ListUnknownThreatDetectStrategyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUnknownThreatDetectStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>ListUnknownThreatDetectStrategyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetSelectionType")
        private String assetSelectionType;

        @com.aliyun.core.annotation.NameInMap("DurationDaysAfterInit")
        private Integer durationDaysAfterInit;

        @com.aliyun.core.annotation.NameInMap("DurationDaysAfterStop")
        private Integer durationDaysAfterStop;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("MachineCount")
        private Integer machineCount;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("StudyMode")
        private String studyMode;

        private Data(Builder builder) {
            this.assetSelectionType = builder.assetSelectionType;
            this.durationDaysAfterInit = builder.durationDaysAfterInit;
            this.durationDaysAfterStop = builder.durationDaysAfterStop;
            this.id = builder.id;
            this.machineCount = builder.machineCount;
            this.name = builder.name;
            this.studyMode = builder.studyMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return assetSelectionType
         */
        public String getAssetSelectionType() {
            return this.assetSelectionType;
        }

        /**
         * @return durationDaysAfterInit
         */
        public Integer getDurationDaysAfterInit() {
            return this.durationDaysAfterInit;
        }

        /**
         * @return durationDaysAfterStop
         */
        public Integer getDurationDaysAfterStop() {
            return this.durationDaysAfterStop;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return machineCount
         */
        public Integer getMachineCount() {
            return this.machineCount;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return studyMode
         */
        public String getStudyMode() {
            return this.studyMode;
        }

        public static final class Builder {
            private String assetSelectionType; 
            private Integer durationDaysAfterInit; 
            private Integer durationDaysAfterStop; 
            private Long id; 
            private Integer machineCount; 
            private String name; 
            private String studyMode; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.assetSelectionType = model.assetSelectionType;
                this.durationDaysAfterInit = model.durationDaysAfterInit;
                this.durationDaysAfterStop = model.durationDaysAfterStop;
                this.id = model.id;
                this.machineCount = model.machineCount;
                this.name = model.name;
                this.studyMode = model.studyMode;
            } 

            /**
             * AssetSelectionType.
             */
            public Builder assetSelectionType(String assetSelectionType) {
                this.assetSelectionType = assetSelectionType;
                return this;
            }

            /**
             * DurationDaysAfterInit.
             */
            public Builder durationDaysAfterInit(Integer durationDaysAfterInit) {
                this.durationDaysAfterInit = durationDaysAfterInit;
                return this;
            }

            /**
             * DurationDaysAfterStop.
             */
            public Builder durationDaysAfterStop(Integer durationDaysAfterStop) {
                this.durationDaysAfterStop = durationDaysAfterStop;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * MachineCount.
             */
            public Builder machineCount(Integer machineCount) {
                this.machineCount = machineCount;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * StudyMode.
             */
            public Builder studyMode(String studyMode) {
                this.studyMode = studyMode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUnknownThreatDetectStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>ListUnknownThreatDetectStrategyResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.count = model.count;
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
