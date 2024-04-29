// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTraceInfoDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeTraceInfoDetailRequest</p>
 */
public class DescribeTraceInfoDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    @com.aliyun.core.annotation.Validation(required = true)
    private String from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncidentTime")
    private Long incidentTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VertexId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vertexId;

    private DescribeTraceInfoDetailRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.incidentTime = builder.incidentTime;
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
        this.type = builder.type;
        this.uuid = builder.uuid;
        this.vertexId = builder.vertexId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTraceInfoDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return incidentTime
     */
    public Long getIncidentTime() {
        return this.incidentTime;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    /**
     * @return vertexId
     */
    public String getVertexId() {
        return this.vertexId;
    }

    public static final class Builder extends Request.Builder<DescribeTraceInfoDetailRequest, Builder> {
        private String from; 
        private Long incidentTime; 
        private String lang; 
        private String sourceIp; 
        private String type; 
        private String uuid; 
        private String vertexId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTraceInfoDetailRequest request) {
            super(request);
            this.from = request.from;
            this.incidentTime = request.incidentTime;
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
            this.type = request.type;
            this.uuid = request.uuid;
            this.vertexId = request.vertexId;
        } 

        /**
         * The ID of the request source. Set the value to **sas**.
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * The timestamp of the detection. Unit: milliseconds.
         */
        public Builder incidentTime(Long incidentTime) {
            this.putQueryParameter("IncidentTime", incidentTime);
            this.incidentTime = incidentTime;
            return this;
        }

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The source IP address of the request. The value of this parameter is specified by the system.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The type of the vertex. Set the value to **SAS_INCIDENT**.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * The UUID of the server.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        /**
         * The ID of the vertex. You can call the [DescribeSuspEvents](~~DescribeSuspEvents~~) operation to query the ID.
         */
        public Builder vertexId(String vertexId) {
            this.putQueryParameter("VertexId", vertexId);
            this.vertexId = vertexId;
            return this;
        }

        @Override
        public DescribeTraceInfoDetailRequest build() {
            return new DescribeTraceInfoDetailRequest(this);
        } 

    } 

}
