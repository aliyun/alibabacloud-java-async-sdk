// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link HandleUnknownThreatDetectEventRequest} extends {@link RequestModel}
 *
 * <p>HandleUnknownThreatDetectEventRequest</p>
 */
public class HandleUnknownThreatDetectEventRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventIdList")
    private java.util.List<String> eventIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    private HandleUnknownThreatDetectEventRequest(Builder builder) {
        super(builder);
        this.eventIdList = builder.eventIdList;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HandleUnknownThreatDetectEventRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventIdList
     */
    public java.util.List<String> getEventIdList() {
        return this.eventIdList;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<HandleUnknownThreatDetectEventRequest, Builder> {
        private java.util.List<String> eventIdList; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(HandleUnknownThreatDetectEventRequest request) {
            super(request);
            this.eventIdList = request.eventIdList;
            this.status = request.status;
        } 

        /**
         * EventIdList.
         */
        public Builder eventIdList(java.util.List<String> eventIdList) {
            this.putQueryParameter("EventIdList", eventIdList);
            this.eventIdList = eventIdList;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public HandleUnknownThreatDetectEventRequest build() {
            return new HandleUnknownThreatDetectEventRequest(this);
        } 

    } 

}
