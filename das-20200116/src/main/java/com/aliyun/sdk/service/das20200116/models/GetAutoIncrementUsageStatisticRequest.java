// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAutoIncrementUsageStatisticRequest} extends {@link RequestModel}
 *
 * <p>GetAutoIncrementUsageStatisticRequest</p>
 */
public class GetAutoIncrementUsageStatisticRequest extends Request {
    @Query
    @NameInMap("DbNames")
    private String dbNames;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RatioFilter")
    @Validation(required = true)
    private Double ratioFilter;

    @Query
    @NameInMap("RealTime")
    @Validation(required = true)
    private Boolean realTime;

    private GetAutoIncrementUsageStatisticRequest(Builder builder) {
        super(builder);
        this.dbNames = builder.dbNames;
        this.instanceId = builder.instanceId;
        this.ratioFilter = builder.ratioFilter;
        this.realTime = builder.realTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAutoIncrementUsageStatisticRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbNames
     */
    public String getDbNames() {
        return this.dbNames;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ratioFilter
     */
    public Double getRatioFilter() {
        return this.ratioFilter;
    }

    /**
     * @return realTime
     */
    public Boolean getRealTime() {
        return this.realTime;
    }

    public static final class Builder extends Request.Builder<GetAutoIncrementUsageStatisticRequest, Builder> {
        private String dbNames; 
        private String instanceId; 
        private Double ratioFilter; 
        private Boolean realTime; 

        private Builder() {
            super();
        } 

        private Builder(GetAutoIncrementUsageStatisticRequest request) {
            super(request);
            this.dbNames = request.dbNames;
            this.instanceId = request.instanceId;
            this.ratioFilter = request.ratioFilter;
            this.realTime = request.realTime;
        } 

        /**
         * DbNames.
         */
        public Builder dbNames(String dbNames) {
            this.putQueryParameter("DbNames", dbNames);
            this.dbNames = dbNames;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RatioFilter.
         */
        public Builder ratioFilter(Double ratioFilter) {
            this.putQueryParameter("RatioFilter", ratioFilter);
            this.ratioFilter = ratioFilter;
            return this;
        }

        /**
         * RealTime.
         */
        public Builder realTime(Boolean realTime) {
            this.putQueryParameter("RealTime", realTime);
            this.realTime = realTime;
            return this;
        }

        @Override
        public GetAutoIncrementUsageStatisticRequest build() {
            return new GetAutoIncrementUsageStatisticRequest(this);
        } 

    } 

}
