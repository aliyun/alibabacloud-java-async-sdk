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
         * AttachInfos.
         */
        public Builder attachInfos(java.util.List<AttachInfos> attachInfos) {
            this.attachInfos = attachInfos;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * MountPointId.
             */
            public Builder mountPointId(String mountPointId) {
                this.mountPointId = mountPointId;
                return this;
            }

            /**
             * VscId.
             */
            public Builder vscId(String vscId) {
                this.vscId = vscId;
                return this;
            }

            /**
             * VscName.
             */
            public Builder vscName(String vscName) {
                this.vscName = vscName;
                return this;
            }

            /**
             * VscStatus.
             */
            public Builder vscStatus(String vscStatus) {
                this.vscStatus = vscStatus;
                return this;
            }

            /**
             * VscType.
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
