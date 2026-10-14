// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20260120.models;

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
 * {@link ListTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTemplatesResponseBody</p>
 */
public class ListTemplatesResponseBody extends TeaModel {
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

    private ListTemplatesResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTemplatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListTemplatesResponseBody model) {
            this.currentPage = model.currentPage;
            this.items = model.items;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number of the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The list of records returned by the current query.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The number of records per page for the current query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID, which can be used to locate this API call.</p>
         * 
         * <strong>example:</strong>
         * <p>7C6D8E9F-1234-5678-ABCD-0123456789AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records that match the current query scope.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTemplatesResponseBody build() {
            return new ListTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTemplatesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Items model) {
                this.currentRiskLevel = model.currentRiskLevel;
                this.description = model.description;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.maxCategoryLevel = model.maxCategoryLevel;
                this.maxRiskLevel = model.maxRiskLevel;
                this.name = model.name;
                this.status = model.status;
                this.supportEdit = model.supportEdit;
                this.type = model.type;
            } 

            /**
             * <p>The current sensitivity level of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder currentRiskLevel(Integer currentRiskLevel) {
                this.currentRiskLevel = currentRiskLevel;
                return this;
            }

            /**
             * <p>The description of the classification and grading template.</p>
             * 
             * <strong>example:</strong>
             * <p>Used to detect common sensitive data</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the template was created. This value is a UNIX timestamp in milliseconds since 1970-01-01 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1788566400000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the template was last modified. This value is a UNIX timestamp in milliseconds since 1970-01-01 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1788566400000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the classification and grading template.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The maximum category level supported by the template.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder maxCategoryLevel(Integer maxCategoryLevel) {
                this.maxCategoryLevel = maxCategoryLevel;
                return this;
            }

            /**
             * <p>The maximum sensitivity level supported by the template.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder maxRiskLevel(Integer maxRiskLevel) {
                this.maxRiskLevel = maxRiskLevel;
                return this;
            }

            /**
             * <p>The name of the classification and grading template.</p>
             * 
             * <strong>example:</strong>
             * <p>General classification and grading template</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status of the template. Valid values:</p>
             * <ul>
             * <li>0: disabled.</li>
             * <li>1: enabled as the primary template.</li>
             * <li>2: active template.</li>
             * <li>3: general-purpose detection model.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Indicates whether the template can be edited. Valid values:</p>
             * <ul>
             * <li>0: not supported.</li>
             * <li>1: supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder supportEdit(Integer supportEdit) {
                this.supportEdit = supportEdit;
                return this;
            }

            /**
             * <p>The category of the template. Valid values:</p>
             * <ul>
             * <li>1: Alibaba template.</li>
             * <li>2: finance template.</li>
             * <li>3: energy template.</li>
             * <li>4: personal information security template.</li>
             * <li>5: travel template.</li>
             * <li>65: general-purpose template.</li>
             * <li>66: custom template.</li>
             * <li>67: template from another cloud service.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>65</p>
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
