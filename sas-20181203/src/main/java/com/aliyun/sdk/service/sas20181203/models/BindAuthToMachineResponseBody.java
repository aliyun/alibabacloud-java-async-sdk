// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link BindAuthToMachineResponseBody} extends {@link TeaModel}
 *
 * <p>BindAuthToMachineResponseBody</p>
 */
public class BindAuthToMachineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BindCount")
    private Integer bindCount;

    @com.aliyun.core.annotation.NameInMap("InsufficientCoreCount")
    private Integer insufficientCoreCount;

    @com.aliyun.core.annotation.NameInMap("InsufficientEcsCount")
    private Integer insufficientEcsCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private Integer resultCode;

    @com.aliyun.core.annotation.NameInMap("UnBindCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(BindAuthToMachineResponseBody model) {
            this.bindCount = model.bindCount;
            this.insufficientCoreCount = model.insufficientCoreCount;
            this.insufficientEcsCount = model.insufficientEcsCount;
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.unBindCount = model.unBindCount;
        } 

        /**
         * <p>The number of bound servers.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder bindCount(Integer bindCount) {
            this.bindCount = bindCount;
            return this;
        }

        /**
         * <p>The shortage in the quota for cores of servers that can be protected.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder insufficientCoreCount(Integer insufficientCoreCount) {
            this.insufficientCoreCount = insufficientCoreCount;
            return this;
        }

        /**
         * <p>The shortage in the quota for servers that can be protected.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder insufficientEcsCount(Integer insufficientEcsCount) {
            this.insufficientEcsCount = insufficientEcsCount;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>23AD0BD2-8771-5647-819E-6BA51E212F80</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status code that indicates the result. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The servers are bound to or unbound from Security Center.</li>
         * <li><strong>1</strong>: The values that you specified for the parameters are invalid.</li>
         * <li><strong>2</strong>: The quota for servers that can be protected is insufficient.</li>
         * <li><strong>3</strong>: The quota for cores of servers that can be protected is insufficient.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder resultCode(Integer resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * <p>The number of unbound servers.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
