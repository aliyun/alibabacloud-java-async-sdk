// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSampleDataListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSampleDataListResponseBody</p>
 */
public class DescribeSampleDataListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("currentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List < ResultObject> resultObject;

    @com.aliyun.core.annotation.NameInMap("totalItem")
    private Integer totalItem;

    @com.aliyun.core.annotation.NameInMap("totalPage")
    private Integer totalPage;

    private DescribeSampleDataListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.resultObject = builder.resultObject;
        this.totalItem = builder.totalItem;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSampleDataListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return resultObject
     */
    public java.util.List < ResultObject> getResultObject() {
        return this.resultObject;
    }

    /**
     * @return totalItem
     */
    public Integer getTotalItem() {
        return this.totalItem;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private String requestId; 
        private Integer currentPage; 
        private Integer pageSize; 
        private java.util.List < ResultObject> resultObject; 
        private Integer totalItem; 
        private Integer totalPage; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * currentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * resultObject.
         */
        public Builder resultObject(java.util.List < ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        /**
         * totalItem.
         */
        public Builder totalItem(Integer totalItem) {
            this.totalItem = totalItem;
            return this;
        }

        /**
         * totalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeSampleDataListResponseBody build() {
            return new DescribeSampleDataListResponseBody(this);
        } 

    } 

    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("classificationType")
        private String classificationType;

        @com.aliyun.core.annotation.NameInMap("dataDistributed")
        private String dataDistributed;

        @com.aliyun.core.annotation.NameInMap("dataTitle")
        private String dataTitle;

        @com.aliyun.core.annotation.NameInMap("deleteTag")
        private String deleteTag;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("normalSize")
        private Long normalSize;

        @com.aliyun.core.annotation.NameInMap("recallConfig")
        private String recallConfig;

        @com.aliyun.core.annotation.NameInMap("riskSize")
        private Long riskSize;

        @com.aliyun.core.annotation.NameInMap("riskValue")
        private String riskValue;

        @com.aliyun.core.annotation.NameInMap("sampleLabelDetail")
        private String sampleLabelDetail;

        @com.aliyun.core.annotation.NameInMap("sampleSize")
        private Long sampleSize;

        @com.aliyun.core.annotation.NameInMap("scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("storePath")
        private String storePath;

        @com.aliyun.core.annotation.NameInMap("storeType")
        private String storeType;

        @com.aliyun.core.annotation.NameInMap("supportRecall")
        private String supportRecall;

        @com.aliyun.core.annotation.NameInMap("userId")
        private Long userId;

        @com.aliyun.core.annotation.NameInMap("version")
        private Integer version;

        private ResultObject(Builder builder) {
            this.classificationType = builder.classificationType;
            this.dataDistributed = builder.dataDistributed;
            this.dataTitle = builder.dataTitle;
            this.deleteTag = builder.deleteTag;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.name = builder.name;
            this.normalSize = builder.normalSize;
            this.recallConfig = builder.recallConfig;
            this.riskSize = builder.riskSize;
            this.riskValue = builder.riskValue;
            this.sampleLabelDetail = builder.sampleLabelDetail;
            this.sampleSize = builder.sampleSize;
            this.scene = builder.scene;
            this.status = builder.status;
            this.storePath = builder.storePath;
            this.storeType = builder.storeType;
            this.supportRecall = builder.supportRecall;
            this.userId = builder.userId;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return classificationType
         */
        public String getClassificationType() {
            return this.classificationType;
        }

        /**
         * @return dataDistributed
         */
        public String getDataDistributed() {
            return this.dataDistributed;
        }

        /**
         * @return dataTitle
         */
        public String getDataTitle() {
            return this.dataTitle;
        }

        /**
         * @return deleteTag
         */
        public String getDeleteTag() {
            return this.deleteTag;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return normalSize
         */
        public Long getNormalSize() {
            return this.normalSize;
        }

        /**
         * @return recallConfig
         */
        public String getRecallConfig() {
            return this.recallConfig;
        }

        /**
         * @return riskSize
         */
        public Long getRiskSize() {
            return this.riskSize;
        }

        /**
         * @return riskValue
         */
        public String getRiskValue() {
            return this.riskValue;
        }

        /**
         * @return sampleLabelDetail
         */
        public String getSampleLabelDetail() {
            return this.sampleLabelDetail;
        }

        /**
         * @return sampleSize
         */
        public Long getSampleSize() {
            return this.sampleSize;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storePath
         */
        public String getStorePath() {
            return this.storePath;
        }

        /**
         * @return storeType
         */
        public String getStoreType() {
            return this.storeType;
        }

        /**
         * @return supportRecall
         */
        public String getSupportRecall() {
            return this.supportRecall;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String classificationType; 
            private String dataDistributed; 
            private String dataTitle; 
            private String deleteTag; 
            private String description; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long id; 
            private String name; 
            private Long normalSize; 
            private String recallConfig; 
            private Long riskSize; 
            private String riskValue; 
            private String sampleLabelDetail; 
            private Long sampleSize; 
            private String scene; 
            private String status; 
            private String storePath; 
            private String storeType; 
            private String supportRecall; 
            private Long userId; 
            private Integer version; 

            /**
             * classificationType.
             */
            public Builder classificationType(String classificationType) {
                this.classificationType = classificationType;
                return this;
            }

            /**
             * dataDistributed.
             */
            public Builder dataDistributed(String dataDistributed) {
                this.dataDistributed = dataDistributed;
                return this;
            }

            /**
             * dataTitle.
             */
            public Builder dataTitle(String dataTitle) {
                this.dataTitle = dataTitle;
                return this;
            }

            /**
             * deleteTag.
             */
            public Builder deleteTag(String deleteTag) {
                this.deleteTag = deleteTag;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * normalSize.
             */
            public Builder normalSize(Long normalSize) {
                this.normalSize = normalSize;
                return this;
            }

            /**
             * recallConfig.
             */
            public Builder recallConfig(String recallConfig) {
                this.recallConfig = recallConfig;
                return this;
            }

            /**
             * riskSize.
             */
            public Builder riskSize(Long riskSize) {
                this.riskSize = riskSize;
                return this;
            }

            /**
             * riskValue.
             */
            public Builder riskValue(String riskValue) {
                this.riskValue = riskValue;
                return this;
            }

            /**
             * sampleLabelDetail.
             */
            public Builder sampleLabelDetail(String sampleLabelDetail) {
                this.sampleLabelDetail = sampleLabelDetail;
                return this;
            }

            /**
             * sampleSize.
             */
            public Builder sampleSize(Long sampleSize) {
                this.sampleSize = sampleSize;
                return this;
            }

            /**
             * scene.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * storePath.
             */
            public Builder storePath(String storePath) {
                this.storePath = storePath;
                return this;
            }

            /**
             * storeType.
             */
            public Builder storeType(String storeType) {
                this.storeType = storeType;
                return this;
            }

            /**
             * supportRecall.
             */
            public Builder supportRecall(String supportRecall) {
                this.supportRecall = supportRecall;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * version.
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
