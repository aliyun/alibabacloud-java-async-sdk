// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScdnDomainTopReferVisitResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScdnDomainTopReferVisitResponseBody</p>
 */
public class DescribeScdnDomainTopReferVisitResponseBody extends TeaModel {
    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    @NameInMap("TopReferList")
    private TopReferList topReferList;

    private DescribeScdnDomainTopReferVisitResponseBody(Builder builder) {
        this.domainName = builder.domainName;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.topReferList = builder.topReferList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScdnDomainTopReferVisitResponseBody create() {
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
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * TopReferList.
         */
        public Builder topReferList(TopReferList topReferList) {
            this.topReferList = topReferList;
            return this;
        }

        public DescribeScdnDomainTopReferVisitResponseBody build() {
            return new DescribeScdnDomainTopReferVisitResponseBody(this);
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
             * Flow.
             */
            public Builder flow(String flow) {
                this.flow = flow;
                return this;
            }

            /**
             * FlowProportion.
             */
            public Builder flowProportion(Float flowProportion) {
                this.flowProportion = flowProportion;
                return this;
            }

            /**
             * ReferDetail.
             */
            public Builder referDetail(String referDetail) {
                this.referDetail = referDetail;
                return this;
            }

            /**
             * VisitData.
             */
            public Builder visitData(String visitData) {
                this.visitData = visitData;
                return this;
            }

            /**
             * VisitProportion.
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
