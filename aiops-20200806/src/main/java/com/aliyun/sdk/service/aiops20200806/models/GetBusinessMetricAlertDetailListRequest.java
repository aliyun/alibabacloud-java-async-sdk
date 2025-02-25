// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBusinessMetricAlertDetailListRequest} extends {@link RequestModel}
 *
 * <p>GetBusinessMetricAlertDetailListRequest</p>
 */
public class GetBusinessMetricAlertDetailListRequest extends Request {
    @Query
    @NameInMap("EventId")
    private String eventId;

    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("MetricName")
    private String metricName;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private GetBusinessMetricAlertDetailListRequest(Builder builder) {
        super(builder);
        this.eventId = builder.eventId;
        this.id = builder.id;
        this.metricName = builder.metricName;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBusinessMetricAlertDetailListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<GetBusinessMetricAlertDetailListRequest, Builder> {
        private String eventId; 
        private Long id; 
        private String metricName; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(GetBusinessMetricAlertDetailListRequest request) {
            super(request);
            this.eventId = request.eventId;
            this.id = request.id;
            this.metricName = request.metricName;
            this.operaUid = request.operaUid;
        } 

        /**
         * EventId.
         */
        public Builder eventId(String eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * MetricName.
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        @Override
        public GetBusinessMetricAlertDetailListRequest build() {
            return new GetBusinessMetricAlertDetailListRequest(this);
        } 

    } 

}
