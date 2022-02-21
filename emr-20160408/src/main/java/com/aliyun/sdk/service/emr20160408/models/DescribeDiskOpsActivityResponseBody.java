// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiskOpsActivityResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiskOpsActivityResponseBody</p>
 */
public class DescribeDiskOpsActivityResponseBody extends TeaModel {
    @NameInMap("ActivityState")
    private String activityState;

    @NameInMap("ClusterType")
    private String clusterType;

    @NameInMap("CurrentActivity")
    private String currentActivity;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("NeedReboot")
    private Boolean needReboot;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDiskOpsActivityResponseBody(Builder builder) {
        this.activityState = builder.activityState;
        this.clusterType = builder.clusterType;
        this.currentActivity = builder.currentActivity;
        this.errorMessage = builder.errorMessage;
        this.needReboot = builder.needReboot;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiskOpsActivityResponseBody create() {
        return builder().build();
    }

    /**
     * @return activityState
     */
    public String getActivityState() {
        return this.activityState;
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return currentActivity
     */
    public String getCurrentActivity() {
        return this.currentActivity;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return needReboot
     */
    public Boolean getNeedReboot() {
        return this.needReboot;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String activityState; 
        private String clusterType; 
        private String currentActivity; 
        private String errorMessage; 
        private Boolean needReboot; 
        private String requestId; 

        /**
         * ActivityState.
         */
        public Builder activityState(String activityState) {
            this.activityState = activityState;
            return this;
        }

        /**
         * ClusterType.
         */
        public Builder clusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }

        /**
         * CurrentActivity.
         */
        public Builder currentActivity(String currentActivity) {
            this.currentActivity = currentActivity;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * NeedReboot.
         */
        public Builder needReboot(Boolean needReboot) {
            this.needReboot = needReboot;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDiskOpsActivityResponseBody build() {
            return new DescribeDiskOpsActivityResponseBody(this);
        } 

    } 

}
