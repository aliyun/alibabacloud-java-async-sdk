// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribePolarFsObjectsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolarFsObjectsResponseBody</p>
 */
public class DescribePolarFsObjectsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private String pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    @com.aliyun.core.annotation.NameInMap("PolarFsInstanceId")
    private String polarFsInstanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private String totalRecordCount;

    private DescribePolarFsObjectsResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageRecordCount = builder.pageRecordCount;
        this.pageSize = builder.pageSize;
        this.path = builder.path;
        this.polarFsInstanceId = builder.polarFsInstanceId;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarFsObjectsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return pageRecordCount
     */
    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return polarFsInstanceId
     */
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private String pageRecordCount; 
        private String pageSize; 
        private String path; 
        private String polarFsInstanceId; 
        private String requestId; 
        private String totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribePolarFsObjectsResponseBody model) {
            this.items = model.items;
            this.pageRecordCount = model.pageRecordCount;
            this.pageSize = model.pageSize;
            this.path = model.path;
            this.polarFsInstanceId = model.polarFsInstanceId;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The list of directory entries.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The maximum number of records that can be displayed on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageRecordCount(String pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The number of records per page. Valid values: 30, 50, and 100. Default value: 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The absolute path of the directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/test</p>
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * <p>The PolarFs instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pfs-2ze0i7*****</p>
         */
        public Builder polarFsInstanceId(String polarFsInstanceId) {
            this.polarFsInstanceId = polarFsInstanceId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CDB3258F-B5DE-43C4-8935-CBA0CA******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder totalRecordCount(String totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribePolarFsObjectsResponseBody build() {
            return new DescribePolarFsObjectsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePolarFsObjectsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarFsObjectsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capacity")
        private String capacity;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private Long creationTime;

        @com.aliyun.core.annotation.NameInMap("LastModified")
        private Long lastModified;

        @com.aliyun.core.annotation.NameInMap("LinkTarget")
        private String linkTarget;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Nlink")
        private Integer nlink;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Items(Builder builder) {
            this.capacity = builder.capacity;
            this.creationTime = builder.creationTime;
            this.lastModified = builder.lastModified;
            this.linkTarget = builder.linkTarget;
            this.mode = builder.mode;
            this.nlink = builder.nlink;
            this.owner = builder.owner;
            this.path = builder.path;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return capacity
         */
        public String getCapacity() {
            return this.capacity;
        }

        /**
         * @return creationTime
         */
        public Long getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return lastModified
         */
        public Long getLastModified() {
            return this.lastModified;
        }

        /**
         * @return linkTarget
         */
        public String getLinkTarget() {
            return this.linkTarget;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return nlink
         */
        public Integer getNlink() {
            return this.nlink;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String capacity; 
            private Long creationTime; 
            private Long lastModified; 
            private String linkTarget; 
            private String mode; 
            private Integer nlink; 
            private String owner; 
            private String path; 
            private String type; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.capacity = model.capacity;
                this.creationTime = model.creationTime;
                this.lastModified = model.lastModified;
                this.linkTarget = model.linkTarget;
                this.mode = model.mode;
                this.nlink = model.nlink;
                this.owner = model.owner;
                this.path = model.path;
                this.type = model.type;
            } 

            /**
             * <p>The capacity.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder capacity(String capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-25T09:37:10Z</p>
             */
            public Builder creationTime(Long creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The last modified time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-25T09:37:10Z</p>
             */
            public Builder lastModified(Long lastModified) {
                this.lastModified = lastModified;
                return this;
            }

            /**
             * <p>The real path of the symbolic link.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder linkTarget(String linkTarget) {
                this.linkTarget = linkTarget;
                return this;
            }

            /**
             * <p>The file system permissions.</p>
             * 
             * <strong>example:</strong>
             * <p>755</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The number of links.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder nlink(Integer nlink) {
                this.nlink = nlink;
                return this;
            }

            /**
             * <p>Owner</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The absolute path of the directory.</p>
             * 
             * <strong>example:</strong>
             * <p>/test</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The file type.</p>
             * 
             * <strong>example:</strong>
             * <p>directory</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
