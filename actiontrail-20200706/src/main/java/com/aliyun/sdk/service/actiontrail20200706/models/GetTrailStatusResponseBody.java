// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link GetTrailStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetTrailStatusResponseBody</p>
 */
public class GetTrailStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsLogging")
    private Boolean isLogging;

    @com.aliyun.core.annotation.NameInMap("LatestDeliveryError")
    private String latestDeliveryError;

    @com.aliyun.core.annotation.NameInMap("LatestDeliveryLogServiceError")
    private String latestDeliveryLogServiceError;

    @com.aliyun.core.annotation.NameInMap("LatestDeliveryLogServiceTime")
    private String latestDeliveryLogServiceTime;

    @com.aliyun.core.annotation.NameInMap("LatestDeliveryTime")
    private String latestDeliveryTime;

    @com.aliyun.core.annotation.NameInMap("OssBucketStatus")
    private Boolean ossBucketStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SlsLogStoreStatus")
    private Boolean slsLogStoreStatus;

    @com.aliyun.core.annotation.NameInMap("StartLoggingTime")
    private String startLoggingTime;

    @com.aliyun.core.annotation.NameInMap("StopLoggingTime")
    private String stopLoggingTime;

    private GetTrailStatusResponseBody(Builder builder) {
        this.isLogging = builder.isLogging;
        this.latestDeliveryError = builder.latestDeliveryError;
        this.latestDeliveryLogServiceError = builder.latestDeliveryLogServiceError;
        this.latestDeliveryLogServiceTime = builder.latestDeliveryLogServiceTime;
        this.latestDeliveryTime = builder.latestDeliveryTime;
        this.ossBucketStatus = builder.ossBucketStatus;
        this.requestId = builder.requestId;
        this.slsLogStoreStatus = builder.slsLogStoreStatus;
        this.startLoggingTime = builder.startLoggingTime;
        this.stopLoggingTime = builder.stopLoggingTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrailStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isLogging
     */
    public Boolean getIsLogging() {
        return this.isLogging;
    }

    /**
     * @return latestDeliveryError
     */
    public String getLatestDeliveryError() {
        return this.latestDeliveryError;
    }

    /**
     * @return latestDeliveryLogServiceError
     */
    public String getLatestDeliveryLogServiceError() {
        return this.latestDeliveryLogServiceError;
    }

    /**
     * @return latestDeliveryLogServiceTime
     */
    public String getLatestDeliveryLogServiceTime() {
        return this.latestDeliveryLogServiceTime;
    }

    /**
     * @return latestDeliveryTime
     */
    public String getLatestDeliveryTime() {
        return this.latestDeliveryTime;
    }

    /**
     * @return ossBucketStatus
     */
    public Boolean getOssBucketStatus() {
        return this.ossBucketStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slsLogStoreStatus
     */
    public Boolean getSlsLogStoreStatus() {
        return this.slsLogStoreStatus;
    }

    /**
     * @return startLoggingTime
     */
    public String getStartLoggingTime() {
        return this.startLoggingTime;
    }

    /**
     * @return stopLoggingTime
     */
    public String getStopLoggingTime() {
        return this.stopLoggingTime;
    }

    public static final class Builder {
        private Boolean isLogging; 
        private String latestDeliveryError; 
        private String latestDeliveryLogServiceError; 
        private String latestDeliveryLogServiceTime; 
        private String latestDeliveryTime; 
        private Boolean ossBucketStatus; 
        private String requestId; 
        private Boolean slsLogStoreStatus; 
        private String startLoggingTime; 
        private String stopLoggingTime; 

        private Builder() {
        } 

        private Builder(GetTrailStatusResponseBody model) {
            this.isLogging = model.isLogging;
            this.latestDeliveryError = model.latestDeliveryError;
            this.latestDeliveryLogServiceError = model.latestDeliveryLogServiceError;
            this.latestDeliveryLogServiceTime = model.latestDeliveryLogServiceTime;
            this.latestDeliveryTime = model.latestDeliveryTime;
            this.ossBucketStatus = model.ossBucketStatus;
            this.requestId = model.requestId;
            this.slsLogStoreStatus = model.slsLogStoreStatus;
            this.startLoggingTime = model.startLoggingTime;
            this.stopLoggingTime = model.stopLoggingTime;
        } 

        /**
         * <p>Indicates whether logging is enabled for the trail. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isLogging(Boolean isLogging) {
            this.isLogging = isLogging;
            return this;
        }

        /**
         * <p>The log of the last failed delivery.</p>
         * 
         * <strong>example:</strong>
         * <p>write sls failed, exception: the parent of sub user must be project owner, itemscount: 1</p>
         */
        public Builder latestDeliveryError(String latestDeliveryError) {
            this.latestDeliveryError = latestDeliveryError;
            return this;
        }

        /**
         * <p>The log of the last failed delivery to Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>write sls failed, exception: the parent of sub user must be project owner, itemscount: 1</p>
         */
        public Builder latestDeliveryLogServiceError(String latestDeliveryLogServiceError) {
            this.latestDeliveryLogServiceError = latestDeliveryLogServiceError;
            return this;
        }

        /**
         * <p>The most recent time when an event was delivered to Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-26T09:19:44Z</p>
         */
        public Builder latestDeliveryLogServiceTime(String latestDeliveryLogServiceTime) {
            this.latestDeliveryLogServiceTime = latestDeliveryLogServiceTime;
            return this;
        }

        /**
         * <p>The most recent time when an event was delivered by the trail.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-26T09:19:44Z</p>
         */
        public Builder latestDeliveryTime(String latestDeliveryTime) {
            this.latestDeliveryTime = latestDeliveryTime;
            return this;
        }

        /**
         * <p>Indicates whether the destination Object Storage Service (OSS) bucket is available. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ossBucketStatus(Boolean ossBucketStatus) {
            this.ossBucketStatus = ossBucketStatus;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8067369B-B923-4D26-85BC-61BF33922505</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the destination Log Service Logstore is available. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder slsLogStoreStatus(Boolean slsLogStoreStatus) {
            this.slsLogStoreStatus = slsLogStoreStatus;
            return this;
        }

        /**
         * <p>The time when logging was last enabled for the trail.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-24T09:19:44Z</p>
         */
        public Builder startLoggingTime(String startLoggingTime) {
            this.startLoggingTime = startLoggingTime;
            return this;
        }

        /**
         * <p>The time when logging was last disabled for the trail.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-25T09:19:44Z</p>
         */
        public Builder stopLoggingTime(String stopLoggingTime) {
            this.stopLoggingTime = stopLoggingTime;
            return this;
        }

        public GetTrailStatusResponseBody build() {
            return new GetTrailStatusResponseBody(this);
        } 

    } 

}
