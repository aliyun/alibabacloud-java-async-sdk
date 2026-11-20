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
 * {@link DescribeAiEngineEvidenceRequestResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAiEngineEvidenceRequestResponseBody</p>
 */
public class DescribeAiEngineEvidenceRequestResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AiInterpretation")
    private String aiInterpretation;

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

    @com.aliyun.core.annotation.NameInMap("Request")
    private String request;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RequestPath")
    private String requestPath;

    @com.aliyun.core.annotation.NameInMap("RequestTime")
    private Long requestTime;

    @com.aliyun.core.annotation.NameInMap("Resource")
    private String resource;

    @com.aliyun.core.annotation.NameInMap("Response")
    private String response;

    @com.aliyun.core.annotation.NameInMap("SuspectedBypass")
    private Integer suspectedBypass;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private DescribeAiEngineEvidenceRequestResponseBody(Builder builder) {
        this.aiInterpretation = builder.aiInterpretation;
        this.attackSources = builder.attackSources;
        this.evidenceId = builder.evidenceId;
        this.host = builder.host;
        this.httpStatus = builder.httpStatus;
        this.impactType = builder.impactType;
        this.method = builder.method;
        this.nodeId = builder.nodeId;
        this.request = builder.request;
        this.requestId = builder.requestId;
        this.requestPath = builder.requestPath;
        this.requestTime = builder.requestTime;
        this.resource = builder.resource;
        this.response = builder.response;
        this.suspectedBypass = builder.suspectedBypass;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAiEngineEvidenceRequestResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aiInterpretation
     */
    public String getAiInterpretation() {
        return this.aiInterpretation;
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
     * @return request
     */
    public String getRequest() {
        return this.request;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return response
     */
    public String getResponse() {
        return this.response;
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
        private String aiInterpretation; 
        private java.util.List<AttackSources> attackSources; 
        private String evidenceId; 
        private String host; 
        private Integer httpStatus; 
        private String impactType; 
        private String method; 
        private String nodeId; 
        private String request; 
        private String requestId; 
        private String requestPath; 
        private Long requestTime; 
        private String resource; 
        private String response; 
        private Integer suspectedBypass; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(DescribeAiEngineEvidenceRequestResponseBody model) {
            this.aiInterpretation = model.aiInterpretation;
            this.attackSources = model.attackSources;
            this.evidenceId = model.evidenceId;
            this.host = model.host;
            this.httpStatus = model.httpStatus;
            this.impactType = model.impactType;
            this.method = model.method;
            this.nodeId = model.nodeId;
            this.request = model.request;
            this.requestId = model.requestId;
            this.requestPath = model.requestPath;
            this.requestTime = model.requestTime;
            this.resource = model.resource;
            this.response = model.response;
            this.suspectedBypass = model.suspectedBypass;
            this.traceId = model.traceId;
        } 

        /**
         * <p>The AI interpretation result in the specified language, in Markdown format.</p>
         * 
         * <strong>example:</strong>
         * <p>This request has SQL injection risk.</p>
         */
        public Builder aiInterpretation(String aiInterpretation) {
            this.aiInterpretation = aiInterpretation;
            return this;
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
         * <p>The impact tag of the evidence. Valid values:</p>
         * <ul>
         * <li><p><strong>block</strong>: The request is blocked.</p>
         * </li>
         * <li><p><strong>challenge</strong>: The request triggers a challenge.</p>
         * </li>
         * <li><p><strong>monitor</strong>: The request is monitored.</p>
         * </li>
         * <li><p><strong>bypass</strong>: The request is suspected to be a bypass.</p>
         * </li>
         * <li><p><strong>attempt</strong>: The request is a reconnaissance probe.</p>
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
         * <p>The ID of the associated node, which corresponds to the NodeId in the node list.</p>
         * 
         * <strong>example:</strong>
         * <p>node-109-04</p>
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The request content.</p>
         * 
         * <strong>example:</strong>
         * <p>GET /api/orders/query?id=1%27 HTTP/1.1</p>
         */
        public Builder request(String request) {
            this.request = request;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>01A<em><strong>2-1219-019A-8B44-255</strong></em>**2C8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The masked request path.</p>
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
         * <p>The ID of the protected object to which the request belongs.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com-waf">www.example.com-waf</a></p>
         */
        public Builder resource(String resource) {
            this.resource = resource;
            return this;
        }

        /**
         * <p>The response content.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP/1.1 500 Internal Server Error</p>
         */
        public Builder response(String response) {
            this.response = response;
            return this;
        }

        /**
         * <p>Specifies whether the request is suspected to be a bypass. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The request is suspected to be a bypass.</li>
         * <li><strong>0</strong>: The request is not a bypass.</li>
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
         * <p>The trace ID of the original request, which can be up to 128 ASCII characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>trace-20241025-109-04</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeAiEngineEvidenceRequestResponseBody build() {
            return new DescribeAiEngineEvidenceRequestResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAiEngineEvidenceRequestResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAiEngineEvidenceRequestResponseBody</p>
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
             * <p>The value of the source, such as an IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.1.1</p>
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
     * {@link DescribeAiEngineEvidenceRequestResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAiEngineEvidenceRequestResponseBody</p>
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
             * <p>The type of the attack source.</p>
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
}
