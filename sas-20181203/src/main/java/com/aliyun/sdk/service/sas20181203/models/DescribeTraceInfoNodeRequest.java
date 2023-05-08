// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTraceInfoNodeRequest} extends {@link RequestModel}
 *
 * <p>DescribeTraceInfoNodeRequest</p>
 */
public class DescribeTraceInfoNodeRequest extends Request {
    @Query
    @NameInMap("EventName")
    private String eventName;

    @Query
    @NameInMap("From")
    @Validation(required = true)
    private String from;

    @Query
    @NameInMap("IncidentTime")
    private Long incidentTime;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    @Query
    @NameInMap("Uuid")
    @Validation(required = true)
    private String uuid;

    @Query
    @NameInMap("VertexId")
    @Validation(required = true)
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
         * The name of the alert event.
         * <p>
         * 
         * > You can call the [DescribeSuspEvents](~~DescribeSuspEvents~~) operation to query the names of alerts events.
         */
        public Builder eventName(String eventName) {
            this.putQueryParameter("EventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * The ID of the request source. Set the value to sas.
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * The time when the alert event was first detected.
         */
        public Builder incidentTime(Long incidentTime) {
            this.putQueryParameter("IncidentTime", incidentTime);
            this.incidentTime = incidentTime;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
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
         * The type of the vertex. You can call the [DescribeTraceInfoDetail](~~DescribeTraceInfoDetail~~) operation to query the types of vertexes.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * The UUID of the server. You can call the [DescribeSuspEvents](~~DescribeSuspEvents~~) operation to query the UUIDs of servers.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        /**
         * The ID of the vertex.
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
