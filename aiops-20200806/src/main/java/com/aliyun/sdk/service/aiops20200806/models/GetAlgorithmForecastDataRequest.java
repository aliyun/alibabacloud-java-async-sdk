// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAlgorithmForecastDataRequest} extends {@link RequestModel}
 *
 * <p>GetAlgorithmForecastDataRequest</p>
 */
public class GetAlgorithmForecastDataRequest extends Request {
    @Query
    @NameInMap("AliUid")
    private String aliUid;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("Id")
    private Integer id;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    private GetAlgorithmForecastDataRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.endTime = builder.endTime;
        this.id = builder.id;
        this.operaUid = builder.operaUid;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlgorithmForecastDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public String getAliUid() {
        return this.aliUid;
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
    public Integer getId() {
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

    public static final class Builder extends Request.Builder<GetAlgorithmForecastDataRequest, Builder> {
        private String aliUid; 
        private Long endTime; 
        private Integer id; 
        private String operaUid; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetAlgorithmForecastDataRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.endTime = request.endTime;
            this.id = request.id;
            this.operaUid = request.operaUid;
            this.startTime = request.startTime;
        } 

        /**
         * AliUid.
         */
        public Builder aliUid(String aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
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
        public Builder id(Integer id) {
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
        public GetAlgorithmForecastDataRequest build() {
            return new GetAlgorithmForecastDataRequest(this);
        } 

    } 

}
