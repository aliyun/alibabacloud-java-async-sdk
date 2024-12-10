// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListTrainingJobInstanceEventsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTrainingJobInstanceEventsResponseBody</p>
 */
public class ListTrainingJobInstanceEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Events")
    private java.util.List < String > events;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListTrainingJobInstanceEventsResponseBody(Builder builder) {
        this.events = builder.events;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrainingJobInstanceEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return events
     */
    public java.util.List < String > getEvents() {
        return this.events;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < String > events; 
        private String requestId; 
        private String totalCount; 

        /**
         * Events.
         */
        public Builder events(java.util.List < String > events) {
            this.events = events;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTrainingJobInstanceEventsResponseBody build() {
            return new ListTrainingJobInstanceEventsResponseBody(this);
        } 

    } 

}
