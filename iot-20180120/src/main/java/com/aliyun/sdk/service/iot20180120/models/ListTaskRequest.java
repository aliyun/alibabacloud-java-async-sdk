// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTaskRequest} extends {@link RequestModel}
 *
 * <p>ListTaskRequest</p>
 */
public class ListTaskRequest extends Request {
    @Query
    @NameInMap("Device")
    private java.util.Map < String, ? > device;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("JobId")
    private String jobId;

    @Query
    @NameInMap("Limit")
    @Validation(required = true, maximum = 50, minimum = 1)
    private Integer limit;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("Status")
    private String status;

    private ListTaskRequest(Builder builder) {
        super(builder);
        this.device = builder.device;
        this.iotInstanceId = builder.iotInstanceId;
        this.jobId = builder.jobId;
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return device
     */
    public java.util.Map < String, ? > getDevice() {
        return this.device;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListTaskRequest, Builder> {
        private java.util.Map < String, ? > device; 
        private String iotInstanceId; 
        private String jobId; 
        private Integer limit; 
        private String nextToken; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListTaskRequest request) {
            super(request);
            this.device = request.device;
            this.iotInstanceId = request.iotInstanceId;
            this.jobId = request.jobId;
            this.limit = request.limit;
            this.nextToken = request.nextToken;
            this.status = request.status;
        } 

        /**
         * Device.
         */
        public Builder device(java.util.Map < String, ? > device) {
            String deviceShrink = shrink(device, "Device", "json");
            this.putQueryParameter("Device", deviceShrink);
            this.device = device;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListTaskRequest build() {
            return new ListTaskRequest(this);
        } 

    } 

}
