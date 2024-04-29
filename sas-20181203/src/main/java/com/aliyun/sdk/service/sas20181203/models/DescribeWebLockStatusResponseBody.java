// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebLockStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebLockStatusResponseBody</p>
 */
public class DescribeWebLockStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthCount")
    private Integer authCount;

    @com.aliyun.core.annotation.NameInMap("BindCount")
    private Integer bindCount;

    @com.aliyun.core.annotation.NameInMap("BlockCount")
    private Integer blockCount;

    @com.aliyun.core.annotation.NameInMap("DirCount")
    private Integer dirCount;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private Long expireTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WhiteCount")
    private Integer whiteCount;

    private DescribeWebLockStatusResponseBody(Builder builder) {
        this.authCount = builder.authCount;
        this.bindCount = builder.bindCount;
        this.blockCount = builder.blockCount;
        this.dirCount = builder.dirCount;
        this.expireTime = builder.expireTime;
        this.requestId = builder.requestId;
        this.whiteCount = builder.whiteCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebLockStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return authCount
     */
    public Integer getAuthCount() {
        return this.authCount;
    }

    /**
     * @return bindCount
     */
    public Integer getBindCount() {
        return this.bindCount;
    }

    /**
     * @return blockCount
     */
    public Integer getBlockCount() {
        return this.blockCount;
    }

    /**
     * @return dirCount
     */
    public Integer getDirCount() {
        return this.dirCount;
    }

    /**
     * @return expireTime
     */
    public Long getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return whiteCount
     */
    public Integer getWhiteCount() {
        return this.whiteCount;
    }

    public static final class Builder {
        private Integer authCount; 
        private Integer bindCount; 
        private Integer blockCount; 
        private Integer dirCount; 
        private Long expireTime; 
        private String requestId; 
        private Integer whiteCount; 

        /**
         * The total quota that you purchase for web tamper proofing.
         */
        public Builder authCount(Integer authCount) {
            this.authCount = authCount;
            return this;
        }

        /**
         * The associated tamper proofing quota.
         */
        public Builder bindCount(Integer bindCount) {
            this.bindCount = bindCount;
            return this;
        }

        /**
         * The number of blocked processes.
         */
        public Builder blockCount(Integer blockCount) {
            this.blockCount = blockCount;
            return this;
        }

        /**
         * The number of protected directories.
         */
        public Builder dirCount(Integer dirCount) {
            this.dirCount = dirCount;
            return this;
        }

        /**
         * The timestamp generated when the quota for tamper proofing expires. Unit: millisecond.
         */
        public Builder expireTime(Long expireTime) {
            this.expireTime = expireTime;
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
         * The number of processes in the whitelist.
         */
        public Builder whiteCount(Integer whiteCount) {
            this.whiteCount = whiteCount;
            return this;
        }

        public DescribeWebLockStatusResponseBody build() {
            return new DescribeWebLockStatusResponseBody(this);
        } 

    } 

}
