// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CommitRoutineStagingCodeResponseBody} extends {@link TeaModel}
 *
 * <p>CommitRoutineStagingCodeResponseBody</p>
 */
public class CommitRoutineStagingCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CodeVersion")
    private String codeVersion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CommitRoutineStagingCodeResponseBody(Builder builder) {
        this.codeVersion = builder.codeVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CommitRoutineStagingCodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return codeVersion
     */
    public String getCodeVersion() {
        return this.codeVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String codeVersion; 
        private String requestId; 

        /**
         * CodeVersion.
         */
        public Builder codeVersion(String codeVersion) {
            this.codeVersion = codeVersion;
            return this;
        }

        /**
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CommitRoutineStagingCodeResponseBody build() {
            return new CommitRoutineStagingCodeResponseBody(this);
        } 

    } 

}
