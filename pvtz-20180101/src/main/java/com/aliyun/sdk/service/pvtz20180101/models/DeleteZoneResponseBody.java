// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteZoneResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteZoneResponseBody</p>
 */
public class DeleteZoneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DeleteZoneResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteZoneResponseBody create() {
        return builder().build();
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

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E246E023-F2EB-4034-83F7-B13FCF31459C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The zone ID. This ID uniquely identifies the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>0e41496f12da01311d314f17b801****</p>
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public DeleteZoneResponseBody build() {
            return new DeleteZoneResponseBody(this);
        } 

    } 

}
