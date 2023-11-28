// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ZoneInfo} extends {@link TeaModel}
 *
 * <p>ZoneInfo</p>
 */
public class ZoneInfo extends TeaModel {
    @NameInMap("status")
    private String status;

    @NameInMap("zoneId")
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

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * zoneId.
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
