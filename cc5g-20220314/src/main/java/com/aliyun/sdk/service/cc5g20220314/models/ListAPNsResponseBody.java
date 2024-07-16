// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAPNsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAPNsResponseBody</p>
 */
public class ListAPNsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("APNs")
    private java.util.List < APNs> APNs;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private String maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListAPNsResponseBody(Builder builder) {
        this.APNs = builder.APNs;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAPNsResponseBody create() {
        return builder().build();
    }

    /**
     * @return APNs
     */
    public java.util.List < APNs> getAPNs() {
        return this.APNs;
    }

    /**
     * @return maxResults
     */
    public String getMaxResults() {
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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < APNs> APNs; 
        private String maxResults; 
        private String nextToken; 
        private String requestId; 
        private String totalCount; 

        /**
         * APNs.
         */
        public Builder APNs(java.util.List < APNs> APNs) {
            this.APNs = APNs;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(String maxResults) {
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
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAPNsResponseBody build() {
            return new ListAPNsResponseBody(this);
        } 

    } 

    public static class APNs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("APN")
        private String APN;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ISP")
        private String ISP;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Zones")
        private java.util.List < String > zones;

        private APNs(Builder builder) {
            this.APN = builder.APN;
            this.description = builder.description;
            this.ISP = builder.ISP;
            this.name = builder.name;
            this.zones = builder.zones;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static APNs create() {
            return builder().build();
        }

        /**
         * @return APN
         */
        public String getAPN() {
            return this.APN;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ISP
         */
        public String getISP() {
            return this.ISP;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return zones
         */
        public java.util.List < String > getZones() {
            return this.zones;
        }

        public static final class Builder {
            private String APN; 
            private String description; 
            private String ISP; 
            private String name; 
            private java.util.List < String > zones; 

            /**
             * 代表资源名称的资源属性字段
             */
            public Builder APN(String APN) {
                this.APN = APN;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 代表资源一级ID的资源属性字段
             */
            public Builder ISP(String ISP) {
                this.ISP = ISP;
                return this;
            }

            /**
             * 代表创建时间的资源属性字段
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Zones.
             */
            public Builder zones(java.util.List < String > zones) {
                this.zones = zones;
                return this;
            }

            public APNs build() {
                return new APNs(this);
            } 

        } 

    }
}
