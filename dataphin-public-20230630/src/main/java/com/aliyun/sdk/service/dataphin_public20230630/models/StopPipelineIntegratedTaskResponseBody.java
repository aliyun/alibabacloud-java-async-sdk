// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link StopPipelineIntegratedTaskResponseBody} extends {@link TeaModel}
 *
 * <p>StopPipelineIntegratedTaskResponseBody</p>
 */
public class StopPipelineIntegratedTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private StopPipelineIntegratedTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopPipelineIntegratedTaskResponseBody create() {
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
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(StopPipelineIntegratedTaskResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
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
        public Builder data(Data data) {
            this.data = data;
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

        public StopPipelineIntegratedTaskResponseBody build() {
            return new StopPipelineIntegratedTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link StopPipelineIntegratedTaskResponseBody} extends {@link TeaModel}
     *
     * <p>StopPipelineIntegratedTaskResponseBody</p>
     */
    public static class DevOpsActionResDTOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DevOpsActionResDTOList(Builder builder) {
            this.jobName = builder.jobName;
            this.owner = builder.owner;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DevOpsActionResDTOList create() {
            return builder().build();
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String jobName; 
            private String owner; 
            private String status; 

            private Builder() {
            } 

            private Builder(DevOpsActionResDTOList model) {
                this.jobName = model.jobName;
                this.owner = model.owner;
                this.status = model.status;
            } 

            /**
             * JobName.
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DevOpsActionResDTOList build() {
                return new DevOpsActionResDTOList(this);
            } 

        } 

    }
    /**
     * 
     * {@link StopPipelineIntegratedTaskResponseBody} extends {@link TeaModel}
     *
     * <p>StopPipelineIntegratedTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DevOpsActionResDTOList")
        private java.util.List<DevOpsActionResDTOList> devOpsActionResDTOList;

        @com.aliyun.core.annotation.NameInMap("Fail")
        private Long fail;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Long success;

        private Data(Builder builder) {
            this.devOpsActionResDTOList = builder.devOpsActionResDTOList;
            this.fail = builder.fail;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return devOpsActionResDTOList
         */
        public java.util.List<DevOpsActionResDTOList> getDevOpsActionResDTOList() {
            return this.devOpsActionResDTOList;
        }

        /**
         * @return fail
         */
        public Long getFail() {
            return this.fail;
        }

        /**
         * @return success
         */
        public Long getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private java.util.List<DevOpsActionResDTOList> devOpsActionResDTOList; 
            private Long fail; 
            private Long success; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.devOpsActionResDTOList = model.devOpsActionResDTOList;
                this.fail = model.fail;
                this.success = model.success;
            } 

            /**
             * DevOpsActionResDTOList.
             */
            public Builder devOpsActionResDTOList(java.util.List<DevOpsActionResDTOList> devOpsActionResDTOList) {
                this.devOpsActionResDTOList = devOpsActionResDTOList;
                return this;
            }

            /**
             * Fail.
             */
            public Builder fail(Long fail) {
                this.fail = fail;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
