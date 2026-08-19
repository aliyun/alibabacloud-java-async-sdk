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
 * {@link GetDeviceOnlineHeatmapResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeviceOnlineHeatmapResponseBody</p>
 */
public class GetDeviceOnlineHeatmapResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeviceOnlineHeatmap")
    private java.util.List<java.util.List<Long>> deviceOnlineHeatmap;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDeviceOnlineHeatmapResponseBody(Builder builder) {
        this.deviceOnlineHeatmap = builder.deviceOnlineHeatmap;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceOnlineHeatmapResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceOnlineHeatmap
     */
    public java.util.List<java.util.List<Long>> getDeviceOnlineHeatmap() {
        return this.deviceOnlineHeatmap;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<java.util.List<Long>> deviceOnlineHeatmap; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDeviceOnlineHeatmapResponseBody model) {
            this.deviceOnlineHeatmap = model.deviceOnlineHeatmap;
            this.requestId = model.requestId;
        } 

        /**
         * DeviceOnlineHeatmap.
         */
        public Builder deviceOnlineHeatmap(java.util.List<java.util.List<Long>> deviceOnlineHeatmap) {
            this.deviceOnlineHeatmap = deviceOnlineHeatmap;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>D6707286-A50E-57B1-B2CF-EFAC59E850D8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDeviceOnlineHeatmapResponseBody build() {
            return new GetDeviceOnlineHeatmapResponseBody(this);
        } 

    } 

}
