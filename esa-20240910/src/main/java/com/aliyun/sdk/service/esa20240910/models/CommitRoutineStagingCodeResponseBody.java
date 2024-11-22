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
         * <p>The version number of the newly generated code.</p>
         * 
         * <strong>example:</strong>
         * <p>1710120201067203242</p>
         */
        public Builder codeVersion(String codeVersion) {
            this.codeVersion = codeVersion;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EDBD3EB3-97DA-5465-AEF5-8DCA5DC5E395</p>
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
