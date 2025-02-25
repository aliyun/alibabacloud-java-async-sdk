// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.buss20220822.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserInvestigationInfoQueryTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateUserInvestigationInfoQueryTaskRequest</p>
 */
public class CreateUserInvestigationInfoQueryTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("employeeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String employeeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ossFileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ossFileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("userId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private CreateUserInvestigationInfoQueryTaskRequest(Builder builder) {
        super(builder);
        this.dataType = builder.dataType;
        this.employeeId = builder.employeeId;
        this.endTime = builder.endTime;
        this.ossFileName = builder.ossFileName;
        this.startTime = builder.startTime;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserInvestigationInfoQueryTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return employeeId
     */
    public String getEmployeeId() {
        return this.employeeId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return ossFileName
     */
    public String getOssFileName() {
        return this.ossFileName;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CreateUserInvestigationInfoQueryTaskRequest, Builder> {
        private String dataType; 
        private String employeeId; 
        private Long endTime; 
        private String ossFileName; 
        private Long startTime; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserInvestigationInfoQueryTaskRequest request) {
            super(request);
            this.dataType = request.dataType;
            this.employeeId = request.employeeId;
            this.endTime = request.endTime;
            this.ossFileName = request.ossFileName;
            this.startTime = request.startTime;
            this.userId = request.userId;
        } 

        /**
         * dataType.
         */
        public Builder dataType(String dataType) {
            this.putQueryParameter("dataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * employeeId.
         */
        public Builder employeeId(String employeeId) {
            this.putQueryParameter("employeeId", employeeId);
            this.employeeId = employeeId;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * ossFileName.
         */
        public Builder ossFileName(String ossFileName) {
            this.putQueryParameter("ossFileName", ossFileName);
            this.ossFileName = ossFileName;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public CreateUserInvestigationInfoQueryTaskRequest build() {
            return new CreateUserInvestigationInfoQueryTaskRequest(this);
        } 

    } 

}
