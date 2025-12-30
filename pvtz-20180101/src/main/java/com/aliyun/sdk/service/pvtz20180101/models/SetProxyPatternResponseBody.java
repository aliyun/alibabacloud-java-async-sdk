// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

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
 * {@link SetProxyPatternResponseBody} extends {@link TeaModel}
 *
 * <p>SetProxyPatternResponseBody</p>
 */
public class SetProxyPatternResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private SetProxyPatternResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetProxyPatternResponseBody create() {
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
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private String requestId; 
        private String zoneId; 

        private Builder() {
        } 

        private Builder(SetProxyPatternResponseBody model) {
            this.requestId = model.requestId;
            this.zoneId = model.zoneId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C6F1D541-E7A6-447A-A2B5-9F7A20B2A8FB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The global ID of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>df2d03865266bd9842306db586d3****</p>
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public SetProxyPatternResponseBody build() {
            return new SetProxyPatternResponseBody(this);
        } 

    } 

}
