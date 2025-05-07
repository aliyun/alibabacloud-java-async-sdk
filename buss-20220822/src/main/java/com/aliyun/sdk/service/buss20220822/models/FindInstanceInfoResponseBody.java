// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.buss20220822.models;

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
 * {@link FindInstanceInfoResponseBody} extends {@link TeaModel}
 *
 * <p>FindInstanceInfoResponseBody</p>
 */
public class FindInstanceInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private FindInstanceInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindInstanceInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer count; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(FindInstanceInfoResponseBody model) {
            this.code = model.code;
            this.count = model.count;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public FindInstanceInfoResponseBody build() {
            return new FindInstanceInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FindInstanceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>FindInstanceInfoResponseBody</p>
     */
    public static class UserInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GcLevel")
        private String gcLevel;

        @com.aliyun.core.annotation.NameInMap("HitWhiteReason")
        private String hitWhiteReason;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserSite")
        private String userSite;

        @com.aliyun.core.annotation.NameInMap("WhiteUser")
        private Boolean whiteUser;

        private UserInfo(Builder builder) {
            this.gcLevel = builder.gcLevel;
            this.hitWhiteReason = builder.hitWhiteReason;
            this.userId = builder.userId;
            this.userSite = builder.userSite;
            this.whiteUser = builder.whiteUser;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserInfo create() {
            return builder().build();
        }

        /**
         * @return gcLevel
         */
        public String getGcLevel() {
            return this.gcLevel;
        }

        /**
         * @return hitWhiteReason
         */
        public String getHitWhiteReason() {
            return this.hitWhiteReason;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userSite
         */
        public String getUserSite() {
            return this.userSite;
        }

        /**
         * @return whiteUser
         */
        public Boolean getWhiteUser() {
            return this.whiteUser;
        }

        public static final class Builder {
            private String gcLevel; 
            private String hitWhiteReason; 
            private String userId; 
            private String userSite; 
            private Boolean whiteUser; 

            private Builder() {
            } 

            private Builder(UserInfo model) {
                this.gcLevel = model.gcLevel;
                this.hitWhiteReason = model.hitWhiteReason;
                this.userId = model.userId;
                this.userSite = model.userSite;
                this.whiteUser = model.whiteUser;
            } 

            /**
             * GcLevel.
             */
            public Builder gcLevel(String gcLevel) {
                this.gcLevel = gcLevel;
                return this;
            }

            /**
             * HitWhiteReason.
             */
            public Builder hitWhiteReason(String hitWhiteReason) {
                this.hitWhiteReason = hitWhiteReason;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserSite.
             */
            public Builder userSite(String userSite) {
                this.userSite = userSite;
                return this;
            }

            /**
             * WhiteUser.
             */
            public Builder whiteUser(Boolean whiteUser) {
                this.whiteUser = whiteUser;
                return this;
            }

            public UserInfo build() {
                return new UserInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link FindInstanceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>FindInstanceInfoResponseBody</p>
     */
    public static class PegInstanceInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BussinessCode")
        private String bussinessCode;

        @com.aliyun.core.annotation.NameInMap("Coordinate")
        private java.util.Map<String, ?> coordinate;

        @com.aliyun.core.annotation.NameInMap("IdType")
        private String idType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ServiceCreatedTime")
        private String serviceCreatedTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserInfo")
        private UserInfo userInfo;

        private PegInstanceInfoList(Builder builder) {
            this.bussinessCode = builder.bussinessCode;
            this.coordinate = builder.coordinate;
            this.idType = builder.idType;
            this.instanceId = builder.instanceId;
            this.serviceCreatedTime = builder.serviceCreatedTime;
            this.userId = builder.userId;
            this.userInfo = builder.userInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PegInstanceInfoList create() {
            return builder().build();
        }

        /**
         * @return bussinessCode
         */
        public String getBussinessCode() {
            return this.bussinessCode;
        }

        /**
         * @return coordinate
         */
        public java.util.Map<String, ?> getCoordinate() {
            return this.coordinate;
        }

        /**
         * @return idType
         */
        public String getIdType() {
            return this.idType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return serviceCreatedTime
         */
        public String getServiceCreatedTime() {
            return this.serviceCreatedTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userInfo
         */
        public UserInfo getUserInfo() {
            return this.userInfo;
        }

        public static final class Builder {
            private String bussinessCode; 
            private java.util.Map<String, ?> coordinate; 
            private String idType; 
            private String instanceId; 
            private String serviceCreatedTime; 
            private String userId; 
            private UserInfo userInfo; 

            private Builder() {
            } 

            private Builder(PegInstanceInfoList model) {
                this.bussinessCode = model.bussinessCode;
                this.coordinate = model.coordinate;
                this.idType = model.idType;
                this.instanceId = model.instanceId;
                this.serviceCreatedTime = model.serviceCreatedTime;
                this.userId = model.userId;
                this.userInfo = model.userInfo;
            } 

            /**
             * BussinessCode.
             */
            public Builder bussinessCode(String bussinessCode) {
                this.bussinessCode = bussinessCode;
                return this;
            }

            /**
             * Coordinate.
             */
            public Builder coordinate(java.util.Map<String, ?> coordinate) {
                this.coordinate = coordinate;
                return this;
            }

            /**
             * IdType.
             */
            public Builder idType(String idType) {
                this.idType = idType;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * ServiceCreatedTime.
             */
            public Builder serviceCreatedTime(String serviceCreatedTime) {
                this.serviceCreatedTime = serviceCreatedTime;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserInfo.
             */
            public Builder userInfo(UserInfo userInfo) {
                this.userInfo = userInfo;
                return this;
            }

            public PegInstanceInfoList build() {
                return new PegInstanceInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link FindInstanceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>FindInstanceInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PegInstanceInfoList")
        private java.util.List<PegInstanceInfoList> pegInstanceInfoList;

        private Data(Builder builder) {
            this.pegInstanceInfoList = builder.pegInstanceInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pegInstanceInfoList
         */
        public java.util.List<PegInstanceInfoList> getPegInstanceInfoList() {
            return this.pegInstanceInfoList;
        }

        public static final class Builder {
            private java.util.List<PegInstanceInfoList> pegInstanceInfoList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pegInstanceInfoList = model.pegInstanceInfoList;
            } 

            /**
             * PegInstanceInfoList.
             */
            public Builder pegInstanceInfoList(java.util.List<PegInstanceInfoList> pegInstanceInfoList) {
                this.pegInstanceInfoList = pegInstanceInfoList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
