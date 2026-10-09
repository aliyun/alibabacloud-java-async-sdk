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
 * {@link DescribePrivateDnsStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePrivateDnsStatisticsResponseBody</p>
 */
public class DescribePrivateDnsStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AbnormalPrivateDnsCount")
    private Long abnormalPrivateDnsCount;

    @com.aliyun.core.annotation.NameInMap("CreatedPrivateDnsCount")
    private Long createdPrivateDnsCount;

    @com.aliyun.core.annotation.NameInMap("DomainNameTotalCount")
    private Long domainNameTotalCount;

    @com.aliyun.core.annotation.NameInMap("NewDomainNameTotalCount")
    private Long newDomainNameTotalCount;

    @com.aliyun.core.annotation.NameInMap("NormalPrivateDnsCount")
    private Long normalPrivateDnsCount;

    @com.aliyun.core.annotation.NameInMap("PrivateDnsRegionList")
    private java.util.List<PrivateDnsRegionList> privateDnsRegionList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePrivateDnsStatisticsResponseBody(Builder builder) {
        this.abnormalPrivateDnsCount = builder.abnormalPrivateDnsCount;
        this.createdPrivateDnsCount = builder.createdPrivateDnsCount;
        this.domainNameTotalCount = builder.domainNameTotalCount;
        this.newDomainNameTotalCount = builder.newDomainNameTotalCount;
        this.normalPrivateDnsCount = builder.normalPrivateDnsCount;
        this.privateDnsRegionList = builder.privateDnsRegionList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePrivateDnsStatisticsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return abnormalPrivateDnsCount
     */
    public Long getAbnormalPrivateDnsCount() {
        return this.abnormalPrivateDnsCount;
    }

    /**
     * @return createdPrivateDnsCount
     */
    public Long getCreatedPrivateDnsCount() {
        return this.createdPrivateDnsCount;
    }

    /**
     * @return domainNameTotalCount
     */
    public Long getDomainNameTotalCount() {
        return this.domainNameTotalCount;
    }

    /**
     * @return newDomainNameTotalCount
     */
    public Long getNewDomainNameTotalCount() {
        return this.newDomainNameTotalCount;
    }

    /**
     * @return normalPrivateDnsCount
     */
    public Long getNormalPrivateDnsCount() {
        return this.normalPrivateDnsCount;
    }

    /**
     * @return privateDnsRegionList
     */
    public java.util.List<PrivateDnsRegionList> getPrivateDnsRegionList() {
        return this.privateDnsRegionList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long abnormalPrivateDnsCount; 
        private Long createdPrivateDnsCount; 
        private Long domainNameTotalCount; 
        private Long newDomainNameTotalCount; 
        private Long normalPrivateDnsCount; 
        private java.util.List<PrivateDnsRegionList> privateDnsRegionList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePrivateDnsStatisticsResponseBody model) {
            this.abnormalPrivateDnsCount = model.abnormalPrivateDnsCount;
            this.createdPrivateDnsCount = model.createdPrivateDnsCount;
            this.domainNameTotalCount = model.domainNameTotalCount;
            this.newDomainNameTotalCount = model.newDomainNameTotalCount;
            this.normalPrivateDnsCount = model.normalPrivateDnsCount;
            this.privateDnsRegionList = model.privateDnsRegionList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The number of private DNS instances in an abnormal state.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder abnormalPrivateDnsCount(Long abnormalPrivateDnsCount) {
            this.abnormalPrivateDnsCount = abnormalPrivateDnsCount;
            return this;
        }

        /**
         * <p>The number of created private DNS instances.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder createdPrivateDnsCount(Long createdPrivateDnsCount) {
            this.createdPrivateDnsCount = createdPrivateDnsCount;
            return this;
        }

        /**
         * <p>The total number of configured domain names.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder domainNameTotalCount(Long domainNameTotalCount) {
            this.domainNameTotalCount = domainNameTotalCount;
            return this;
        }

        /**
         * <p>The number of configured domain names that were created within the specified time range.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder newDomainNameTotalCount(Long newDomainNameTotalCount) {
            this.newDomainNameTotalCount = newDomainNameTotalCount;
            return this;
        }

        /**
         * <p>The number of private DNS instances in a normal state.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        public Builder normalPrivateDnsCount(Long normalPrivateDnsCount) {
            this.normalPrivateDnsCount = normalPrivateDnsCount;
            return this;
        }

        /**
         * <p>A list of DNS regions.</p>
         */
        public Builder privateDnsRegionList(java.util.List<PrivateDnsRegionList> privateDnsRegionList) {
            this.privateDnsRegionList = privateDnsRegionList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5716ED52-1B82-5DE1-8695-EFEC453D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePrivateDnsStatisticsResponseBody build() {
            return new DescribePrivateDnsStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePrivateDnsStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePrivateDnsStatisticsResponseBody</p>
     */
    public static class PrivateDnsRegionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainNameCount")
        private Long domainNameCount;

        @com.aliyun.core.annotation.NameInMap("NewDomainNameCount")
        private Long newDomainNameCount;

        @com.aliyun.core.annotation.NameInMap("PrivateDnsCount")
        private Long privateDnsCount;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        private PrivateDnsRegionList(Builder builder) {
            this.domainNameCount = builder.domainNameCount;
            this.newDomainNameCount = builder.newDomainNameCount;
            this.privateDnsCount = builder.privateDnsCount;
            this.regionNo = builder.regionNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateDnsRegionList create() {
            return builder().build();
        }

        /**
         * @return domainNameCount
         */
        public Long getDomainNameCount() {
            return this.domainNameCount;
        }

        /**
         * @return newDomainNameCount
         */
        public Long getNewDomainNameCount() {
            return this.newDomainNameCount;
        }

        /**
         * @return privateDnsCount
         */
        public Long getPrivateDnsCount() {
            return this.privateDnsCount;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        public static final class Builder {
            private Long domainNameCount; 
            private Long newDomainNameCount; 
            private Long privateDnsCount; 
            private String regionNo; 

            private Builder() {
            } 

            private Builder(PrivateDnsRegionList model) {
                this.domainNameCount = model.domainNameCount;
                this.newDomainNameCount = model.newDomainNameCount;
                this.privateDnsCount = model.privateDnsCount;
                this.regionNo = model.regionNo;
            } 

            /**
             * <p>The number of configured domain names for private DNS in the region.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder domainNameCount(Long domainNameCount) {
                this.domainNameCount = domainNameCount;
                return this;
            }

            /**
             * <p>The number of configured domain names that were created in the region within the specified time range.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder newDomainNameCount(Long newDomainNameCount) {
                this.newDomainNameCount = newDomainNameCount;
                return this;
            }

            /**
             * <p>The number of private DNS instances in the region.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder privateDnsCount(Long privateDnsCount) {
                this.privateDnsCount = privateDnsCount;
                return this;
            }

            /**
             * <p>The region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            public PrivateDnsRegionList build() {
                return new PrivateDnsRegionList(this);
            } 

        } 

    }
}
