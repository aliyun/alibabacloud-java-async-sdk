// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLinkJobRequest} extends {@link RequestModel}
 *
 * <p>CreateLinkJobRequest</p>
 */
public class CreateLinkJobRequest extends Request {
    @Body
    @NameInMap("AutoConfirm")
    private Boolean autoConfirm;

    @Body
    @NameInMap("DoubleConvertStrategy")
    private String doubleConvertStrategy;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("JobId")
    private String jobId;

    @Body
    @NameInMap("SingleStrategy")
    private String singleStrategy;

    private CreateLinkJobRequest(Builder builder) {
        super(builder);
        this.autoConfirm = builder.autoConfirm;
        this.doubleConvertStrategy = builder.doubleConvertStrategy;
        this.instanceId = builder.instanceId;
        this.jobId = builder.jobId;
        this.singleStrategy = builder.singleStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLinkJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoConfirm
     */
    public Boolean getAutoConfirm() {
        return this.autoConfirm;
    }

    /**
     * @return doubleConvertStrategy
     */
    public String getDoubleConvertStrategy() {
        return this.doubleConvertStrategy;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return singleStrategy
     */
    public String getSingleStrategy() {
        return this.singleStrategy;
    }

    public static final class Builder extends Request.Builder<CreateLinkJobRequest, Builder> {
        private Boolean autoConfirm; 
        private String doubleConvertStrategy; 
        private String instanceId; 
        private String jobId; 
        private String singleStrategy; 

        private Builder() {
            super();
        } 

        private Builder(CreateLinkJobRequest request) {
            super(request);
            this.autoConfirm = request.autoConfirm;
            this.doubleConvertStrategy = request.doubleConvertStrategy;
            this.instanceId = request.instanceId;
            this.jobId = request.jobId;
            this.singleStrategy = request.singleStrategy;
        } 

        /**
         * 是否自动确认
         */
        public Builder autoConfirm(Boolean autoConfirm) {
            this.putBodyParameter("AutoConfirm", autoConfirm);
            this.autoConfirm = autoConfirm;
            return this;
        }

        /**
         * 双端链路转换策略
         */
        public Builder doubleConvertStrategy(String doubleConvertStrategy) {
            this.putBodyParameter("DoubleConvertStrategy", doubleConvertStrategy);
            this.doubleConvertStrategy = doubleConvertStrategy;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 任务ID
         */
        public Builder jobId(String jobId) {
            this.putBodyParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * 单端链路发现策略
         */
        public Builder singleStrategy(String singleStrategy) {
            this.putBodyParameter("SingleStrategy", singleStrategy);
            this.singleStrategy = singleStrategy;
            return this;
        }

        @Override
        public CreateLinkJobRequest build() {
            return new CreateLinkJobRequest(this);
        } 

    } 

}
