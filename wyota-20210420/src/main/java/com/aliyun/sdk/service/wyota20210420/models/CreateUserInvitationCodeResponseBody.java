// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

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
 * {@link CreateUserInvitationCodeResponseBody} extends {@link TeaModel}
 *
 * <p>CreateUserInvitationCodeResponseBody</p>
 */
public class CreateUserInvitationCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateUserInvitationCodeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserInvitationCodeResponseBody create() {
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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateUserInvitationCodeResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business error code. This field may be empty if the call is successful. If the call fails, a value such as PARAM_ERROR indicates that the parameter value is invalid.</p>
         * 
         * <strong>example:</strong>
         * <p>PARAM_ERROR</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The array of created management invitation code records. Each user corresponds to one record. An array is returned even for single-user creation.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code of the backend business response. A value of 200 indicates success. A value of 400 indicates parameter or business validation failure. A value of 500 indicates a system error.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The business error message. This field may be empty if the call is successful. If the call fails, this field describes the cause of the error.</p>
         * 
         * <strong>example:</strong>
         * <p>PARAM_ERROR</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request, used to locate call logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>00000000-0000-4000-8000-000000000001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the business processing is successful. A value of true indicates success. A value of false indicates failure.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateUserInvitationCodeResponseBody build() {
            return new CreateUserInvitationCodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateUserInvitationCodeResponseBody} extends {@link TeaModel}
     *
     * <p>CreateUserInvitationCodeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindTime")
        private String bindTime;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("Expired")
        private Boolean expired;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("InvitationCode")
        private String invitationCode;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TerminalGroupId")
        private String terminalGroupId;

        @com.aliyun.core.annotation.NameInMap("TerminalGroupName")
        private String terminalGroupName;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("ValidityMinutes")
        private Integer validityMinutes;

        private Data(Builder builder) {
            this.bindTime = builder.bindTime;
            this.endUserId = builder.endUserId;
            this.expireTime = builder.expireTime;
            this.expired = builder.expired;
            this.gmtCreate = builder.gmtCreate;
            this.invitationCode = builder.invitationCode;
            this.platform = builder.platform;
            this.status = builder.status;
            this.terminalGroupId = builder.terminalGroupId;
            this.terminalGroupName = builder.terminalGroupName;
            this.userName = builder.userName;
            this.uuid = builder.uuid;
            this.validityMinutes = builder.validityMinutes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bindTime
         */
        public String getBindTime() {
            return this.bindTime;
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return expired
         */
        public Boolean getExpired() {
            return this.expired;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return invitationCode
         */
        public String getInvitationCode() {
            return this.invitationCode;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return terminalGroupId
         */
        public String getTerminalGroupId() {
            return this.terminalGroupId;
        }

        /**
         * @return terminalGroupName
         */
        public String getTerminalGroupName() {
            return this.terminalGroupName;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return validityMinutes
         */
        public Integer getValidityMinutes() {
            return this.validityMinutes;
        }

        public static final class Builder {
            private String bindTime; 
            private String endUserId; 
            private String expireTime; 
            private Boolean expired; 
            private String gmtCreate; 
            private String invitationCode; 
            private String platform; 
            private String status; 
            private String terminalGroupId; 
            private String terminalGroupName; 
            private String userName; 
            private String uuid; 
            private Integer validityMinutes; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bindTime = model.bindTime;
                this.endUserId = model.endUserId;
                this.expireTime = model.expireTime;
                this.expired = model.expired;
                this.gmtCreate = model.gmtCreate;
                this.invitationCode = model.invitationCode;
                this.platform = model.platform;
                this.status = model.status;
                this.terminalGroupId = model.terminalGroupId;
                this.terminalGroupName = model.terminalGroupName;
                this.userName = model.userName;
                this.uuid = model.uuid;
                this.validityMinutes = model.validityMinutes;
            } 

            /**
             * <p>The binding time when the terminal uses the code to complete management. This field is empty for a newly created code because it is not yet bound to a terminal.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder bindTime(String bindTime) {
                this.bindTime = bindTime;
                return this;
            }

            /**
             * <p>The logon identifier (EndUserId) of the user corresponding to the management code.</p>
             * 
             * <strong>example:</strong>
             * <p>user-001</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>The expiration time of the management code calculated by the server. This field is empty if the code is permanently valid. To determine whether the code has expired, use the Expired field.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>Indicates whether the code has expired as calculated by the server. A value of true indicates that the validity period has expired. A value of false indicates that the code has not expired or is permanently valid. This field is independent of the usage status in the Status field.</p>
             */
            public Builder expired(Boolean expired) {
                this.expired = expired;
                return this;
            }

            /**
             * <p>The creation time of the management code, generated by the server.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-15T08:00:00.000+00:00</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The generated eight-digit terminal management invitation code. It is processed as a string and leading zeros are preserved.</p>
             * 
             * <strong>example:</strong>
             * <p>01234567</p>
             */
            public Builder invitationCode(String invitationCode) {
                this.invitationCode = invitationCode;
                return this;
            }

            /**
             * <p>The client type of the bound terminal. This field is empty for a newly created code because it is not yet bound to a terminal.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The usage status of the management code. Valid values:</p>
             * <ul>
             * <li>ACTIVE: The code is unused.</li>
             * <li>USED: The code is used.
             * The creation response returns ACTIVE. Expiration does not change the usage status. Use the Expired field to determine whether the code has expired.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the terminal group specified for the management code.</p>
             * 
             * <strong>example:</strong>
             * <p>tg-example</p>
             */
            public Builder terminalGroupId(String terminalGroupId) {
                this.terminalGroupId = terminalGroupId;
                return this;
            }

            /**
             * <p>The display name of the terminal group. This creation operation does not populate this display field, so it may be empty in the creation response.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder terminalGroupName(String terminalGroupName) {
                this.terminalGroupName = terminalGroupName;
                return this;
            }

            /**
             * <p>The display name of the user. This creation operation does not populate this display field, so it may be empty in the creation response.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * <p>The UUID of the terminal that uses the code to complete management. This field is empty for a newly created code because it is not yet bound to a terminal.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * <p>The validity period of the management code, in minutes. The value is the same as the request value. A value of -1 indicates that the code is permanently valid.</p>
             * 
             * <strong>example:</strong>
             * <p>1440</p>
             */
            public Builder validityMinutes(Integer validityMinutes) {
                this.validityMinutes = validityMinutes;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
