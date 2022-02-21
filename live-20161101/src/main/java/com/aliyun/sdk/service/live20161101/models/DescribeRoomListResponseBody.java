// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRoomListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRoomListResponseBody</p>
 */
public class DescribeRoomListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RoomList")
    private java.util.List < RoomList> roomList;

    @NameInMap("TotalNum")
    private Integer totalNum;

    @NameInMap("TotalPage")
    private Integer totalPage;

    private DescribeRoomListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.roomList = builder.roomList;
        this.totalNum = builder.totalNum;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRoomListResponseBody create() {
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

        public DescribeRoomListResponseBody build() {
            return new DescribeRoomListResponseBody(this);
        } 

    } 

    public static class RoomList extends TeaModel {
        @NameInMap("AnchorId")
        private String anchorId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ForbidStream")
        private String forbidStream;

        @NameInMap("RoomId")
        private String roomId;

        @NameInMap("RoomStatus")
        private Integer roomStatus;

        private RoomList(Builder builder) {
            this.anchorId = builder.anchorId;
            this.createTime = builder.createTime;
            this.forbidStream = builder.forbidStream;
            this.roomId = builder.roomId;
            this.roomStatus = builder.roomStatus;
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return forbidStream
         */
        public String getForbidStream() {
            return this.forbidStream;
        }

        /**
         * @return roomId
         */
        public String getRoomId() {
            return this.roomId;
        }

        /**
         * @return roomStatus
         */
        public Integer getRoomStatus() {
            return this.roomStatus;
        }

        public static final class Builder {
            private String anchorId; 
            private String createTime; 
            private String forbidStream; 
            private String roomId; 
            private Integer roomStatus; 

            /**
             * AnchorId.
             */
            public Builder anchorId(String anchorId) {
                this.anchorId = anchorId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ForbidStream.
             */
            public Builder forbidStream(String forbidStream) {
                this.forbidStream = forbidStream;
                return this;
            }

            /**
             * RoomId.
             */
            public Builder roomId(String roomId) {
                this.roomId = roomId;
                return this;
            }

            /**
             * RoomStatus.
             */
            public Builder roomStatus(Integer roomStatus) {
                this.roomStatus = roomStatus;
                return this;
            }

            public RoomList build() {
                return new RoomList(this);
            } 

        } 

    }
}
