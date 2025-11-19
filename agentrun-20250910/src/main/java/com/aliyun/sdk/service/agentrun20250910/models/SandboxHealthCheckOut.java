// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link SandboxHealthCheckOut} extends {@link TeaModel}
 *
 * <p>SandboxHealthCheckOut</p>
 */
public class SandboxHealthCheckOut extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    private SandboxHealthCheckOut(Builder builder) {
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SandboxHealthCheckOut create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String status; 

        private Builder() {
        } 

        private Builder(SandboxHealthCheckOut model) {
            this.status = model.status;
        } 

        /**
         * <p>健康状态，OK表示健康</p>
         * <p>This parameter is required.</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public SandboxHealthCheckOut build() {
            return new SandboxHealthCheckOut(this);
        } 

    } 

}
