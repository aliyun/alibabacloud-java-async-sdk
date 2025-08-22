// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

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
 * {@link DescribeDcdnDomainTopUrlVisitResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainTopUrlVisitResponseBody</p>
 */
public class DescribeDcdnDomainTopUrlVisitResponseBody extends TeaModel {
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

    private DescribeDcdnDomainTopUrlVisitResponseBody(Builder builder) {
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

    public static DescribeDcdnDomainTopUrlVisitResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDcdnDomainTopUrlVisitResponseBody model) {
            this.allUrlList = model.allUrlList;
            this.domainName = model.domainName;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.url200List = model.url200List;
            this.url300List = model.url300List;
            this.url400List = model.url400List;
            this.url500List = model.url500List;
        } 

        /**
         * <p>A list of frequently requested URLs.</p>
         */
        public Builder allUrlList(AllUrlList allUrlList) {
            this.allUrlList = allUrlList;
            return this;
        }

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
         * <p>64D28B53-5902-409B-94F6-FD46680144FE</p>
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
         * <p>A list of URLs for which 2xx status codes were returned.</p>
         */
        public Builder url200List(Url200List url200List) {
            this.url200List = url200List;
            return this;
        }

        /**
         * <p>A list of URLs for which 3xx status codes were returned.</p>
         */
        public Builder url300List(Url300List url300List) {
            this.url300List = url300List;
            return this;
        }

        /**
         * <p>A list of URLs for which 4xx status codes were returned.</p>
         */
        public Builder url400List(Url400List url400List) {
            this.url400List = url400List;
            return this;
        }

        /**
         * <p>A list of URLs for which 5xx status codes were returned.</p>
         */
        public Builder url500List(Url500List url500List) {
            this.url500List = url500List;
            return this;
        }

        public DescribeDcdnDomainTopUrlVisitResponseBody build() {
            return new DescribeDcdnDomainTopUrlVisitResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnDomainTopUrlVisitResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainTopUrlVisitResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(UrlList model) {
                this.flow = model.flow;
                this.flowProportion = model.flowProportion;
                this.urlDetail = model.urlDetail;
                this.visitData = model.visitData;
                this.visitProportion = model.visitProportion;
            } 

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
             * <p>The complete URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.com/nn_live/nn_x64/a0.m3u8">http://example.com/nn_live/nn_x64/a0.m3u8</a></p>
             */
            public Builder urlDetail(String urlDetail) {
                this.urlDetail = urlDetail;
                return this;
            }

            /**
             * <p>The number of visits.</p>
             * 
             * <strong>example:</strong>
             * <p>161673</p>
             */
            public Builder visitData(String visitData) {
                this.visitData = visitData;
                return this;
            }

            /**
             * <p>The proportion of visits.</p>
             * 
             * <strong>example:</strong>
             * <p>0.35</p>
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
    /**
     * 
     * {@link DescribeDcdnDomainTopUrlVisitResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainTopUrlVisitResponseBody</p>
     */
    public static class AllUrlList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UrlList")
        private java.util.List<UrlList> urlList;

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
        public java.util.List<UrlList> getUrlList() {
            return this.urlList;
        }

        public static final class Builder {
            private java.util.List<UrlList> urlList; 

            private Builder() {
            } 

            private Builder(AllUrlList model) {
                this.urlList = model.urlList;
            } 

            /**
             * UrlList.
             */
            public Builder urlList(java.util.List<UrlList> urlList) {
                this.urlList = urlList;
                return this;
            }

            public AllUrlList build() {
                return new AllUrlList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDcdnDomainTopUrlVisitResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainTopUrlVisitResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Url200ListUrlList model) {
                this.flow = model.flow;
                this.flowProportion = model.flowProportion;
                this.urlDetail = model.urlDetail;
                this.visitData = model.visitData;
                this.visitProportion = model.visitProportion;
            } 

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
             * <p>The complete URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.com/nn_live/nn_x64/a0.m3u8">http://example.com/nn_live/nn_x64/a0.m3u8</a></p>
             */
            public Builder urlDetail(String urlDetail) {
                this.urlDetail = urlDetail;
                return this;
            }

            /**
             * <p>The number of visits.</p>
             * 
             * <strong>example:</strong>
             * <p>161673</p>
             */
            public Builder visitData(String visitData) {
                this.visitData = visitData;
                return this;
            }

            /**
             * <p>The proportion of visits.</p>
             * 
             * <strong>example:</strong>
             * <p>0.35</p>
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
    /**
     * 
     * {@link DescribeDcdnDomainTopUrlVisitResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainTopUrlVisitResponseBody</p>
     */
    public static class Url200List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UrlList")
        private java.util.List<Url200ListUrlList> urlList;

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
        public java.util.List<Url200ListUrlList> getUrlList() {
            return this.urlList;
        }

        public static final class Builder {
            private java.util.List<Url200ListUrlList> urlList; 

            private Builder() {
            } 

            private Builder(Url200List model) {
                this.urlList = model.urlList;
            } 

            /**
             * UrlList.
             */
            public Builder urlList(java.util.List<Url200ListUrlList> urlList) {
                this.urlList = urlList;
                return this;
            }

            public Url200List build() {
                return new Url200List(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDcdnDomainTopUrlVisitResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainTopUrlVisitResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Url300ListUrlList model) {
                this.flow = model.flow;
                this.flowProportion = model.flowProportion;
                this.urlDetail = model.urlDetail;
                this.visitData = model.visitData;
                this.visitProportion = model.visitProportion;
            } 

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
             * <p>The complete URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.com/nn_live/nn_x64/a0.m3u8">http://example.com/nn_live/nn_x64/a0.m3u8</a></p>
             */
            public Builder urlDetail(String urlDetail) {
                this.urlDetail = urlDetail;
                return this;
            }

            /**
             * <p>The number of visits.</p>
             * 
             * <strong>example:</strong>
             * <p>161673</p>
             */
            public Builder visitData(String visitData) {
                this.visitData = visitData;
                return this;
            }

            /**
             * <p>The proportion of visits.</p>
             * 
             * <strong>example:</strong>
             * <p>0.35</p>
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
    /**
     * 
     * {@link DescribeDcdnDomainTopUrlVisitResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainTopUrlVisitResponseBody</p>
     */
    public static class Url300List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UrlList")
        private java.util.List<Url300ListUrlList> urlList;

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
        public java.util.List<Url300ListUrlList> getUrlList() {
            return this.urlList;
        }

        public static final class Builder {
            private java.util.List<Url300ListUrlList> urlList; 

            private Builder() {
            } 

            private Builder(Url300List model) {
                this.urlList = model.urlList;
            } 

            /**
             * UrlList.
             */
            public Builder urlList(java.util.List<Url300ListUrlList> urlList) {
                this.urlList = urlList;
                return this;
            }

            public Url300List build() {
                return new Url300List(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDcdnDomainTopUrlVisitResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainTopUrlVisitResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Url400ListUrlList model) {
                this.flow = model.flow;
                this.flowProportion = model.flowProportion;
                this.urlDetail = model.urlDetail;
                this.visitData = model.visitData;
                this.visitProportion = model.visitProportion;
            } 

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
             * <p>The complete URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.com/nn_live/nn_x64/a0.m3u8">http://example.com/nn_live/nn_x64/a0.m3u8</a></p>
             */
            public Builder urlDetail(String urlDetail) {
                this.urlDetail = urlDetail;
                return this;
            }

            /**
             * <p>The number of visits.</p>
             * 
             * <strong>example:</strong>
             * <p>161673</p>
             */
            public Builder visitData(String visitData) {
                this.visitData = visitData;
                return this;
            }

            /**
             * <p>The proportion of visits.</p>
             * 
             * <strong>example:</strong>
             * <p>0.35</p>
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
    /**
     * 
     * {@link DescribeDcdnDomainTopUrlVisitResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainTopUrlVisitResponseBody</p>
     */
    public static class Url400List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UrlList")
        private java.util.List<Url400ListUrlList> urlList;

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
        public java.util.List<Url400ListUrlList> getUrlList() {
            return this.urlList;
        }

        public static final class Builder {
            private java.util.List<Url400ListUrlList> urlList; 

            private Builder() {
            } 

            private Builder(Url400List model) {
                this.urlList = model.urlList;
            } 

            /**
             * UrlList.
             */
            public Builder urlList(java.util.List<Url400ListUrlList> urlList) {
                this.urlList = urlList;
                return this;
            }

            public Url400List build() {
                return new Url400List(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDcdnDomainTopUrlVisitResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainTopUrlVisitResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Url500ListUrlList model) {
                this.flow = model.flow;
                this.flowProportion = model.flowProportion;
                this.urlDetail = model.urlDetail;
                this.visitData = model.visitData;
                this.visitProportion = model.visitProportion;
            } 

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
             * <p>The complete URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.com/nn_live/nn_x64/a0.m3u8">http://example.com/nn_live/nn_x64/a0.m3u8</a></p>
             */
            public Builder urlDetail(String urlDetail) {
                this.urlDetail = urlDetail;
                return this;
            }

            /**
             * <p>The number of visits.</p>
             * 
             * <strong>example:</strong>
             * <p>161673</p>
             */
            public Builder visitData(String visitData) {
                this.visitData = visitData;
                return this;
            }

            /**
             * <p>The proportion of visits.</p>
             * 
             * <strong>example:</strong>
             * <p>0.35</p>
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
    /**
     * 
     * {@link DescribeDcdnDomainTopUrlVisitResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainTopUrlVisitResponseBody</p>
     */
    public static class Url500List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UrlList")
        private java.util.List<Url500ListUrlList> urlList;

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
        public java.util.List<Url500ListUrlList> getUrlList() {
            return this.urlList;
        }

        public static final class Builder {
            private java.util.List<Url500ListUrlList> urlList; 

            private Builder() {
            } 

            private Builder(Url500List model) {
                this.urlList = model.urlList;
            } 

            /**
             * UrlList.
             */
            public Builder urlList(java.util.List<Url500ListUrlList> urlList) {
                this.urlList = urlList;
                return this;
            }

            public Url500List build() {
                return new Url500List(this);
            } 

        } 

    }
}
