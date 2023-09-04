// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListByMonitorSourceIdRequest} extends {@link RequestModel}
 *
 * <p>ListByMonitorSourceIdRequest</p>
 */
public class ListByMonitorSourceIdRequest extends Request {
    @Body
    @NameInMap("monitorSourceId")
    private String monitorSourceId;

    private ListByMonitorSourceIdRequest(Builder builder) {
        super(builder);
        this.monitorSourceId = builder.monitorSourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListByMonitorSourceIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return monitorSourceId
     */
    public String getMonitorSourceId() {
        return this.monitorSourceId;
    }

    public static final class Builder extends Request.Builder<ListByMonitorSourceIdRequest, Builder> {
        private String monitorSourceId; 

        private Builder() {
            super();
        } 

        private Builder(ListByMonitorSourceIdRequest request) {
            super(request);
            this.monitorSourceId = request.monitorSourceId;
        } 

        /**
         * monitorSourceId.
         */
        public Builder monitorSourceId(String monitorSourceId) {
            this.putBodyParameter("monitorSourceId", monitorSourceId);
            this.monitorSourceId = monitorSourceId;
            return this;
        }

        @Override
        public ListByMonitorSourceIdRequest build() {
            return new ListByMonitorSourceIdRequest(this);
        } 

    } 

}
