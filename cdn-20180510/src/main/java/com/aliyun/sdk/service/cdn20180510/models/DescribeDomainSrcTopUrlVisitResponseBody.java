// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainSrcTopUrlVisitResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainSrcTopUrlVisitResponseBody</p>
 */
public class DescribeDomainSrcTopUrlVisitResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AllUrlList")
    private AllUrlList allUrlList;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Url200List")
    private Url200List url200List;

    @com.aliyun.core.annotation.NameInMap("Url300List")
    private Url300List url300List;

    @com.aliyun.core.annotation.NameInMap("Url400List")
    private Url400List url400List;

    @com.aliyun.core.annotation.NameInMap("Url500List")
    private Url500List url500List;

    private DescribeDomainSrcTopUrlVisitResponseBody(Builder builder) {
        this.allUrlList = builder.allUrlList;
        this.domainName = builder.domainName;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.url200List = builder.url200List;
        this.url300List = builder.url300List;
        this.url400List = builder.url400List;
        this.url500List = builder.url500List;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainSrcTopUrlVisitResponseBody create() {
        return builder().build();
    }

    /**
     * @return allUrlList
     */
    public AllUrlList getAllUrlList() {
        return this.allUrlList;
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
     * @return url200List
     */
    public Url200List getUrl200List() {
        return this.url200List;
    }

    /**
     * @return url300List
     */
    public Url300List getUrl300List() {
        return this.url300List;
    }

    /**
     * @return url400List
     */
    public Url400List getUrl400List() {
        return this.url400List;
    }

    /**
     * @return url500List
     */
    public Url500List getUrl500List() {
        return this.url500List;
    }

    public static final class Builder {
        private AllUrlList allUrlList; 
        private String domainName; 
        private String requestId; 
        private String startTime; 
        private Url200List url200List; 
        private Url300List url300List; 
        private Url400List url400List; 
        private Url500List url500List; 

        /**
         * A list of frequently requested URLs.
         */
        public Builder allUrlList(AllUrlList allUrlList) {
            this.allUrlList = allUrlList;
            return this;
        }

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
         * A list of URLs for which 2xx status codes were returned.
         */
        public Builder url200List(Url200List url200List) {
            this.url200List = url200List;
            return this;
        }

        /**
         * A list of URLs for which 3xx status codes were returned.
         */
        public Builder url300List(Url300List url300List) {
            this.url300List = url300List;
            return this;
        }

        /**
         * A list of URLs for which 4xx status codes were returned.
         */
        public Builder url400List(Url400List url400List) {
            this.url400List = url400List;
            return this;
        }

        /**
         * A list of URLs for which 5xx status codes were returned.
         */
        public Builder url500List(Url500List url500List) {
            this.url500List = url500List;
            return this;
        }

        public DescribeDomainSrcTopUrlVisitResponseBody build() {
            return new DescribeDomainSrcTopUrlVisitResponseBody(this);
        } 

    } 

    public static class UrlList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Flow")
        private String flow;

        @com.aliyun.core.annotation.NameInMap("FlowProportion")
        private Float flowProportion;

        @com.aliyun.core.annotation.NameInMap("UrlDetail")
        private String urlDetail;

        @com.aliyun.core.annotation.NameInMap("VisitData")
        private String visitData;

        @com.aliyun.core.annotation.NameInMap("VisitProportion")
        private Float visitProportion;

        private UrlList(Builder builder) {
            this.flow = builder.flow;
            this.flowProportion = builder.flowProportion;
            this.urlDetail = builder.urlDetail;
            this.visitData = builder.visitData;
            this.visitProportion = builder.visitProportion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UrlList create() {
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
         * @return urlDetail
         */
        public String getUrlDetail() {
            return this.urlDetail;
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
            private String urlDetail; 
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
             * The complete URL.
             */
            public Builder urlDetail(String urlDetail) {
                this.urlDetail = urlDetail;
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

            public UrlList build() {
                return new UrlList(this);
            } 

        } 

    }
    public static class AllUrlList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UrlList")
        private java.util.List < UrlList> urlList;

        private AllUrlList(Builder builder) {
            this.urlList = builder.urlList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AllUrlList create() {
            return builder().build();
        }

        /**
         * @return urlList
         */
        public java.util.List < UrlList> getUrlList() {
            return this.urlList;
        }

        public static final class Builder {
            private java.util.List < UrlList> urlList; 

            /**
             * UrlList.
             */
            public Builder urlList(java.util.List < UrlList> urlList) {
                this.urlList = urlList;
                return this;
            }

            public AllUrlList build() {
                return new AllUrlList(this);
            } 

        } 

    }
    public static class Url200ListUrlList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Flow")
        private String flow;

        @com.aliyun.core.annotation.NameInMap("FlowProportion")
        private Float flowProportion;

        @com.aliyun.core.annotation.NameInMap("UrlDetail")
        private String urlDetail;

        @com.aliyun.core.annotation.NameInMap("VisitData")
        private String visitData;

        @com.aliyun.core.annotation.NameInMap("VisitProportion")
        private Float visitProportion;

        private Url200ListUrlList(Builder builder) {
            this.flow = builder.flow;
            this.flowProportion = builder.flowProportion;
            this.urlDetail = builder.urlDetail;
            this.visitData = builder.visitData;
            this.visitProportion = builder.visitProportion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Url200ListUrlList create() {
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
         * @return urlDetail
         */
        public String getUrlDetail() {
            return this.urlDetail;
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
            private String urlDetail; 
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
             * The complete URL.
             */
            public Builder urlDetail(String urlDetail) {
                this.urlDetail = urlDetail;
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

            public Url200ListUrlList build() {
                return new Url200ListUrlList(this);
            } 

        } 

    }
    public static class Url200List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UrlList")
        private java.util.List < Url200ListUrlList> urlList;

        private Url200List(Builder builder) {
            this.urlList = builder.urlList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Url200List create() {
            return builder().build();
        }

        /**
         * @return urlList
         */
        public java.util.List < Url200ListUrlList> getUrlList() {
            return this.urlList;
        }

        public static final class Builder {
            private java.util.List < Url200ListUrlList> urlList; 

            /**
             * UrlList.
             */
            public Builder urlList(java.util.List < Url200ListUrlList> urlList) {
                this.urlList = urlList;
                return this;
            }

            public Url200List build() {
                return new Url200List(this);
            } 

        } 

    }
    public static class Url300ListUrlList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Flow")
        private String flow;

        @com.aliyun.core.annotation.NameInMap("FlowProportion")
        private Float flowProportion;

        @com.aliyun.core.annotation.NameInMap("UrlDetail")
        private String urlDetail;

        @com.aliyun.core.annotation.NameInMap("VisitData")
        private String visitData;

        @com.aliyun.core.annotation.NameInMap("VisitProportion")
        private Float visitProportion;

        private Url300ListUrlList(Builder builder) {
            this.flow = builder.flow;
            this.flowProportion = builder.flowProportion;
            this.urlDetail = builder.urlDetail;
            this.visitData = builder.visitData;
            this.visitProportion = builder.visitProportion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Url300ListUrlList create() {
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
         * @return urlDetail
         */
        public String getUrlDetail() {
            return this.urlDetail;
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
            private String urlDetail; 
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
             * The complete URL.
             */
            public Builder urlDetail(String urlDetail) {
                this.urlDetail = urlDetail;
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

            public Url300ListUrlList build() {
                return new Url300ListUrlList(this);
            } 

        } 

    }
    public static class Url300List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UrlList")
        private java.util.List < Url300ListUrlList> urlList;

        private Url300List(Builder builder) {
            this.urlList = builder.urlList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Url300List create() {
            return builder().build();
        }

        /**
         * @return urlList
         */
        public java.util.List < Url300ListUrlList> getUrlList() {
            return this.urlList;
        }

        public static final class Builder {
            private java.util.List < Url300ListUrlList> urlList; 

            /**
             * UrlList.
             */
            public Builder urlList(java.util.List < Url300ListUrlList> urlList) {
                this.urlList = urlList;
                return this;
            }

            public Url300List build() {
                return new Url300List(this);
            } 

        } 

    }
    public static class Url400ListUrlList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Flow")
        private String flow;

        @com.aliyun.core.annotation.NameInMap("FlowProportion")
        private Float flowProportion;

        @com.aliyun.core.annotation.NameInMap("UrlDetail")
        private String urlDetail;

        @com.aliyun.core.annotation.NameInMap("VisitData")
        private String visitData;

        @com.aliyun.core.annotation.NameInMap("VisitProportion")
        private Float visitProportion;

        private Url400ListUrlList(Builder builder) {
            this.flow = builder.flow;
            this.flowProportion = builder.flowProportion;
            this.urlDetail = builder.urlDetail;
            this.visitData = builder.visitData;
            this.visitProportion = builder.visitProportion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Url400ListUrlList create() {
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
         * @return urlDetail
         */
        public String getUrlDetail() {
            return this.urlDetail;
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
            private String urlDetail; 
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
             * The complete URL.
             */
            public Builder urlDetail(String urlDetail) {
                this.urlDetail = urlDetail;
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

            public Url400ListUrlList build() {
                return new Url400ListUrlList(this);
            } 

        } 

    }
    public static class Url400List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UrlList")
        private java.util.List < Url400ListUrlList> urlList;

        private Url400List(Builder builder) {
            this.urlList = builder.urlList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Url400List create() {
            return builder().build();
        }

        /**
         * @return urlList
         */
        public java.util.List < Url400ListUrlList> getUrlList() {
            return this.urlList;
        }

        public static final class Builder {
            private java.util.List < Url400ListUrlList> urlList; 

            /**
             * UrlList.
             */
            public Builder urlList(java.util.List < Url400ListUrlList> urlList) {
                this.urlList = urlList;
                return this;
            }

            public Url400List build() {
                return new Url400List(this);
            } 

        } 

    }
    public static class Url500ListUrlList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Flow")
        private String flow;

        @com.aliyun.core.annotation.NameInMap("FlowProportion")
        private Float flowProportion;

        @com.aliyun.core.annotation.NameInMap("UrlDetail")
        private String urlDetail;

        @com.aliyun.core.annotation.NameInMap("VisitData")
        private String visitData;

        @com.aliyun.core.annotation.NameInMap("VisitProportion")
        private Float visitProportion;

        private Url500ListUrlList(Builder builder) {
            this.flow = builder.flow;
            this.flowProportion = builder.flowProportion;
            this.urlDetail = builder.urlDetail;
            this.visitData = builder.visitData;
            this.visitProportion = builder.visitProportion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Url500ListUrlList create() {
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
         * @return urlDetail
         */
        public String getUrlDetail() {
            return this.urlDetail;
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
            private String urlDetail; 
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
             * The complete URL.
             */
            public Builder urlDetail(String urlDetail) {
                this.urlDetail = urlDetail;
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

            public Url500ListUrlList build() {
                return new Url500ListUrlList(this);
            } 

        } 

    }
    public static class Url500List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UrlList")
        private java.util.List < Url500ListUrlList> urlList;

        private Url500List(Builder builder) {
            this.urlList = builder.urlList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Url500List create() {
            return builder().build();
        }

        /**
         * @return urlList
         */
        public java.util.List < Url500ListUrlList> getUrlList() {
            return this.urlList;
        }

        public static final class Builder {
            private java.util.List < Url500ListUrlList> urlList; 

            /**
             * UrlList.
             */
            public Builder urlList(java.util.List < Url500ListUrlList> urlList) {
                this.urlList = urlList;
                return this;
            }

            public Url500List build() {
                return new Url500List(this);
            } 

        } 

    }
}
