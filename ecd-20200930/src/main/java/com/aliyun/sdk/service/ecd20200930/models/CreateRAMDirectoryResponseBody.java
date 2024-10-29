// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The RAM directory ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dri-uf62w3qzt4aigvlcb****</p>
         */
        public Builder directoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
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
