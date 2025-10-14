// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link GetDataStorageResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataStorageResponseBody</p>
 */
public class GetDataStorageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDataStorageResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataStorageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDataStorageResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDataStorageResponseBody build() {
            return new GetDataStorageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataStorageResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataStorageResponseBody</p>
     */
    public static class NormalizationLogStores extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogStoreName")
        private String logStoreName;

        @com.aliyun.core.annotation.NameInMap("LogStoreTtl")
        private Integer logStoreTtl;

        private NormalizationLogStores(Builder builder) {
            this.logStoreName = builder.logStoreName;
            this.logStoreTtl = builder.logStoreTtl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NormalizationLogStores create() {
            return builder().build();
        }

        /**
         * @return logStoreName
         */
        public String getLogStoreName() {
            return this.logStoreName;
        }

        /**
         * @return logStoreTtl
         */
        public Integer getLogStoreTtl() {
            return this.logStoreTtl;
        }

        public static final class Builder {
            private String logStoreName; 
            private Integer logStoreTtl; 

            private Builder() {
            } 

            private Builder(NormalizationLogStores model) {
                this.logStoreName = model.logStoreName;
                this.logStoreTtl = model.logStoreTtl;
            } 

            /**
             * LogStoreName.
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            /**
             * LogStoreTtl.
             */
            public Builder logStoreTtl(Integer logStoreTtl) {
                this.logStoreTtl = logStoreTtl;
                return this;
            }

            public NormalizationLogStores build() {
                return new NormalizationLogStores(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataStorageResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataStorageResponseBody</p>
     */
    public static class NormalizationLogViews extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityName")
        private String activityName;

        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("DetectionRuleReferenceCount")
        private Integer detectionRuleReferenceCount;

        @com.aliyun.core.annotation.NameInMap("DetectionRuleReferenceProductIds")
        private java.util.List<String> detectionRuleReferenceProductIds;

        @com.aliyun.core.annotation.NameInMap("LogSearchConditions")
        private String logSearchConditions;

        @com.aliyun.core.annotation.NameInMap("LogStoreName")
        private String logStoreName;

        @com.aliyun.core.annotation.NameInMap("LogViewExisted")
        private Boolean logViewExisted;

        @com.aliyun.core.annotation.NameInMap("LogViewName")
        private String logViewName;

        private NormalizationLogViews(Builder builder) {
            this.activityName = builder.activityName;
            this.categoryName = builder.categoryName;
            this.detectionRuleReferenceCount = builder.detectionRuleReferenceCount;
            this.detectionRuleReferenceProductIds = builder.detectionRuleReferenceProductIds;
            this.logSearchConditions = builder.logSearchConditions;
            this.logStoreName = builder.logStoreName;
            this.logViewExisted = builder.logViewExisted;
            this.logViewName = builder.logViewName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NormalizationLogViews create() {
            return builder().build();
        }

        /**
         * @return activityName
         */
        public String getActivityName() {
            return this.activityName;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return detectionRuleReferenceCount
         */
        public Integer getDetectionRuleReferenceCount() {
            return this.detectionRuleReferenceCount;
        }

        /**
         * @return detectionRuleReferenceProductIds
         */
        public java.util.List<String> getDetectionRuleReferenceProductIds() {
            return this.detectionRuleReferenceProductIds;
        }

        /**
         * @return logSearchConditions
         */
        public String getLogSearchConditions() {
            return this.logSearchConditions;
        }

        /**
         * @return logStoreName
         */
        public String getLogStoreName() {
            return this.logStoreName;
        }

        /**
         * @return logViewExisted
         */
        public Boolean getLogViewExisted() {
            return this.logViewExisted;
        }

        /**
         * @return logViewName
         */
        public String getLogViewName() {
            return this.logViewName;
        }

        public static final class Builder {
            private String activityName; 
            private String categoryName; 
            private Integer detectionRuleReferenceCount; 
            private java.util.List<String> detectionRuleReferenceProductIds; 
            private String logSearchConditions; 
            private String logStoreName; 
            private Boolean logViewExisted; 
            private String logViewName; 

            private Builder() {
            } 

            private Builder(NormalizationLogViews model) {
                this.activityName = model.activityName;
                this.categoryName = model.categoryName;
                this.detectionRuleReferenceCount = model.detectionRuleReferenceCount;
                this.detectionRuleReferenceProductIds = model.detectionRuleReferenceProductIds;
                this.logSearchConditions = model.logSearchConditions;
                this.logStoreName = model.logStoreName;
                this.logViewExisted = model.logViewExisted;
                this.logViewName = model.logViewName;
            } 

            /**
             * ActivityName.
             */
            public Builder activityName(String activityName) {
                this.activityName = activityName;
                return this;
            }

            /**
             * CategoryName.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * DetectionRuleReferenceCount.
             */
            public Builder detectionRuleReferenceCount(Integer detectionRuleReferenceCount) {
                this.detectionRuleReferenceCount = detectionRuleReferenceCount;
                return this;
            }

            /**
             * DetectionRuleReferenceProductIds.
             */
            public Builder detectionRuleReferenceProductIds(java.util.List<String> detectionRuleReferenceProductIds) {
                this.detectionRuleReferenceProductIds = detectionRuleReferenceProductIds;
                return this;
            }

            /**
             * LogSearchConditions.
             */
            public Builder logSearchConditions(String logSearchConditions) {
                this.logSearchConditions = logSearchConditions;
                return this;
            }

            /**
             * LogStoreName.
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            /**
             * LogViewExisted.
             */
            public Builder logViewExisted(Boolean logViewExisted) {
                this.logViewExisted = logViewExisted;
                return this;
            }

            /**
             * LogViewName.
             */
            public Builder logViewName(String logViewName) {
                this.logViewName = logViewName;
                return this;
            }

            public NormalizationLogViews build() {
                return new NormalizationLogViews(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataStorageResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataStorageResponseBody</p>
     */
    public static class SasLogStores extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogCode")
        private String logCode;

        @com.aliyun.core.annotation.NameInMap("LogDeliveryGroup")
        private String logDeliveryGroup;

        @com.aliyun.core.annotation.NameInMap("LogDeliveryPermission")
        private String logDeliveryPermission;

        @com.aliyun.core.annotation.NameInMap("LogDeliveryStatus")
        private String logDeliveryStatus;

        @com.aliyun.core.annotation.NameInMap("LogDeliveryUpdateTime")
        private String logDeliveryUpdateTime;

        @com.aliyun.core.annotation.NameInMap("LogName")
        private String logName;

        @com.aliyun.core.annotation.NameInMap("LogSearchConditions")
        private String logSearchConditions;

        @com.aliyun.core.annotation.NameInMap("LogStoreExisted")
        private Boolean logStoreExisted;

        @com.aliyun.core.annotation.NameInMap("LogStoreName")
        private String logStoreName;

        @com.aliyun.core.annotation.NameInMap("LogStoreTtl")
        private Integer logStoreTtl;

        private SasLogStores(Builder builder) {
            this.logCode = builder.logCode;
            this.logDeliveryGroup = builder.logDeliveryGroup;
            this.logDeliveryPermission = builder.logDeliveryPermission;
            this.logDeliveryStatus = builder.logDeliveryStatus;
            this.logDeliveryUpdateTime = builder.logDeliveryUpdateTime;
            this.logName = builder.logName;
            this.logSearchConditions = builder.logSearchConditions;
            this.logStoreExisted = builder.logStoreExisted;
            this.logStoreName = builder.logStoreName;
            this.logStoreTtl = builder.logStoreTtl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SasLogStores create() {
            return builder().build();
        }

        /**
         * @return logCode
         */
        public String getLogCode() {
            return this.logCode;
        }

        /**
         * @return logDeliveryGroup
         */
        public String getLogDeliveryGroup() {
            return this.logDeliveryGroup;
        }

        /**
         * @return logDeliveryPermission
         */
        public String getLogDeliveryPermission() {
            return this.logDeliveryPermission;
        }

        /**
         * @return logDeliveryStatus
         */
        public String getLogDeliveryStatus() {
            return this.logDeliveryStatus;
        }

        /**
         * @return logDeliveryUpdateTime
         */
        public String getLogDeliveryUpdateTime() {
            return this.logDeliveryUpdateTime;
        }

        /**
         * @return logName
         */
        public String getLogName() {
            return this.logName;
        }

        /**
         * @return logSearchConditions
         */
        public String getLogSearchConditions() {
            return this.logSearchConditions;
        }

        /**
         * @return logStoreExisted
         */
        public Boolean getLogStoreExisted() {
            return this.logStoreExisted;
        }

        /**
         * @return logStoreName
         */
        public String getLogStoreName() {
            return this.logStoreName;
        }

        /**
         * @return logStoreTtl
         */
        public Integer getLogStoreTtl() {
            return this.logStoreTtl;
        }

        public static final class Builder {
            private String logCode; 
            private String logDeliveryGroup; 
            private String logDeliveryPermission; 
            private String logDeliveryStatus; 
            private String logDeliveryUpdateTime; 
            private String logName; 
            private String logSearchConditions; 
            private Boolean logStoreExisted; 
            private String logStoreName; 
            private Integer logStoreTtl; 

            private Builder() {
            } 

            private Builder(SasLogStores model) {
                this.logCode = model.logCode;
                this.logDeliveryGroup = model.logDeliveryGroup;
                this.logDeliveryPermission = model.logDeliveryPermission;
                this.logDeliveryStatus = model.logDeliveryStatus;
                this.logDeliveryUpdateTime = model.logDeliveryUpdateTime;
                this.logName = model.logName;
                this.logSearchConditions = model.logSearchConditions;
                this.logStoreExisted = model.logStoreExisted;
                this.logStoreName = model.logStoreName;
                this.logStoreTtl = model.logStoreTtl;
            } 

            /**
             * LogCode.
             */
            public Builder logCode(String logCode) {
                this.logCode = logCode;
                return this;
            }

            /**
             * LogDeliveryGroup.
             */
            public Builder logDeliveryGroup(String logDeliveryGroup) {
                this.logDeliveryGroup = logDeliveryGroup;
                return this;
            }

            /**
             * LogDeliveryPermission.
             */
            public Builder logDeliveryPermission(String logDeliveryPermission) {
                this.logDeliveryPermission = logDeliveryPermission;
                return this;
            }

            /**
             * LogDeliveryStatus.
             */
            public Builder logDeliveryStatus(String logDeliveryStatus) {
                this.logDeliveryStatus = logDeliveryStatus;
                return this;
            }

            /**
             * LogDeliveryUpdateTime.
             */
            public Builder logDeliveryUpdateTime(String logDeliveryUpdateTime) {
                this.logDeliveryUpdateTime = logDeliveryUpdateTime;
                return this;
            }

            /**
             * LogName.
             */
            public Builder logName(String logName) {
                this.logName = logName;
                return this;
            }

            /**
             * LogSearchConditions.
             */
            public Builder logSearchConditions(String logSearchConditions) {
                this.logSearchConditions = logSearchConditions;
                return this;
            }

            /**
             * LogStoreExisted.
             */
            public Builder logStoreExisted(Boolean logStoreExisted) {
                this.logStoreExisted = logStoreExisted;
                return this;
            }

            /**
             * LogStoreName.
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            /**
             * LogStoreTtl.
             */
            public Builder logStoreTtl(Integer logStoreTtl) {
                this.logStoreTtl = logStoreTtl;
                return this;
            }

            public SasLogStores build() {
                return new SasLogStores(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataStorageResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataStorageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColdStorageUsedCapacity")
        private Double coldStorageUsedCapacity;

        @com.aliyun.core.annotation.NameInMap("DataStorageRegionId")
        private String dataStorageRegionId;

        @com.aliyun.core.annotation.NameInMap("DataStorageRegionPermission")
        private String dataStorageRegionPermission;

        @com.aliyun.core.annotation.NameInMap("DataStorageTotalCapacity")
        private Long dataStorageTotalCapacity;

        @com.aliyun.core.annotation.NameInMap("DataStorageUsedCapacity")
        private Double dataStorageUsedCapacity;

        @com.aliyun.core.annotation.NameInMap("DataStorageUsedCapacityDetail")
        private String dataStorageUsedCapacityDetail;

        @com.aliyun.core.annotation.NameInMap("LogProject")
        private String logProject;

        @com.aliyun.core.annotation.NameInMap("NormalizationLogStores")
        private java.util.List<NormalizationLogStores> normalizationLogStores;

        @com.aliyun.core.annotation.NameInMap("NormalizationLogViews")
        private java.util.List<NormalizationLogViews> normalizationLogViews;

        @com.aliyun.core.annotation.NameInMap("SasLogStores")
        private java.util.List<SasLogStores> sasLogStores;

        private Data(Builder builder) {
            this.coldStorageUsedCapacity = builder.coldStorageUsedCapacity;
            this.dataStorageRegionId = builder.dataStorageRegionId;
            this.dataStorageRegionPermission = builder.dataStorageRegionPermission;
            this.dataStorageTotalCapacity = builder.dataStorageTotalCapacity;
            this.dataStorageUsedCapacity = builder.dataStorageUsedCapacity;
            this.dataStorageUsedCapacityDetail = builder.dataStorageUsedCapacityDetail;
            this.logProject = builder.logProject;
            this.normalizationLogStores = builder.normalizationLogStores;
            this.normalizationLogViews = builder.normalizationLogViews;
            this.sasLogStores = builder.sasLogStores;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return coldStorageUsedCapacity
         */
        public Double getColdStorageUsedCapacity() {
            return this.coldStorageUsedCapacity;
        }

        /**
         * @return dataStorageRegionId
         */
        public String getDataStorageRegionId() {
            return this.dataStorageRegionId;
        }

        /**
         * @return dataStorageRegionPermission
         */
        public String getDataStorageRegionPermission() {
            return this.dataStorageRegionPermission;
        }

        /**
         * @return dataStorageTotalCapacity
         */
        public Long getDataStorageTotalCapacity() {
            return this.dataStorageTotalCapacity;
        }

        /**
         * @return dataStorageUsedCapacity
         */
        public Double getDataStorageUsedCapacity() {
            return this.dataStorageUsedCapacity;
        }

        /**
         * @return dataStorageUsedCapacityDetail
         */
        public String getDataStorageUsedCapacityDetail() {
            return this.dataStorageUsedCapacityDetail;
        }

        /**
         * @return logProject
         */
        public String getLogProject() {
            return this.logProject;
        }

        /**
         * @return normalizationLogStores
         */
        public java.util.List<NormalizationLogStores> getNormalizationLogStores() {
            return this.normalizationLogStores;
        }

        /**
         * @return normalizationLogViews
         */
        public java.util.List<NormalizationLogViews> getNormalizationLogViews() {
            return this.normalizationLogViews;
        }

        /**
         * @return sasLogStores
         */
        public java.util.List<SasLogStores> getSasLogStores() {
            return this.sasLogStores;
        }

        public static final class Builder {
            private Double coldStorageUsedCapacity; 
            private String dataStorageRegionId; 
            private String dataStorageRegionPermission; 
            private Long dataStorageTotalCapacity; 
            private Double dataStorageUsedCapacity; 
            private String dataStorageUsedCapacityDetail; 
            private String logProject; 
            private java.util.List<NormalizationLogStores> normalizationLogStores; 
            private java.util.List<NormalizationLogViews> normalizationLogViews; 
            private java.util.List<SasLogStores> sasLogStores; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.coldStorageUsedCapacity = model.coldStorageUsedCapacity;
                this.dataStorageRegionId = model.dataStorageRegionId;
                this.dataStorageRegionPermission = model.dataStorageRegionPermission;
                this.dataStorageTotalCapacity = model.dataStorageTotalCapacity;
                this.dataStorageUsedCapacity = model.dataStorageUsedCapacity;
                this.dataStorageUsedCapacityDetail = model.dataStorageUsedCapacityDetail;
                this.logProject = model.logProject;
                this.normalizationLogStores = model.normalizationLogStores;
                this.normalizationLogViews = model.normalizationLogViews;
                this.sasLogStores = model.sasLogStores;
            } 

            /**
             * ColdStorageUsedCapacity.
             */
            public Builder coldStorageUsedCapacity(Double coldStorageUsedCapacity) {
                this.coldStorageUsedCapacity = coldStorageUsedCapacity;
                return this;
            }

            /**
             * DataStorageRegionId.
             */
            public Builder dataStorageRegionId(String dataStorageRegionId) {
                this.dataStorageRegionId = dataStorageRegionId;
                return this;
            }

            /**
             * DataStorageRegionPermission.
             */
            public Builder dataStorageRegionPermission(String dataStorageRegionPermission) {
                this.dataStorageRegionPermission = dataStorageRegionPermission;
                return this;
            }

            /**
             * DataStorageTotalCapacity.
             */
            public Builder dataStorageTotalCapacity(Long dataStorageTotalCapacity) {
                this.dataStorageTotalCapacity = dataStorageTotalCapacity;
                return this;
            }

            /**
             * DataStorageUsedCapacity.
             */
            public Builder dataStorageUsedCapacity(Double dataStorageUsedCapacity) {
                this.dataStorageUsedCapacity = dataStorageUsedCapacity;
                return this;
            }

            /**
             * DataStorageUsedCapacityDetail.
             */
            public Builder dataStorageUsedCapacityDetail(String dataStorageUsedCapacityDetail) {
                this.dataStorageUsedCapacityDetail = dataStorageUsedCapacityDetail;
                return this;
            }

            /**
             * LogProject.
             */
            public Builder logProject(String logProject) {
                this.logProject = logProject;
                return this;
            }

            /**
             * NormalizationLogStores.
             */
            public Builder normalizationLogStores(java.util.List<NormalizationLogStores> normalizationLogStores) {
                this.normalizationLogStores = normalizationLogStores;
                return this;
            }

            /**
             * NormalizationLogViews.
             */
            public Builder normalizationLogViews(java.util.List<NormalizationLogViews> normalizationLogViews) {
                this.normalizationLogViews = normalizationLogViews;
                return this;
            }

            /**
             * SasLogStores.
             */
            public Builder sasLogStores(java.util.List<SasLogStores> sasLogStores) {
                this.sasLogStores = sasLogStores;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
