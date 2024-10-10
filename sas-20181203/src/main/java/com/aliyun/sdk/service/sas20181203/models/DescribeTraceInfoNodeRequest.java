// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeTraceInfoNodeRequest} extends {@link RequestModel}
 *
 * <p>DescribeTraceInfoNodeRequest</p>
 */
public class DescribeTraceInfoNodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventName")
    private String eventName;

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

    private DescribeTraceInfoNodeRequest(Builder builder) {
        super(builder);
        this.eventName = builder.eventName;
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

    public static DescribeTraceInfoNodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
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

    public static final class Builder extends Request.Builder<DescribeTraceInfoNodeRequest, Builder> {
        private String eventName; 
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

        private Builder(DescribeTraceInfoNodeRequest request) {
            super(request);
            this.eventName = request.eventName;
            this.from = request.from;
            this.incidentTime = request.incidentTime;
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
            this.type = request.type;
            this.uuid = request.uuid;
            this.vertexId = request.vertexId;
        } 

        /**
         * <p>The name of the alert event.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> operation to query the names of alerts events.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>WEBSHELL</p>
         */
        public Builder eventName(String eventName) {
            this.putQueryParameter("EventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * <p>The ID of the request source. Set the value to sas.</p>
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
         * <p>The time when the alert event was first detected.</p>
         * 
         * <strong>example:</strong>
         * <p>1635978934000</p>
         */
        public Builder incidentTime(Long incidentTime) {
            this.putQueryParameter("IncidentTime", incidentTime);
            this.incidentTime = incidentTime;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
         * <p>127.0.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The type of the vertex. You can call the <a href="~~DescribeTraceInfoDetail~~">DescribeTraceInfoDetail</a> operation to query the types of vertexes.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SAS_ASSET</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The UUID of the server. You can call the <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> operation to query the UUIDs of servers.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6f346617-eef9-45e6-b6d1-946xxxxxxxx</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        /**
         * <p>The ID of the vertex.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>03da4e2350a3eb50cd25a18cexxxxxxx</p>
         */
        public Builder vertexId(String vertexId) {
            this.putQueryParameter("VertexId", vertexId);
            this.vertexId = vertexId;
            return this;
        }

        @Override
        public DescribeTraceInfoNodeRequest build() {
            return new DescribeTraceInfoNodeRequest(this);
        } 

    } 

}
