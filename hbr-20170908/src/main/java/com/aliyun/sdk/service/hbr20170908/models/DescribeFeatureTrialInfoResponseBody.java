// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link DescribeFeatureTrialInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFeatureTrialInfoResponseBody</p>
 */
public class DescribeFeatureTrialInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("FeatureEnabled")
    private Boolean featureEnabled;

    @com.aliyun.core.annotation.NameInMap("InTrialPeriod")
    private Boolean inTrialPeriod;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TrialExpireTime")
    private Long trialExpireTime;

    private DescribeFeatureTrialInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.featureEnabled = builder.featureEnabled;
        this.inTrialPeriod = builder.inTrialPeriod;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.trialExpireTime = builder.trialExpireTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFeatureTrialInfoResponseBody create() {
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
     * @return featureEnabled
     */
    public Boolean getFeatureEnabled() {
        return this.featureEnabled;
    }

    /**
     * @return inTrialPeriod
     */
    public Boolean getInTrialPeriod() {
        return this.inTrialPeriod;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return trialExpireTime
     */
    public Long getTrialExpireTime() {
        return this.trialExpireTime;
    }

    public static final class Builder {
        private String code; 
        private Boolean featureEnabled; 
        private Boolean inTrialPeriod; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Long trialExpireTime; 

        private Builder() {
        } 

        private Builder(DescribeFeatureTrialInfoResponseBody model) {
            this.code = model.code;
            this.featureEnabled = model.featureEnabled;
            this.inTrialPeriod = model.inTrialPeriod;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.trialExpireTime = model.trialExpireTime;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * FeatureEnabled.
         */
        public Builder featureEnabled(Boolean featureEnabled) {
            this.featureEnabled = featureEnabled;
            return this;
        }

        /**
         * InTrialPeriod.
         */
        public Builder inTrialPeriod(Boolean inTrialPeriod) {
            this.inTrialPeriod = inTrialPeriod;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TrialExpireTime.
         */
        public Builder trialExpireTime(Long trialExpireTime) {
            this.trialExpireTime = trialExpireTime;
            return this;
        }

        public DescribeFeatureTrialInfoResponseBody build() {
            return new DescribeFeatureTrialInfoResponseBody(this);
        } 

    } 

}
