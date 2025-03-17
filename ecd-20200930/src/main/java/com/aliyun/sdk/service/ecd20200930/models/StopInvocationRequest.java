// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link StopInvocationRequest} extends {@link RequestModel}
 *
 * <p>StopInvocationRequest</p>
 */
public class StopInvocationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    private java.util.List<String> desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InvokeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String invokeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private StopInvocationRequest(Builder builder) {
        super(builder);
        this.desktopId = builder.desktopId;
        this.invokeId = builder.invokeId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopInvocationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopId
     */
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return invokeId
     */
    public String getInvokeId() {
        return this.invokeId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<StopInvocationRequest, Builder> {
        private java.util.List<String> desktopId; 
        private String invokeId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(StopInvocationRequest request) {
            super(request);
            this.desktopId = request.desktopId;
            this.invokeId = request.invokeId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of cloud desktop N. Valid values of N: 1 to 50.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-7w78ozhjcwa3u****</p>
         */
        public Builder desktopId(java.util.List<String> desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * <p>The ID of the execution.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>t-7d2a745b412b4601b2d47f6a768d****</p>
         */
        public Builder invokeId(String invokeId) {
            this.putQueryParameter("InvokeId", invokeId);
            this.invokeId = invokeId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public StopInvocationRequest build() {
            return new StopInvocationRequest(this);
        } 

    } 

}
