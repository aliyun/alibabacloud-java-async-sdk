// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SkipPreCheckResponseBody} extends {@link TeaModel}
 *
 * <p>SkipPreCheckResponseBody</p>
 */
public class SkipPreCheckResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DynamicMessage")
    private String dynamicMessage;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("MigrationJobId")
    private String migrationJobId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScheduleJobId")
    private String scheduleJobId;

    @NameInMap("SkipItems")
    private String skipItems;

    @NameInMap("SkipNames")
    private String skipNames;

    @NameInMap("Success")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
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
         * MigrationJobId.
         */
        public Builder migrationJobId(String migrationJobId) {
            this.migrationJobId = migrationJobId;
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
         * ScheduleJobId.
         */
        public Builder scheduleJobId(String scheduleJobId) {
            this.scheduleJobId = scheduleJobId;
            return this;
        }

        /**
         * SkipItems.
         */
        public Builder skipItems(String skipItems) {
            this.skipItems = skipItems;
            return this;
        }

        /**
         * SkipNames.
         */
        public Builder skipNames(String skipNames) {
            this.skipNames = skipNames;
            return this;
        }

        /**
         * Success.
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
