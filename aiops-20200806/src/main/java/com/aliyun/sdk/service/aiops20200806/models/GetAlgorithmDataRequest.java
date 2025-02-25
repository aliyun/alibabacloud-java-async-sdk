// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAlgorithmDataRequest} extends {@link RequestModel}
 *
 * <p>GetAlgorithmDataRequest</p>
 */
public class GetAlgorithmDataRequest extends Request {
    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    private GetAlgorithmDataRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.id = builder.id;
        this.operaUid = builder.operaUid;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlgorithmDataRequest create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetAlgorithmDataRequest, Builder> {
        private Long endTime; 
        private Long id; 
        private String operaUid; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetAlgorithmDataRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.id = request.id;
            this.operaUid = request.operaUid;
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
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
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
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetAlgorithmDataRequest build() {
            return new GetAlgorithmDataRequest(this);
        } 

    } 

}
