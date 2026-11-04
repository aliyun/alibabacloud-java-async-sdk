// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link QueryFaceUserGroupAndDeviceGroupRelationResponseBody} extends {@link TeaModel}
 *
 * <p>QueryFaceUserGroupAndDeviceGroupRelationResponseBody</p>
 */
public class QueryFaceUserGroupAndDeviceGroupRelationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryFaceUserGroupAndDeviceGroupRelationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFaceUserGroupAndDeviceGroupRelationResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryFaceUserGroupAndDeviceGroupRelationResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The return value of the API call.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0A13279A-5640-45E7-87AA-83750541AD0E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryFaceUserGroupAndDeviceGroupRelationResponseBody build() {
            return new QueryFaceUserGroupAndDeviceGroupRelationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryFaceUserGroupAndDeviceGroupRelationResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFaceUserGroupAndDeviceGroupRelationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ControlId")
        private String controlId;

        @com.aliyun.core.annotation.NameInMap("ControlType")
        private String controlType;

        @com.aliyun.core.annotation.NameInMap("DeviceGroupId")
        private String deviceGroupId;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("UserGroupId")
        private String userGroupId;

        private Data(Builder builder) {
            this.controlId = builder.controlId;
            this.controlType = builder.controlType;
            this.deviceGroupId = builder.deviceGroupId;
            this.modifiedTime = builder.modifiedTime;
            this.userGroupId = builder.userGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return controlId
         */
        public String getControlId() {
            return this.controlId;
        }

        /**
         * @return controlType
         */
        public String getControlType() {
            return this.controlType;
        }

        /**
         * @return deviceGroupId
         */
        public String getDeviceGroupId() {
            return this.deviceGroupId;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return userGroupId
         */
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public static final class Builder {
            private String controlId; 
            private String controlType; 
            private String deviceGroupId; 
            private String modifiedTime; 
            private String userGroupId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.controlId = model.controlId;
                this.controlType = model.controlType;
                this.deviceGroupId = model.deviceGroupId;
                this.modifiedTime = model.modifiedTime;
                this.userGroupId = model.userGroupId;
            } 

            /**
             * <p>The control ID for the face synchronization relationship between user groups and device groups.</p>
             * 
             * <strong>example:</strong>
             * <p>ni1iyxqry0j03plv</p>
             */
            public Builder controlId(String controlId) {
                this.controlId = controlId;
                return this;
            }

            /**
             * <p>The face synchronization relationship.</p>
             * 
             * <strong>example:</strong>
             * <p>SYNC_INFO_PICTURE</p>
             */
            public Builder controlType(String controlType) {
                this.controlType = controlType;
                return this;
            }

            /**
             * <p>The device group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>TestDeviceGroupId</p>
             */
            public Builder deviceGroupId(String deviceGroupId) {
                this.deviceGroupId = deviceGroupId;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-05-12 17:12:37</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The user group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>TestUserGroupId</p>
             */
            public Builder userGroupId(String userGroupId) {
                this.userGroupId = userGroupId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
