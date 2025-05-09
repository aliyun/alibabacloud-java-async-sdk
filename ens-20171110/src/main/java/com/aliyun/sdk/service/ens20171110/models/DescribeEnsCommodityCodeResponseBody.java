// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeEnsCommodityCodeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEnsCommodityCodeResponseBody</p>
 */
public class DescribeEnsCommodityCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CommodityCodeInfo")
    private java.util.List<CommodityCodeInfo> commodityCodeInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commodityCodeInfo
     */
    public java.util.List<CommodityCodeInfo> getCommodityCodeInfo() {
        return this.commodityCodeInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<CommodityCodeInfo> commodityCodeInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeEnsCommodityCodeResponseBody model) {
            this.commodityCodeInfo = model.commodityCodeInfo;
            this.requestId = model.requestId;
        } 

        /**
         * CommodityCodeInfo.
         */
        public Builder commodityCodeInfo(java.util.List<CommodityCodeInfo> commodityCodeInfo) {
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

    /**
     * 
     * {@link DescribeEnsCommodityCodeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnsCommodityCodeResponseBody</p>
     */
    public static class CommodityCodeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("CommodityName")
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

            private Builder() {
            } 

            private Builder(CommodityCodeInfo model) {
                this.commodityCode = model.commodityCode;
                this.commodityName = model.commodityName;
            } 

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
