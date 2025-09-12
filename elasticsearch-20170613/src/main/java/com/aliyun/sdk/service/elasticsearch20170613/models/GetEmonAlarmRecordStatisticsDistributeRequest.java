// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link GetEmonAlarmRecordStatisticsDistributeRequest} extends {@link RequestModel}
 *
 * <p>GetEmonAlarmRecordStatisticsDistributeRequest</p>
 */
public class GetEmonAlarmRecordStatisticsDistributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("timeEnd")
    private Long timeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("timeStart")
    private Long timeStart;

    private GetEmonAlarmRecordStatisticsDistributeRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
        this.groupId = builder.groupId;
        this.timeEnd = builder.timeEnd;
        this.timeStart = builder.timeStart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEmonAlarmRecordStatisticsDistributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return timeEnd
     */
    public Long getTimeEnd() {
        return this.timeEnd;
    }

    /**
     * @return timeStart
     */
    public Long getTimeStart() {
        return this.timeStart;
    }

    public static final class Builder extends Request.Builder<GetEmonAlarmRecordStatisticsDistributeRequest, Builder> {
        private String body; 
        private String groupId; 
        private Long timeEnd; 
        private Long timeStart; 

        private Builder() {
            super();
        } 

        private Builder(GetEmonAlarmRecordStatisticsDistributeRequest request) {
            super(request);
            this.body = request.body;
            this.groupId = request.groupId;
            this.timeEnd = request.timeEnd;
            this.timeStart = request.timeStart;
        } 

        /**
         * body.
         */
        public Builder body(String body) {
            this.putQueryParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * groupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("groupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * timeEnd.
         */
        public Builder timeEnd(Long timeEnd) {
            this.putQueryParameter("timeEnd", timeEnd);
            this.timeEnd = timeEnd;
            return this;
        }

        /**
         * timeStart.
         */
        public Builder timeStart(Long timeStart) {
            this.putQueryParameter("timeStart", timeStart);
            this.timeStart = timeStart;
            return this;
        }

        @Override
        public GetEmonAlarmRecordStatisticsDistributeRequest build() {
            return new GetEmonAlarmRecordStatisticsDistributeRequest(this);
        } 

    } 

}
