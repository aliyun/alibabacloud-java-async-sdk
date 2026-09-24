// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link ZoneInfo} extends {@link TeaModel}
 *
 * <p>ZoneInfo</p>
 */
public class ZoneInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("zoneId")
    private String zoneId;

    private ZoneInfo(Builder builder) {
        this.status = builder.status;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ZoneInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private String status; 
        private String zoneId; 

        private Builder() {
        } 

        private Builder(ZoneInfo model) {
            this.status = model.status;
            this.zoneId = model.zoneId;
        } 

        /**
         * <p>The zone status. Valid values:</p>
         * <ul>
         * <li>ISOLATION: offline</li>
         * <li>NORMAL: Normal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The zone ID, which uniquely identifies the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public ZoneInfo build() {
            return new ZoneInfo(this);
        } 

    } 

}
