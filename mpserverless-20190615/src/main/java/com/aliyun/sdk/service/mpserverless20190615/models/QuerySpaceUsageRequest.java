// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySpaceUsageRequest} extends {@link RequestModel}
 *
 * <p>QuerySpaceUsageRequest</p>
 */
public class QuerySpaceUsageRequest extends Request {
    @Body
    @NameInMap("EndTime")
    private String endTime;

    @Body
    @NameInMap("SpaceId")
    private String spaceId;

    @Body
    @NameInMap("StartTime")
    private String startTime;

    private QuerySpaceUsageRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.spaceId = builder.spaceId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySpaceUsageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<QuerySpaceUsageRequest, Builder> {
        private String endTime; 
        private String spaceId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(QuerySpaceUsageRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.spaceId = request.spaceId;
            this.startTime = request.startTime;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public QuerySpaceUsageRequest build() {
            return new QuerySpaceUsageRequest(this);
        } 

    } 

}
