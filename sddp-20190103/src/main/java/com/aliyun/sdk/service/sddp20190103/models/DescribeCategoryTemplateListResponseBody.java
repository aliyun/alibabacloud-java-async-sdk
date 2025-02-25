// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

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
 * {@link DescribeCategoryTemplateListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCategoryTemplateListResponseBody</p>
 */
public class DescribeCategoryTemplateListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCategoryTemplateListResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCategoryTemplateListResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer currentPage; 
        private java.util.List<Items> items; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCategoryTemplateListResponseBody build() {
            return new DescribeCategoryTemplateListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCategoryTemplateListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCategoryTemplateListResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentRiskLevel")
        private Integer currentRiskLevel;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("MaxCategoryLevel")
        private Integer maxCategoryLevel;

        @com.aliyun.core.annotation.NameInMap("MaxRiskLevel")
        private Integer maxRiskLevel;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("SupportEdit")
        private Integer supportEdit;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        private Items(Builder builder) {
            this.currentRiskLevel = builder.currentRiskLevel;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.maxCategoryLevel = builder.maxCategoryLevel;
            this.maxRiskLevel = builder.maxRiskLevel;
            this.name = builder.name;
            this.status = builder.status;
            this.supportEdit = builder.supportEdit;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return currentRiskLevel
         */
        public Integer getCurrentRiskLevel() {
            return this.currentRiskLevel;
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
         * @return maxCategoryLevel
         */
        public Integer getMaxCategoryLevel() {
            return this.maxCategoryLevel;
        }

        /**
         * @return maxRiskLevel
         */
        public Integer getMaxRiskLevel() {
            return this.maxRiskLevel;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return supportEdit
         */
        public Integer getSupportEdit() {
            return this.supportEdit;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer currentRiskLevel; 
            private String description; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long id; 
            private Integer maxCategoryLevel; 
            private Integer maxRiskLevel; 
            private String name; 
            private Integer status; 
            private Integer supportEdit; 
            private Integer type; 

            /**
             * CurrentRiskLevel.
             */
            public Builder currentRiskLevel(Integer currentRiskLevel) {
                this.currentRiskLevel = currentRiskLevel;
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
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
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
             * MaxCategoryLevel.
             */
            public Builder maxCategoryLevel(Integer maxCategoryLevel) {
                this.maxCategoryLevel = maxCategoryLevel;
                return this;
            }

            /**
             * MaxRiskLevel.
             */
            public Builder maxRiskLevel(Integer maxRiskLevel) {
                this.maxRiskLevel = maxRiskLevel;
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
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * SupportEdit.
             */
            public Builder supportEdit(Integer supportEdit) {
                this.supportEdit = supportEdit;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
