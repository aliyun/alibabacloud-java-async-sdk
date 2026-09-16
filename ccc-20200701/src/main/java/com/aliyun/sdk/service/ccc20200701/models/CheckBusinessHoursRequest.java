// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link CheckBusinessHoursRequest} extends {@link RequestModel}
 *
 * <p>CheckBusinessHoursRequest</p>
 */
public class CheckBusinessHoursRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Time")
    private Long time;

    private CheckBusinessHoursRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckBusinessHoursRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return time
     */
    public Long getTime() {
        return this.time;
    }

    public static final class Builder extends Request.Builder<CheckBusinessHoursRequest, Builder> {
        private String instanceId; 
        private Long time; 

        private Builder() {
            super();
        } 

        private Builder(CheckBusinessHoursRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.time = request.time;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Time.
         */
        public Builder time(Long time) {
            this.putQueryParameter("Time", time);
            this.time = time;
            return this;
        }

        @Override
        public CheckBusinessHoursRequest build() {
            return new CheckBusinessHoursRequest(this);
        } 

    } 

}
