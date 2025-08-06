// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeVodDomainTopReferVisitResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodDomainTopReferVisitResponseBody</p>
 */
public class DescribeVodDomainTopReferVisitResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("TopReferList")
    private TopReferList topReferList;

    private DescribeVodDomainTopReferVisitResponseBody(Builder builder) {
        this.domainName = builder.domainName;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.topReferList = builder.topReferList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodDomainTopReferVisitResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeVodDomainTopReferVisitResponseBody model) {
            this.domainName = model.domainName;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.topReferList = model.topReferList;
        } 

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

        public DescribeVodDomainTopReferVisitResponseBody build() {
            return new DescribeVodDomainTopReferVisitResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVodDomainTopReferVisitResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainTopReferVisitResponseBody</p>
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

            private Builder() {
            } 

            private Builder(ReferList model) {
                this.flow = model.flow;
                this.flowProportion = model.flowProportion;
                this.referDetail = model.referDetail;
                this.visitData = model.visitData;
                this.visitProportion = model.visitProportion;
            } 

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
    /**
     * 
     * {@link DescribeVodDomainTopReferVisitResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainTopReferVisitResponseBody</p>
     */
    public static class TopReferList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReferList")
        private java.util.List<ReferList> referList;

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
        public java.util.List<ReferList> getReferList() {
            return this.referList;
        }

        public static final class Builder {
            private java.util.List<ReferList> referList; 

            private Builder() {
            } 

            private Builder(TopReferList model) {
                this.referList = model.referList;
            } 

            /**
             * ReferList.
             */
            public Builder referList(java.util.List<ReferList> referList) {
                this.referList = referList;
                return this;
            }

            public TopReferList build() {
                return new TopReferList(this);
            } 

        } 

    }
}
