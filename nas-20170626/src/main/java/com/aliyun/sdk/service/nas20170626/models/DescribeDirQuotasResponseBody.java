// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDirQuotasResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDirQuotasResponseBody</p>
 */
public class DescribeDirQuotasResponseBody extends TeaModel {
    @NameInMap("DirQuotaInfos")
    private java.util.List < DirQuotaInfos> dirQuotaInfos;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDirQuotasResponseBody(Builder builder) {
        this.dirQuotaInfos = builder.dirQuotaInfos;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDirQuotasResponseBody create() {
        return builder().build();
    }

    /**
     * @return dirQuotaInfos
     */
    public java.util.List < DirQuotaInfos> getDirQuotaInfos() {
        return this.dirQuotaInfos;
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
        private java.util.List < DirQuotaInfos> dirQuotaInfos; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * DirQuotaInfos.
         */
        public Builder dirQuotaInfos(java.util.List < DirQuotaInfos> dirQuotaInfos) {
            this.dirQuotaInfos = dirQuotaInfos;
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

        public DescribeDirQuotasResponseBody build() {
            return new DescribeDirQuotasResponseBody(this);
        } 

    } 

    public static class UserQuotaInfos extends TeaModel {
        @NameInMap("FileCountLimit")
        private Long fileCountLimit;

        @NameInMap("FileCountReal")
        private Long fileCountReal;

        @NameInMap("QuotaType")
        private String quotaType;

        @NameInMap("SizeLimit")
        private Long sizeLimit;

        @NameInMap("SizeReal")
        private Long sizeReal;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("UserType")
        private String userType;

        private UserQuotaInfos(Builder builder) {
            this.fileCountLimit = builder.fileCountLimit;
            this.fileCountReal = builder.fileCountReal;
            this.quotaType = builder.quotaType;
            this.sizeLimit = builder.sizeLimit;
            this.sizeReal = builder.sizeReal;
            this.userId = builder.userId;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserQuotaInfos create() {
            return builder().build();
        }

        /**
         * @return fileCountLimit
         */
        public Long getFileCountLimit() {
            return this.fileCountLimit;
        }

        /**
         * @return fileCountReal
         */
        public Long getFileCountReal() {
            return this.fileCountReal;
        }

        /**
         * @return quotaType
         */
        public String getQuotaType() {
            return this.quotaType;
        }

        /**
         * @return sizeLimit
         */
        public Long getSizeLimit() {
            return this.sizeLimit;
        }

        /**
         * @return sizeReal
         */
        public Long getSizeReal() {
            return this.sizeReal;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userType
         */
        public String getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private Long fileCountLimit; 
            private Long fileCountReal; 
            private String quotaType; 
            private Long sizeLimit; 
            private Long sizeReal; 
            private String userId; 
            private String userType; 

            /**
             * FileCountLimit.
             */
            public Builder fileCountLimit(Long fileCountLimit) {
                this.fileCountLimit = fileCountLimit;
                return this;
            }

            /**
             * FileCountReal.
             */
            public Builder fileCountReal(Long fileCountReal) {
                this.fileCountReal = fileCountReal;
                return this;
            }

            /**
             * QuotaType.
             */
            public Builder quotaType(String quotaType) {
                this.quotaType = quotaType;
                return this;
            }

            /**
             * SizeLimit.
             */
            public Builder sizeLimit(Long sizeLimit) {
                this.sizeLimit = sizeLimit;
                return this;
            }

            /**
             * SizeReal.
             */
            public Builder sizeReal(Long sizeReal) {
                this.sizeReal = sizeReal;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserType.
             */
            public Builder userType(String userType) {
                this.userType = userType;
                return this;
            }

            public UserQuotaInfos build() {
                return new UserQuotaInfos(this);
            } 

        } 

    }
    public static class DirQuotaInfos extends TeaModel {
        @NameInMap("DirInode")
        private String dirInode;

        @NameInMap("Path")
        private String path;

        @NameInMap("Status")
        private String status;

        @NameInMap("UserQuotaInfos")
        private java.util.List < UserQuotaInfos> userQuotaInfos;

        private DirQuotaInfos(Builder builder) {
            this.dirInode = builder.dirInode;
            this.path = builder.path;
            this.status = builder.status;
            this.userQuotaInfos = builder.userQuotaInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DirQuotaInfos create() {
            return builder().build();
        }

        /**
         * @return dirInode
         */
        public String getDirInode() {
            return this.dirInode;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userQuotaInfos
         */
        public java.util.List < UserQuotaInfos> getUserQuotaInfos() {
            return this.userQuotaInfos;
        }

        public static final class Builder {
            private String dirInode; 
            private String path; 
            private String status; 
            private java.util.List < UserQuotaInfos> userQuotaInfos; 

            /**
             * DirInode.
             */
            public Builder dirInode(String dirInode) {
                this.dirInode = dirInode;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
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
             * UserQuotaInfos.
             */
            public Builder userQuotaInfos(java.util.List < UserQuotaInfos> userQuotaInfos) {
                this.userQuotaInfos = userQuotaInfos;
                return this;
            }

            public DirQuotaInfos build() {
                return new DirQuotaInfos(this);
            } 

        } 

    }
}
