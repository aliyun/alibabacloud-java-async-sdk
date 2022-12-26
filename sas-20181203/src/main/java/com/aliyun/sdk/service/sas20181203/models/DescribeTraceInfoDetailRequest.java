// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTraceInfoDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeTraceInfoDetailRequest</p>
 */
public class DescribeTraceInfoDetailRequest extends Request {
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
         * From.
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * IncidentTime.
         */
        public Builder incidentTime(Long incidentTime) {
            this.putQueryParameter("IncidentTime", incidentTime);
            this.incidentTime = incidentTime;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        /**
         * VertexId.
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
