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
 * {@link AssumeOssRoleResponseBody} extends {@link TeaModel}
 *
 * <p>AssumeOssRoleResponseBody</p>
 */
public class AssumeOssRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OssAuthResult")
    private String ossAuthResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AssumeOssRoleResponseBody(Builder builder) {
        this.ossAuthResult = builder.ossAuthResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssumeOssRoleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ossAuthResult
     */
    public String getOssAuthResult() {
        return this.ossAuthResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ossAuthResult; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AssumeOssRoleResponseBody model) {
            this.ossAuthResult = model.ossAuthResult;
            this.requestId = model.requestId;
        } 

        /**
         * OssAuthResult.
         */
        public Builder ossAuthResult(String ossAuthResult) {
            this.ossAuthResult = ossAuthResult;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AssumeOssRoleResponseBody build() {
            return new AssumeOssRoleResponseBody(this);
        } 

    } 

}
