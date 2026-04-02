// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link GetTempFileTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetTempFileTaskResponseBody</p>
 */
public class GetTempFileTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtExpiredTime")
    private String gmtExpiredTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private GetTempFileTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtExpiredTime = builder.gmtExpiredTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.httpStatusCode = builder.httpStatusCode;
        this.instanceId = builder.instanceId;
        this.message = builder.message;
        this.ownerId = builder.ownerId;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.userId = builder.userId;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTempFileTaskResponseBody create() {
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
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtExpiredTime
     */
    public String getGmtExpiredTime() {
        return this.gmtExpiredTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
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

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder {
        private String code; 
        private String gmtCreateTime; 
        private String gmtExpiredTime; 
        private String gmtModifiedTime; 
        private Integer httpStatusCode; 
        private String instanceId; 
        private String message; 
        private String ownerId; 
        private String requestId; 
        private Boolean success; 
        private String userId; 
        private String uuid; 

        private Builder() {
        } 

        private Builder(GetTempFileTaskResponseBody model) {
            this.code = model.code;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtExpiredTime = model.gmtExpiredTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.httpStatusCode = model.httpStatusCode;
            this.instanceId = model.instanceId;
            this.message = model.message;
            this.ownerId = model.ownerId;
            this.requestId = model.requestId;
            this.success = model.success;
            this.userId = model.userId;
            this.uuid = model.uuid;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtExpiredTime.
         */
        public Builder gmtExpiredTime(String gmtExpiredTime) {
            this.gmtExpiredTime = gmtExpiredTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Owner Id</p>
         * 
         * <strong>example:</strong>
         * <p>1612285282502324</p>
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
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

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        public GetTempFileTaskResponseBody build() {
            return new GetTempFileTaskResponseBody(this);
        } 

    } 

}
