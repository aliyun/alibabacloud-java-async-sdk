// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link ConvertDirectConversationToWorkResponseBody} extends {@link TeaModel}
 *
 * <p>ConvertDirectConversationToWorkResponseBody</p>
 */
public class ConvertDirectConversationToWorkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("conversionId")
    private String conversionId;

    @com.aliyun.core.annotation.NameInMap("convertedRounds")
    private Integer convertedRounds;

    @com.aliyun.core.annotation.NameInMap("historyScope")
    private String historyScope;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("retryable")
    private Boolean retryable;

    @com.aliyun.core.annotation.NameInMap("sourceEpoch")
    private Long sourceEpoch;

    @com.aliyun.core.annotation.NameInMap("sourceSessionId")
    private String sourceSessionId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("targetSessionId")
    private String targetSessionId;

    @com.aliyun.core.annotation.NameInMap("throughSequence")
    private Long throughSequence;

    @com.aliyun.core.annotation.NameInMap("workMode")
    private String workMode;

    private ConvertDirectConversationToWorkResponseBody(Builder builder) {
        this.code = builder.code;
        this.conversionId = builder.conversionId;
        this.convertedRounds = builder.convertedRounds;
        this.historyScope = builder.historyScope;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.retryable = builder.retryable;
        this.sourceEpoch = builder.sourceEpoch;
        this.sourceSessionId = builder.sourceSessionId;
        this.status = builder.status;
        this.targetSessionId = builder.targetSessionId;
        this.throughSequence = builder.throughSequence;
        this.workMode = builder.workMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConvertDirectConversationToWorkResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return conversionId
     */
    public String getConversionId() {
        return this.conversionId;
    }

    /**
     * @return convertedRounds
     */
    public Integer getConvertedRounds() {
        return this.convertedRounds;
    }

    /**
     * @return historyScope
     */
    public String getHistoryScope() {
        return this.historyScope;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return retryable
     */
    public Boolean getRetryable() {
        return this.retryable;
    }

    /**
     * @return sourceEpoch
     */
    public Long getSourceEpoch() {
        return this.sourceEpoch;
    }

    /**
     * @return sourceSessionId
     */
    public String getSourceSessionId() {
        return this.sourceSessionId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return targetSessionId
     */
    public String getTargetSessionId() {
        return this.targetSessionId;
    }

    /**
     * @return throughSequence
     */
    public Long getThroughSequence() {
        return this.throughSequence;
    }

    /**
     * @return workMode
     */
    public String getWorkMode() {
        return this.workMode;
    }

    public static final class Builder {
        private String code; 
        private String conversionId; 
        private Integer convertedRounds; 
        private String historyScope; 
        private String message; 
        private String requestId; 
        private Boolean retryable; 
        private Long sourceEpoch; 
        private String sourceSessionId; 
        private String status; 
        private String targetSessionId; 
        private Long throughSequence; 
        private String workMode; 

        private Builder() {
        } 

        private Builder(ConvertDirectConversationToWorkResponseBody model) {
            this.code = model.code;
            this.conversionId = model.conversionId;
            this.convertedRounds = model.convertedRounds;
            this.historyScope = model.historyScope;
            this.message = model.message;
            this.requestId = model.requestId;
            this.retryable = model.retryable;
            this.sourceEpoch = model.sourceEpoch;
            this.sourceSessionId = model.sourceSessionId;
            this.status = model.status;
            this.targetSessionId = model.targetSessionId;
            this.throughSequence = model.throughSequence;
            this.workMode = model.workMode;
        } 

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The session conversion record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleConversionId</p>
         */
        public Builder conversionId(String conversionId) {
            this.conversionId = conversionId;
            return this;
        }

        /**
         * <p>The number of converted conversation turns.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder convertedRounds(Integer convertedRounds) {
            this.convertedRounds = convertedRounds;
            return this;
        }

        /**
         * <p>The scope of the converted historical messages.</p>
         * 
         * <strong>example:</strong>
         * <p>direct</p>
         */
        public Builder historyScope(String historyScope) {
            this.historyScope = historyScope;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Specifies whether retries are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder retryable(Boolean retryable) {
            this.retryable = retryable;
            return this;
        }

        /**
         * <p>The source session version identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder sourceEpoch(Long sourceEpoch) {
            this.sourceEpoch = sourceEpoch;
            return this;
        }

        /**
         * <p>The source session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSourceSessionId</p>
         */
        public Builder sourceSessionId(String sourceSessionId) {
            this.sourceSessionId = sourceSessionId;
            return this;
        }

        /**
         * <p>The conversion status.</p>
         * 
         * <strong>example:</strong>
         * <p>succeeded</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The target work session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleTargetSessionId</p>
         */
        public Builder targetSessionId(String targetSessionId) {
            this.targetSessionId = targetSessionId;
            return this;
        }

        /**
         * <p>The cutoff message sequence number for the conversion.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder throughSequence(Long throughSequence) {
            this.throughSequence = throughSequence;
            return this;
        }

        /**
         * <p>The work session mode.</p>
         * 
         * <strong>example:</strong>
         * <p>work</p>
         */
        public Builder workMode(String workMode) {
            this.workMode = workMode;
            return this;
        }

        public ConvertDirectConversationToWorkResponseBody build() {
            return new ConvertDirectConversationToWorkResponseBody(this);
        } 

    } 

}
