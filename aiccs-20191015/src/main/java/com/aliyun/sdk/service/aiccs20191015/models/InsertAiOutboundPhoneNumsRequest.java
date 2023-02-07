// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertAiOutboundPhoneNumsRequest} extends {@link RequestModel}
 *
 * <p>InsertAiOutboundPhoneNumsRequest</p>
 */
public class InsertAiOutboundPhoneNumsRequest extends Request {
    @Query
    @NameInMap("BatchVersion")
    private Integer batchVersion;

    @Query
    @NameInMap("Details")
    @Validation(required = true)
    private java.util.List < Details> details;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private Long taskId;

    private InsertAiOutboundPhoneNumsRequest(Builder builder) {
        super(builder);
        this.batchVersion = builder.batchVersion;
        this.details = builder.details;
        this.instanceId = builder.instanceId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertAiOutboundPhoneNumsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchVersion
     */
    public Integer getBatchVersion() {
        return this.batchVersion;
    }

    /**
     * @return details
     */
    public java.util.List < Details> getDetails() {
        return this.details;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<InsertAiOutboundPhoneNumsRequest, Builder> {
        private Integer batchVersion; 
        private java.util.List < Details> details; 
        private String instanceId; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(InsertAiOutboundPhoneNumsRequest request) {
            super(request);
            this.batchVersion = request.batchVersion;
            this.details = request.details;
            this.instanceId = request.instanceId;
            this.taskId = request.taskId;
        } 

        /**
         * 任务批次号（不填则导入到默认批次）
         */
        public Builder batchVersion(Integer batchVersion) {
            this.putQueryParameter("BatchVersion", batchVersion);
            this.batchVersion = batchVersion;
            return this;
        }

        /**
         * 号码详情(至多30条)
         */
        public Builder details(java.util.List < Details> details) {
            String detailsShrink = shrink(details, "Details", "json");
            this.putQueryParameter("Details", detailsShrink);
            this.details = details;
            return this;
        }

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 任务id
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public InsertAiOutboundPhoneNumsRequest build() {
            return new InsertAiOutboundPhoneNumsRequest(this);
        } 

    } 

    public static class Details extends TeaModel {
        @NameInMap("BizData")
        private String bizData;

        @NameInMap("PhoneNum")
        private String phoneNum;

        private Details(Builder builder) {
            this.bizData = builder.bizData;
            this.phoneNum = builder.phoneNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
            return builder().build();
        }

        /**
         * @return bizData
         */
        public String getBizData() {
            return this.bizData;
        }

        /**
         * @return phoneNum
         */
        public String getPhoneNum() {
            return this.phoneNum;
        }

        public static final class Builder {
            private String bizData; 
            private String phoneNum; 

            /**
             * 自定义信息
             */
            public Builder bizData(String bizData) {
                this.bizData = bizData;
                return this;
            }

            /**
             * 手机号
             */
            public Builder phoneNum(String phoneNum) {
                this.phoneNum = phoneNum;
                return this;
            }

            public Details build() {
                return new Details(this);
            } 

        } 

    }
}
