// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAssistReportResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAssistReportResponseBody</p>
 */
public class DescribeAssistReportResponseBody extends TeaModel {
    @NameInMap("AssistDescription")
    private String assistDescription;

    @NameInMap("AssistId")
    private String assistId;

    @NameInMap("AssistReason")
    private String assistReason;

    @NameInMap("AssistResult")
    private String assistResult;

    @NameInMap("AssistTag")
    private String assistTag;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAssistReportResponseBody(Builder builder) {
        this.assistDescription = builder.assistDescription;
        this.assistId = builder.assistId;
        this.assistReason = builder.assistReason;
        this.assistResult = builder.assistResult;
        this.assistTag = builder.assistTag;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAssistReportResponseBody create() {
        return builder().build();
    }

    /**
     * @return assistDescription
     */
    public String getAssistDescription() {
        return this.assistDescription;
    }

    /**
     * @return assistId
     */
    public String getAssistId() {
        return this.assistId;
    }

    /**
     * @return assistReason
     */
    public String getAssistReason() {
        return this.assistReason;
    }

    /**
     * @return assistResult
     */
    public String getAssistResult() {
        return this.assistResult;
    }

    /**
     * @return assistTag
     */
    public String getAssistTag() {
        return this.assistTag;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String assistDescription; 
        private String assistId; 
        private String assistReason; 
        private String assistResult; 
        private String assistTag; 
        private String requestId; 

        /**
         * AssistDescription.
         */
        public Builder assistDescription(String assistDescription) {
            this.assistDescription = assistDescription;
            return this;
        }

        /**
         * AssistId.
         */
        public Builder assistId(String assistId) {
            this.assistId = assistId;
            return this;
        }

        /**
         * AssistReason.
         */
        public Builder assistReason(String assistReason) {
            this.assistReason = assistReason;
            return this;
        }

        /**
         * AssistResult.
         */
        public Builder assistResult(String assistResult) {
            this.assistResult = assistResult;
            return this;
        }

        /**
         * AssistTag.
         */
        public Builder assistTag(String assistTag) {
            this.assistTag = assistTag;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAssistReportResponseBody build() {
            return new DescribeAssistReportResponseBody(this);
        } 

    } 

}
