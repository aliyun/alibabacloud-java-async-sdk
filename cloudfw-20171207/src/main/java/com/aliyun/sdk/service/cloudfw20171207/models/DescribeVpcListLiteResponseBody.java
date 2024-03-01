// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcListLiteResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcListLiteResponseBody</p>
 */
public class DescribeVpcListLiteResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VpcList")
    private java.util.List < VpcList> vpcList;

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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vpcList
     */
    public java.util.List < VpcList> getVpcList() {
        return this.vpcList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < VpcList> vpcList; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VpcList.
         */
        public Builder vpcList(java.util.List < VpcList> vpcList) {
            this.vpcList = vpcList;
            return this;
        }

        public DescribeVpcListLiteResponseBody build() {
            return new DescribeVpcListLiteResponseBody(this);
        } 

    } 

    public static class VpcList extends TeaModel {
        @NameInMap("RegionNo")
        private String regionNo;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpcName")
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

            /**
             * RegionNo.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
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

            public VpcList build() {
                return new VpcList(this);
            } 

        } 

    }
}
