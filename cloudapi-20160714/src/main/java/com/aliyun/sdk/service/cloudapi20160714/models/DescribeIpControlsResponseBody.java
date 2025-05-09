// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link DescribeIpControlsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIpControlsResponseBody</p>
 */
public class DescribeIpControlsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IpControlInfos")
    private IpControlInfos ipControlInfos;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeIpControlsResponseBody model) {
            this.ipControlInfos = model.ipControlInfos;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The information about the ACL. The information is an array that consists of IpControlInfo data. The information does not include specific policies.</p>
         */
        public Builder ipControlInfos(IpControlInfos ipControlInfos) {
            this.ipControlInfos = ipControlInfos;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ004</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeIpControlsResponseBody build() {
            return new DescribeIpControlsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeIpControlsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIpControlsResponseBody</p>
     */
    public static class IpControlInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("IpControlId")
        private String ipControlId;

        @com.aliyun.core.annotation.NameInMap("IpControlName")
        private String ipControlName;

        @com.aliyun.core.annotation.NameInMap("IpControlType")
        private String ipControlType;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("RegionId")
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

            private Builder() {
            } 

            private Builder(IpControlInfo model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.ipControlId = model.ipControlId;
                this.ipControlName = model.ipControlName;
                this.ipControlType = model.ipControlType;
                this.modifiedTime = model.modifiedTime;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The time when the ACL was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-01-17T05:48:11Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the ACL.</p>
             * 
             * <strong>example:</strong>
             * <p>description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the ACL.</p>
             * 
             * <strong>example:</strong>
             * <p>7ea91319a34d48a09b5c9c871d9768b1</p>
             */
            public Builder ipControlId(String ipControlId) {
                this.ipControlId = ipControlId;
                return this;
            }

            /**
             * <p>The name of the ACL.</p>
             * 
             * <strong>example:</strong>
             * <p>testControl11</p>
             */
            public Builder ipControlName(String ipControlName) {
                this.ipControlName = ipControlName;
                return this;
            }

            /**
             * <p>The type of the ACL.</p>
             * 
             * <strong>example:</strong>
             * <p>ALLOW</p>
             */
            public Builder ipControlType(String ipControlType) {
                this.ipControlType = ipControlType;
                return this;
            }

            /**
             * <p>The time when the ACL was modified. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-01-17T06:00:38Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The ID of the region in which the ACL is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-qingdao</p>
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
    /**
     * 
     * {@link DescribeIpControlsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIpControlsResponseBody</p>
     */
    public static class IpControlInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpControlInfo")
        private java.util.List<IpControlInfo> ipControlInfo;

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
        public java.util.List<IpControlInfo> getIpControlInfo() {
            return this.ipControlInfo;
        }

        public static final class Builder {
            private java.util.List<IpControlInfo> ipControlInfo; 

            private Builder() {
            } 

            private Builder(IpControlInfos model) {
                this.ipControlInfo = model.ipControlInfo;
            } 

            /**
             * IpControlInfo.
             */
            public Builder ipControlInfo(java.util.List<IpControlInfo> ipControlInfo) {
                this.ipControlInfo = ipControlInfo;
                return this;
            }

            public IpControlInfos build() {
                return new IpControlInfos(this);
            } 

        } 

    }
}
