// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeWebLockExclusiveFileTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebLockExclusiveFileTypeResponseBody</p>
 */
public class DescribeWebLockExclusiveFileTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExclusiveFileType")
    private java.util.List < String > exclusiveFileType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeWebLockExclusiveFileTypeResponseBody(Builder builder) {
        this.exclusiveFileType = builder.exclusiveFileType;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebLockExclusiveFileTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return exclusiveFileType
     */
    public java.util.List < String > getExclusiveFileType() {
        return this.exclusiveFileType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < String > exclusiveFileType; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * ExclusiveFileType.
         */
        public Builder exclusiveFileType(java.util.List < String > exclusiveFileType) {
            this.exclusiveFileType = exclusiveFileType;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeWebLockExclusiveFileTypeResponseBody build() {
            return new DescribeWebLockExclusiveFileTypeResponseBody(this);
        } 

    } 

}
