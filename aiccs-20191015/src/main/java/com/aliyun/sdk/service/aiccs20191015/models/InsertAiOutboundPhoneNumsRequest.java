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
 * {@link InsertAiOutboundPhoneNumsRequest} extends {@link RequestModel}
 *
 * <p>InsertAiOutboundPhoneNumsRequest</p>
 */
public class InsertAiOutboundPhoneNumsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchVersion")
    private Integer batchVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Details")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Details> details;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public java.util.List<Details> getDetails() {
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
        private java.util.List<Details> details; 
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
         * <p>The task batch number.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the numbers are imported to the default batch.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder batchVersion(Integer batchVersion) {
            this.putQueryParameter("BatchVersion", batchVersion);
            this.batchVersion = batchVersion;
            return this;
        }

        /**
         * <p>The number details.</p>
         * <blockquote>
         * <p>A maximum of 30 entries are supported.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        public Builder details(java.util.List<Details> details) {
            String detailsShrink = shrink(details, "Details", "json");
            this.putQueryParameter("Details", detailsShrink);
            this.details = details;
            return this;
        }

        /**
         * <p>The AICCS instance ID.
         * You can obtain the instance ID in the <b>Instances</b> section of the left-side navigation pane in the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agent_***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/312260.html">CreateAiOutboundTask</a> operation and view the <strong>Data</strong> response parameter, or call the <a href="https://help.aliyun.com/document_detail/2718026.html">GetAiOutboundTaskList</a> operation and view the <strong>TaskId</strong> response parameter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
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

    /**
     * 
     * {@link InsertAiOutboundPhoneNumsRequest} extends {@link TeaModel}
     *
     * <p>InsertAiOutboundPhoneNumsRequest</p>
     */
    public static class Details extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizData")
        private String bizData;

        @com.aliyun.core.annotation.NameInMap("PhoneNum")
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

            private Builder() {
            } 

            private Builder(Details model) {
                this.bizData = model.bizData;
                this.phoneNum = model.phoneNum;
            } 

            /**
             * <p>The custom business information.</p>
             * 
             * <strong>example:</strong>
             * <p>ioi-qerhne-hoz-114c</p>
             */
            public Builder bizData(String bizData) {
                this.bizData = bizData;
                return this;
            }

            /**
             * <p>The outbound called number.</p>
             * 
             * <strong>example:</strong>
             * <p>150****0000</p>
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
