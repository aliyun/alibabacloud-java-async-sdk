// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link ListVirtualResourceResponseBody} extends {@link TeaModel}
 *
 * <p>ListVirtualResourceResponseBody</p>
 */
public class ListVirtualResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("VirtualResources")
    private java.util.List<VirtualResources> virtualResources;

    private ListVirtualResourceResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.virtualResources = builder.virtualResources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVirtualResourceResponseBody create() {
        return builder().build();
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

    /**
     * @return virtualResources
     */
    public java.util.List<VirtualResources> getVirtualResources() {
        return this.virtualResources;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<VirtualResources> virtualResources; 

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
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>40325405-579C-4D82****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The list of virtual resource groups.</p>
         */
        public Builder virtualResources(java.util.List<VirtualResources> virtualResources) {
            this.virtualResources = virtualResources;
            return this;
        }

        public ListVirtualResourceResponseBody build() {
            return new ListVirtualResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVirtualResourceResponseBody} extends {@link TeaModel}
     *
     * <p>ListVirtualResourceResponseBody</p>
     */
    public static class VirtualResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ServiceCount")
        private Integer serviceCount;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("VirtualResourceId")
        private String virtualResourceId;

        @com.aliyun.core.annotation.NameInMap("VirtualResourceName")
        private String virtualResourceName;

        private VirtualResources(Builder builder) {
            this.createTime = builder.createTime;
            this.serviceCount = builder.serviceCount;
            this.updateTime = builder.updateTime;
            this.virtualResourceId = builder.virtualResourceId;
            this.virtualResourceName = builder.virtualResourceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VirtualResources create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return serviceCount
         */
        public Integer getServiceCount() {
            return this.serviceCount;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return virtualResourceId
         */
        public String getVirtualResourceId() {
            return this.virtualResourceId;
        }

        /**
         * @return virtualResourceName
         */
        public String getVirtualResourceName() {
            return this.virtualResourceName;
        }

        public static final class Builder {
            private String createTime; 
            private Integer serviceCount; 
            private String updateTime; 
            private String virtualResourceId; 
            private String virtualResourceName; 

            /**
             * <p>The time when the virtual resource group was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-16T17:52:49Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ServiceCount.
             */
            public Builder serviceCount(Integer serviceCount) {
                this.serviceCount = serviceCount;
                return this;
            }

            /**
             * <p>The time when the virtual resource group was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-16T19:52:49Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The ID of the virtual resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>eas-vr-npovr28onap1xxxxxx</p>
             */
            public Builder virtualResourceId(String virtualResourceId) {
                this.virtualResourceId = virtualResourceId;
                return this;
            }

            /**
             * <p>The name of the virtual resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>MyVirtualResource</p>
             */
            public Builder virtualResourceName(String virtualResourceName) {
                this.virtualResourceName = virtualResourceName;
                return this;
            }

            public VirtualResources build() {
                return new VirtualResources(this);
            } 

        } 

    }
}
