// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The ID of the request source. Set the value to <strong>sas</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>The timestamp of the detection. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1670555392000</p>
         */
        public Builder incidentTime(Long incidentTime) {
            this.putQueryParameter("IncidentTime", incidentTime);
            this.incidentTime = incidentTime;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The source IP address of the request. The value of this parameter is specified by the system.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The type of the vertex. Set the value to <strong>SAS_INCIDENT</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SAS_INCIDENT</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The UUID of the server.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1627f2d7-aaa2-4ed1-b07a-xxxxxxxxxxxxxx</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        /**
         * <p>The ID of the vertex. You can call the <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> operation to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cce1d28dxxxxxxxxxxxxxxxx</p>
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
