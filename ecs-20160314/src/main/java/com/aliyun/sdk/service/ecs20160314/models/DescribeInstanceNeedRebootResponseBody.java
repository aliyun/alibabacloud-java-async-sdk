// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceNeedRebootResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceNeedRebootResponseBody</p>
 */
public class DescribeInstanceNeedRebootResponseBody extends TeaModel {
    @NameInMap("InstanceInfo")
    private InstanceInfo instanceInfo;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeInstanceNeedRebootResponseBody(Builder builder) {
        this.instanceInfo = builder.instanceInfo;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceNeedRebootResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceInfo
     */
    public InstanceInfo getInstanceInfo() {
        return this.instanceInfo;
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
        private InstanceInfo instanceInfo; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * InstanceInfo.
         */
        public Builder instanceInfo(InstanceInfo instanceInfo) {
            this.instanceInfo = instanceInfo;
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

        public DescribeInstanceNeedRebootResponseBody build() {
            return new DescribeInstanceNeedRebootResponseBody(this);
        } 

    } 

    public static class InstanceInfo extends TeaModel {
        @NameInMap("InstanceInfo")
        private java.util.List < String > instanceInfo;

        private InstanceInfo(Builder builder) {
            this.instanceInfo = builder.instanceInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceInfo create() {
            return builder().build();
        }

        /**
         * @return instanceInfo
         */
        public java.util.List < String > getInstanceInfo() {
            return this.instanceInfo;
        }

        public static final class Builder {
            private java.util.List < String > instanceInfo; 

            /**
             * InstanceInfo.
             */
            public Builder instanceInfo(java.util.List < String > instanceInfo) {
                this.instanceInfo = instanceInfo;
                return this;
            }

            public InstanceInfo build() {
                return new InstanceInfo(this);
            } 

        } 

    }
}
