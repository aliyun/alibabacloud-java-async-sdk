// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsCommodityCodeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEnsCommodityCodeResponseBody</p>
 */
public class DescribeEnsCommodityCodeResponseBody extends TeaModel {
    @NameInMap("CommodityCodeInfo")
    private java.util.List < CommodityCodeInfo> commodityCodeInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeEnsCommodityCodeResponseBody(Builder builder) {
        this.commodityCodeInfo = builder.commodityCodeInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnsCommodityCodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return commodityCodeInfo
     */
    public java.util.List < CommodityCodeInfo> getCommodityCodeInfo() {
        return this.commodityCodeInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < CommodityCodeInfo> commodityCodeInfo; 
        private String requestId; 

        /**
         * CommodityCodeInfo.
         */
        public Builder commodityCodeInfo(java.util.List < CommodityCodeInfo> commodityCodeInfo) {
            this.commodityCodeInfo = commodityCodeInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEnsCommodityCodeResponseBody build() {
            return new DescribeEnsCommodityCodeResponseBody(this);
        } 

    } 

    public static class CommodityCodeInfo extends TeaModel {
        @NameInMap("CommodityCode")
        private String commodityCode;

        @NameInMap("CommodityName")
        private String commodityName;

        private CommodityCodeInfo(Builder builder) {
            this.commodityCode = builder.commodityCode;
            this.commodityName = builder.commodityName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommodityCodeInfo create() {
            return builder().build();
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return commodityName
         */
        public String getCommodityName() {
            return this.commodityName;
        }

        public static final class Builder {
            private String commodityCode; 
            private String commodityName; 

            /**
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * CommodityName.
             */
            public Builder commodityName(String commodityName) {
                this.commodityName = commodityName;
                return this;
            }

            public CommodityCodeInfo build() {
                return new CommodityCodeInfo(this);
            } 

        } 

    }
}
