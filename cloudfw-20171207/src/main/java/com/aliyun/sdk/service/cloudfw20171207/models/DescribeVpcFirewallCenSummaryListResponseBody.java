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
 * {@link DescribeVpcFirewallCenSummaryListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcFirewallCenSummaryListResponseBody</p>
 */
public class DescribeVpcFirewallCenSummaryListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CenList")
    private java.util.List<CenList> cenList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeVpcFirewallCenSummaryListResponseBody(Builder builder) {
        this.cenList = builder.cenList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallCenSummaryListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cenList
     */
    public java.util.List<CenList> getCenList() {
        return this.cenList;
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
        private java.util.List<CenList> cenList; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeVpcFirewallCenSummaryListResponseBody model) {
            this.cenList = model.cenList;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of CEN instances.</p>
         */
        public Builder cenList(java.util.List<CenList> cenList) {
            this.cenList = cenList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>432D6CCA-5186-5B91-A2B8-10C8994B****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeVpcFirewallCenSummaryListResponseBody build() {
            return new DescribeVpcFirewallCenSummaryListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVpcFirewallCenSummaryListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallCenSummaryListResponseBody</p>
     */
    public static class CenList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CenId")
        private String cenId;

        @com.aliyun.core.annotation.NameInMap("CenName")
        private String cenName;

        @com.aliyun.core.annotation.NameInMap("RegionNoList")
        private java.util.List<String> regionNoList;

        private CenList(Builder builder) {
            this.cenId = builder.cenId;
            this.cenName = builder.cenName;
            this.regionNoList = builder.regionNoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CenList create() {
            return builder().build();
        }

        /**
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
        }

        /**
         * @return cenName
         */
        public String getCenName() {
            return this.cenName;
        }

        /**
         * @return regionNoList
         */
        public java.util.List<String> getRegionNoList() {
            return this.regionNoList;
        }

        public static final class Builder {
            private String cenId; 
            private String cenName; 
            private java.util.List<String> regionNoList; 

            private Builder() {
            } 

            private Builder(CenList model) {
                this.cenId = model.cenId;
                this.cenName = model.cenName;
                this.regionNoList = model.regionNoList;
            } 

            /**
             * <p>The ID of the CEN instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cen-maqfw3abcmjy56****</p>
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * <p>The name of the CEN instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder cenName(String cenName) {
                this.cenName = cenName;
                return this;
            }

            /**
             * <p>The list of region IDs for the VPC border firewall.</p>
             */
            public Builder regionNoList(java.util.List<String> regionNoList) {
                this.regionNoList = regionNoList;
                return this;
            }

            public CenList build() {
                return new CenList(this);
            } 

        } 

    }
}
