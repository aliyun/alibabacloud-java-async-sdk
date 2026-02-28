// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryStudioAppPageListOpenResponseBody} extends {@link TeaModel}
 *
 * <p>QueryStudioAppPageListOpenResponseBody</p>
 */
public class QueryStudioAppPageListOpenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryStudioAppPageListOpenResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryStudioAppPageListOpenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryStudioAppPageListOpenResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
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
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryStudioAppPageListOpenResponseBody build() {
            return new QueryStudioAppPageListOpenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryStudioAppPageListOpenResponseBody} extends {@link TeaModel}
     *
     * <p>QueryStudioAppPageListOpenResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("IsHidden")
        private Integer isHidden;

        @com.aliyun.core.annotation.NameInMap("IsHome")
        private Integer isHome;

        @com.aliyun.core.annotation.NameInMap("IsLoginPage")
        private Integer isLoginPage;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PageId")
        private String pageId;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        private PageInfo(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.isHidden = builder.isHidden;
            this.isHome = builder.isHome;
            this.isLoginPage = builder.isLoginPage;
            this.name = builder.name;
            this.pageId = builder.pageId;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return isHidden
         */
        public Integer getIsHidden() {
            return this.isHidden;
        }

        /**
         * @return isHome
         */
        public Integer getIsHome() {
            return this.isHome;
        }

        /**
         * @return isLoginPage
         */
        public Integer getIsLoginPage() {
            return this.isLoginPage;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pageId
         */
        public String getPageId() {
            return this.pageId;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String gmtCreate; 
            private String gmtModified; 
            private Integer id; 
            private Integer isHidden; 
            private Integer isHome; 
            private Integer isLoginPage; 
            private String name; 
            private String pageId; 
            private String path; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.isHidden = model.isHidden;
                this.isHome = model.isHome;
                this.isLoginPage = model.isLoginPage;
                this.name = model.name;
                this.pageId = model.pageId;
                this.path = model.path;
            } 

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * IsHidden.
             */
            public Builder isHidden(Integer isHidden) {
                this.isHidden = isHidden;
                return this;
            }

            /**
             * IsHome.
             */
            public Builder isHome(Integer isHome) {
                this.isHome = isHome;
                return this;
            }

            /**
             * IsLoginPage.
             */
            public Builder isLoginPage(Integer isLoginPage) {
                this.isLoginPage = isLoginPage;
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
             * PageId.
             */
            public Builder pageId(String pageId) {
                this.pageId = pageId;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryStudioAppPageListOpenResponseBody} extends {@link TeaModel}
     *
     * <p>QueryStudioAppPageListOpenResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageInfo")
        private java.util.List<PageInfo> pageInfo;

        private List(Builder builder) {
            this.pageInfo = builder.pageInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return pageInfo
         */
        public java.util.List<PageInfo> getPageInfo() {
            return this.pageInfo;
        }

        public static final class Builder {
            private java.util.List<PageInfo> pageInfo; 

            private Builder() {
            } 

            private Builder(List model) {
                this.pageInfo = model.pageInfo;
            } 

            /**
             * PageInfo.
             */
            public Builder pageInfo(java.util.List<PageInfo> pageInfo) {
                this.pageInfo = pageInfo;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryStudioAppPageListOpenResponseBody} extends {@link TeaModel}
     *
     * <p>QueryStudioAppPageListOpenResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private List list;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        @com.aliyun.core.annotation.NameInMap("TotalPage")
        private Integer totalPage;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
            this.totalPage = builder.totalPage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public List getList() {
            return this.list;
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        /**
         * @return totalPage
         */
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public static final class Builder {
            private List list; 
            private Integer pageNo; 
            private Integer pageSize; 
            private Integer total; 
            private Integer totalPage; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.total = model.total;
                this.totalPage = model.totalPage;
            } 

            /**
             * List.
             */
            public Builder list(List list) {
                this.list = list;
                return this;
            }

            /**
             * PageNo.
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
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
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            /**
             * TotalPage.
             */
            public Builder totalPage(Integer totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
