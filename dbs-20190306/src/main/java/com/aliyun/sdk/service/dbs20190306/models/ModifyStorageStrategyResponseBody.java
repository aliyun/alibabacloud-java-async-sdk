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
 * {@link ModifyStorageStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyStorageStrategyResponseBody</p>
 */
public class ModifyStorageStrategyResponseBody extends TeaModel {
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

    private ModifyStorageStrategyResponseBody(Builder builder) {
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

    public static ModifyStorageStrategyResponseBody create() {
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

        private Builder(ModifyStorageStrategyResponseBody model) {
            this.backupPlanId = model.backupPlanId;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.needPrecheck = model.needPrecheck;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The ID of the backup schedule.</p>
         * 
         * <strong>example:</strong>
         * <p>dbsqdss5tmh****</p>
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
         * <li><strong>true</strong>: A precheck is triggered. You must manually call the <a href="https://help.aliyun.com/document_detail/2869818.html">StartBackupPlan</a> operation to start the backup schedule.</li>
         * <li><strong>false</strong>: No precheck is triggered.</li>
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
         * <p>E995F91F-6F89-503B-9F7D-502F58FD****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request is successful.</li>
         * <li><strong>false</strong>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ModifyStorageStrategyResponseBody build() {
            return new ModifyStorageStrategyResponseBody(this);
        } 

    } 

}
