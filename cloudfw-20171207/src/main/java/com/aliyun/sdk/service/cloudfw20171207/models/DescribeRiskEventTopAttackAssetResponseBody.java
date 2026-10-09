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
 * {@link DescribeRiskEventTopAttackAssetResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRiskEventTopAttackAssetResponseBody</p>
 */
public class DescribeRiskEventTopAttackAssetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Assets")
    private java.util.List<Assets> assets;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRiskEventTopAttackAssetResponseBody(Builder builder) {
        this.assets = builder.assets;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRiskEventTopAttackAssetResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assets
     */
    public java.util.List<Assets> getAssets() {
        return this.assets;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Assets> assets; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeRiskEventTopAttackAssetResponseBody model) {
            this.assets = model.assets;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The statistics of the assets.</p>
         */
        public Builder assets(java.util.List<Assets> assets) {
            this.assets = assets;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B9BF7C33-9A23-5096-8568-A3DACAF0****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRiskEventTopAttackAssetResponseBody build() {
            return new DescribeRiskEventTopAttackAssetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRiskEventTopAttackAssetResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRiskEventTopAttackAssetResponseBody</p>
     */
    public static class Assets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttackCnt")
        private Integer attackCnt;

        @com.aliyun.core.annotation.NameInMap("DropCnt")
        private Integer dropCnt;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("ResourceInstanceId")
        private String resourceInstanceId;

        @com.aliyun.core.annotation.NameInMap("ResourceInstanceName")
        private String resourceInstanceName;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private Assets(Builder builder) {
            this.attackCnt = builder.attackCnt;
            this.dropCnt = builder.dropCnt;
            this.ip = builder.ip;
            this.regionNo = builder.regionNo;
            this.resourceInstanceId = builder.resourceInstanceId;
            this.resourceInstanceName = builder.resourceInstanceName;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Assets create() {
            return builder().build();
        }

        /**
         * @return attackCnt
         */
        public Integer getAttackCnt() {
            return this.attackCnt;
        }

        /**
         * @return dropCnt
         */
        public Integer getDropCnt() {
            return this.dropCnt;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        /**
         * @return resourceInstanceId
         */
        public String getResourceInstanceId() {
            return this.resourceInstanceId;
        }

        /**
         * @return resourceInstanceName
         */
        public String getResourceInstanceName() {
            return this.resourceInstanceName;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private Integer attackCnt; 
            private Integer dropCnt; 
            private String ip; 
            private String regionNo; 
            private String resourceInstanceId; 
            private String resourceInstanceName; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(Assets model) {
                this.attackCnt = model.attackCnt;
                this.dropCnt = model.dropCnt;
                this.ip = model.ip;
                this.regionNo = model.regionNo;
                this.resourceInstanceId = model.resourceInstanceId;
                this.resourceInstanceName = model.resourceInstanceName;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The number of attacks.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder attackCnt(Integer attackCnt) {
                this.attackCnt = attackCnt;
                return this;
            }

            /**
             * <p>The number of dropped attempts.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder dropCnt(Integer dropCnt) {
                this.dropCnt = dropCnt;
                return this;
            }

            /**
             * <p>The IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.3.54.XXX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-chengdu</p>
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * <p>The ID of the asset instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-8vbdrjrxzt78****</p>
             */
            public Builder resourceInstanceId(String resourceInstanceId) {
                this.resourceInstanceId = resourceInstanceId;
                return this;
            }

            /**
             * <p>The name of the resource instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test_resource</p>
             */
            public Builder resourceInstanceName(String resourceInstanceName) {
                this.resourceInstanceName = resourceInstanceName;
                return this;
            }

            /**
             * <p>The type of the resource instance.</p>
             * 
             * <strong>example:</strong>
             * <p>EcsPublicIP</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public Assets build() {
                return new Assets(this);
            } 

        } 

    }
}
