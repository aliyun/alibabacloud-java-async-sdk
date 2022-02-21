// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAndStartBackupPlanResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAndStartBackupPlanResponseBody</p>
 */
public class CreateAndStartBackupPlanResponseBody extends TeaModel {
    @NameInMap("BackupPlanId")
    private String backupPlanId;

    @NameInMap("CreateBackupSet")
    private Boolean createBackupSet;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("OrderId")
    private String orderId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateAndStartBackupPlanResponseBody(Builder builder) {
        this.backupPlanId = builder.backupPlanId;
        this.createBackupSet = builder.createBackupSet;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAndStartBackupPlanResponseBody create() {
        return builder().build();
    }

    /**
     * @return backupPlanId
     */
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    /**
     * @return createBackupSet
     */
    public Boolean getCreateBackupSet() {
        return this.createBackupSet;
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
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
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
        private Boolean createBackupSet; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String orderId; 
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
         * CreateBackupSet.
         */
        public Builder createBackupSet(Boolean createBackupSet) {
            this.createBackupSet = createBackupSet;
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
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
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

        public CreateAndStartBackupPlanResponseBody build() {
            return new CreateAndStartBackupPlanResponseBody(this);
        } 

    } 

}
