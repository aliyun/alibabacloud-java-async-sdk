// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SkipPreCheckResponseBody} extends {@link TeaModel}
 *
 * <p>SkipPreCheckResponseBody</p>
 */
public class SkipPreCheckResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("MigrationJobId")
    private String migrationJobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScheduleJobId")
    private String scheduleJobId;

    @com.aliyun.core.annotation.NameInMap("SkipItems")
    private String skipItems;

    @com.aliyun.core.annotation.NameInMap("SkipNames")
    private String skipNames;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SkipPreCheckResponseBody(Builder builder) {
        this.code = builder.code;
        this.dynamicMessage = builder.dynamicMessage;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.migrationJobId = builder.migrationJobId;
        this.requestId = builder.requestId;
        this.scheduleJobId = builder.scheduleJobId;
        this.skipItems = builder.skipItems;
        this.skipNames = builder.skipNames;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SkipPreCheckResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
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
     * @return scheduleJobId
     */
    public String getScheduleJobId() {
        return this.scheduleJobId;
    }

    /**
     * @return skipItems
     */
    public String getSkipItems() {
        return this.skipItems;
    }

    /**
     * @return skipNames
     */
    public String getSkipNames() {
        return this.skipNames;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String dynamicMessage; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String migrationJobId; 
        private String requestId; 
        private String scheduleJobId; 
        private String skipItems; 
        private String skipNames; 
        private Boolean success; 

        /**
         * The error code. This parameter will be removed in the future.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The dynamic part in the error message. This parameter is used to replace the **%s** variable in the **ErrMessage** parameter.
         * <p>
         * 
         * >  If the specified **JobId** parameter is invalid, **The Value of Input Parameter %s is not valid** is returned for **ErrMessage** and **JobId** is returned for **DynamicMessage**.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

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
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The ID of the DTS task on which the precheck is performed.
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
         * The ID of the precheck task.
         */
        public Builder scheduleJobId(String scheduleJobId) {
            this.scheduleJobId = scheduleJobId;
            return this;
        }

        /**
         * The shortened name of the precheck item.
         */
        public Builder skipItems(String skipItems) {
            this.skipItems = skipItems;
            return this;
        }

        /**
         * The name of the precheck item.
         */
        public Builder skipNames(String skipNames) {
            this.skipNames = skipNames;
            return this;
        }

        /**
         * Indicates whether the call is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SkipPreCheckResponseBody build() {
            return new SkipPreCheckResponseBody(this);
        } 

    } 

}
