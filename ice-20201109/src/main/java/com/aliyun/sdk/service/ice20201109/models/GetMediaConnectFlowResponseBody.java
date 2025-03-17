// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetMediaConnectFlowResponseBody} extends {@link TeaModel}
 *
 * <p>GetMediaConnectFlowResponseBody</p>
 */
public class GetMediaConnectFlowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Retcode")
    private Integer retcode;

    private GetMediaConnectFlowResponseBody(Builder builder) {
        this.content = builder.content;
        this.description = builder.description;
        this.requestId = builder.requestId;
        this.retcode = builder.retcode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaConnectFlowResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return retcode
     */
    public Integer getRetcode() {
        return this.retcode;
    }

    public static final class Builder {
        private Content content; 
        private String description; 
        private String requestId; 
        private Integer retcode; 

        private Builder() {
        } 

        private Builder(GetMediaConnectFlowResponseBody model) {
            this.content = model.content;
            this.description = model.description;
            this.requestId = model.requestId;
            this.retcode = model.retcode;
        } 

        /**
         * <p>The response body.</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The call description.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>FB503AEF-118E-1516-89E2-7B227EA1AC20</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned code. A value of 0 indicates the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder retcode(Integer retcode) {
            this.retcode = retcode;
            return this;
        }

        public GetMediaConnectFlowResponseBody build() {
            return new GetMediaConnectFlowResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMediaConnectFlowResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaConnectFlowResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("FlowId")
        private String flowId;

        @com.aliyun.core.annotation.NameInMap("FlowName")
        private String flowName;

        @com.aliyun.core.annotation.NameInMap("FlowStatus")
        private String flowStatus;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private Content(Builder builder) {
            this.createTime = builder.createTime;
            this.flowId = builder.flowId;
            this.flowName = builder.flowName;
            this.flowStatus = builder.flowStatus;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return flowId
         */
        public String getFlowId() {
            return this.flowId;
        }

        /**
         * @return flowName
         */
        public String getFlowName() {
            return this.flowName;
        }

        /**
         * @return flowStatus
         */
        public String getFlowStatus() {
            return this.flowStatus;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String createTime; 
            private String flowId; 
            private String flowName; 
            private String flowStatus; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.createTime = model.createTime;
                this.flowId = model.flowId;
                this.flowName = model.flowName;
                this.flowStatus = model.flowStatus;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The time when the flow was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-18T01:29:24Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The flow ID.</p>
             * 
             * <strong>example:</strong>
             * <p>34900dc6-90ec-4968-af3c-fcd87f231a5f</p>
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * <p>The flow name.</p>
             * 
             * <strong>example:</strong>
             * <p>AliTestFlow</p>
             */
            public Builder flowName(String flowName) {
                this.flowName = flowName;
                return this;
            }

            /**
             * <p>The state of the flow.</p>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder flowStatus(String flowStatus) {
                this.flowStatus = flowStatus;
                return this;
            }

            /**
             * <p>The time when the flow is started.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-18T01:39:24Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
