// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcsResponseBody</p>
 */
public class DescribeVpcsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    @Validation(required = true)
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("Vpcs")
    private java.util.List < Vpcs> vpcs;

    private DescribeVpcsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vpcs = builder.vpcs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcsResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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

    /**
     * @return vpcs
     */
    public java.util.List < Vpcs> getVpcs() {
        return this.vpcs;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < Vpcs> vpcs; 

        /**
         * The maximum number of entries returned on a single page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that marks the end of the current returned page. If this parameter is empty, it indicates that you have retrieved all the data.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned. By default, this parameter is not returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The list of VPCs that are available in the specified region.
         */
        public Builder vpcs(java.util.List < Vpcs> vpcs) {
            this.vpcs = vpcs;
            return this;
        }

        public DescribeVpcsResponseBody build() {
            return new DescribeVpcsResponseBody(this);
        } 

    } 

    public static class Vpcs extends TeaModel {
        @NameInMap("IsDefault")
        private Boolean isDefault;

        @NameInMap("Status")
        private String status;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpcName")
        private String vpcName;

        private Vpcs(Builder builder) {
            this.isDefault = builder.isDefault;
            this.status = builder.status;
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vpcs create() {
            return builder().build();
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
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
            private Boolean isDefault; 
            private String status; 
            private String vpcId; 
            private String vpcName; 

            /**
             * Indicates whether the VPC is the default VPC in the specified region. Valid values:
             * <p>
             * 
             * *   `true`: yes
             * *   `false`: no
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * The status of the VPC. Valid values:
             * <p>
             * 
             * *   `Pending`: The VPC is being configured.
             * *   `Available`: The VPC is available for use.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of a VPC.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The name of the VPC.
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            public Vpcs build() {
                return new Vpcs(this);
            } 

        } 

    }
}
