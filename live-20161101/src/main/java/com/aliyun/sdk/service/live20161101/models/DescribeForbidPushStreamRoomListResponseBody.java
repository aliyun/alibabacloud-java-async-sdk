// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeForbidPushStreamRoomListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeForbidPushStreamRoomListResponseBody</p>
 */
public class DescribeForbidPushStreamRoomListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RoomList")
    private java.util.List < RoomList> roomList;

    @NameInMap("TotalNum")
    private Integer totalNum;

    @NameInMap("TotalPage")
    private Integer totalPage;

    private DescribeForbidPushStreamRoomListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.roomList = builder.roomList;
        this.totalNum = builder.totalNum;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeForbidPushStreamRoomListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return roomList
     */
    public java.util.List < RoomList> getRoomList() {
        return this.roomList;
    }

    /**
     * @return totalNum
     */
    public Integer getTotalNum() {
        return this.totalNum;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < RoomList> roomList; 
        private Integer totalNum; 
        private Integer totalPage; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RoomList.
         */
        public Builder roomList(java.util.List < RoomList> roomList) {
            this.roomList = roomList;
            return this;
        }

        /**
         * TotalNum.
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        /**
         * TotalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeForbidPushStreamRoomListResponseBody build() {
            return new DescribeForbidPushStreamRoomListResponseBody(this);
        } 

    } 

    public static class RoomList extends TeaModel {
        @NameInMap("AnchorId")
        private String anchorId;

        @NameInMap("OpEndTime")
        private String opEndTime;

        @NameInMap("OpStartTime")
        private String opStartTime;

        @NameInMap("RoomId")
        private String roomId;

        private RoomList(Builder builder) {
            this.anchorId = builder.anchorId;
            this.opEndTime = builder.opEndTime;
            this.opStartTime = builder.opStartTime;
            this.roomId = builder.roomId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoomList create() {
            return builder().build();
        }

        /**
         * @return anchorId
         */
        public String getAnchorId() {
            return this.anchorId;
        }

        /**
         * @return opEndTime
         */
        public String getOpEndTime() {
            return this.opEndTime;
        }

        /**
         * @return opStartTime
         */
        public String getOpStartTime() {
            return this.opStartTime;
        }

        /**
         * @return roomId
         */
        public String getRoomId() {
            return this.roomId;
        }

        public static final class Builder {
            private String anchorId; 
            private String opEndTime; 
            private String opStartTime; 
            private String roomId; 

            /**
             * AnchorId.
             */
            public Builder anchorId(String anchorId) {
                this.anchorId = anchorId;
                return this;
            }

            /**
             * OpEndTime.
             */
            public Builder opEndTime(String opEndTime) {
                this.opEndTime = opEndTime;
                return this;
            }

            /**
             * OpStartTime.
             */
            public Builder opStartTime(String opStartTime) {
                this.opStartTime = opStartTime;
                return this;
            }

            /**
             * RoomId.
             */
            public Builder roomId(String roomId) {
                this.roomId = roomId;
                return this;
            }

            public RoomList build() {
                return new RoomList(this);
            } 

        } 

    }
}
