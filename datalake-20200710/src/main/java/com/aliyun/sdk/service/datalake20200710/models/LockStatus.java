// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LockStatus} extends {@link TeaModel}
 *
 * <p>LockStatus</p>
 */
public class LockStatus extends TeaModel {
    @NameInMap("LockId")
    private Long lockId;

    @NameInMap("LockState")
    private String lockState;

    private LockStatus(Builder builder) {
        this.lockId = builder.lockId;
        this.lockState = builder.lockState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LockStatus create() {
        return builder().build();
    }

    /**
     * @return lockId
     */
    public Long getLockId() {
        return this.lockId;
    }

    /**
     * @return lockState
     */
    public String getLockState() {
        return this.lockState;
    }

    public static final class Builder {
        private Long lockId; 
        private String lockState; 

        /**
         * LockId
         */
        public Builder lockId(Long lockId) {
            this.lockId = lockId;
            return this;
        }

        /**
         * ACQUIRED/NOT_ACQUIRED
         */
        public Builder lockState(String lockState) {
            this.lockState = lockState;
            return this;
        }

        public LockStatus build() {
            return new LockStatus(this);
        } 

    } 

}
