// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRoomResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRoomResponseBody</p>
 */
public class CreateRoomResponseBody extends TeaModel {
    @NameInMap("AnchorId")
    private String anchorId;

    @NameInMap("AppId")
    private String appId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RoomId")
    private String roomId;

    private CreateRoomResponseBody(Builder builder) {
        this.anchorId = builder.anchorId;
        this.appId = builder.appId;
        this.requestId = builder.requestId;
        this.roomId = builder.roomId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRoomResponseBody create() {
        return builder().build();
    }

    /**
     * @return anchorId
     */
    public String getAnchorId() {
        return this.anchorId;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return roomId
     */
    public String getRoomId() {
        return this.roomId;
    }

    public static final class Builder {
        private String anchorId; 
        private String appId; 
        private String requestId; 
        private String roomId; 

        /**
         * AnchorId.
         */
        public Builder anchorId(String anchorId) {
            this.anchorId = anchorId;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RoomId.
         */
        public Builder roomId(String roomId) {
            this.roomId = roomId;
            return this;
        }

        public CreateRoomResponseBody build() {
            return new CreateRoomResponseBody(this);
        } 

    } 

}
