// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportConversationDetailsRequest} extends {@link RequestModel}
 *
 * <p>ExportConversationDetailsRequest</p>
 */
public class ExportConversationDetailsRequest extends Request {
    @Query
    @NameInMap("BeginTimeLeftRange")
    private Long beginTimeLeftRange;

    @Query
    @NameInMap("BeginTimeRightRange")
    private Long beginTimeRightRange;

    @Query
    @NameInMap("CallingNumber")
    private String callingNumber;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Options")
    private java.util.List < String > options;

    @Query
    @NameInMap("RoundsLeftRange")
    private Integer roundsLeftRange;

    @Query
    @NameInMap("RoundsRightRange")
    private Integer roundsRightRange;

    private ExportConversationDetailsRequest(Builder builder) {
        super(builder);
        this.beginTimeLeftRange = builder.beginTimeLeftRange;
        this.beginTimeRightRange = builder.beginTimeRightRange;
        this.callingNumber = builder.callingNumber;
        this.instanceId = builder.instanceId;
        this.options = builder.options;
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
