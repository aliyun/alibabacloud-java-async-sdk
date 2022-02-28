// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccesskeyLeakListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccesskeyLeakListResponseBody</p>
 */
public class DescribeAccesskeyLeakListResponseBody extends TeaModel {
    @NameInMap("AccessKeyLeakList")
    private java.util.List < AccessKeyLeakList> accessKeyLeakList;

    @NameInMap("AkLeakCount")
    private Integer akLeakCount;

    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("GmtLast")
    private Long gmtLast;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAccesskeyLeakListResponseBody(Builder builder) {
        this.accessKeyLeakList = builder.accessKeyLeakList;
        this.akLeakCount = builder.akLeakCount;
        this.currentPage = builder.currentPage;
        this.gmtLast = builder.gmtLast;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccesskeyLeakListResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessKeyLeakList
     */
    public java.util.List < AccessKeyLeakList> getAccessKeyLeakList() {
        return this.accessKeyLeakList;
    }

    /**
     * @return akLeakCount
     */
    public Integer getAkLeakCount() {
        return this.akLeakCount;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return gmtLast
     */
    public Long getGmtLast() {
        return this.gmtLast;
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
        private java.util.List < AccessKeyLeakList> accessKeyLeakList; 
        private Integer akLeakCount; 
        private Integer currentPage; 
        private Long gmtLast; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * AccessKeyLeakList.
         */
        public Builder accessKeyLeakList(java.util.List < AccessKeyLeakList> accessKeyLeakList) {
            this.accessKeyLeakList = accessKeyLeakList;
            return this;
        }

        /**
         * AkLeakCount.
         */
        public Builder akLeakCount(Integer akLeakCount) {
            this.akLeakCount = akLeakCount;
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
         * GmtLast.
         */
        public Builder gmtLast(Long gmtLast) {
            this.gmtLast = gmtLast;
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

        public DescribeAccesskeyLeakListResponseBody build() {
            return new DescribeAccesskeyLeakListResponseBody(this);
        } 

    } 

    public static class AccessKeyLeakList extends TeaModel {
        @NameInMap("AccesskeyId")
        private String accesskeyId;

        @NameInMap("AliUserName")
        private String aliUserName;

        @NameInMap("Asset")
        private String asset;

        @NameInMap("DealTime")
        private String dealTime;

        @NameInMap("DealType")
        private String dealType;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        @NameInMap("Url")
        private String url;

        @NameInMap("UserType")
        private String userType;

        private AccessKeyLeakList(Builder builder) {
            this.accesskeyId = builder.accesskeyId;
            this.aliUserName = builder.aliUserName;
            this.asset = builder.asset;
            this.dealTime = builder.dealTime;
            this.dealType = builder.dealType;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.status = builder.status;
            this.type = builder.type;
            this.url = builder.url;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessKeyLeakList create() {
            return builder().build();
        }

        /**
         * @return accesskeyId
         */
        public String getAccesskeyId() {
            return this.accesskeyId;
        }

        /**
         * @return aliUserName
         */
        public String getAliUserName() {
            return this.aliUserName;
        }

        /**
         * @return asset
         */
        public String getAsset() {
            return this.asset;
        }

        /**
         * @return dealTime
         */
        public String getDealTime() {
            return this.dealTime;
        }

        /**
         * @return dealType
         */
        public String getDealType() {
            return this.dealType;
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
         * @return status
         */
        public String getStatus() {
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

        /**
         * @return userType
         */
        public String getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private String accesskeyId; 
            private String aliUserName; 
            private String asset; 
            private String dealTime; 
            private String dealType; 
            private Long gmtModified; 
            private Long id; 
            private String status; 
            private String type; 
            private String url; 
            private String userType; 

            /**
             * AccesskeyId.
             */
            public Builder accesskeyId(String accesskeyId) {
                this.accesskeyId = accesskeyId;
                return this;
            }

            /**
             * AliUserName.
             */
            public Builder aliUserName(String aliUserName) {
                this.aliUserName = aliUserName;
                return this;
            }

            /**
             * Asset.
             */
            public Builder asset(String asset) {
                this.asset = asset;
                return this;
            }

            /**
             * DealTime.
             */
            public Builder dealTime(String dealTime) {
                this.dealTime = dealTime;
                return this;
            }

            /**
             * DealType.
             */
            public Builder dealType(String dealType) {
                this.dealType = dealType;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * UserType.
             */
            public Builder userType(String userType) {
                this.userType = userType;
                return this;
            }

            public AccessKeyLeakList build() {
                return new AccessKeyLeakList(this);
            } 

        } 

    }
}
