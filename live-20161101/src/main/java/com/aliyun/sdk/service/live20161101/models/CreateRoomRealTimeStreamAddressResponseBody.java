// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link CreateRoomRealTimeStreamAddressResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRoomRealTimeStreamAddressResponseBody</p>
 */
public class CreateRoomRealTimeStreamAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RtmpAddress")
    private String rtmpAddress;

    private CreateRoomRealTimeStreamAddressResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.rtmpAddress = builder.rtmpAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRoomRealTimeStreamAddressResponseBody create() {
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
     * @return rtmpAddress
     */
    public String getRtmpAddress() {
        return this.rtmpAddress;
    }

    public static final class Builder {
        private String requestId; 
        private String rtmpAddress; 

        private Builder() {
        } 

        private Builder(CreateRoomRealTimeStreamAddressResponseBody model) {
            this.requestId = model.requestId;
            this.rtmpAddress = model.rtmpAddress;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F8DB7E25-6A35-161A-AA41-B7A658AF****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The RTMP ingest URL.</p>
         */
        public Builder rtmpAddress(String rtmpAddress) {
            this.rtmpAddress = rtmpAddress;
            return this;
        }

        public CreateRoomRealTimeStreamAddressResponseBody build() {
            return new CreateRoomRealTimeStreamAddressResponseBody(this);
        } 

    } 

}
