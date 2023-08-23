// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainTopReferVisitResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainTopReferVisitResponseBody</p>
 */
public class DescribeDomainTopReferVisitResponseBody extends TeaModel {
    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    @NameInMap("TopReferList")
    private TopReferList topReferList;

    private DescribeDomainTopReferVisitResponseBody(Builder builder) {
        this.domainName = builder.domainName;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.topReferList = builder.topReferList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainTopReferVisitResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return topReferList
     */
    public TopReferList getTopReferList() {
        return this.topReferList;
    }

    public static final class Builder {
        private String domainName; 
        private String requestId; 
        private String startTime; 
        private TopReferList topReferList; 

        /**
         * The accelerated domain name.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The beginning of the time range that was queried.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * The most frequently requested web pages.
         */
        public Builder topReferList(TopReferList topReferList) {
            this.topReferList = topReferList;
            return this;
        }

        public DescribeDomainTopReferVisitResponseBody build() {
            return new DescribeDomainTopReferVisitResponseBody(this);
        } 

    } 

    public static class ReferList extends TeaModel {
        @NameInMap("Flow")
        private String flow;

        @NameInMap("FlowProportion")
        private Float flowProportion;

        @NameInMap("ReferDetail")
        private String referDetail;

        @NameInMap("VisitData")
        private String visitData;

        @NameInMap("VisitProportion")
        private Float visitProportion;

        private ReferList(Builder builder) {
            this.flow = builder.flow;
            this.flowProportion = builder.flowProportion;
            this.referDetail = builder.referDetail;
            this.visitData = builder.visitData;
            this.visitProportion = builder.visitProportion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReferList create() {
            return builder().build();
        }

        /**
         * @return flow
         */
        public String getFlow() {
            return this.flow;
        }

        /**
         * @return flowProportion
         */
        public Float getFlowProportion() {
            return this.flowProportion;
        }

        /**
         * @return referDetail
         */
        public String getReferDetail() {
            return this.referDetail;
        }

        /**
         * @return visitData
         */
        public String getVisitData() {
            return this.visitData;
        }

        /**
         * @return visitProportion
         */
        public Float getVisitProportion() {
            return this.visitProportion;
        }

        public static final class Builder {
            private String flow; 
            private Float flowProportion; 
            private String referDetail; 
            private String visitData; 
            private Float visitProportion; 

            /**
             * The amount of network traffic. Unit: bytes.
             */
            public Builder flow(String flow) {
                this.flow = flow;
                return this;
            }

            /**
             * The proportion of network traffic consumed to access the URL.
             */
            public Builder flowProportion(Float flowProportion) {
                this.flowProportion = flowProportion;
                return this;
            }

            /**
             * The URLs to the most frequently requested web pages.
             */
            public Builder referDetail(String referDetail) {
                this.referDetail = referDetail;
                return this;
            }

            /**
             * The number of visits to the URL.
             */
            public Builder visitData(String visitData) {
                this.visitData = visitData;
                return this;
            }

            /**
             * The proportion of visits to the URL.
             */
            public Builder visitProportion(Float visitProportion) {
                this.visitProportion = visitProportion;
                return this;
            }

            public ReferList build() {
                return new ReferList(this);
            } 

        } 

    }
    public static class TopReferList extends TeaModel {
        @NameInMap("ReferList")
        private java.util.List < ReferList> referList;

        private TopReferList(Builder builder) {
            this.referList = builder.referList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopReferList create() {
            return builder().build();
        }

        /**
         * @return referList
         */
        public java.util.List < ReferList> getReferList() {
            return this.referList;
        }

        public static final class Builder {
            private java.util.List < ReferList> referList; 

            /**
             * ReferList.
             */
            public Builder referList(java.util.List < ReferList> referList) {
                this.referList = referList;
                return this;
            }

            public TopReferList build() {
                return new TopReferList(this);
            } 

        } 

    }
}
