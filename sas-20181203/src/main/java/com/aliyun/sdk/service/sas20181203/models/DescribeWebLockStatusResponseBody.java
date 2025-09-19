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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeWebLockStatusResponseBody model) {
            this.authCount = model.authCount;
            this.bindCount = model.bindCount;
            this.blockCount = model.blockCount;
            this.dirCount = model.dirCount;
            this.expireTime = model.expireTime;
            this.requestId = model.requestId;
            this.whiteCount = model.whiteCount;
        } 

        /**
         * <p>The total quota that you purchase for web tamper proofing.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        public Builder authCount(Integer authCount) {
            this.authCount = authCount;
            return this;
        }

        /**
         * <p>The associated tamper proofing quota.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder bindCount(Integer bindCount) {
            this.bindCount = bindCount;
            return this;
        }

        /**
         * <p>The number of blocked processes.</p>
         * 
         * <strong>example:</strong>
         * <p>48</p>
         */
        public Builder blockCount(Integer blockCount) {
            this.blockCount = blockCount;
            return this;
        }

        /**
         * <p>The number of protected directories.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder dirCount(Integer dirCount) {
            this.dirCount = dirCount;
            return this;
        }

        /**
         * <p>The timestamp generated when the quota for tamper proofing expires. Unit: millisecond.</p>
         * 
         * <strong>example:</strong>
         * <p>1688090851000</p>
         */
        public Builder expireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>0B48AB3C-84FC-424D-A01D-B9270EF46038</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of processes in the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
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
