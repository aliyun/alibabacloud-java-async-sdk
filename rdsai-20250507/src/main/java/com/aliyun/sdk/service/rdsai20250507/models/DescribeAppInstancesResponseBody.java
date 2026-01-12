// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link DescribeAppInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppInstancesResponseBody</p>
 */
public class DescribeAppInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List<Instances> instances;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeAppInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.maxResults = builder.maxResults;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instances
     */
    public java.util.List<Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
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
        private java.util.List<Instances> instances; 
        private Long maxResults; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeAppInstancesResponseBody model) {
            this.instances = model.instances;
            this.maxResults = model.maxResults;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The information about the RDS Supabase instances.</p>
         */
        public Builder instances(java.util.List<Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * <p>A reserved parameter. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>32DEFB4A-861F-5D1D-ADD5-918E4FD7AB8C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAppInstancesResponseBody build() {
            return new DescribeAppInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAppInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppInstancesResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppType")
        private String appType;

        @com.aliyun.core.annotation.NameInMap("DBInstanceName")
        private String DBInstanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceClass")
        private String instanceClass;

        @com.aliyun.core.annotation.NameInMap("InstanceMinorVersion")
        private String instanceMinorVersion;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("PublicConnectionString")
        private String publicConnectionString;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcConnectionString")
        private String vpcConnectionString;

        private Instances(Builder builder) {
            this.appName = builder.appName;
            this.appType = builder.appType;
            this.DBInstanceName = builder.DBInstanceName;
            this.instanceClass = builder.instanceClass;
            this.instanceMinorVersion = builder.instanceMinorVersion;
            this.instanceName = builder.instanceName;
            this.publicConnectionString = builder.publicConnectionString;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.vSwitchId = builder.vSwitchId;
            this.vpcConnectionString = builder.vpcConnectionString;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appType
         */
        public String getAppType() {
            return this.appType;
        }

        /**
         * @return DBInstanceName
         */
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        /**
         * @return instanceClass
         */
        public String getInstanceClass() {
            return this.instanceClass;
        }

        /**
         * @return instanceMinorVersion
         */
        public String getInstanceMinorVersion() {
            return this.instanceMinorVersion;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return publicConnectionString
         */
        public String getPublicConnectionString() {
            return this.publicConnectionString;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcConnectionString
         */
        public String getVpcConnectionString() {
            return this.vpcConnectionString;
        }

        public static final class Builder {
            private String appName; 
            private String appType; 
            private String DBInstanceName; 
            private String instanceClass; 
            private String instanceMinorVersion; 
            private String instanceName; 
            private String publicConnectionString; 
            private String regionId; 
            private String status; 
            private String vSwitchId; 
            private String vpcConnectionString; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.appName = model.appName;
                this.appType = model.appType;
                this.DBInstanceName = model.DBInstanceName;
                this.instanceClass = model.instanceClass;
                this.instanceMinorVersion = model.instanceMinorVersion;
                this.instanceName = model.instanceName;
                this.publicConnectionString = model.publicConnectionString;
                this.regionId = model.regionId;
                this.status = model.status;
                this.vSwitchId = model.vSwitchId;
                this.vpcConnectionString = model.vpcConnectionString;
            } 

            /**
             * <p>The name of the AI application.</p>
             * 
             * <strong>example:</strong>
             * <p>test-supabase</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The application type. Only <strong>supabase</strong> is supported. For more information, see <a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>supabase</p>
             */
            public Builder appType(String appType) {
                this.appType = appType;
                return this;
            }

            /**
             * <p>The ID of the RDS for PostgreSQL instance with which the RDS Supabase instances are associated.</p>
             * 
             * <strong>example:</strong>
             * <p>pgm-2ze49qv594vi****</p>
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * <p>The instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>rdsai.supabase.basic</p>
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * <p>The minor version number of RDS Supabase instance.</p>
             * 
             * <strong>example:</strong>
             * <p>20241231</p>
             */
            public Builder instanceMinorVersion(String instanceMinorVersion) {
                this.instanceMinorVersion = instanceMinorVersion;
                return this;
            }

            /**
             * <p>The ID of the RDS Supabase instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ra-supabase-8moov5lxba****</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public endpoint of the AI application.</p>
             * 
             * <strong>example:</strong>
             * <p>8.152. XXX.XXX:8000</p>
             */
            public Builder publicConnectionString(String publicConnectionString) {
                this.publicConnectionString = publicConnectionString;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The instance status. For more information, see <a href="https://help.aliyun.com/document_detail/2623972.html">Instance state table</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-2zeaepb8k4ku05ov2****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The internal endpoint of the AI application.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.XXX.XXX:8000</p>
             */
            public Builder vpcConnectionString(String vpcConnectionString) {
                this.vpcConnectionString = vpcConnectionString;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
