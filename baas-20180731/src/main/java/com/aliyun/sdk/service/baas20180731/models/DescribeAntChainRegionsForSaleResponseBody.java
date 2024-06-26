// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainRegionsForSaleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAntChainRegionsForSaleResponseBody</p>
 */
public class DescribeAntChainRegionsForSaleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

    private DescribeAntChainRegionsForSaleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainRegionsForSaleResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public DescribeAntChainRegionsForSaleResponseBody build() {
            return new DescribeAntChainRegionsForSaleResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("TypeList")
        private java.util.List < String > typeList;

        private Result(Builder builder) {
            this.regionId = builder.regionId;
            this.typeList = builder.typeList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return typeList
         */
        public java.util.List < String > getTypeList() {
            return this.typeList;
        }

        public static final class Builder {
            private String regionId; 
            private java.util.List < String > typeList; 

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * TypeList.
             */
            public Builder typeList(java.util.List < String > typeList) {
                this.typeList = typeList;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
