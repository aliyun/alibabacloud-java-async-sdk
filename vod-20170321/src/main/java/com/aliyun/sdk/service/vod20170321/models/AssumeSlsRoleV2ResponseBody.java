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
 * {@link AssumeSlsRoleV2ResponseBody} extends {@link TeaModel}
 *
 * <p>AssumeSlsRoleV2ResponseBody</p>
 */
public class AssumeSlsRoleV2ResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SlsAuthResult")
    private String slsAuthResult;

    private AssumeSlsRoleV2ResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.slsAuthResult = builder.slsAuthResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssumeSlsRoleV2ResponseBody create() {
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

        private Builder(AssumeSlsRoleV2ResponseBody model) {
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

        public AssumeSlsRoleV2ResponseBody build() {
            return new AssumeSlsRoleV2ResponseBody(this);
        } 

    } 

}
