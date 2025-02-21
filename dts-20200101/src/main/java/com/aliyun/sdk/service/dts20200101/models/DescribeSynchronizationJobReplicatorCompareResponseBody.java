// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link DescribeSynchronizationJobReplicatorCompareResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSynchronizationJobReplicatorCompareResponseBody</p>
 */
public class DescribeSynchronizationJobReplicatorCompareResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("SynchronizationReplicatorCompareEnable")
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
         * <p>The error code returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The request processing has failed due to some unknown error.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E6EB407F-C59F-4682-A682-A00FA6A2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * <p>Indicates whether image matching is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Image matching is enabled.</li>
         * <li><strong>false</strong>: Image matching is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
