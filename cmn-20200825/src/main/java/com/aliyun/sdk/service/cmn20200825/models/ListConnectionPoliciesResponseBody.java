// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConnectionPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>ListConnectionPoliciesResponseBody</p>
 */
public class ListConnectionPoliciesResponseBody extends TeaModel {
    @NameInMap("ConnectionPolicy")
    private java.util.List < ConnectionPolicy> connectionPolicy;

    @NameInMap("MaxResults")
    private Long maxResults;

    @NameInMap("NextToken")
    private Integer nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListConnectionPoliciesResponseBody(Builder builder) {
        this.connectionPolicy = builder.connectionPolicy;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConnectionPoliciesResponseBody create() {
        return builder().build();
    }

    /**
     * @return connectionPolicy
     */
    public java.util.List < ConnectionPolicy> getConnectionPolicy() {
        return this.connectionPolicy;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public Integer getNextToken() {
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < ConnectionPolicy> connectionPolicy; 
        private Long maxResults; 
        private Integer nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * ConnectionPolicy.
         */
        public Builder connectionPolicy(java.util.List < ConnectionPolicy> connectionPolicy) {
            this.connectionPolicy = connectionPolicy;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(Integer nextToken) {
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListConnectionPoliciesResponseBody build() {
            return new ListConnectionPoliciesResponseBody(this);
        } 

    } 

    public static class ConnectionPolicy extends TeaModel {
        @NameInMap("Algorithm")
        private String algorithm;

        @NameInMap("ArchitectureIterationId")
        private String architectureIterationId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DownlinkArchitectureDeviceId")
        private String downlinkArchitectureDeviceId;

        @NameInMap("DownlinkArchitectureModuleId")
        private String downlinkArchitectureModuleId;

        @NameInMap("Id")
        private String id;

        @NameInMap("LinkCount")
        private Integer linkCount;

        @NameInMap("Name")
        private String name;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("UplinkArchitectureDeviceId")
        private String uplinkArchitectureDeviceId;

        @NameInMap("UplinkArchitectureModuleId")
        private String uplinkArchitectureModuleId;

        private ConnectionPolicy(Builder builder) {
            this.algorithm = builder.algorithm;
            this.architectureIterationId = builder.architectureIterationId;
            this.createTime = builder.createTime;
            this.downlinkArchitectureDeviceId = builder.downlinkArchitectureDeviceId;
            this.downlinkArchitectureModuleId = builder.downlinkArchitectureModuleId;
            this.id = builder.id;
            this.linkCount = builder.linkCount;
            this.name = builder.name;
            this.updateTime = builder.updateTime;
            this.uplinkArchitectureDeviceId = builder.uplinkArchitectureDeviceId;
            this.uplinkArchitectureModuleId = builder.uplinkArchitectureModuleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConnectionPolicy create() {
            return builder().build();
        }

        /**
         * @return algorithm
         */
        public String getAlgorithm() {
            return this.algorithm;
        }

        /**
         * @return architectureIterationId
         */
        public String getArchitectureIterationId() {
            return this.architectureIterationId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return downlinkArchitectureDeviceId
         */
        public String getDownlinkArchitectureDeviceId() {
            return this.downlinkArchitectureDeviceId;
        }

        /**
         * @return downlinkArchitectureModuleId
         */
        public String getDownlinkArchitectureModuleId() {
            return this.downlinkArchitectureModuleId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return linkCount
         */
        public Integer getLinkCount() {
            return this.linkCount;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return uplinkArchitectureDeviceId
         */
        public String getUplinkArchitectureDeviceId() {
            return this.uplinkArchitectureDeviceId;
        }

        /**
         * @return uplinkArchitectureModuleId
         */
        public String getUplinkArchitectureModuleId() {
            return this.uplinkArchitectureModuleId;
        }

        public static final class Builder {
            private String algorithm; 
            private String architectureIterationId; 
            private String createTime; 
            private String downlinkArchitectureDeviceId; 
            private String downlinkArchitectureModuleId; 
            private String id; 
            private Integer linkCount; 
            private String name; 
            private String updateTime; 
            private String uplinkArchitectureDeviceId; 
            private String uplinkArchitectureModuleId; 

            /**
             * Algorithm.
             */
            public Builder algorithm(String algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * ArchitectureIterationId.
             */
            public Builder architectureIterationId(String architectureIterationId) {
                this.architectureIterationId = architectureIterationId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 上联设备uid
             */
            public Builder downlinkArchitectureDeviceId(String downlinkArchitectureDeviceId) {
                this.downlinkArchitectureDeviceId = downlinkArchitectureDeviceId;
                return this;
            }

            /**
             * 下联设备uid
             */
            public Builder downlinkArchitectureModuleId(String downlinkArchitectureModuleId) {
                this.downlinkArchitectureModuleId = downlinkArchitectureModuleId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * LinkCount.
             */
            public Builder linkCount(Integer linkCount) {
                this.linkCount = linkCount;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * 上联模块uid
             */
            public Builder uplinkArchitectureDeviceId(String uplinkArchitectureDeviceId) {
                this.uplinkArchitectureDeviceId = uplinkArchitectureDeviceId;
                return this;
            }

            /**
             * 下联模块uid
             */
            public Builder uplinkArchitectureModuleId(String uplinkArchitectureModuleId) {
                this.uplinkArchitectureModuleId = uplinkArchitectureModuleId;
                return this;
            }

            public ConnectionPolicy build() {
                return new ConnectionPolicy(this);
            } 

        } 

    }
}
