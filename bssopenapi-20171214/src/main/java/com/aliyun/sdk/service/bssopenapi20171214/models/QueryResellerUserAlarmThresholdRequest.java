// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryResellerUserAlarmThresholdRequest} extends {@link RequestModel}
 *
 * <p>QueryResellerUserAlarmThresholdRequest</p>
 */
public class QueryResellerUserAlarmThresholdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlarmType")
    private String alarmType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    private QueryResellerUserAlarmThresholdRequest(Builder builder) {
        super(builder);
        this.alarmType = builder.alarmType;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryResellerUserAlarmThresholdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmType
     */
    public String getAlarmType() {
        return this.alarmType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<QueryResellerUserAlarmThresholdRequest, Builder> {
        private String alarmType; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(QueryResellerUserAlarmThresholdRequest request) {
            super(request);
            this.alarmType = request.alarmType;
            this.ownerId = request.ownerId;
        } 

        /**
         * AlarmType.
         */
        public Builder alarmType(String alarmType) {
            this.putQueryParameter("AlarmType", alarmType);
            this.alarmType = alarmType;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public QueryResellerUserAlarmThresholdRequest build() {
            return new QueryResellerUserAlarmThresholdRequest(this);
        } 

    } 

}
