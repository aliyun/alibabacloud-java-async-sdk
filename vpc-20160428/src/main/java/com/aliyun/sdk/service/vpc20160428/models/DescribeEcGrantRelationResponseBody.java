// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEcGrantRelationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEcGrantRelationResponseBody</p>
 */
public class DescribeEcGrantRelationResponseBody extends TeaModel {
    @NameInMap("Count")
    private Integer count;

    @NameInMap("EcGrantRelations")
    private java.util.List < EcGrantRelations> ecGrantRelations;

    @NameInMap("Page")
    private Integer page;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeEcGrantRelationResponseBody(Builder builder) {
        this.count = builder.count;
        this.ecGrantRelations = builder.ecGrantRelations;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEcGrantRelationResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return ecGrantRelations
     */
    public java.util.List < EcGrantRelations> getEcGrantRelations() {
        return this.ecGrantRelations;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
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
        private Integer count; 
        private java.util.List < EcGrantRelations> ecGrantRelations; 
        private Integer page; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The number of the returned page.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account to which the VBR belongs.
         */
        public Builder ecGrantRelations(java.util.List < EcGrantRelations> ecGrantRelations) {
            this.ecGrantRelations = ecGrantRelations;
            return this;
        }

        /**
         * The number of entries returned on each page.
         */
        public Builder page(Integer page) {
            this.page = page;
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
         * The query results.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEcGrantRelationResponseBody build() {
            return new DescribeEcGrantRelationResponseBody(this);
        } 

    } 

    public static class EcGrantRelations extends TeaModel {
        @NameInMap("AliUid")
        private Long aliUid;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GrantType")
        private String grantType;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InstanceRouterId")
        private String instanceRouterId;

        @NameInMap("RegionNo")
        private String regionNo;

        @NameInMap("Status")
        private String status;

        @NameInMap("VbrInstanceId")
        private String vbrInstanceId;

        @NameInMap("VbrOwnerUid")
        private Long vbrOwnerUid;

        @NameInMap("VbrRegionNo")
        private String vbrRegionNo;

        private EcGrantRelations(Builder builder) {
            this.aliUid = builder.aliUid;
            this.gmtCreate = builder.gmtCreate;
            this.grantType = builder.grantType;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceRouterId = builder.instanceRouterId;
            this.regionNo = builder.regionNo;
            this.status = builder.status;
            this.vbrInstanceId = builder.vbrInstanceId;
            this.vbrOwnerUid = builder.vbrOwnerUid;
            this.vbrRegionNo = builder.vbrRegionNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcGrantRelations create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return grantType
         */
        public String getGrantType() {
            return this.grantType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instanceRouterId
         */
        public String getInstanceRouterId() {
            return this.instanceRouterId;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vbrInstanceId
         */
        public String getVbrInstanceId() {
            return this.vbrInstanceId;
        }

        /**
         * @return vbrOwnerUid
         */
        public Long getVbrOwnerUid() {
            return this.vbrOwnerUid;
        }

        /**
         * @return vbrRegionNo
         */
        public String getVbrRegionNo() {
            return this.vbrRegionNo;
        }

        public static final class Builder {
            private Long aliUid; 
            private String gmtCreate; 
            private String grantType; 
            private String instanceId; 
            private String instanceName; 
            private String instanceRouterId; 
            private String regionNo; 
            private String status; 
            private String vbrInstanceId; 
            private Long vbrOwnerUid; 
            private String vbrRegionNo; 

            /**
             * The ID of the region where the VPC is deployed.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * The VBRs that have permissions on the VPC. Valid values:
             * <p>
             * 
             * *   **All**: VBRs that reside in the specified region and belong to the specified Alibaba Cloud account all have permissions on the VPC.
             * *   **Specify**: Only the specified VBR has permissions on the VPC.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder grantType(String grantType) {
                this.grantType = grantType;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the VPC belongs.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The ID of the vRouter.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The ID of the region where the VBR is deployed.
             */
            public Builder instanceRouterId(String instanceRouterId) {
                this.instanceRouterId = instanceRouterId;
                return this;
            }

            /**
             * The query result. Valid values:
             * <p>
             * 
             * *   **Created**: The VBR has permissions on the VPC.
             * *   **Deleted**: The VBR does not have permissions on the VPC.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * The name of the VPC.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the VPC.
             */
            public Builder vbrInstanceId(String vbrInstanceId) {
                this.vbrInstanceId = vbrInstanceId;
                return this;
            }

            /**
             * The ID of the VBR.
             */
            public Builder vbrOwnerUid(Long vbrOwnerUid) {
                this.vbrOwnerUid = vbrOwnerUid;
                return this;
            }

            /**
             * The time when permissions on the VPC were granted to the VBR.
             */
            public Builder vbrRegionNo(String vbrRegionNo) {
                this.vbrRegionNo = vbrRegionNo;
                return this;
            }

            public EcGrantRelations build() {
                return new EcGrantRelations(this);
            } 

        } 

    }
}
