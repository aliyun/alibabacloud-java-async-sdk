// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link GetQualityProjectLogResponseBody} extends {@link TeaModel}
 *
 * <p>GetQualityProjectLogResponseBody</p>
 */
public class GetQualityProjectLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetQualityProjectLogResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQualityProjectLogResponseBody create() {
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
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetQualityProjectLogResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
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

        public GetQualityProjectLogResponseBody build() {
            return new GetQualityProjectLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetQualityProjectLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityProjectLogResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionData")
        private String actionData;

        @com.aliyun.core.annotation.NameInMap("ActionTime")
        private String actionTime;

        @com.aliyun.core.annotation.NameInMap("ActionType")
        private String actionType;

        @com.aliyun.core.annotation.NameInMap("ProjectCreateTime")
        private String projectCreateTime;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        private Data(Builder builder) {
            this.actionData = builder.actionData;
            this.actionTime = builder.actionTime;
            this.actionType = builder.actionType;
            this.projectCreateTime = builder.projectCreateTime;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return actionData
         */
        public String getActionData() {
            return this.actionData;
        }

        /**
         * @return actionTime
         */
        public String getActionTime() {
            return this.actionTime;
        }

        /**
         * @return actionType
         */
        public String getActionType() {
            return this.actionType;
        }

        /**
         * @return projectCreateTime
         */
        public String getProjectCreateTime() {
            return this.projectCreateTime;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private String actionData; 
            private String actionTime; 
            private String actionType; 
            private String projectCreateTime; 
            private Long projectId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.actionData = model.actionData;
                this.actionTime = model.actionTime;
                this.actionType = model.actionType;
                this.projectCreateTime = model.projectCreateTime;
                this.projectId = model.projectId;
            } 

            /**
             * ActionData.
             */
            public Builder actionData(String actionData) {
                this.actionData = actionData;
                return this;
            }

            /**
             * ActionTime.
             */
            public Builder actionTime(String actionTime) {
                this.actionTime = actionTime;
                return this;
            }

            /**
             * ActionType.
             */
            public Builder actionType(String actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * ProjectCreateTime.
             */
            public Builder projectCreateTime(String projectCreateTime) {
                this.projectCreateTime = projectCreateTime;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
