// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CompleteBoardRecordResponseBody} extends {@link TeaModel}
 *
 * <p>CompleteBoardRecordResponseBody</p>
 */
public class CompleteBoardRecordResponseBody extends TeaModel {
    @NameInMap("OssPath")
    private String ossPath;

    @NameInMap("RequestId")
    private String requestId;

    private CompleteBoardRecordResponseBody(Builder builder) {
        this.ossPath = builder.ossPath;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompleteBoardRecordResponseBody create() {
        return builder().build();
    }

    /**
     * @return ossPath
     */
    public String getOssPath() {
        return this.ossPath;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ossPath; 
        private String requestId; 

        /**
         * OssPath.
         */
        public Builder ossPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CompleteBoardRecordResponseBody build() {
            return new CompleteBoardRecordResponseBody(this);
        } 

    } 

}
