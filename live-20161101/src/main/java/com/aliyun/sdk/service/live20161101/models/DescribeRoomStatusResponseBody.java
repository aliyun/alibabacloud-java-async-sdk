// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRoomStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRoomStatusResponseBody</p>
 */
public class DescribeRoomStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RoomStatus")
    private Integer roomStatus;

    private DescribeRoomStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.roomStatus = builder.roomStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRoomStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return roomStatus
     */
    public Integer getRoomStatus() {
        return this.roomStatus;
    }

    public static final class Builder {
        private String requestId; 
        private Integer roomStatus; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RoomStatus.
         */
        public Builder roomStatus(Integer roomStatus) {
            this.roomStatus = roomStatus;
            return this;
        }

        public DescribeRoomStatusResponseBody build() {
            return new DescribeRoomStatusResponseBody(this);
        } 

    } 

}
