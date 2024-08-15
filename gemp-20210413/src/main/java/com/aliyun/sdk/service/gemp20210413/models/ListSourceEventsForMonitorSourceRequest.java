// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSourceEventsForMonitorSourceRequest} extends {@link RequestModel}
 *
 * <p>ListSourceEventsForMonitorSourceRequest</p>
 */
public class ListSourceEventsForMonitorSourceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("monitorSourceId")
    private Long monitorSourceId;

    private ListSourceEventsForMonitorSourceRequest(Builder builder) {
        super(builder);
        this.monitorSourceId = builder.monitorSourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSourceEventsForMonitorSourceRequest create() {
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

    public static final class Builder extends Request.Builder<ListSourceEventsForMonitorSourceRequest, Builder> {
        private Long monitorSourceId; 

        private Builder() {
            super();
        } 

        private Builder(ListSourceEventsForMonitorSourceRequest request) {
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
        public ListSourceEventsForMonitorSourceRequest build() {
            return new ListSourceEventsForMonitorSourceRequest(this);
        } 

    } 

}
