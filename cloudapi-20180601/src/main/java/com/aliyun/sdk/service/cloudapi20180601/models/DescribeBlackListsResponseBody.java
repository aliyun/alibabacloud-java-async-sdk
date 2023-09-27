// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBlackListsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBlackListsResponseBody</p>
 */
public class DescribeBlackListsResponseBody extends TeaModel {
    @NameInMap("BlackLists")
    private BlackLists blackLists;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeBlackListsResponseBody(Builder builder) {
        this.blackLists = builder.blackLists;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBlackListsResponseBody create() {
        return builder().build();
    }

    /**
     * @return blackLists
     */
    public BlackLists getBlackLists() {
        return this.blackLists;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
        private BlackLists blackLists; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * BlackLists.
         */
        public Builder blackLists(BlackLists blackLists) {
            this.blackLists = blackLists;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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

        public DescribeBlackListsResponseBody build() {
            return new DescribeBlackListsResponseBody(this);
        } 

    } 

    public static class BlackList extends TeaModel {
        @NameInMap("BlackContent")
        private String blackContent;

        @NameInMap("BlackType")
        private String blackType;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        private BlackList(Builder builder) {
            this.blackContent = builder.blackContent;
            this.blackType = builder.blackType;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.modifiedTime = builder.modifiedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlackList create() {
            return builder().build();
        }

        /**
         * @return blackContent
         */
        public String getBlackContent() {
            return this.blackContent;
        }

        /**
         * @return blackType
         */
        public String getBlackType() {
            return this.blackType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public static final class Builder {
            private String blackContent; 
            private String blackType; 
            private String createTime; 
            private String description; 
            private String modifiedTime; 

            /**
             * BlackContent.
             */
            public Builder blackContent(String blackContent) {
                this.blackContent = blackContent;
                return this;
            }

            /**
             * BlackType.
             */
            public Builder blackType(String blackType) {
                this.blackType = blackType;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            public BlackList build() {
                return new BlackList(this);
            } 

        } 

    }
    public static class BlackLists extends TeaModel {
        @NameInMap("BlackList")
        private java.util.List < BlackList> blackList;

        private BlackLists(Builder builder) {
            this.blackList = builder.blackList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlackLists create() {
            return builder().build();
        }

        /**
         * @return blackList
         */
        public java.util.List < BlackList> getBlackList() {
            return this.blackList;
        }

        public static final class Builder {
            private java.util.List < BlackList> blackList; 

            /**
             * BlackList.
             */
            public Builder blackList(java.util.List < BlackList> blackList) {
                this.blackList = blackList;
                return this;
            }

            public BlackLists build() {
                return new BlackLists(this);
            } 

        } 

    }
}
