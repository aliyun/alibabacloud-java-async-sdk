// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEventRequest} extends {@link RequestModel}
 *
 * <p>GetEventRequest</p>
 */
public class GetEventRequest extends Request {
    @Body
    @NameInMap("monitorSourceId")
    @Validation(required = true)
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

        private Builder(GetEventRequest response) {
            super(response);
            this.monitorSourceId = response.monitorSourceId;
        } 

        /**
         * 监控源ID不能为空
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
