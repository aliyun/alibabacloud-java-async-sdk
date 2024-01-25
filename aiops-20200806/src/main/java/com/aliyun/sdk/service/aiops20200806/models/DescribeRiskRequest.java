// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRiskRequest} extends {@link RequestModel}
 *
 * <p>DescribeRiskRequest</p>
 */
public class DescribeRiskRequest extends Request {
    @Query
    @NameInMap("EndTime")
    @Validation()
    private Long endTime;

    @Query
    @NameInMap("StartTime")
    @Validation()
    private Long startTime;

    @Query
    @NameInMap("Types")
    private String types;

    @Query
    @NameInMap("Uid")
    @Validation()
    private Long uid;

    private DescribeRiskRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
        this.types = builder.types;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRiskRequest create() {
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
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return types
     */
    public String getTypes() {
        return this.types;
    }

    /**
     * @return uid
     */
    public Long getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<DescribeRiskRequest, Builder> {
        private Long endTime; 
        private Long startTime; 
        private String types; 
        private Long uid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRiskRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.startTime = request.startTime;
            this.types = request.types;
            this.uid = request.uid;
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
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Types.
         */
        public Builder types(String types) {
            this.putQueryParameter("Types", types);
            this.types = types;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(Long uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public DescribeRiskRequest build() {
            return new DescribeRiskRequest(this);
        } 

    } 

}
