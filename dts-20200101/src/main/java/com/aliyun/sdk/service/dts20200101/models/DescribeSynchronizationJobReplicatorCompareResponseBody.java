// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSynchronizationJobReplicatorCompareResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSynchronizationJobReplicatorCompareResponseBody</p>
 */
public class DescribeSynchronizationJobReplicatorCompareResponseBody extends TeaModel {
    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    @NameInMap("SynchronizationReplicatorCompareEnable")
    private Boolean synchronizationReplicatorCompareEnable;

    private DescribeSynchronizationJobReplicatorCompareResponseBody(Builder builder) {
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.synchronizationReplicatorCompareEnable = builder.synchronizationReplicatorCompareEnable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSynchronizationJobReplicatorCompareResponseBody create() {
        return builder().build();
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
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
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return synchronizationReplicatorCompareEnable
     */
    public Boolean getSynchronizationReplicatorCompareEnable() {
        return this.synchronizationReplicatorCompareEnable;
    }

    public static final class Builder {
        private String errCode; 
        private String errMessage; 
        private String requestId; 
        private String success; 
        private Boolean synchronizationReplicatorCompareEnable; 

        /**
         * The error code returned if the call failed.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * The error message returned if the call failed.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call was successful.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * Indicates whether image matching is enabled. Valid values:
         * <p>
         * 
         * *   **true**: Image matching is enabled.
         * *   **false**: Image matching is disabled.
         */
        public Builder synchronizationReplicatorCompareEnable(Boolean synchronizationReplicatorCompareEnable) {
            this.synchronizationReplicatorCompareEnable = synchronizationReplicatorCompareEnable;
            return this;
        }

        public DescribeSynchronizationJobReplicatorCompareResponseBody build() {
            return new DescribeSynchronizationJobReplicatorCompareResponseBody(this);
        } 

    } 

}
