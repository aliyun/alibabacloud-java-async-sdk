// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRAMDirectoryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRAMDirectoryResponseBody</p>
 */
public class CreateRAMDirectoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateRAMDirectoryResponseBody(Builder builder) {
        this.directoryId = builder.directoryId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRAMDirectoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String directoryId; 
        private String requestId; 

        /**
         * The RAM directory ID.
         */
        public Builder directoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateRAMDirectoryResponseBody build() {
            return new CreateRAMDirectoryResponseBody(this);
        } 

    } 

}
