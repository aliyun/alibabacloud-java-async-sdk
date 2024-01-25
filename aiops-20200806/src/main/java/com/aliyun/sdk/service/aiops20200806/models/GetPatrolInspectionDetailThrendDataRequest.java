// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPatrolInspectionDetailThrendDataRequest} extends {@link RequestModel}
 *
 * <p>GetPatrolInspectionDetailThrendDataRequest</p>
 */
public class GetPatrolInspectionDetailThrendDataRequest extends Request {
    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("RequestContent")
    private String requestContent;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    private GetPatrolInspectionDetailThrendDataRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.operaUid = builder.operaUid;
        this.requestContent = builder.requestContent;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPatrolInspectionDetailThrendDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return requestContent
     */
    public String getRequestContent() {
        return this.requestContent;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetPatrolInspectionDetailThrendDataRequest, Builder> {
        private Long endTime; 
        private String operaUid; 
        private String requestContent; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetPatrolInspectionDetailThrendDataRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.operaUid = request.operaUid;
            this.requestContent = request.requestContent;
            this.startTime = request.startTime;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * RequestContent.
         */
        public Builder requestContent(String requestContent) {
            this.putQueryParameter("RequestContent", requestContent);
            this.requestContent = requestContent;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetPatrolInspectionDetailThrendDataRequest build() {
            return new GetPatrolInspectionDetailThrendDataRequest(this);
        } 

    } 

}
