// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link GetUserDeviceWorkloadTrendRequest} extends {@link RequestModel}
 *
 * <p>GetUserDeviceWorkloadTrendRequest</p>
 */
public class GetUserDeviceWorkloadTrendRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceTag")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("To")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long to;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkloadType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workloadType;

    private GetUserDeviceWorkloadTrendRequest(Builder builder) {
        super(builder);
        this.deviceTag = builder.deviceTag;
        this.from = builder.from;
        this.to = builder.to;
        this.workloadType = builder.workloadType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserDeviceWorkloadTrendRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceTag
     */
    public String getDeviceTag() {
        return this.deviceTag;
    }

    /**
     * @return from
     */
    public Long getFrom() {
        return this.from;
    }

    /**
     * @return to
     */
    public Long getTo() {
        return this.to;
    }

    /**
     * @return workloadType
     */
    public String getWorkloadType() {
        return this.workloadType;
    }

    public static final class Builder extends Request.Builder<GetUserDeviceWorkloadTrendRequest, Builder> {
        private String deviceTag; 
        private Long from; 
        private Long to; 
        private String workloadType; 

        private Builder() {
            super();
        } 

        private Builder(GetUserDeviceWorkloadTrendRequest request) {
            super(request);
            this.deviceTag = request.deviceTag;
            this.from = request.from;
            this.to = request.to;
            this.workloadType = request.workloadType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
         */
        public Builder deviceTag(String deviceTag) {
            this.putQueryParameter("DeviceTag", deviceTag);
            this.deviceTag = deviceTag;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1769998785</p>
         */
        public Builder from(Long from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1771986521</p>
         */
        public Builder to(Long to) {
            this.putQueryParameter("To", to);
            this.to = to;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu</p>
         */
        public Builder workloadType(String workloadType) {
            this.putQueryParameter("WorkloadType", workloadType);
            this.workloadType = workloadType;
            return this;
        }

        @Override
        public GetUserDeviceWorkloadTrendRequest build() {
            return new GetUserDeviceWorkloadTrendRequest(this);
        } 

    } 

}
