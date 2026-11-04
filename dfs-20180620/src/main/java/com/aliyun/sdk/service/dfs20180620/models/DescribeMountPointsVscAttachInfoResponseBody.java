// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

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
 * {@link DescribeMountPointsVscAttachInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMountPointsVscAttachInfoResponseBody</p>
 */
public class DescribeMountPointsVscAttachInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AttachInfos")
    private java.util.List<AttachInfos> attachInfos;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeMountPointsVscAttachInfoResponseBody(Builder builder) {
        this.attachInfos = builder.attachInfos;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMountPointsVscAttachInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attachInfos
     */
    public java.util.List<AttachInfos> getAttachInfos() {
        return this.attachInfos;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<AttachInfos> attachInfos; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(DescribeMountPointsVscAttachInfoResponseBody model) {
            this.attachInfos = model.attachInfos;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of mount information.</p>
         */
        public Builder attachInfos(java.util.List<AttachInfos> attachInfos) {
            this.attachInfos = attachInfos;
            return this;
        }

        /**
         * <p>The maximum number of entries to return per page during paging in a paged query. Maximum value: 100. Default value: 10. If you do not specify a value in the Settings or the value in the Settings is less than 10, the default value 10 is used. If the value in the Settings is greater than 100, the default value 100 is used.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. If a query does not return all results, a non-empty NextToken is returned. You can use the returned NextToken in a subsequent query to retrieve the remaining results.</p>
         * 
         * <strong>example:</strong>
         * <p>asd0daj****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>55C5FFD6-BF99-41BD-9C66-FFF39189****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of mount points.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeMountPointsVscAttachInfoResponseBody build() {
            return new DescribeMountPointsVscAttachInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMountPointsVscAttachInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMountPointsVscAttachInfoResponseBody</p>
     */
    public static class AttachInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MountPointId")
        private String mountPointId;

        @com.aliyun.core.annotation.NameInMap("VscId")
        private String vscId;

        @com.aliyun.core.annotation.NameInMap("VscName")
        private String vscName;

        @com.aliyun.core.annotation.NameInMap("VscStatus")
        private String vscStatus;

        @com.aliyun.core.annotation.NameInMap("VscType")
        private String vscType;

        private AttachInfos(Builder builder) {
            this.instanceId = builder.instanceId;
            this.mountPointId = builder.mountPointId;
            this.vscId = builder.vscId;
            this.vscName = builder.vscName;
            this.vscStatus = builder.vscStatus;
            this.vscType = builder.vscType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttachInfos create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return mountPointId
         */
        public String getMountPointId() {
            return this.mountPointId;
        }

        /**
         * @return vscId
         */
        public String getVscId() {
            return this.vscId;
        }

        /**
         * @return vscName
         */
        public String getVscName() {
            return this.vscName;
        }

        /**
         * @return vscStatus
         */
        public String getVscStatus() {
            return this.vscStatus;
        }

        /**
         * @return vscType
         */
        public String getVscType() {
            return this.vscType;
        }

        public static final class Builder {
            private String instanceId; 
            private String mountPointId; 
            private String vscId; 
            private String vscName; 
            private String vscStatus; 
            private String vscType; 

            private Builder() {
            } 

            private Builder(AttachInfos model) {
                this.instanceId = model.instanceId;
                this.mountPointId = model.mountPointId;
                this.vscId = model.vscId;
                this.vscName = model.vscName;
                this.vscStatus = model.vscStatus;
                this.vscType = model.vscType;
            } 

            /**
             * <p>The instance ID of the ECS instance on which the HDFS file system is mounted.</p>
             * 
             * <strong>example:</strong>
             * <p>vsc-agent-f5a9bb4b041541f595a0c239c9e0f971-cn-shanghai</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The ID of the mount point.</p>
             * 
             * <strong>example:</strong>
             * <p>f-9dd3c6bajmy110.cn-zhangjiakou.dfs.aliyuncs.com</p>
             */
            public Builder mountPointId(String mountPointId) {
                this.mountPointId = mountPointId;
                return this;
            }

            /**
             * <p>The ID of the VSC on which the HDFS file system is mounted.</p>
             * 
             * <strong>example:</strong>
             * <p>vsc-bp18fhqie89loyqixyieal</p>
             */
            public Builder vscId(String vscId) {
                this.vscId = vscId;
                return this;
            }

            /**
             * <p>The custom name of the VSC.</p>
             * 
             * <strong>example:</strong>
             * <p>cxc</p>
             */
            public Builder vscName(String vscName) {
                this.vscName = vscName;
                return this;
            }

            /**
             * <p>The mount status of the VSC.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li>NORMAL: Mounted successfully.</li>
             * <li>CREATING: Mounting.</li>
             * <li>INVALID: Mount failed</li>
             * </ul>
             */
            public Builder vscStatus(String vscStatus) {
                this.vscStatus = vscStatus;
                return this;
            }

            /**
             * <p>The type of the VSC. Valid values: </p>
             * <ul>
             * <li>Primary (default): the default reserved VSC on the ECS instance. </li>
             * <li>Secondary: a reusable VSC on the ECS instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Primary</p>
             */
            public Builder vscType(String vscType) {
                this.vscType = vscType;
                return this;
            }

            public AttachInfos build() {
                return new AttachInfos(this);
            } 

        } 

    }
}
