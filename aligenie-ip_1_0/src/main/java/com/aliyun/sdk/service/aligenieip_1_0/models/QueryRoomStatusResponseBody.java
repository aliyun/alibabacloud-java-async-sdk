// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

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
 * {@link QueryRoomStatusResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRoomStatusResponseBody</p>
 */
public class QueryRoomStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("StatusCode")
    private Integer statusCode;

    private QueryRoomStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.statusCode = builder.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRoomStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Result result; 
        private Integer statusCode; 

        private Builder() {
        } 

        private Builder(QueryRoomStatusResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
            this.statusCode = model.statusCode;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * StatusCode.
         */
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public QueryRoomStatusResponseBody build() {
            return new QueryRoomStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryRoomStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRoomStatusResponseBody</p>
     */
    public static class SceneList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SceneName")
        private String sceneName;

        private SceneList(Builder builder) {
            this.sceneName = builder.sceneName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SceneList create() {
            return builder().build();
        }

        /**
         * @return sceneName
         */
        public String getSceneName() {
            return this.sceneName;
        }

        public static final class Builder {
            private String sceneName; 

            private Builder() {
            } 

            private Builder(SceneList model) {
                this.sceneName = model.sceneName;
            } 

            /**
             * SceneName.
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            public SceneList build() {
                return new SceneList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryRoomStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRoomStatusResponseBody</p>
     */
    public static class StatusList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StatusName")
        private String statusName;

        @com.aliyun.core.annotation.NameInMap("StatusValue")
        private String statusValue;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private StatusList(Builder builder) {
            this.statusName = builder.statusName;
            this.statusValue = builder.statusValue;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatusList create() {
            return builder().build();
        }

        /**
         * @return statusName
         */
        public String getStatusName() {
            return this.statusName;
        }

        /**
         * @return statusValue
         */
        public String getStatusValue() {
            return this.statusValue;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String statusName; 
            private String statusValue; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(StatusList model) {
                this.statusName = model.statusName;
                this.statusValue = model.statusValue;
                this.updateTime = model.updateTime;
            } 

            /**
             * StatusName.
             */
            public Builder statusName(String statusName) {
                this.statusName = statusName;
                return this;
            }

            /**
             * StatusValue.
             */
            public Builder statusValue(String statusValue) {
                this.statusValue = statusValue;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public StatusList build() {
                return new StatusList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryRoomStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRoomStatusResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HotelId")
        private String hotelId;

        @com.aliyun.core.annotation.NameInMap("RoomNo")
        private String roomNo;

        @com.aliyun.core.annotation.NameInMap("SceneList")
        private java.util.List<SceneList> sceneList;

        @com.aliyun.core.annotation.NameInMap("StatusList")
        private java.util.List<StatusList> statusList;

        private Result(Builder builder) {
            this.hotelId = builder.hotelId;
            this.roomNo = builder.roomNo;
            this.sceneList = builder.sceneList;
            this.statusList = builder.statusList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return hotelId
         */
        public String getHotelId() {
            return this.hotelId;
        }

        /**
         * @return roomNo
         */
        public String getRoomNo() {
            return this.roomNo;
        }

        /**
         * @return sceneList
         */
        public java.util.List<SceneList> getSceneList() {
            return this.sceneList;
        }

        /**
         * @return statusList
         */
        public java.util.List<StatusList> getStatusList() {
            return this.statusList;
        }

        public static final class Builder {
            private String hotelId; 
            private String roomNo; 
            private java.util.List<SceneList> sceneList; 
            private java.util.List<StatusList> statusList; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.hotelId = model.hotelId;
                this.roomNo = model.roomNo;
                this.sceneList = model.sceneList;
                this.statusList = model.statusList;
            } 

            /**
             * HotelId.
             */
            public Builder hotelId(String hotelId) {
                this.hotelId = hotelId;
                return this;
            }

            /**
             * RoomNo.
             */
            public Builder roomNo(String roomNo) {
                this.roomNo = roomNo;
                return this;
            }

            /**
             * SceneList.
             */
            public Builder sceneList(java.util.List<SceneList> sceneList) {
                this.sceneList = sceneList;
                return this;
            }

            /**
             * StatusList.
             */
            public Builder statusList(java.util.List<StatusList> statusList) {
                this.statusList = statusList;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
