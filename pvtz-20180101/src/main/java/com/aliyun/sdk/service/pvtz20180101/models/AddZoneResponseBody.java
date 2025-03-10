// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddZoneResponseBody} extends {@link TeaModel}
 *
 * <p>AddZoneResponseBody</p>
 */
public class AddZoneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    @com.aliyun.core.annotation.NameInMap("ZoneName")
    private String zoneName;

    private AddZoneResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.zoneId = builder.zoneId;
        this.zoneName = builder.zoneName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddZoneResponseBody create() {
        return builder().build();
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
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return zoneName
     */
    public String getZoneName() {
        return this.zoneName;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean success; 
        private String zoneId; 
        private String zoneName; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>46973D4C-E3E4-4ABA-9190-9A9DE406C7E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The zone ID. This ID uniquely identifies the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>6fc186295683a131f63bb8b0cddc****</p>
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        /**
         * <p>The name of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder zoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }

        public AddZoneResponseBody build() {
            return new AddZoneResponseBody(this);
        } 

    } 

}
