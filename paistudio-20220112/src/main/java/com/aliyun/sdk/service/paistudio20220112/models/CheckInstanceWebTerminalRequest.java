// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckInstanceWebTerminalRequest} extends {@link RequestModel}
 *
 * <p>CheckInstanceWebTerminalRequest</p>
 */
public class CheckInstanceWebTerminalRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TrainingJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trainingJobId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CheckInfo")
    private String checkInfo;

    private CheckInstanceWebTerminalRequest(Builder builder) {
        super(builder);
        this.trainingJobId = builder.trainingJobId;
        this.instanceId = builder.instanceId;
        this.checkInfo = builder.checkInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckInstanceWebTerminalRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return trainingJobId
     */
    public String getTrainingJobId() {
        return this.trainingJobId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return checkInfo
     */
    public String getCheckInfo() {
        return this.checkInfo;
    }

    public static final class Builder extends Request.Builder<CheckInstanceWebTerminalRequest, Builder> {
        private String trainingJobId; 
        private String instanceId; 
        private String checkInfo; 

        private Builder() {
            super();
        } 

        private Builder(CheckInstanceWebTerminalRequest request) {
            super(request);
            this.trainingJobId = request.trainingJobId;
            this.instanceId = request.instanceId;
            this.checkInfo = request.checkInfo;
        } 

        /**
         * TrainingJobId.
         */
        public Builder trainingJobId(String trainingJobId) {
            this.putPathParameter("TrainingJobId", trainingJobId);
            this.trainingJobId = trainingJobId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * CheckInfo.
         */
        public Builder checkInfo(String checkInfo) {
            this.putBodyParameter("CheckInfo", checkInfo);
            this.checkInfo = checkInfo;
            return this;
        }

        @Override
        public CheckInstanceWebTerminalRequest build() {
            return new CheckInstanceWebTerminalRequest(this);
        } 

    } 

}
