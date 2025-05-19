// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link PutEventRequest} extends {@link RequestModel}
 *
 * <p>PutEventRequest</p>
 */
public class PutEventRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventInfo")
    private String eventInfo;

    private PutEventRequest(Builder builder) {
        super(builder);
        this.eventInfo = builder.eventInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutEventRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventInfo
     */
    public String getEventInfo() {
        return this.eventInfo;
    }

    public static final class Builder extends Request.Builder<PutEventRequest, Builder> {
        private String eventInfo; 

        private Builder() {
            super();
        } 

        private Builder(PutEventRequest request) {
            super(request);
            this.eventInfo = request.eventInfo;
        } 

        /**
         * EventInfo.
         */
        public Builder eventInfo(String eventInfo) {
            this.putQueryParameter("EventInfo", eventInfo);
            this.eventInfo = eventInfo;
            return this;
        }

        @Override
        public PutEventRequest build() {
            return new PutEventRequest(this);
        } 

    } 

}
