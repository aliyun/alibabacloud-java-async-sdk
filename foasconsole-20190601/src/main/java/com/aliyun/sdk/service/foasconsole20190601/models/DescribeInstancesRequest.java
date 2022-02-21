// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstancesRequest</p>
 */
public class DescribeInstancesRequest extends Request {
    @Query
    @NameInMap("DescribeInstancesRequest")
    @Validation(required = true)
    private DescribeInstancesRequestDescribeInstancesRequest describeInstancesRequest;

    private DescribeInstancesRequest(Builder builder) {
        super(builder);
        this.describeInstancesRequest = builder.describeInstancesRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return describeInstancesRequest
     */
    public DescribeInstancesRequestDescribeInstancesRequest getDescribeInstancesRequest() {
        return this.describeInstancesRequest;
    }

    public static final class Builder extends Request.Builder<DescribeInstancesRequest, Builder> {
        private DescribeInstancesRequestDescribeInstancesRequest describeInstancesRequest; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstancesRequest response) {
            super(response);
            this.describeInstancesRequest = response.describeInstancesRequest;
        } 

        /**
         * DescribeInstancesRequest.
         */
        public Builder describeInstancesRequest(DescribeInstancesRequestDescribeInstancesRequest describeInstancesRequest) {
            this.putQueryParameter("DescribeInstancesRequest", describeInstancesRequest);
            this.describeInstancesRequest = describeInstancesRequest;
            return this;
        }

        @Override
        public DescribeInstancesRequest build() {
            return new DescribeInstancesRequest(this);
        } 

    } 

    public static class DescribeInstancesRequestDescribeInstancesRequest extends TeaModel {
        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("PageIndex")
        private Integer pageIndex;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Region")
        @Validation(required = true)
        private String region;

        private DescribeInstancesRequestDescribeInstancesRequest(Builder builder) {
            this.chargeType = builder.chargeType;
            this.instanceId = builder.instanceId;
            this.pageIndex = builder.pageIndex;
            this.pageSize = builder.pageSize;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescribeInstancesRequestDescribeInstancesRequest create() {
            return builder().build();
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return pageIndex
         */
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String chargeType; 
            private String instanceId; 
            private Integer pageIndex; 
            private Integer pageSize; 
            private String region; 

            /**
             * 付款类型
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * PageIndex.
             */
            public Builder pageIndex(Integer pageIndex) {
                this.pageIndex = pageIndex;
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
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public DescribeInstancesRequestDescribeInstancesRequest build() {
                return new DescribeInstancesRequestDescribeInstancesRequest(this);
            } 

        } 

    }
}
