// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link CreateFileSystemResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFileSystemResponseBody</p>
 */
public class CreateFileSystemResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AllocationId")
    private java.util.List<String> allocationId;

    @com.aliyun.core.annotation.NameInMap("BizStatusCode")
    private String bizStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UnAllocationId")
    private java.util.List<String> unAllocationId;

    private CreateFileSystemResponseBody(Builder builder) {
        this.allocationId = builder.allocationId;
        this.bizStatusCode = builder.bizStatusCode;
        this.requestId = builder.requestId;
        this.unAllocationId = builder.unAllocationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFileSystemResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allocationId
     */
    public java.util.List<String> getAllocationId() {
        return this.allocationId;
    }

    /**
     * @return bizStatusCode
     */
    public String getBizStatusCode() {
        return this.bizStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return unAllocationId
     */
    public java.util.List<String> getUnAllocationId() {
        return this.unAllocationId;
    }

    public static final class Builder {
        private java.util.List<String> allocationId; 
        private String bizStatusCode; 
        private String requestId; 
        private java.util.List<String> unAllocationId; 

        private Builder() {
        } 

        private Builder(CreateFileSystemResponseBody model) {
            this.allocationId = model.allocationId;
            this.bizStatusCode = model.bizStatusCode;
            this.requestId = model.requestId;
            this.unAllocationId = model.unAllocationId;
        } 

        /**
         * <p>The information about the file system that was created.</p>
         */
        public Builder allocationId(java.util.List<String> allocationId) {
            this.allocationId = allocationId;
            return this;
        }

        /**
         * <p>The status code for successful operations. Valid values:</p>
         * <ul>
         * <li>PartSuccess: The operation is partially successful.</li>
         * <li>AllSuccess: The operation is successful.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PartSuccess</p>
         */
        public Builder bizStatusCode(String bizStatusCode) {
            this.bizStatusCode = bizStatusCode;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the file system that failed to be created.</p>
         */
        public Builder unAllocationId(java.util.List<String> unAllocationId) {
            this.unAllocationId = unAllocationId;
            return this;
        }

        public CreateFileSystemResponseBody build() {
            return new CreateFileSystemResponseBody(this);
        } 

    } 

}
