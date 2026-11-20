// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeAiEngineEvidenceRequestsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAiEngineEvidenceRequestsResponseBody</p>
 */
public class DescribeAiEngineEvidenceRequestsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAiEngineEvidenceRequestsResponseBody(Builder builder) {
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAiEngineEvidenceRequestsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
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
        private java.util.List<Items> items; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeAiEngineEvidenceRequestsResponseBody model) {
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of evidence requests.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The number of entries to return on each page in a paging query. Valid values: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next page. If a next page exists, this field returns a value.</p>
         * <blockquote>
         * <p>If this parameter returns a value, a next page exists. You can use the returned <strong>NextToken</strong> as a request parameter to retrieve the next page. Repeat this process until no value is returned, which indicates that all data has been retrieved.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>AAAAAGBgV9tolsLfijC4wam2htS*****D/46H3X2wIS</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>01A1CEE2-<em><strong><strong>9-019A-8B44-2</strong></strong></em>C2C8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of evidence requests that meet the specified conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAiEngineEvidenceRequestsResponseBody build() {
            return new DescribeAiEngineEvidenceRequestsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAiEngineEvidenceRequestsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAiEngineEvidenceRequestsResponseBody</p>
     */
    public static class Sources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attribute")
        private String attribute;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Sources(Builder builder) {
            this.attribute = builder.attribute;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sources create() {
            return builder().build();
        }

        /**
         * @return attribute
         */
        public String getAttribute() {
            return this.attribute;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String attribute; 
            private String value; 

            private Builder() {
            } 

            private Builder(Sources model) {
                this.attribute = model.attribute;
                this.value = model.value;
            } 

            /**
             * <p>The display attribute of the source, such as the region code.</p>
             * 
             * <strong>example:</strong>
             * <p>US-CA</p>
             */
            public Builder attribute(String attribute) {
                this.attribute = attribute;
                return this;
            }

            /**
             * <p>The source value, such as an IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>2XX.0.113.1X</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Sources build() {
                return new Sources(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAiEngineEvidenceRequestsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAiEngineEvidenceRequestsResponseBody</p>
     */
    public static class AttackSources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Sources")
        private java.util.List<Sources> sources;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private AttackSources(Builder builder) {
            this.sources = builder.sources;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttackSources create() {
            return builder().build();
        }

        /**
         * @return sources
         */
        public java.util.List<Sources> getSources() {
            return this.sources;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<Sources> sources; 
            private String type; 

            private Builder() {
            } 

            private Builder(AttackSources model) {
                this.sources = model.sources;
                this.type = model.type;
            } 

            /**
             * <p>The list of sources of this type.</p>
             */
            public Builder sources(java.util.List<Sources> sources) {
                this.sources = sources;
                return this;
            }

            /**
             * <p>The attack source type.</p>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AttackSources build() {
                return new AttackSources(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAiEngineEvidenceRequestsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAiEngineEvidenceRequestsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttackSources")
        private java.util.List<AttackSources> attackSources;

        @com.aliyun.core.annotation.NameInMap("EvidenceId")
        private String evidenceId;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("HttpStatus")
        private Integer httpStatus;

        @com.aliyun.core.annotation.NameInMap("ImpactType")
        private String impactType;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("RequestPath")
        private String requestPath;

        @com.aliyun.core.annotation.NameInMap("RequestTime")
        private Long requestTime;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private String resource;

        @com.aliyun.core.annotation.NameInMap("SuspectedBypass")
        private Integer suspectedBypass;

        @com.aliyun.core.annotation.NameInMap("TraceId")
        private String traceId;

        private Items(Builder builder) {
            this.attackSources = builder.attackSources;
            this.evidenceId = builder.evidenceId;
            this.host = builder.host;
            this.httpStatus = builder.httpStatus;
            this.impactType = builder.impactType;
            this.method = builder.method;
            this.nodeId = builder.nodeId;
            this.requestPath = builder.requestPath;
            this.requestTime = builder.requestTime;
            this.resource = builder.resource;
            this.suspectedBypass = builder.suspectedBypass;
            this.traceId = builder.traceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return attackSources
         */
        public java.util.List<AttackSources> getAttackSources() {
            return this.attackSources;
        }

        /**
         * @return evidenceId
         */
        public String getEvidenceId() {
            return this.evidenceId;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return httpStatus
         */
        public Integer getHttpStatus() {
            return this.httpStatus;
        }

        /**
         * @return impactType
         */
        public String getImpactType() {
            return this.impactType;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return requestPath
         */
        public String getRequestPath() {
            return this.requestPath;
        }

        /**
         * @return requestTime
         */
        public Long getRequestTime() {
            return this.requestTime;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        /**
         * @return suspectedBypass
         */
        public Integer getSuspectedBypass() {
            return this.suspectedBypass;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        public static final class Builder {
            private java.util.List<AttackSources> attackSources; 
            private String evidenceId; 
            private String host; 
            private Integer httpStatus; 
            private String impactType; 
            private String method; 
            private String nodeId; 
            private String requestPath; 
            private Long requestTime; 
            private String resource; 
            private Integer suspectedBypass; 
            private String traceId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.attackSources = model.attackSources;
                this.evidenceId = model.evidenceId;
                this.host = model.host;
                this.httpStatus = model.httpStatus;
                this.impactType = model.impactType;
                this.method = model.method;
                this.nodeId = model.nodeId;
                this.requestPath = model.requestPath;
                this.requestTime = model.requestTime;
                this.resource = model.resource;
                this.suspectedBypass = model.suspectedBypass;
                this.traceId = model.traceId;
            } 

            /**
             * <p>The list of attack source groups for the request.</p>
             */
            public Builder attackSources(java.util.List<AttackSources> attackSources) {
                this.attackSources = attackSources;
                return this;
            }

            /**
             * <p>The evidence ID.</p>
             * 
             * <strong>example:</strong>
             * <p>EVD-20241025-001</p>
             */
            public Builder evidenceId(String evidenceId) {
                this.evidenceId = evidenceId;
                return this;
            }

            /**
             * <p>The host of the request.</p>
             * 
             * <strong>example:</strong>
             * <p>api.example.com</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The HTTP response status code.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder httpStatus(Integer httpStatus) {
                this.httpStatus = httpStatus;
                return this;
            }

            /**
             * <p>The evidence impact tag. Valid values:</p>
             * <ul>
             * <li><p><strong>block</strong>: Indicates that the request is blocked.</p>
             * </li>
             * <li><p><strong>challenge</strong>: Indicates that the request is challenged.</p>
             * </li>
             * <li><p><strong>monitor</strong>: Indicates that the request is monitored.</p>
             * </li>
             * <li><p><strong>bypass</strong>: Indicates a suspected bypass.</p>
             * </li>
             * <li><p><strong>attempt</strong>: Indicates reconnaissance or probing.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>bypass</p>
             */
            public Builder impactType(String impactType) {
                this.impactType = impactType;
                return this;
            }

            /**
             * <p>The HTTP method.</p>
             * 
             * <strong>example:</strong>
             * <p>GET</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The ID of the associated node. This corresponds to the NodeId in the node list.</p>
             * 
             * <strong>example:</strong>
             * <p>node-109-04</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The masked path of the request.</p>
             * 
             * <strong>example:</strong>
             * <p>/api/orders/query</p>
             */
            public Builder requestPath(String requestPath) {
                this.requestPath = requestPath;
                return this;
            }

            /**
             * <p>The time when the original request was made. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1792973400000</p>
             */
            public Builder requestTime(Long requestTime) {
                this.requestTime = requestTime;
                return this;
            }

            /**
             * <p>The protected object to which the request belongs.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * <p>Specifies whether the request is a suspected bypass. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Indicates a suspected bypass.</li>
             * <li><strong>0</strong>: Indicates that the request is not a bypass.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder suspectedBypass(Integer suspectedBypass) {
                this.suspectedBypass = suspectedBypass;
                return this;
            }

            /**
             * <p>The trace ID of the original request.</p>
             * 
             * <strong>example:</strong>
             * <p>trace-20241025-109-04</p>
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
