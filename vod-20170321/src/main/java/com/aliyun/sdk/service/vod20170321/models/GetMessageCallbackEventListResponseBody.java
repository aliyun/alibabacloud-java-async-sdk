// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetMessageCallbackEventListResponseBody} extends {@link TeaModel}
 *
 * <p>GetMessageCallbackEventListResponseBody</p>
 */
public class GetMessageCallbackEventListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EventList")
    private String eventList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetMessageCallbackEventListResponseBody(Builder builder) {
        this.eventList = builder.eventList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMessageCallbackEventListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventList
     */
    public String getEventList() {
        return this.eventList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String eventList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetMessageCallbackEventListResponseBody model) {
            this.eventList = model.eventList;
            this.requestId = model.requestId;
        } 

        /**
         * EventList.
         */
        public Builder eventList(String eventList) {
            this.eventList = eventList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMessageCallbackEventListResponseBody build() {
            return new GetMessageCallbackEventListResponseBody(this);
        } 

    } 

}
