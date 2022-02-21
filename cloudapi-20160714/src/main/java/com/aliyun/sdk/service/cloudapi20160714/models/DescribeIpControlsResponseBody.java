// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIpControlsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIpControlsResponseBody</p>
 */
public class DescribeIpControlsResponseBody extends TeaModel {
    @NameInMap("IpControlInfos")
    private IpControlInfos ipControlInfos;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeIpControlsResponseBody(Builder builder) {
        this.ipControlInfos = builder.ipControlInfos;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpControlsResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipControlInfos
     */
    public IpControlInfos getIpControlInfos() {
        return this.ipControlInfos;
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
        private IpControlInfos ipControlInfos; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * IpControlInfos.
         */
        public Builder ipControlInfos(IpControlInfos ipControlInfos) {
            this.ipControlInfos = ipControlInfos;
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

        public DescribeIpControlsResponseBody build() {
            return new DescribeIpControlsResponseBody(this);
        } 

    } 

    public static class IpControlInfo extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("IpControlId")
        private String ipControlId;

        @NameInMap("IpControlName")
        private String ipControlName;

        @NameInMap("IpControlType")
        private String ipControlType;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("RegionId")
        private String regionId;

        private IpControlInfo(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.ipControlId = builder.ipControlId;
            this.ipControlName = builder.ipControlName;
            this.ipControlType = builder.ipControlType;
            this.modifiedTime = builder.modifiedTime;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpControlInfo create() {
            return builder().build();
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
         * @return ipControlId
         */
        public String getIpControlId() {
            return this.ipControlId;
        }

        /**
         * @return ipControlName
         */
        public String getIpControlName() {
            return this.ipControlName;
        }

        /**
         * @return ipControlType
         */
        public String getIpControlType() {
            return this.ipControlType;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String ipControlId; 
            private String ipControlName; 
            private String ipControlType; 
            private String modifiedTime; 
            private String regionId; 

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
             * IpControlId.
             */
            public Builder ipControlId(String ipControlId) {
                this.ipControlId = ipControlId;
                return this;
            }

            /**
             * IpControlName.
             */
            public Builder ipControlName(String ipControlName) {
                this.ipControlName = ipControlName;
                return this;
            }

            /**
             * IpControlType.
             */
            public Builder ipControlType(String ipControlType) {
                this.ipControlType = ipControlType;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public IpControlInfo build() {
                return new IpControlInfo(this);
            } 

        } 

    }
    public static class IpControlInfos extends TeaModel {
        @NameInMap("IpControlInfo")
        private java.util.List < IpControlInfo> ipControlInfo;

        private IpControlInfos(Builder builder) {
            this.ipControlInfo = builder.ipControlInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpControlInfos create() {
            return builder().build();
        }

        /**
         * @return ipControlInfo
         */
        public java.util.List < IpControlInfo> getIpControlInfo() {
            return this.ipControlInfo;
        }

        public static final class Builder {
            private java.util.List < IpControlInfo> ipControlInfo; 

            /**
             * IpControlInfo.
             */
            public Builder ipControlInfo(java.util.List < IpControlInfo> ipControlInfo) {
                this.ipControlInfo = ipControlInfo;
                return this;
            }

            public IpControlInfos build() {
                return new IpControlInfos(this);
            } 

        } 

    }
}
