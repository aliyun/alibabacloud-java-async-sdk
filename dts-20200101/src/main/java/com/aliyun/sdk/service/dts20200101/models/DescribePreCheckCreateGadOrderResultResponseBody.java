// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link DescribePreCheckCreateGadOrderResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePreCheckCreateGadOrderResultResponseBody</p>
 */
public class DescribePreCheckCreateGadOrderResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("PreCheckItems")
    private PreCheckItems preCheckItems;

    @com.aliyun.core.annotation.NameInMap("PreCheckResult")
    private Boolean preCheckResult;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private DescribePreCheckCreateGadOrderResultResponseBody(Builder builder) {
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.instanceId = builder.instanceId;
        this.preCheckItems = builder.preCheckItems;
        this.preCheckResult = builder.preCheckResult;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePreCheckCreateGadOrderResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
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
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return preCheckItems
     */
    public PreCheckItems getPreCheckItems() {
        return this.preCheckItems;
    }

    /**
     * @return preCheckResult
     */
    public Boolean getPreCheckResult() {
        return this.preCheckResult;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String dynamicCode; 
        private String dynamicMessage; 
        private String errCode; 
        private String errMessage; 
        private String httpStatusCode; 
        private String instanceId; 
        private PreCheckItems preCheckItems; 
        private Boolean preCheckResult; 
        private String regionId; 
        private String requestId; 
        private String success; 
        private String taskId; 

        private Builder() {
        } 

        private Builder(DescribePreCheckCreateGadOrderResultResponseBody model) {
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.instanceId = model.instanceId;
            this.preCheckItems = model.preCheckItems;
            this.preCheckResult = model.preCheckResult;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.success = model.success;
            this.taskId = model.taskId;
        } 

        /**
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
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
        public Builder httpStatusCode(String httpStatusCode) {
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
         * PreCheckItems.
         */
        public Builder preCheckItems(PreCheckItems preCheckItems) {
            this.preCheckItems = preCheckItems;
            return this;
        }

        /**
         * PreCheckResult.
         */
        public Builder preCheckResult(Boolean preCheckResult) {
            this.preCheckResult = preCheckResult;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public DescribePreCheckCreateGadOrderResultResponseBody build() {
            return new DescribePreCheckCreateGadOrderResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePreCheckCreateGadOrderResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePreCheckCreateGadOrderResultResponseBody</p>
     */
    public static class PreCheckItemsPreCheckItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private PreCheckItemsPreCheckItems(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreCheckItemsPreCheckItems create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String code; 
            private String message; 
            private String status; 

            private Builder() {
            } 

            private Builder(PreCheckItemsPreCheckItems model) {
                this.code = model.code;
                this.message = model.message;
                this.status = model.status;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public PreCheckItemsPreCheckItems build() {
                return new PreCheckItemsPreCheckItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePreCheckCreateGadOrderResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePreCheckCreateGadOrderResultResponseBody</p>
     */
    public static class PreCheckItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PreCheckItems")
        private java.util.List<PreCheckItemsPreCheckItems> preCheckItems;

        private PreCheckItems(Builder builder) {
            this.preCheckItems = builder.preCheckItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreCheckItems create() {
            return builder().build();
        }

        /**
         * @return preCheckItems
         */
        public java.util.List<PreCheckItemsPreCheckItems> getPreCheckItems() {
            return this.preCheckItems;
        }

        public static final class Builder {
            private java.util.List<PreCheckItemsPreCheckItems> preCheckItems; 

            private Builder() {
            } 

            private Builder(PreCheckItems model) {
                this.preCheckItems = model.preCheckItems;
            } 

            /**
             * PreCheckItems.
             */
            public Builder preCheckItems(java.util.List<PreCheckItemsPreCheckItems> preCheckItems) {
                this.preCheckItems = preCheckItems;
                return this;
            }

            public PreCheckItems build() {
                return new PreCheckItems(this);
            } 

        } 

    }
}
