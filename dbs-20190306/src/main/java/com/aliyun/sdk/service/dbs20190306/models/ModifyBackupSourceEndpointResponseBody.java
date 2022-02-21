// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBackupSourceEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyBackupSourceEndpointResponseBody</p>
 */
public class ModifyBackupSourceEndpointResponseBody extends TeaModel {
    @NameInMap("BackupPlanId")
    private String backupPlanId;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("NeedPrecheck")
    private Boolean needPrecheck;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ModifyBackupSourceEndpointResponseBody(Builder builder) {
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

    public static ModifyBackupSourceEndpointResponseBody create() {
        return builder().build();
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

        /**
         * BackupPlanId.
         */
        public Builder backupPlanId(String backupPlanId) {
            this.backupPlanId = backupPlanId;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
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
         * NeedPrecheck.
         */
        public Builder needPrecheck(Boolean needPrecheck) {
            this.needPrecheck = needPrecheck;
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

        public ModifyBackupSourceEndpointResponseBody build() {
            return new ModifyBackupSourceEndpointResponseBody(this);
        } 

    } 

}
