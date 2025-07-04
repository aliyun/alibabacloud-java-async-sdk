// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link DescribeDirQuotasResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDirQuotasResponseBody</p>
 */
public class DescribeDirQuotasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DirQuotaInfos")
    private java.util.List<DirQuotaInfos> dirQuotaInfos;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dirQuotaInfos
     */
    public java.util.List<DirQuotaInfos> getDirQuotaInfos() {
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
        private java.util.List<DirQuotaInfos> dirQuotaInfos; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeDirQuotasResponseBody model) {
            this.dirQuotaInfos = model.dirQuotaInfos;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The queried directory quotas.</p>
         */
        public Builder dirQuotaInfos(java.util.List<DirQuotaInfos> dirQuotaInfos) {
            this.dirQuotaInfos = dirQuotaInfos;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5BC5CB97-9F28-42FE-84A4-0CD0DF42****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of directories.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDirQuotasResponseBody build() {
            return new DescribeDirQuotasResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDirQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDirQuotasResponseBody</p>
     */
    public static class UserQuotaInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileCountLimit")
        private Long fileCountLimit;

        @com.aliyun.core.annotation.NameInMap("FileCountReal")
        private Long fileCountReal;

        @com.aliyun.core.annotation.NameInMap("QuotaType")
        private String quotaType;

        @com.aliyun.core.annotation.NameInMap("SizeLimit")
        private Long sizeLimit;

        @com.aliyun.core.annotation.NameInMap("SizeReal")
        private Long sizeReal;

        @com.aliyun.core.annotation.NameInMap("SizeRealInByte")
        private Long sizeRealInByte;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserType")
        private String userType;

        private UserQuotaInfos(Builder builder) {
            this.fileCountLimit = builder.fileCountLimit;
            this.fileCountReal = builder.fileCountReal;
            this.quotaType = builder.quotaType;
            this.sizeLimit = builder.sizeLimit;
            this.sizeReal = builder.sizeReal;
            this.sizeRealInByte = builder.sizeRealInByte;
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
         * @return sizeRealInByte
         */
        public Long getSizeRealInByte() {
            return this.sizeRealInByte;
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
            private Long sizeRealInByte; 
            private String userId; 
            private String userType; 

            private Builder() {
            } 

            private Builder(UserQuotaInfos model) {
                this.fileCountLimit = model.fileCountLimit;
                this.fileCountReal = model.fileCountReal;
                this.quotaType = model.quotaType;
                this.sizeLimit = model.sizeLimit;
                this.sizeReal = model.sizeReal;
                this.sizeRealInByte = model.sizeRealInByte;
                this.userId = model.userId;
                this.userType = model.userType;
            } 

            /**
             * <p>The maximum number of files that a user can create in the directory.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder fileCountLimit(Long fileCountLimit) {
                this.fileCountLimit = fileCountLimit;
                return this;
            }

            /**
             * <p>The total number of files that a user has created in the directory.</p>
             * 
             * <strong>example:</strong>
             * <p>5100</p>
             */
            public Builder fileCountReal(Long fileCountReal) {
                this.fileCountReal = fileCountReal;
                return this;
            }

            /**
             * <p>The type of the quota. Valid values: Accounting and Enforcement.</p>
             * 
             * <strong>example:</strong>
             * <p>Accounting</p>
             */
            public Builder quotaType(String quotaType) {
                this.quotaType = quotaType;
                return this;
            }

            /**
             * <p>The maximum size of files that a user can create in the directory. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder sizeLimit(Long sizeLimit) {
                this.sizeLimit = sizeLimit;
                return this;
            }

            /**
             * <p>The total size of files that a user has created in the directory. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>800</p>
             */
            public Builder sizeReal(Long sizeReal) {
                this.sizeReal = sizeReal;
                return this;
            }

            /**
             * <p>The total size of files that a user has created in the directory. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>858995833870</p>
             */
            public Builder sizeRealInByte(Long sizeRealInByte) {
                this.sizeRealInByte = sizeRealInByte;
                return this;
            }

            /**
             * <p>The ID of the user that you specify to create a quota for the directory. The value depends on the value of the UserType parameter. Valid values: Uid and Gid.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The type of user. Valid values: Uid, Gid, and AllUsers.</p>
             * <ul>
             * <li>If Uid or Gid is returned, a value is returned for UserId.</li>
             * <li>If AllUsers is returned, UserId is empty.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Uid</p>
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
    /**
     * 
     * {@link DescribeDirQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDirQuotasResponseBody</p>
     */
    public static class DirQuotaInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DirInode")
        private String dirInode;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserQuotaInfos")
        private java.util.List<UserQuotaInfos> userQuotaInfos;

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
        public java.util.List<UserQuotaInfos> getUserQuotaInfos() {
            return this.userQuotaInfos;
        }

        public static final class Builder {
            private String dirInode; 
            private String path; 
            private String status; 
            private java.util.List<UserQuotaInfos> userQuotaInfos; 

            private Builder() {
            } 

            private Builder(DirQuotaInfos model) {
                this.dirInode = model.dirInode;
                this.path = model.path;
                this.status = model.status;
                this.userQuotaInfos = model.userQuotaInfos;
            } 

            /**
             * <p>The inode number of the directory.</p>
             * 
             * <strong>example:</strong>
             * <p>1123</p>
             */
            public Builder dirInode(String dirInode) {
                this.dirInode = dirInode;
                return this;
            }

            /**
             * <p>The absolute path of a directory.</p>
             * 
             * <strong>example:</strong>
             * <p>/data/sub1</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The status of the quota created for the directory. Valid values: Initializing and Normal. The Initializing state indicates that the quota is being created. The Normal state indicates that the quota is created.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The information about quotas for all users.</p>
             */
            public Builder userQuotaInfos(java.util.List<UserQuotaInfos> userQuotaInfos) {
                this.userQuotaInfos = userQuotaInfos;
                return this;
            }

            public DirQuotaInfos build() {
                return new DirQuotaInfos(this);
            } 

        } 

    }
}
