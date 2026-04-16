// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link FunctionLockInfo} extends {@link TeaModel}
 *
 * <p>FunctionLockInfo</p>
 */
public class FunctionLockInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("lockedAt")
    private String lockedAt;

    @com.aliyun.core.annotation.NameInMap("lockedBy")
    private String lockedBy;

    @com.aliyun.core.annotation.NameInMap("lockedResources")
    private java.util.List<String> lockedResources;

    private FunctionLockInfo(Builder builder) {
        this.lockedAt = builder.lockedAt;
        this.lockedBy = builder.lockedBy;
        this.lockedResources = builder.lockedResources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FunctionLockInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lockedAt
     */
    public String getLockedAt() {
        return this.lockedAt;
    }

    /**
     * @return lockedBy
     */
    public String getLockedBy() {
        return this.lockedBy;
    }

    /**
     * @return lockedResources
     */
    public java.util.List<String> getLockedResources() {
        return this.lockedResources;
    }

    public static final class Builder {
        private String lockedAt; 
        private String lockedBy; 
        private java.util.List<String> lockedResources; 

        private Builder() {
        } 

        private Builder(FunctionLockInfo model) {
            this.lockedAt = model.lockedAt;
            this.lockedBy = model.lockedBy;
            this.lockedResources = model.lockedResources;
        } 

        /**
         * <p>锁定时间</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-05T10:00:00Z</p>
         */
        public Builder lockedAt(String lockedAt) {
            this.lockedAt = lockedAt;
            return this;
        }

        /**
         * <p>锁定方名称</p>
         * 
         * <strong>example:</strong>
         * <p>AgentRun</p>
         */
        public Builder lockedBy(String lockedBy) {
            this.lockedBy = lockedBy;
            return this;
        }

        /**
         * <p>锁定的资源类型列表</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;function&quot;, &quot;trigger&quot;, &quot;version&quot;, &quot;alias&quot;]</p>
         */
        public Builder lockedResources(java.util.List<String> lockedResources) {
            this.lockedResources = lockedResources;
            return this;
        }

        public FunctionLockInfo build() {
            return new FunctionLockInfo(this);
        } 

    } 

}
