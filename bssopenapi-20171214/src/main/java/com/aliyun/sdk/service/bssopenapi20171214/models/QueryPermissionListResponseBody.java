// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link QueryPermissionListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPermissionListResponseBody</p>
 */
public class QueryPermissionListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful!</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F6E29451-A3CD-4705-806D-0112D08F5C49</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryPermissionListResponseBody build() {
            return new QueryPermissionListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryPermissionListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPermissionListResponseBody</p>
     */
    public static class PermissionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("PermissionCode")
        private String permissionCode;

        @com.aliyun.core.annotation.NameInMap("PermissionName")
        private String permissionName;

        @com.aliyun.core.annotation.NameInMap("StartTime")
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
             * <p>The time when the permission expired. If no value is returned, the permission is still valid. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC. For example, 2016-05-23T12:00:00Z indicates that the permission expired at 20:00:00 on May 23, 2016 (UTC+8).</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-05T15:12Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The code of the permission.</p>
             * 
             * <strong>example:</strong>
             * <p>allow_synchronize_finance_identity</p>
             */
            public Builder permissionCode(String permissionCode) {
                this.permissionCode = permissionCode;
                return this;
            }

            /**
             * <p>The name of the permission.</p>
             * 
             * <strong>example:</strong>
             * <p>The management account shares the credit control identity with the member.</p>
             */
            public Builder permissionName(String permissionName) {
                this.permissionName = permissionName;
                return this;
            }

            /**
             * <p>The time when the permission took effect. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC. For example, 2016-05-23T12:00:00Z indicates that the permission took effect at 20:00:00 on May 23, 2016 (UTC+8).</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-02T15:12Z</p>
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
    /**
     * 
     * {@link QueryPermissionListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPermissionListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("MasterId")
        private Long masterId;

        @com.aliyun.core.annotation.NameInMap("MemberId")
        private Long memberId;

        @com.aliyun.core.annotation.NameInMap("PermissionList")
        private java.util.List<PermissionList> permissionList;

        @com.aliyun.core.annotation.NameInMap("RelationType")
        private String relationType;

        @com.aliyun.core.annotation.NameInMap("SetupTime")
        private String setupTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("State")
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
        public java.util.List<PermissionList> getPermissionList() {
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
            private java.util.List<PermissionList> permissionList; 
            private String relationType; 
            private String setupTime; 
            private String startTime; 
            private String state; 

            /**
             * <p>The time when the relationship expired. If no value is returned, the relationship is still valid.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-06T15:12Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The ID of the management account.</p>
             * 
             * <strong>example:</strong>
             * <p>1990699401005016</p>
             */
            public Builder masterId(Long masterId) {
                this.masterId = masterId;
                return this;
            }

            /**
             * <p>The ID of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>1851253838840762</p>
             */
            public Builder memberId(Long memberId) {
                this.memberId = memberId;
                return this;
            }

            /**
             * <p>The list of permissions.</p>
             */
            public Builder permissionList(java.util.List<PermissionList> permissionList) {
                this.permissionList = permissionList;
                return this;
            }

            /**
             * <p>The type of the relationship. Valid values: FinancialManagement and FinancialTrusteeship.</p>
             * 
             * <strong>example:</strong>
             * <p>FinancialManagement</p>
             */
            public Builder relationType(String relationType) {
                this.relationType = relationType;
                return this;
            }

            /**
             * <p>The time when the relationship was established. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC. For example, 2016-05-23T12:00:00Z indicates that the relationship was established at 20:00:00 on May 23, 2016 (UTC+8).</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-02T15:12Z</p>
             */
            public Builder setupTime(String setupTime) {
                this.setupTime = setupTime;
                return this;
            }

            /**
             * <p>The time when the relationship took effect. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC. For example, 2016-05-23T12:00:00Z indicates that the relationship took effect at 20:00:00 on May 23, 2016 (UTC+8).</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-02T15:12Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the relationship. For more information about valid values of this parameter, see the enumeration values of the RelationshipStatusEnum type in the following table.</p>
             * 
             * <strong>example:</strong>
             * <p>RELATED</p>
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
