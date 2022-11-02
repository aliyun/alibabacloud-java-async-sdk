// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResponseCodeTrendGraphRequest} extends {@link RequestModel}
 *
 * <p>DescribeResponseCodeTrendGraphRequest</p>
 */
public class DescribeResponseCodeTrendGraphRequest extends Request {
    @Query
    @NameInMap("EndTimestamp")
    private String endTimestamp;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Interval")
    @Validation(required = true)
    private String interval;

    @Query
    @NameInMap("Resource")
    private String resource;

    @Query
    @NameInMap("StartTimestamp")
    @Validation(required = true)
    private String startTimestamp;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private DescribeResponseCodeTrendGraphRequest(Builder builder) {
        super(builder);
        this.endTimestamp = builder.endTimestamp;
        this.instanceId = builder.instanceId;
        this.interval = builder.interval;
        this.resource = builder.resource;
        this.startTimestamp = builder.startTimestamp;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResponseCodeTrendGraphRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTimestamp
     */
    public String getEndTimestamp() {
        return this.endTimestamp;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return interval
     */
    public String getInterval() {
        return this.interval;
    }

    /**
     * @return resource
     */
    public String getResource() {
        return this.resource;
    }

    /**
     * @return startTimestamp
     */
    public String getStartTimestamp() {
        return this.startTimestamp;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeResponseCodeTrendGraphRequest, Builder> {
        private String endTimestamp; 
        private String instanceId; 
        private String interval; 
        private String resource; 
        private String startTimestamp; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeResponseCodeTrendGraphRequest request) {
            super(request);
            this.endTimestamp = request.endTimestamp;
            this.instanceId = request.instanceId;
            this.interval = request.interval;
            this.resource = request.resource;
            this.startTimestamp = request.startTimestamp;
            this.type = request.type;
        } 

        /**
         * EndTimestamp.
         */
        public Builder endTimestamp(String endTimestamp) {
            this.putQueryParameter("EndTimestamp", endTimestamp);
            this.endTimestamp = endTimestamp;
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
         * Interval.
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * Resource.
         */
        public Builder resource(String resource) {
            this.putQueryParameter("Resource", resource);
            this.resource = resource;
            return this;
        }

        /**
         * StartTimestamp.
         */
        public Builder startTimestamp(String startTimestamp) {
            this.putQueryParameter("StartTimestamp", startTimestamp);
            this.startTimestamp = startTimestamp;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeResponseCodeTrendGraphRequest build() {
            return new DescribeResponseCodeTrendGraphRequest(this);
        } 

    } 

}
