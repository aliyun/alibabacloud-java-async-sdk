// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20190601.models;

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
 * {@link DescribeSupportedZonesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSupportedZonesResponseBody</p>
 */
public class DescribeSupportedZonesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("ZoneIds")
    private java.util.List<String> zoneIds;

    private DescribeSupportedZonesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.zoneIds = builder.zoneIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSupportedZonesResponseBody create() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return zoneIds
     */
    public java.util.List<String> getZoneIds() {
        return this.zoneIds;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean success; 
        private java.util.List<String> zoneIds; 

        private Builder() {
        } 

        private Builder(DescribeSupportedZonesResponseBody model) {
            this.requestId = model.requestId;
            this.success = model.success;
            this.zoneIds = model.zoneIds;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * ZoneIds.
         */
        public Builder zoneIds(java.util.List<String> zoneIds) {
            this.zoneIds = zoneIds;
            return this;
        }

        public DescribeSupportedZonesResponseBody build() {
            return new DescribeSupportedZonesResponseBody(this);
        } 

    } 

}
