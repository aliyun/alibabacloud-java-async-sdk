// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ots20160620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceResponseBody</p>
 */
public class ListInstanceResponseBody extends TeaModel {
    @NameInMap("InstanceInfos")
    private InstanceInfos instanceInfos;

    @NameInMap("PageNum")
    private Long pageNum;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListInstanceResponseBody(Builder builder) {
        this.instanceInfos = builder.instanceInfos;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceInfos
     */
    public InstanceInfos getInstanceInfos() {
        return this.instanceInfos;
    }

    /**
     * @return pageNum
     */
    public Long getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private InstanceInfos instanceInfos; 
        private Long pageNum; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * InstanceInfos.
         */
        public Builder instanceInfos(InstanceInfos instanceInfos) {
            this.instanceInfos = instanceInfos;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListInstanceResponseBody build() {
            return new ListInstanceResponseBody(this);
        } 

    } 

    public static class InstanceInfo extends TeaModel {
        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("Timestamp")
        private String timestamp;

        private InstanceInfo(Builder builder) {
            this.instanceName = builder.instanceName;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceInfo create() {
            return builder().build();
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String instanceName; 
            private String timestamp; 

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public InstanceInfo build() {
                return new InstanceInfo(this);
            } 

        } 

    }
    public static class InstanceInfos extends TeaModel {
        @NameInMap("InstanceInfo")
        private java.util.List < InstanceInfo> instanceInfo;

        private InstanceInfos(Builder builder) {
            this.instanceInfo = builder.instanceInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceInfos create() {
            return builder().build();
        }

        /**
         * @return instanceInfo
         */
        public java.util.List < InstanceInfo> getInstanceInfo() {
            return this.instanceInfo;
        }

        public static final class Builder {
            private java.util.List < InstanceInfo> instanceInfo; 

            /**
             * InstanceInfo.
             */
            public Builder instanceInfo(java.util.List < InstanceInfo> instanceInfo) {
                this.instanceInfo = instanceInfo;
                return this;
            }

            public InstanceInfos build() {
                return new InstanceInfos(this);
            } 

        } 

    }
}
