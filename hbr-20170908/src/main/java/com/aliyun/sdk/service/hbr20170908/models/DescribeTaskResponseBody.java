// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTaskResponseBody</p>
 */
public class DescribeTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("CompletedTime")
    private Long completedTime;

    @NameInMap("CreatedTime")
    private Long createdTime;

    @NameInMap("Description")
    private String description;

    @NameInMap("Message")
    private String message;

    @NameInMap("Name")
    private String name;

    @NameInMap("Progress")
    private Integer progress;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private String result;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("UpdatedTime")
    private Long updatedTime;

    private DescribeTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.completedTime = builder.completedTime;
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.message = builder.message;
        this.name = builder.name;
        this.progress = builder.progress;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
        this.updatedTime = builder.updatedTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return completedTime
     */
    public Long getCompletedTime() {
        return this.completedTime;
    }

    /**
     * @return createdTime
     */
    public Long getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return progress
     */
    public Integer getProgress() {
        return this.progress;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public String getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return updatedTime
     */
    public Long getUpdatedTime() {
        return this.updatedTime;
    }

    public static final class Builder {
        private String code; 
        private Long completedTime; 
        private Long createdTime; 
        private String description; 
        private String message; 
        private String name; 
        private Integer progress; 
        private String requestId; 
        private String result; 
        private Boolean success; 
        private Long updatedTime; 

        /**
         * HttpCode
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The time when the job was completed. This value is a UNIX timestamp. Unit: seconds.
         */
        public Builder completedTime(Long completedTime) {
            this.completedTime = completedTime;
            return this;
        }

        /**
         * The time when the job was created. This value is a UNIX timestamp. Unit: seconds.
         */
        public Builder createdTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * The status of the job. Valid values:
         * <p>
         * 
         * *   **created**: The job is created.
         * *   **expired**: The job expires.
         * *   **completed**: The job is completed.
         * *   **cancelled**: The job is canceled.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The message that is returned. If the call is successful, "successful" is returned. If the call fails, an error message is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The name of the job.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The progress of the job. Valid values: 0 to 100. Unit: percentage (%). If the job fails, the value -1 is returned.
         */
        public Builder progress(Integer progress) {
            this.progress = progress;
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
         * The result of the job.
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        /**
         * Indicates whether the call is successful.
         * <p>
         * 
         * *   true: The call is successful.
         * *   false: The call fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The time when the job was updated. This value is a UNIX timestamp. Unit: seconds.
         */
        public Builder updatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }

        public DescribeTaskResponseBody build() {
            return new DescribeTaskResponseBody(this);
        } 

    } 

}
