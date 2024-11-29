// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeEcGrantRelationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEcGrantRelationResponseBody</p>
 */
public class DescribeEcGrantRelationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("EcGrantRelations")
    private java.util.List < EcGrantRelations> ecGrantRelations;

    @com.aliyun.core.annotation.NameInMap("Page")
    private Integer page;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The query results.</p>
         */
        public Builder ecGrantRelations(java.util.List < EcGrantRelations> ecGrantRelations) {
            this.ecGrantRelations = ecGrantRelations;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E6E90F6B-2B41-5AAF-ABEB-236ADBAAD91D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEcGrantRelationResponseBody build() {
            return new DescribeEcGrantRelationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEcGrantRelationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEcGrantRelationResponseBody</p>
     */
    public static class EcGrantRelations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GrantType")
        private String grantType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceRouterId")
        private String instanceRouterId;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VbrInstanceId")
        private String vbrInstanceId;

        @com.aliyun.core.annotation.NameInMap("VbrOwnerUid")
        private Long vbrOwnerUid;

        @com.aliyun.core.annotation.NameInMap("VbrRegionNo")
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
             * <p>The ID of the Alibaba Cloud account to which the VPC belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1250123456123456</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The time when permissions on the VPC were granted to the VBR.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-02T11:46Z</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The VBRs that have permissions on the VPC. Valid values:</p>
             * <ul>
             * <li><strong>All</strong>: VBRs that reside in the specified region and belong to the specified Alibaba Cloud account all have permissions on the VPC.</li>
             * <li><strong>Specify</strong>: Only the specified VBR has permissions on the VPC.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>All</p>
             */
            public Builder grantType(String grantType) {
                this.grantType = grantType;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1brjuegjc88v3u9****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>VPCname</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The ID of the vRouter.</p>
             * 
             * <strong>example:</strong>
             * <p>vrt-bp1i0yzgjd8ra05ec****</p>
             */
            public Builder instanceRouterId(String instanceRouterId) {
                this.instanceRouterId = instanceRouterId;
                return this;
            }

            /**
             * <p>The ID of the region where the VPC is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * <p>The query result. Valid values:</p>
             * <ul>
             * <li><strong>Created</strong>: The VBR has permissions on the VPC.</li>
             * <li><strong>Deleted</strong>: The VBR does not have permissions on the VPC.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Created</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the VBR.</p>
             * 
             * <strong>example:</strong>
             * <p>vbr-m5ex0xf63xk8s5bob****</p>
             */
            public Builder vbrInstanceId(String vbrInstanceId) {
                this.vbrInstanceId = vbrInstanceId;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the VBR belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1210123456123456</p>
             */
            public Builder vbrOwnerUid(Long vbrOwnerUid) {
                this.vbrOwnerUid = vbrOwnerUid;
                return this;
            }

            /**
             * <p>The ID of the region where the VBR is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
