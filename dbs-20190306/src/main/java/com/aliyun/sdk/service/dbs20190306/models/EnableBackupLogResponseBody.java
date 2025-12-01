// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

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
 * {@link EnableBackupLogResponseBody} extends {@link TeaModel}
 *
 * <p>EnableBackupLogResponseBody</p>
 */
public class EnableBackupLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupPlanId")
    private String backupPlanId;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("NeedPrecheck")
    private Boolean needPrecheck;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private EnableBackupLogResponseBody(Builder builder) {
        this.backupPlanId = builder.backupPlanId;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.needPrecheck = builder.needPrecheck;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableBackupLogResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupPlanId
     */
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return needPrecheck
     */
    public Boolean getNeedPrecheck() {
        return this.needPrecheck;
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
        private String backupPlanId; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private Boolean needPrecheck; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(EnableBackupLogResponseBody model) {
            this.backupPlanId = model.backupPlanId;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.needPrecheck = model.needPrecheck;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The backup schedule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dbstooi01xxxx</p>
         */
        public Builder backupPlanId(String backupPlanId) {
            this.backupPlanId = backupPlanId;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Param.NotFound</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>findValidDBSJob error</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Indicates whether a precheck is triggered. Valid values:</p>
         * <ul>
         * <li>true: A precheck is triggered. You must call the <a href="https://help.aliyun.com/document_detail/2869816.html">StartBackupPlan</a> operation to start the backup schedule.</li>
         * <li>false: No precheck is triggered.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder needPrecheck(Boolean needPrecheck) {
            this.needPrecheck = needPrecheck;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D6E068C3-25BC-455A-85FE-45F0B22ECB1F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li>true: The request is successful.</li>
         * <li>false: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public EnableBackupLogResponseBody build() {
            return new EnableBackupLogResponseBody(this);
        } 

    } 

}
