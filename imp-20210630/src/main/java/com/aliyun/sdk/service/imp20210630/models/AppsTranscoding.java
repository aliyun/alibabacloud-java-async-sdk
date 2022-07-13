// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AppsTranscoding} extends {@link TeaModel}
 *
 * <p>AppsTranscoding</p>
 */
public class AppsTranscoding extends TeaModel {
    @NameInMap("FlowId")
    private String flowId;

    @NameInMap("Type")
    private String type;

    private AppsTranscoding(Builder builder) {
        this.flowId = builder.flowId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppsTranscoding create() {
        return builder().build();
    }

    /**
     * @return flowId
     */
    public String getFlowId() {
        return this.flowId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String flowId; 
        private String type; 

        /**
         * FlowId.
         */
        public Builder flowId(String flowId) {
            this.flowId = flowId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public AppsTranscoding build() {
            return new AppsTranscoding(this);
        } 

    } 

}
