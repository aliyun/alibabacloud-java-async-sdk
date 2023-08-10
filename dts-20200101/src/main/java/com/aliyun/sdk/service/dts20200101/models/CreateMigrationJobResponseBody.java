// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMigrationJobResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMigrationJobResponseBody</p>
 */
public class CreateMigrationJobResponseBody extends TeaModel {
    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("MigrationJobId")
    private String migrationJobId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private CreateMigrationJobResponseBody(Builder builder) {
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.migrationJobId = builder.migrationJobId;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMigrationJobResponseBody create() {
        return builder().build();
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
     * @return migrationJobId
     */
    public String getMigrationJobId() {
        return this.migrationJobId;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errCode; 
        private String errMessage; 
        private String migrationJobId; 
        private String requestId; 
        private String success; 

        /**
         * The error code returned if the call failed.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * The error message returned if the call failed.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * The ID of the data migration instance.
         */
        public Builder migrationJobId(String migrationJobId) {
            this.migrationJobId = migrationJobId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call was successful.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public CreateMigrationJobResponseBody build() {
            return new CreateMigrationJobResponseBody(this);
        } 

    } 

}
