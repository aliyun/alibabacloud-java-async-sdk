// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeIpsPrivateAssocResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIpsPrivateAssocResponseBody</p>
 */
public class DescribeIpsPrivateAssocResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IpsPrivateAssoc")
    private java.util.List<IpsPrivateAssoc> ipsPrivateAssoc;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalOpenCount")
    private Long totalOpenCount;

    private DescribeIpsPrivateAssocResponseBody(Builder builder) {
        this.ipsPrivateAssoc = builder.ipsPrivateAssoc;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.totalOpenCount = builder.totalOpenCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpsPrivateAssocResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipsPrivateAssoc
     */
    public java.util.List<IpsPrivateAssoc> getIpsPrivateAssoc() {
        return this.ipsPrivateAssoc;
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

    /**
     * @return totalOpenCount
     */
    public Long getTotalOpenCount() {
        return this.totalOpenCount;
    }

    public static final class Builder {
        private java.util.List<IpsPrivateAssoc> ipsPrivateAssoc; 
        private String requestId; 
        private Long totalCount; 
        private Long totalOpenCount; 

        private Builder() {
        } 

        private Builder(DescribeIpsPrivateAssocResponseBody model) {
            this.ipsPrivateAssoc = model.ipsPrivateAssoc;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.totalOpenCount = model.totalOpenCount;
        } 

        /**
         * IpsPrivateAssoc.
         */
        public Builder ipsPrivateAssoc(java.util.List<IpsPrivateAssoc> ipsPrivateAssoc) {
            this.ipsPrivateAssoc = ipsPrivateAssoc;
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

        /**
         * TotalOpenCount.
         */
        public Builder totalOpenCount(Long totalOpenCount) {
            this.totalOpenCount = totalOpenCount;
            return this;
        }

        public DescribeIpsPrivateAssocResponseBody build() {
            return new DescribeIpsPrivateAssocResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeIpsPrivateAssocResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIpsPrivateAssocResponseBody</p>
     */
    public static class IpsPrivateAssoc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssocInfoStatus")
        private String assocInfoStatus;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("MemberUid")
        private Long memberUid;

        @com.aliyun.core.annotation.NameInMap("ProtectedIpList")
        private java.util.List<String> protectedIpList;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UnprotectedIpList")
        private java.util.List<String> unprotectedIpList;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcName")
        private String vpcName;

        private IpsPrivateAssoc(Builder builder) {
            this.assocInfoStatus = builder.assocInfoStatus;
            this.errorMsg = builder.errorMsg;
            this.memberUid = builder.memberUid;
            this.protectedIpList = builder.protectedIpList;
            this.regionId = builder.regionId;
            this.resourceId = builder.resourceId;
            this.resourceName = builder.resourceName;
            this.status = builder.status;
            this.unprotectedIpList = builder.unprotectedIpList;
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpsPrivateAssoc create() {
            return builder().build();
        }

        /**
         * @return assocInfoStatus
         */
        public String getAssocInfoStatus() {
            return this.assocInfoStatus;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return memberUid
         */
        public Long getMemberUid() {
            return this.memberUid;
        }

        /**
         * @return protectedIpList
         */
        public java.util.List<String> getProtectedIpList() {
            return this.protectedIpList;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return unprotectedIpList
         */
        public java.util.List<String> getUnprotectedIpList() {
            return this.unprotectedIpList;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcName
         */
        public String getVpcName() {
            return this.vpcName;
        }

        public static final class Builder {
            private String assocInfoStatus; 
            private String errorMsg; 
            private Long memberUid; 
            private java.util.List<String> protectedIpList; 
            private String regionId; 
            private String resourceId; 
            private String resourceName; 
            private String status; 
            private java.util.List<String> unprotectedIpList; 
            private String vpcId; 
            private String vpcName; 

            private Builder() {
            } 

            private Builder(IpsPrivateAssoc model) {
                this.assocInfoStatus = model.assocInfoStatus;
                this.errorMsg = model.errorMsg;
                this.memberUid = model.memberUid;
                this.protectedIpList = model.protectedIpList;
                this.regionId = model.regionId;
                this.resourceId = model.resourceId;
                this.resourceName = model.resourceName;
                this.status = model.status;
                this.unprotectedIpList = model.unprotectedIpList;
                this.vpcId = model.vpcId;
                this.vpcName = model.vpcName;
            } 

            /**
             * AssocInfoStatus.
             */
            public Builder assocInfoStatus(String assocInfoStatus) {
                this.assocInfoStatus = assocInfoStatus;
                return this;
            }

            /**
             * ErrorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * MemberUid.
             */
            public Builder memberUid(Long memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            /**
             * ProtectedIpList.
             */
            public Builder protectedIpList(java.util.List<String> protectedIpList) {
                this.protectedIpList = protectedIpList;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceName.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UnprotectedIpList.
             */
            public Builder unprotectedIpList(java.util.List<String> unprotectedIpList) {
                this.unprotectedIpList = unprotectedIpList;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VpcName.
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            public IpsPrivateAssoc build() {
                return new IpsPrivateAssoc(this);
            } 

        } 

    }
}
