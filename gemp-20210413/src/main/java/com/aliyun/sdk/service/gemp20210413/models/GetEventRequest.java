// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEventRequest} extends {@link RequestModel}
 *
 * <p>GetEventRequest</p>
 */
public class GetEventRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("monitorSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long monitorSourceId;

    private GetEventRequest(Builder builder) {
        super(builder);
        this.monitorSourceId = builder.monitorSourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEventRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return monitorSourceId
     */
    public Long getMonitorSourceId() {
        return this.monitorSourceId;
    }

    public static final class Builder extends Request.Builder<GetEventRequest, Builder> {
        private Long monitorSourceId; 

        private Builder() {
            super();
        } 

        private Builder(GetEventRequest request) {
            super(request);
            this.monitorSourceId = request.monitorSourceId;
        } 

        /**
         * monitorSourceId.
         */
        public Builder monitorSourceId(Long monitorSourceId) {
            this.putBodyParameter("monitorSourceId", monitorSourceId);
            this.monitorSourceId = monitorSourceId;
            return this;
        }

        @Override
        public GetEventRequest build() {
            return new GetEventRequest(this);
        } 

    } 

}
