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
 * {@link DescribeVpcListLiteResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcListLiteResponseBody</p>
 */
public class DescribeVpcListLiteResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VpcList")
    private java.util.List<VpcList> vpcList;

    private DescribeVpcListLiteResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vpcList = builder.vpcList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcListLiteResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vpcList
     */
    public java.util.List<VpcList> getVpcList() {
        return this.vpcList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<VpcList> vpcList; 

        private Builder() {
        } 

        private Builder(DescribeVpcListLiteResponseBody model) {
            this.requestId = model.requestId;
            this.vpcList = model.vpcList;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>55E56A55-D93A-5614-AE00-BE2F8077F891</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the VPCs.</p>
         */
        public Builder vpcList(java.util.List<VpcList> vpcList) {
            this.vpcList = vpcList;
            return this;
        }

        public DescribeVpcListLiteResponseBody build() {
            return new DescribeVpcListLiteResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVpcListLiteResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcListLiteResponseBody</p>
     */
    public static class VpcList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcName")
        private String vpcName;

        private VpcList(Builder builder) {
            this.regionNo = builder.regionNo;
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcList create() {
            return builder().build();
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
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
            private String regionNo; 
            private String vpcId; 
            private String vpcName; 

            private Builder() {
            } 

            private Builder(VpcList model) {
                this.regionNo = model.regionNo;
                this.vpcId = model.vpcId;
                this.vpcName = model.vpcName;
            } 

            /**
             * <p>The region ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-wz9dqhljd10fk0b4eh885</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The name of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>Cloud_Firewall_VPC</p>
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            public VpcList build() {
                return new VpcList(this);
            } 

        } 

    }
}
