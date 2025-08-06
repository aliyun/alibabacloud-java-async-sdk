// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link AssumeSlsRoleResponseBody} extends {@link TeaModel}
 *
 * <p>AssumeSlsRoleResponseBody</p>
 */
public class AssumeSlsRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SlsAuthResult")
    private String slsAuthResult;

    private AssumeSlsRoleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.slsAuthResult = builder.slsAuthResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssumeSlsRoleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slsAuthResult
     */
    public String getSlsAuthResult() {
        return this.slsAuthResult;
    }

    public static final class Builder {
        private String requestId; 
        private String slsAuthResult; 

        private Builder() {
        } 

        private Builder(AssumeSlsRoleResponseBody model) {
            this.requestId = model.requestId;
            this.slsAuthResult = model.slsAuthResult;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SlsAuthResult.
         */
        public Builder slsAuthResult(String slsAuthResult) {
            this.slsAuthResult = slsAuthResult;
            return this;
        }

        public AssumeSlsRoleResponseBody build() {
            return new AssumeSlsRoleResponseBody(this);
        } 

    } 

}
