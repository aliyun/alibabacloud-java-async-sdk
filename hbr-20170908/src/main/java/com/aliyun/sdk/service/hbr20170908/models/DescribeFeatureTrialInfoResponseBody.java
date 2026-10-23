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
         * <p>The return code. The value 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether the feature is activated. The value false is returned if the feature is not activated. In this case, InTrialPeriod is false and TrialExpireTime is 0.</p>
         */
        public Builder featureEnabled(Boolean featureEnabled) {
            this.featureEnabled = featureEnabled;
            return this;
        }

        /**
         * <p>Indicates whether the feature is within the free trial period. The value false is returned if the feature is not activated or the free trial has expired.</p>
         */
        public Builder inTrialPeriod(Boolean inTrialPeriod) {
            this.inTrialPeriod = inTrialPeriod;
            return this;
        }

        /**
         * <p>The returned message. The value &quot;successful&quot; is returned upon success. An error message is returned upon failure.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The expiration time of the free trial. The value is a UNIX timestamp, in seconds. The value 0 is returned if the feature is not activated.</p>
         * 
         * <strong>example:</strong>
         * <p>1584597600</p>
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
