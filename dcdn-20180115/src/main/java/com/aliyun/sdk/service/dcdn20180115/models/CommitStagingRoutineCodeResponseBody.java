// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CommitStagingRoutineCodeResponseBody} extends {@link TeaModel}
 *
 * <p>CommitStagingRoutineCodeResponseBody</p>
 */
public class CommitStagingRoutineCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private java.util.Map < String, ? > content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CommitStagingRoutineCodeResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CommitStagingRoutineCodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public java.util.Map < String, ? > getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.Map < String, ? > content; 
        private String requestId; 

        /**
         * <p>The version number of the code.</p>
         * 
         * <strong>example:</strong>
         * <p>1620876959997924701</p>
         */
        public Builder content(java.util.Map < String, ? > content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5CC228B4-7A67-4016-9C9F-4A4133494A91</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CommitStagingRoutineCodeResponseBody build() {
            return new CommitStagingRoutineCodeResponseBody(this);
        } 

    } 

}
