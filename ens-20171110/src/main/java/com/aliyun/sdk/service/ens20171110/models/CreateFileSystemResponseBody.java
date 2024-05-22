// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFileSystemResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFileSystemResponseBody</p>
 */
public class CreateFileSystemResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AllocationId")
    private java.util.List < String > allocationId;

    @com.aliyun.core.annotation.NameInMap("BizStatusCode")
    private String bizStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UnAllocationId")
    private java.util.List < String > unAllocationId;

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

    /**
     * @return allocationId
     */
    public java.util.List < String > getAllocationId() {
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
    public java.util.List < String > getUnAllocationId() {
        return this.unAllocationId;
    }

    public static final class Builder {
        private java.util.List < String > allocationId; 
        private String bizStatusCode; 
        private String requestId; 
        private java.util.List < String > unAllocationId; 

        /**
         * The information about the file system that was created.
         */
        public Builder allocationId(java.util.List < String > allocationId) {
            this.allocationId = allocationId;
            return this;
        }

        /**
         * The status code for successful operations. Valid values:
         * <p>
         * 
         * *   PartSuccess: The operation is partially successful.
         * *   AllSuccess: The operation is successful.
         */
        public Builder bizStatusCode(String bizStatusCode) {
            this.bizStatusCode = bizStatusCode;
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
         * The information about the file system that failed to be created.
         */
        public Builder unAllocationId(java.util.List < String > unAllocationId) {
            this.unAllocationId = unAllocationId;
            return this;
        }

        public CreateFileSystemResponseBody build() {
            return new CreateFileSystemResponseBody(this);
        } 

    } 

}
