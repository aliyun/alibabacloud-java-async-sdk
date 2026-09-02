// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link AgentDataSemanticsStageProgress} extends {@link TeaModel}
 *
 * <p>AgentDataSemanticsStageProgress</p>
 */
public class AgentDataSemanticsStageProgress extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Stage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stage;

    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    private AgentDataSemanticsStageProgress(Builder builder) {
        this.stage = builder.stage;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgentDataSemanticsStageProgress create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return stage
     */
    public String getStage() {
        return this.stage;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String stage; 
        private String status; 

        private Builder() {
        } 

        private Builder(AgentDataSemanticsStageProgress model) {
            this.stage = model.stage;
            this.status = model.status;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROFILE</p>
         */
        public Builder stage(String stage) {
            this.stage = stage;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public AgentDataSemanticsStageProgress build() {
            return new AgentDataSemanticsStageProgress(this);
        } 

    } 

}
