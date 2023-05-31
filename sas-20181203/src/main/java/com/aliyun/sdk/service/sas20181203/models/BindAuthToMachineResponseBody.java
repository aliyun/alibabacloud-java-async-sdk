// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindAuthToMachineResponseBody} extends {@link TeaModel}
 *
 * <p>BindAuthToMachineResponseBody</p>
 */
public class BindAuthToMachineResponseBody extends TeaModel {
    @NameInMap("BindCount")
    private Integer bindCount;

    @NameInMap("InsufficientCoreCount")
    private Integer insufficientCoreCount;

    @NameInMap("InsufficientEcsCount")
    private Integer insufficientEcsCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResultCode")
    private Integer resultCode;

    @NameInMap("UnBindCount")
    private Integer unBindCount;

    private BindAuthToMachineResponseBody(Builder builder) {
        this.bindCount = builder.bindCount;
        this.insufficientCoreCount = builder.insufficientCoreCount;
        this.insufficientEcsCount = builder.insufficientEcsCount;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.unBindCount = builder.unBindCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindAuthToMachineResponseBody create() {
        return builder().build();
    }

    /**
     * @return bindCount
     */
    public Integer getBindCount() {
        return this.bindCount;
    }

    /**
     * @return insufficientCoreCount
     */
    public Integer getInsufficientCoreCount() {
        return this.insufficientCoreCount;
    }

    /**
     * @return insufficientEcsCount
     */
    public Integer getInsufficientEcsCount() {
        return this.insufficientEcsCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCode
     */
    public Integer getResultCode() {
        return this.resultCode;
    }

    /**
     * @return unBindCount
     */
    public Integer getUnBindCount() {
        return this.unBindCount;
    }

    public static final class Builder {
        private Integer bindCount; 
        private Integer insufficientCoreCount; 
        private Integer insufficientEcsCount; 
        private String requestId; 
        private Integer resultCode; 
        private Integer unBindCount; 

        /**
         * The number of bound servers.
         */
        public Builder bindCount(Integer bindCount) {
            this.bindCount = bindCount;
            return this;
        }

        /**
         * The shortage in the quota for cores of servers that can be protected.
         */
        public Builder insufficientCoreCount(Integer insufficientCoreCount) {
            this.insufficientCoreCount = insufficientCoreCount;
            return this;
        }

        /**
         * The shortage in the quota for servers that can be protected.
         */
        public Builder insufficientEcsCount(Integer insufficientEcsCount) {
            this.insufficientEcsCount = insufficientEcsCount;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status code that indicates the result. Valid values:
         * <p>
         * 
         * *   **0**: The servers are bound to or unbound from Security Center.
         * *   **1**: The values that you specified for the parameters are invalid.
         * *   **2**: The quota for servers that can be protected is insufficient.
         * *   **3**: The quota for cores of servers that can be protected is insufficient.
         */
        public Builder resultCode(Integer resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * The number of unbound servers.
         */
        public Builder unBindCount(Integer unBindCount) {
            this.unBindCount = unBindCount;
            return this;
        }

        public BindAuthToMachineResponseBody build() {
            return new BindAuthToMachineResponseBody(this);
        } 

    } 

}
