// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportConversationDetailsRequest} extends {@link RequestModel}
 *
 * <p>ExportConversationDetailsRequest</p>
 */
public class ExportConversationDetailsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTimeLeftRange")
    private Long beginTimeLeftRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTimeRightRange")
    private Long beginTimeRightRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallingNumber")
    private String callingNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Options")
    private java.util.List < String > options;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Result")
    private Integer result;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoundsLeftRange")
    private Integer roundsLeftRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoundsRightRange")
    private Integer roundsRightRange;

    private ExportConversationDetailsRequest(Builder builder) {
        super(builder);
        this.beginTimeLeftRange = builder.beginTimeLeftRange;
        this.beginTimeRightRange = builder.beginTimeRightRange;
        this.callingNumber = builder.callingNumber;
        this.instanceId = builder.instanceId;
        this.options = builder.options;
        this.result = builder.result;
        this.roundsLeftRange = builder.roundsLeftRange;
        this.roundsRightRange = builder.roundsRightRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportConversationDetailsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginTimeLeftRange
     */
    public Long getBeginTimeLeftRange() {
        return this.beginTimeLeftRange;
    }

    /**
     * @return beginTimeRightRange
     */
    public Long getBeginTimeRightRange() {
        return this.beginTimeRightRange;
    }

    /**
     * @return callingNumber
     */
    public String getCallingNumber() {
        return this.callingNumber;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return options
     */
    public java.util.List < String > getOptions() {
        return this.options;
    }

    /**
     * @return result
     */
    public Integer getResult() {
        return this.result;
    }

    /**
     * @return roundsLeftRange
     */
    public Integer getRoundsLeftRange() {
        return this.roundsLeftRange;
    }

    /**
     * @return roundsRightRange
     */
    public Integer getRoundsRightRange() {
        return this.roundsRightRange;
    }

    public static final class Builder extends Request.Builder<ExportConversationDetailsRequest, Builder> {
        private Long beginTimeLeftRange; 
        private Long beginTimeRightRange; 
        private String callingNumber; 
        private String instanceId; 
        private java.util.List < String > options; 
        private Integer result; 
        private Integer roundsLeftRange; 
        private Integer roundsRightRange; 

        private Builder() {
            super();
        } 

        private Builder(ExportConversationDetailsRequest request) {
            super(request);
            this.beginTimeLeftRange = request.beginTimeLeftRange;
            this.beginTimeRightRange = request.beginTimeRightRange;
            this.callingNumber = request.callingNumber;
            this.instanceId = request.instanceId;
            this.options = request.options;
            this.result = request.result;
            this.roundsLeftRange = request.roundsLeftRange;
            this.roundsRightRange = request.roundsRightRange;
        } 

        /**
         * BeginTimeLeftRange.
         */
        public Builder beginTimeLeftRange(Long beginTimeLeftRange) {
            this.putQueryParameter("BeginTimeLeftRange", beginTimeLeftRange);
            this.beginTimeLeftRange = beginTimeLeftRange;
            return this;
        }

        /**
         * BeginTimeRightRange.
         */
        public Builder beginTimeRightRange(Long beginTimeRightRange) {
            this.putQueryParameter("BeginTimeRightRange", beginTimeRightRange);
            this.beginTimeRightRange = beginTimeRightRange;
            return this;
        }

        /**
         * CallingNumber.
         */
        public Builder callingNumber(String callingNumber) {
            this.putQueryParameter("CallingNumber", callingNumber);
            this.callingNumber = callingNumber;
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
         * Options.
         */
        public Builder options(java.util.List < String > options) {
            this.putQueryParameter("Options", options);
            this.options = options;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Integer result) {
            this.putQueryParameter("Result", result);
            this.result = result;
            return this;
        }

        /**
         * RoundsLeftRange.
         */
        public Builder roundsLeftRange(Integer roundsLeftRange) {
            this.putQueryParameter("RoundsLeftRange", roundsLeftRange);
            this.roundsLeftRange = roundsLeftRange;
            return this;
        }

        /**
         * RoundsRightRange.
         */
        public Builder roundsRightRange(Integer roundsRightRange) {
            this.putQueryParameter("RoundsRightRange", roundsRightRange);
            this.roundsRightRange = roundsRightRange;
            return this;
        }

        @Override
        public ExportConversationDetailsRequest build() {
            return new ExportConversationDetailsRequest(this);
        } 

    } 

}
