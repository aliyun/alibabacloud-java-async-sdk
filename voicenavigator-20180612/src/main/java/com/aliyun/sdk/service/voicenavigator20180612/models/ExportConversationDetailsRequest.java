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

    private ExportConversationDetailsRequest(Builder builder) {
        super(builder);
        this.beginTimeLeftRange = builder.beginTimeLeftRange;
        this.beginTimeRightRange = builder.beginTimeRightRange;
        this.callingNumber = builder.callingNumber;
        this.instanceId = builder.instanceId;
        this.options = builder.options;
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

    public static final class Builder extends Request.Builder<ExportConversationDetailsRequest, Builder> {
        private Long beginTimeLeftRange; 
        private Long beginTimeRightRange; 
        private String callingNumber; 
        private String instanceId; 
        private java.util.List < String > options; 

        private Builder() {
            super();
        } 

        private Builder(ExportConversationDetailsRequest response) {
            super(response);
            this.beginTimeLeftRange = response.beginTimeLeftRange;
            this.beginTimeRightRange = response.beginTimeRightRange;
            this.callingNumber = response.callingNumber;
            this.instanceId = response.instanceId;
            this.options = response.options;
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

        @Override
        public ExportConversationDetailsRequest build() {
            return new ExportConversationDetailsRequest(this);
        } 

    } 

}
