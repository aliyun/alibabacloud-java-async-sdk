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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CompletedTime.
         */
        public Builder completedTime(Long completedTime) {
            this.completedTime = completedTime;
            return this;
        }

        /**
         * CreatedTime.
         */
        public Builder createdTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
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
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Progress.
         */
        public Builder progress(Integer progress) {
            this.progress = progress;
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
         * Result.
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * UpdatedTime.
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
