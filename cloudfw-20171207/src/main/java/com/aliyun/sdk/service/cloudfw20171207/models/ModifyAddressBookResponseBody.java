// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link ModifyAddressBookResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyAddressBookResponseBody</p>
 */
public class ModifyAddressBookResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyAddressBookResponseBody(Builder builder) {
        this.dryRun = builder.dryRun;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAddressBookResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean dryRun; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyAddressBookResponseBody model) {
            this.dryRun = model.dryRun;
            this.requestId = model.requestId;
        } 

        /**
         * <p>标识本次为 DryRun 预检成功响应；取值 true 表示仅完成预检、未执行真实变更。真实调用不返回该字段或为 false。</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyAddressBookResponseBody build() {
            return new ModifyAddressBookResponseBody(this);
        } 

    } 

}
