// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAPNsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAPNsResponseBody</p>
 */
public class ListAPNsResponseBody extends TeaModel {
    @NameInMap("APNs")
    private java.util.List < APNs> APNs;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

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

    public static final class Builder {
        private java.util.List < APNs> APNs; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAPNsResponseBody build() {
            return new ListAPNsResponseBody(this);
        } 

    } 

    public static class APNs extends TeaModel {
        @NameInMap("APN")
        private String APN;

        @NameInMap("Description")
        private String description;

        @NameInMap("FeatureList")
        private java.util.List < String > featureList;

        @NameInMap("ISP")
        private String ISP;

        @NameInMap("Name")
        private String name;

        @NameInMap("ZoneList")
        private java.util.List < String > zoneList;

        private APNs(Builder builder) {
            this.APN = builder.APN;
            this.description = builder.description;
            this.featureList = builder.featureList;
            this.ISP = builder.ISP;
            this.name = builder.name;
            this.zoneList = builder.zoneList;
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
         * @return featureList
         */
        public java.util.List < String > getFeatureList() {
            return this.featureList;
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
         * @return zoneList
         */
        public java.util.List < String > getZoneList() {
            return this.zoneList;
        }

        public static final class Builder {
            private String APN; 
            private String description; 
            private java.util.List < String > featureList; 
            private String ISP; 
            private String name; 
            private java.util.List < String > zoneList; 

            /**
             * APN.
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
             * FeatureList.
             */
            public Builder featureList(java.util.List < String > featureList) {
                this.featureList = featureList;
                return this;
            }

            /**
             * ISP.
             */
            public Builder ISP(String ISP) {
                this.ISP = ISP;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ZoneList.
             */
            public Builder zoneList(java.util.List < String > zoneList) {
                this.zoneList = zoneList;
                return this;
            }

            public APNs build() {
                return new APNs(this);
            } 

        } 

    }
}
