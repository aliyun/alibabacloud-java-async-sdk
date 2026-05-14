// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link CloudListSkillResponseBody} extends {@link TeaModel}
 *
 * <p>CloudListSkillResponseBody</p>
 */
public class CloudListSkillResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CloudListSkillResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudListSkillResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CloudListSkillResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CloudListSkillResponseBody build() {
            return new CloudListSkillResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CloudListSkillResponseBody} extends {@link TeaModel}
     *
     * <p>CloudListSkillResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EnterpriseId")
        private Long enterpriseId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private List(Builder builder) {
            this.comment = builder.comment;
            this.createTime = builder.createTime;
            this.enterpriseId = builder.enterpriseId;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return enterpriseId
         */
        public Long getEnterpriseId() {
            return this.enterpriseId;
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

        public static final class Builder {
            private String comment; 
            private String createTime; 
            private Long enterpriseId; 
            private Long id; 
            private String name; 

            private Builder() {
            } 

            private Builder(List model) {
                this.comment = model.comment;
                this.createTime = model.createTime;
                this.enterpriseId = model.enterpriseId;
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * <p>描述</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>创建时间,精确到秒</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-30 06:12:41</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>企业编号</p>
             * 
             * <strong>example:</strong>
             * <p>7122600</p>
             */
            public Builder enterpriseId(Long enterpriseId) {
                this.enterpriseId = enterpriseId;
                return this;
            }

            /**
             * <p>技能id</p>
             * 
             * <strong>example:</strong>
             * <p>52593</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>技能名称</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloudListSkillResponseBody} extends {@link TeaModel}
     *
     * <p>CloudListSkillResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndRow")
        private String endRow;

        @com.aliyun.core.annotation.NameInMap("FirstPage")
        private String firstPage;

        @com.aliyun.core.annotation.NameInMap("HasNextPage")
        private Boolean hasNextPage;

        @com.aliyun.core.annotation.NameInMap("HasPreviousPage")
        private Boolean hasPreviousPage;

        @com.aliyun.core.annotation.NameInMap("IsFirstPage")
        private Boolean isFirstPage;

        @com.aliyun.core.annotation.NameInMap("IsLastPage")
        private Boolean isLastPage;

        @com.aliyun.core.annotation.NameInMap("LastPage")
        private String lastPage;

        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("NavigatePages")
        private String navigatePages;

        @com.aliyun.core.annotation.NameInMap("NavigatepageNums")
        private java.util.List<String> navigatepageNums;

        @com.aliyun.core.annotation.NameInMap("NextPage")
        private String nextPage;

        @com.aliyun.core.annotation.NameInMap("OrderBy")
        private String orderBy;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private String pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private String pageSize;

        @com.aliyun.core.annotation.NameInMap("Pages")
        private String pages;

        @com.aliyun.core.annotation.NameInMap("PrePage")
        private String prePage;

        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

        @com.aliyun.core.annotation.NameInMap("StartRow")
        private String startRow;

        @com.aliyun.core.annotation.NameInMap("Total")
        private String total;

        private Data(Builder builder) {
            this.endRow = builder.endRow;
            this.firstPage = builder.firstPage;
            this.hasNextPage = builder.hasNextPage;
            this.hasPreviousPage = builder.hasPreviousPage;
            this.isFirstPage = builder.isFirstPage;
            this.isLastPage = builder.isLastPage;
            this.lastPage = builder.lastPage;
            this.list = builder.list;
            this.navigatePages = builder.navigatePages;
            this.navigatepageNums = builder.navigatepageNums;
            this.nextPage = builder.nextPage;
            this.orderBy = builder.orderBy;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.pages = builder.pages;
            this.prePage = builder.prePage;
            this.size = builder.size;
            this.startRow = builder.startRow;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return endRow
         */
        public String getEndRow() {
            return this.endRow;
        }

        /**
         * @return firstPage
         */
        public String getFirstPage() {
            return this.firstPage;
        }

        /**
         * @return hasNextPage
         */
        public Boolean getHasNextPage() {
            return this.hasNextPage;
        }

        /**
         * @return hasPreviousPage
         */
        public Boolean getHasPreviousPage() {
            return this.hasPreviousPage;
        }

        /**
         * @return isFirstPage
         */
        public Boolean getIsFirstPage() {
            return this.isFirstPage;
        }

        /**
         * @return isLastPage
         */
        public Boolean getIsLastPage() {
            return this.isLastPage;
        }

        /**
         * @return lastPage
         */
        public String getLastPage() {
            return this.lastPage;
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return navigatePages
         */
        public String getNavigatePages() {
            return this.navigatePages;
        }

        /**
         * @return navigatepageNums
         */
        public java.util.List<String> getNavigatepageNums() {
            return this.navigatepageNums;
        }

        /**
         * @return nextPage
         */
        public String getNextPage() {
            return this.nextPage;
        }

        /**
         * @return orderBy
         */
        public String getOrderBy() {
            return this.orderBy;
        }

        /**
         * @return pageNum
         */
        public String getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public String getPageSize() {
            return this.pageSize;
        }

        /**
         * @return pages
         */
        public String getPages() {
            return this.pages;
        }

        /**
         * @return prePage
         */
        public String getPrePage() {
            return this.prePage;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return startRow
         */
        public String getStartRow() {
            return this.startRow;
        }

        /**
         * @return total
         */
        public String getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String endRow; 
            private String firstPage; 
            private Boolean hasNextPage; 
            private Boolean hasPreviousPage; 
            private Boolean isFirstPage; 
            private Boolean isLastPage; 
            private String lastPage; 
            private java.util.List<List> list; 
            private String navigatePages; 
            private java.util.List<String> navigatepageNums; 
            private String nextPage; 
            private String orderBy; 
            private String pageNum; 
            private String pageSize; 
            private String pages; 
            private String prePage; 
            private String size; 
            private String startRow; 
            private String total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.endRow = model.endRow;
                this.firstPage = model.firstPage;
                this.hasNextPage = model.hasNextPage;
                this.hasPreviousPage = model.hasPreviousPage;
                this.isFirstPage = model.isFirstPage;
                this.isLastPage = model.isLastPage;
                this.lastPage = model.lastPage;
                this.list = model.list;
                this.navigatePages = model.navigatePages;
                this.navigatepageNums = model.navigatepageNums;
                this.nextPage = model.nextPage;
                this.orderBy = model.orderBy;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.pages = model.pages;
                this.prePage = model.prePage;
                this.size = model.size;
                this.startRow = model.startRow;
                this.total = model.total;
            } 

            /**
             * EndRow.
             */
            public Builder endRow(String endRow) {
                this.endRow = endRow;
                return this;
            }

            /**
             * FirstPage.
             */
            public Builder firstPage(String firstPage) {
                this.firstPage = firstPage;
                return this;
            }

            /**
             * HasNextPage.
             */
            public Builder hasNextPage(Boolean hasNextPage) {
                this.hasNextPage = hasNextPage;
                return this;
            }

            /**
             * HasPreviousPage.
             */
            public Builder hasPreviousPage(Boolean hasPreviousPage) {
                this.hasPreviousPage = hasPreviousPage;
                return this;
            }

            /**
             * IsFirstPage.
             */
            public Builder isFirstPage(Boolean isFirstPage) {
                this.isFirstPage = isFirstPage;
                return this;
            }

            /**
             * IsLastPage.
             */
            public Builder isLastPage(Boolean isLastPage) {
                this.isLastPage = isLastPage;
                return this;
            }

            /**
             * LastPage.
             */
            public Builder lastPage(String lastPage) {
                this.lastPage = lastPage;
                return this;
            }

            /**
             * List.
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * NavigatePages.
             */
            public Builder navigatePages(String navigatePages) {
                this.navigatePages = navigatePages;
                return this;
            }

            /**
             * NavigatepageNums.
             */
            public Builder navigatepageNums(java.util.List<String> navigatepageNums) {
                this.navigatepageNums = navigatepageNums;
                return this;
            }

            /**
             * NextPage.
             */
            public Builder nextPage(String nextPage) {
                this.nextPage = nextPage;
                return this;
            }

            /**
             * OrderBy.
             */
            public Builder orderBy(String orderBy) {
                this.orderBy = orderBy;
                return this;
            }

            /**
             * PageNum.
             */
            public Builder pageNum(String pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(String pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Pages.
             */
            public Builder pages(String pages) {
                this.pages = pages;
                return this;
            }

            /**
             * PrePage.
             */
            public Builder prePage(String prePage) {
                this.prePage = prePage;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * StartRow.
             */
            public Builder startRow(String startRow) {
                this.startRow = startRow;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(String total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
