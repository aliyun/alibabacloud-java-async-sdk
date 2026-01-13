// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DescribeZonesPrivateRAGServiceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeZonesPrivateRAGServiceResponseBody</p>
 */
public class DescribeZonesPrivateRAGServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ZoneIds")
    private java.util.List<String> zoneIds;

    private DescribeZonesPrivateRAGServiceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.zoneIds = builder.zoneIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeZonesPrivateRAGServiceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return zoneIds
     */
    public java.util.List<String> getZoneIds() {
        return this.zoneIds;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<String> zoneIds; 

        private Builder() {
        } 

        private Builder(DescribeZonesPrivateRAGServiceResponseBody model) {
            this.requestId = model.requestId;
            this.zoneIds = model.zoneIds;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of zones.</p>
         */
        public Builder zoneIds(java.util.List<String> zoneIds) {
            this.zoneIds = zoneIds;
            return this;
        }

        public DescribeZonesPrivateRAGServiceResponseBody build() {
            return new DescribeZonesPrivateRAGServiceResponseBody(this);
        } 

    } 

}
