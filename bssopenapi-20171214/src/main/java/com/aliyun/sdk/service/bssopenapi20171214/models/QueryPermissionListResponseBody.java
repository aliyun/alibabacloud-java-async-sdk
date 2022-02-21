// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPermissionListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPermissionListResponseBody</p>
 */
public class QueryPermissionListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryPermissionListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPermissionListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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

        public QueryPermissionListResponseBody build() {
            return new QueryPermissionListResponseBody(this);
        } 

    } 

    public static class PermissionList extends TeaModel {
        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("PermissionCode")
        private String permissionCode;

        @NameInMap("PermissionName")
        private String permissionName;

        @NameInMap("StartTime")
        private String startTime;

        private PermissionList(Builder builder) {
            this.endTime = builder.endTime;
            this.permissionCode = builder.permissionCode;
            this.permissionName = builder.permissionName;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PermissionList create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return permissionCode
         */
        public String getPermissionCode() {
            return this.permissionCode;
        }

        /**
         * @return permissionName
         */
        public String getPermissionName() {
            return this.permissionName;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private String permissionCode; 
            private String permissionName; 
            private String startTime; 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * PermissionCode.
             */
            public Builder permissionCode(String permissionCode) {
                this.permissionCode = permissionCode;
                return this;
            }

            /**
             * PermissionName.
             */
            public Builder permissionName(String permissionName) {
                this.permissionName = permissionName;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public PermissionList build() {
                return new PermissionList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("MasterId")
        private Long masterId;

        @NameInMap("MemberId")
        private Long memberId;

        @NameInMap("PermissionList")
        private java.util.List < PermissionList> permissionList;

        @NameInMap("RelationType")
        private String relationType;

        @NameInMap("SetupTime")
        private String setupTime;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("State")
        private String state;

        private Data(Builder builder) {
            this.endTime = builder.endTime;
            this.masterId = builder.masterId;
            this.memberId = builder.memberId;
            this.permissionList = builder.permissionList;
            this.relationType = builder.relationType;
            this.setupTime = builder.setupTime;
            this.startTime = builder.startTime;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return masterId
         */
        public Long getMasterId() {
            return this.masterId;
        }

        /**
         * @return memberId
         */
        public Long getMemberId() {
            return this.memberId;
        }

        /**
         * @return permissionList
         */
        public java.util.List < PermissionList> getPermissionList() {
            return this.permissionList;
        }

        /**
         * @return relationType
         */
        public String getRelationType() {
            return this.relationType;
        }

        /**
         * @return setupTime
         */
        public String getSetupTime() {
            return this.setupTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String endTime; 
            private Long masterId; 
            private Long memberId; 
            private java.util.List < PermissionList> permissionList; 
            private String relationType; 
            private String setupTime; 
            private String startTime; 
            private String state; 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * MasterId.
             */
            public Builder masterId(Long masterId) {
                this.masterId = masterId;
                return this;
            }

            /**
             * MemberId.
             */
            public Builder memberId(Long memberId) {
                this.memberId = memberId;
                return this;
            }

            /**
             * PermissionList.
             */
            public Builder permissionList(java.util.List < PermissionList> permissionList) {
                this.permissionList = permissionList;
                return this;
            }

            /**
             * RelationType.
             */
            public Builder relationType(String relationType) {
                this.relationType = relationType;
                return this;
            }

            /**
             * SetupTime.
             */
            public Builder setupTime(String setupTime) {
                this.setupTime = setupTime;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
