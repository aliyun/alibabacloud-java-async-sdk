// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSubSceneResponseBody} extends {@link TeaModel}
 *
 * <p>ListSubSceneResponseBody</p>
 */
public class ListSubSceneResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("Count")
    private Long count;

    @NameInMap("CurrentPage")
    private Long currentPage;

    @NameInMap("HasNext")
    private Boolean hasNext;

    @NameInMap("List")
    private java.util.List < List> list;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalPage")
    private Long totalPage;

    private ListSubSceneResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.currentPage = builder.currentPage;
        this.hasNext = builder.hasNext;
        this.list = builder.list;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSubSceneResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return hasNext
     */
    public Boolean getHasNext() {
        return this.hasNext;
    }

    /**
     * @return list
     */
    public java.util.List < List> getList() {
        return this.list;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalPage
     */
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private Long code; 
        private Long count; 
        private Long currentPage; 
        private Boolean hasNext; 
        private java.util.List < List> list; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Long totalPage; 

        /**
         * ?????????
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * ???????????????
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * ?????????
         */
        public Builder currentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * ??????????????????
         */
        public Builder hasNext(Boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }

        /**
         * ??????????????????
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
            return this;
        }

        /**
         * ????????????
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * ??????ID????????????requestId??????
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ??????????????????
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * ?????????
         */
        public Builder totalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public ListSubSceneResponseBody build() {
            return new ListSubSceneResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("BaseImageUrl")
        private String baseImageUrl;

        @NameInMap("CoverUrl")
        private String coverUrl;

        @NameInMap("CubemapPath")
        private String cubemapPath;

        @NameInMap("Deleted")
        private Boolean deleted;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("Id")
        private String id;

        @NameInMap("LayoutData")
        private String layoutData;

        @NameInMap("Name")
        private String name;

        @NameInMap("OriginUrl")
        private String originUrl;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceName")
        private String resourceName;

        @NameInMap("Status")
        private Long status;

        @NameInMap("Type")
        private String type;

        @NameInMap("Url")
        private String url;

        private List(Builder builder) {
            this.baseImageUrl = builder.baseImageUrl;
            this.coverUrl = builder.coverUrl;
            this.cubemapPath = builder.cubemapPath;
            this.deleted = builder.deleted;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.layoutData = builder.layoutData;
            this.name = builder.name;
            this.originUrl = builder.originUrl;
            this.resourceId = builder.resourceId;
            this.resourceName = builder.resourceName;
            this.status = builder.status;
            this.type = builder.type;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return baseImageUrl
         */
        public String getBaseImageUrl() {
            return this.baseImageUrl;
        }

        /**
         * @return coverUrl
         */
        public String getCoverUrl() {
            return this.coverUrl;
        }

        /**
         * @return cubemapPath
         */
        public String getCubemapPath() {
            return this.cubemapPath;
        }

        /**
         * @return deleted
         */
        public Boolean getDeleted() {
            return this.deleted;
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
        public String getId() {
            return this.id;
        }

        /**
         * @return layoutData
         */
        public String getLayoutData() {
            return this.layoutData;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return originUrl
         */
        public String getOriginUrl() {
            return this.originUrl;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String baseImageUrl; 
            private String coverUrl; 
            private String cubemapPath; 
            private Boolean deleted; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String id; 
            private String layoutData; 
            private String name; 
            private String originUrl; 
            private String resourceId; 
            private String resourceName; 
            private Long status; 
            private String type; 
            private String url; 

            /**
             * 2k???????????????
             */
            public Builder baseImageUrl(String baseImageUrl) {
                this.baseImageUrl = baseImageUrl;
                return this;
            }

            /**
             * ????????????/??????????????????
             */
            public Builder coverUrl(String coverUrl) {
                this.coverUrl = coverUrl;
                return this;
            }

            /**
             * ???????????????
             */
            public Builder cubemapPath(String cubemapPath) {
                this.cubemapPath = cubemapPath;
                return this;
            }

            /**
             * ????????????
             */
            public Builder deleted(Boolean deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * ????????????
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * ??????????????????
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * ?????????ID
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * ????????????
             */
            public Builder layoutData(String layoutData) {
                this.layoutData = layoutData;
                return this;
            }

            /**
             * ???????????????
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ????????????
             */
            public Builder originUrl(String originUrl) {
                this.originUrl = originUrl;
                return this;
            }

            /**
             * ??????ID/??????ID
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ????????????
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * ??????????????? 1.????????????      * 2.????????????????????????      * 3.???????????????????????????      * 4.????????????      * 5.?????????????????????      * 6.????????????????????????      * 7.?????????      * 8.?????????
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * ??????????????????
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * ????????????/????????????
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
