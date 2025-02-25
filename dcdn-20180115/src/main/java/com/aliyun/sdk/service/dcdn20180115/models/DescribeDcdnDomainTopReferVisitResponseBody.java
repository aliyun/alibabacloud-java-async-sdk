// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnDomainTopReferVisitResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainTopReferVisitResponseBody</p>
 */
public class DescribeDcdnDomainTopReferVisitResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("TopReferList")
    private TopReferList topReferList;

    private DescribeDcdnDomainTopReferVisitResponseBody(Builder builder) {
        this.domainName = builder.domainName;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.topReferList = builder.topReferList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainTopReferVisitResponseBody create() {
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
         * <p>The accelerated domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>95994621-8382-464B-8762-C708E73568D1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The start of the time range during which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-10-03T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The list of frequently referenced URLs returned.</p>
         */
        public Builder topReferList(TopReferList topReferList) {
            this.topReferList = topReferList;
            return this;
        }

        public DescribeDcdnDomainTopReferVisitResponseBody build() {
            return new DescribeDcdnDomainTopReferVisitResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnDomainTopReferVisitResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainTopReferVisitResponseBody</p>
     */
    public static class ReferList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Flow")
        private String flow;

        @com.aliyun.core.annotation.NameInMap("FlowProportion")
        private Float flowProportion;

        @com.aliyun.core.annotation.NameInMap("ReferDetail")
        private String referDetail;

        @com.aliyun.core.annotation.NameInMap("VisitData")
        private String visitData;

        @com.aliyun.core.annotation.NameInMap("VisitProportion")
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
             * <p>The amount of network traffic. (Unit: bytes)</p>
             * 
             * <strong>example:</strong>
             * <p>460486880</p>
             */
            public Builder flow(String flow) {
                this.flow = flow;
                return this;
            }

            /**
             * <p>The proportion of network traffic consumed to access the URL.</p>
             * 
             * <strong>example:</strong>
             * <p>0.35</p>
             */
            public Builder flowProportion(Float flowProportion) {
                this.flowProportion = flowProportion;
                return this;
            }

            /**
             * <p>The complete referenced URL.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.1</p>
             */
            public Builder referDetail(String referDetail) {
                this.referDetail = referDetail;
                return this;
            }

            /**
             * <p>The number of visits.</p>
             * 
             * <strong>example:</strong>
             * <p>229567</p>
             */
            public Builder visitData(String visitData) {
                this.visitData = visitData;
                return this;
            }

            /**
             * <p>The proportion of visits to the URL.</p>
             * 
             * <strong>example:</strong>
             * <p>0.35</p>
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
    /**
     * 
     * {@link DescribeDcdnDomainTopReferVisitResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainTopReferVisitResponseBody</p>
     */
    public static class TopReferList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReferList")
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
