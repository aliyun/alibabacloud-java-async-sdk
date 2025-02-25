// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PipelineTriggerEventStatus} extends {@link TeaModel}
 *
 * <p>PipelineTriggerEventStatus</p>
 */
public class PipelineTriggerEventStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("firedPipelineName")
    private String firedPipelineName;

    @com.aliyun.core.annotation.NameInMap("releaseDetail")
    private ReleaseDetail releaseDetail;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private PipelineTriggerEventStatus(Builder builder) {
        this.errorMessage = builder.errorMessage;
        this.firedPipelineName = builder.firedPipelineName;
        this.releaseDetail = builder.releaseDetail;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PipelineTriggerEventStatus create() {
        return builder().build();
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return firedPipelineName
     */
    public String getFiredPipelineName() {
        return this.firedPipelineName;
    }

    /**
     * @return releaseDetail
     */
    public ReleaseDetail getReleaseDetail() {
        return this.releaseDetail;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String errorMessage; 
        private String firedPipelineName; 
        private ReleaseDetail releaseDetail; 
        private String status; 

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * firedPipelineName.
         */
        public Builder firedPipelineName(String firedPipelineName) {
            this.firedPipelineName = firedPipelineName;
            return this;
        }

        /**
         * releaseDetail.
         */
        public Builder releaseDetail(ReleaseDetail releaseDetail) {
            this.releaseDetail = releaseDetail;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public PipelineTriggerEventStatus build() {
            return new PipelineTriggerEventStatus(this);
        } 

    } 

}
