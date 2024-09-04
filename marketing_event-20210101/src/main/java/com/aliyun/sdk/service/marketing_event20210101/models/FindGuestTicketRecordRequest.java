// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketing_event20210101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindGuestTicketRecordRequest} extends {@link RequestModel}
 *
 * <p>FindGuestTicketRecordRequest</p>
 */
public class FindGuestTicketRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActivityId")
    private String activityId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DateTimeString")
    private String dateTimeString;

    private FindGuestTicketRecordRequest(Builder builder) {
        super(builder);
        this.activityId = builder.activityId;
        this.dateTimeString = builder.dateTimeString;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindGuestTicketRecordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activityId
     */
    public String getActivityId() {
        return this.activityId;
    }

    /**
     * @return dateTimeString
     */
    public String getDateTimeString() {
        return this.dateTimeString;
    }

    public static final class Builder extends Request.Builder<FindGuestTicketRecordRequest, Builder> {
        private String activityId; 
        private String dateTimeString; 

        private Builder() {
            super();
        } 

        private Builder(FindGuestTicketRecordRequest request) {
            super(request);
            this.activityId = request.activityId;
            this.dateTimeString = request.dateTimeString;
        } 

        /**
         * ActivityId.
         */
        public Builder activityId(String activityId) {
            this.putQueryParameter("ActivityId", activityId);
            this.activityId = activityId;
            return this;
        }

        /**
         * DateTimeString.
         */
        public Builder dateTimeString(String dateTimeString) {
            this.putQueryParameter("DateTimeString", dateTimeString);
            this.dateTimeString = dateTimeString;
            return this;
        }

        @Override
        public FindGuestTicketRecordRequest build() {
            return new FindGuestTicketRecordRequest(this);
        } 

    } 

}
