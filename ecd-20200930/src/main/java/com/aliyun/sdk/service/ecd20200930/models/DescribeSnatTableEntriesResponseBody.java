// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeSnatTableEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSnatTableEntriesResponseBody</p>
 */
public class DescribeSnatTableEntriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SnatTableEntries")
    private java.util.List<SnatTableEntries> snatTableEntries;

    private DescribeSnatTableEntriesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.snatTableEntries = builder.snatTableEntries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSnatTableEntriesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return snatTableEntries
     */
    public java.util.List<SnatTableEntries> getSnatTableEntries() {
        return this.snatTableEntries;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<SnatTableEntries> snatTableEntries; 

        private Builder() {
        } 

        private Builder(DescribeSnatTableEntriesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.snatTableEntries = model.snatTableEntries;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SnatTableEntries.
         */
        public Builder snatTableEntries(java.util.List<SnatTableEntries> snatTableEntries) {
            this.snatTableEntries = snatTableEntries;
            return this;
        }

        public DescribeSnatTableEntriesResponseBody build() {
            return new DescribeSnatTableEntriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSnatTableEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSnatTableEntriesResponseBody</p>
     */
    public static class SnatTableEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EipAffinity")
        private String eipAffinity;

        @com.aliyun.core.annotation.NameInMap("NatGatewayId")
        private String natGatewayId;

        @com.aliyun.core.annotation.NameInMap("SnatEntryId")
        private String snatEntryId;

        @com.aliyun.core.annotation.NameInMap("SnatEntryName")
        private String snatEntryName;

        @com.aliyun.core.annotation.NameInMap("SnatIp")
        private String snatIp;

        @com.aliyun.core.annotation.NameInMap("SnatTableId")
        private String snatTableId;

        @com.aliyun.core.annotation.NameInMap("SourceCIDR")
        private String sourceCIDR;

        @com.aliyun.core.annotation.NameInMap("SourceVSwitchId")
        private String sourceVSwitchId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private SnatTableEntries(Builder builder) {
            this.eipAffinity = builder.eipAffinity;
            this.natGatewayId = builder.natGatewayId;
            this.snatEntryId = builder.snatEntryId;
            this.snatEntryName = builder.snatEntryName;
            this.snatIp = builder.snatIp;
            this.snatTableId = builder.snatTableId;
            this.sourceCIDR = builder.sourceCIDR;
            this.sourceVSwitchId = builder.sourceVSwitchId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnatTableEntries create() {
            return builder().build();
        }

        /**
         * @return eipAffinity
         */
        public String getEipAffinity() {
            return this.eipAffinity;
        }

        /**
         * @return natGatewayId
         */
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        /**
         * @return snatEntryId
         */
        public String getSnatEntryId() {
            return this.snatEntryId;
        }

        /**
         * @return snatEntryName
         */
        public String getSnatEntryName() {
            return this.snatEntryName;
        }

        /**
         * @return snatIp
         */
        public String getSnatIp() {
            return this.snatIp;
        }

        /**
         * @return snatTableId
         */
        public String getSnatTableId() {
            return this.snatTableId;
        }

        /**
         * @return sourceCIDR
         */
        public String getSourceCIDR() {
            return this.sourceCIDR;
        }

        /**
         * @return sourceVSwitchId
         */
        public String getSourceVSwitchId() {
            return this.sourceVSwitchId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String eipAffinity; 
            private String natGatewayId; 
            private String snatEntryId; 
            private String snatEntryName; 
            private String snatIp; 
            private String snatTableId; 
            private String sourceCIDR; 
            private String sourceVSwitchId; 
            private String status; 

            private Builder() {
            } 

            private Builder(SnatTableEntries model) {
                this.eipAffinity = model.eipAffinity;
                this.natGatewayId = model.natGatewayId;
                this.snatEntryId = model.snatEntryId;
                this.snatEntryName = model.snatEntryName;
                this.snatIp = model.snatIp;
                this.snatTableId = model.snatTableId;
                this.sourceCIDR = model.sourceCIDR;
                this.sourceVSwitchId = model.sourceVSwitchId;
                this.status = model.status;
            } 

            /**
             * EipAffinity.
             */
            public Builder eipAffinity(String eipAffinity) {
                this.eipAffinity = eipAffinity;
                return this;
            }

            /**
             * NatGatewayId.
             */
            public Builder natGatewayId(String natGatewayId) {
                this.natGatewayId = natGatewayId;
                return this;
            }

            /**
             * SnatEntryId.
             */
            public Builder snatEntryId(String snatEntryId) {
                this.snatEntryId = snatEntryId;
                return this;
            }

            /**
             * SnatEntryName.
             */
            public Builder snatEntryName(String snatEntryName) {
                this.snatEntryName = snatEntryName;
                return this;
            }

            /**
             * SnatIp.
             */
            public Builder snatIp(String snatIp) {
                this.snatIp = snatIp;
                return this;
            }

            /**
             * SnatTableId.
             */
            public Builder snatTableId(String snatTableId) {
                this.snatTableId = snatTableId;
                return this;
            }

            /**
             * SourceCIDR.
             */
            public Builder sourceCIDR(String sourceCIDR) {
                this.sourceCIDR = sourceCIDR;
                return this;
            }

            /**
             * SourceVSwitchId.
             */
            public Builder sourceVSwitchId(String sourceVSwitchId) {
                this.sourceVSwitchId = sourceVSwitchId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SnatTableEntries build() {
                return new SnatTableEntries(this);
            } 

        } 

    }
}
