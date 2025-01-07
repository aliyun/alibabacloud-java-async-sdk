// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link CreateFileDetectResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFileDetectResponseBody</p>
 */
public class CreateFileDetectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HashKey")
    private String hashKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateFileDetectResponseBody(Builder builder) {
        this.hashKey = builder.hashKey;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFileDetectResponseBody create() {
        return builder().build();
    }

    /**
     * @return hashKey
     */
    public String getHashKey() {
        return this.hashKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String hashKey; 
        private String requestId; 

        /**
         * <p>The identifier of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>0a212417e65c26ff133cfff28f6c****</p>
         */
        public Builder hashKey(String hashKey) {
            this.hashKey = hashKey;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>7E0618A9-D5EF-4220-9471-C42B5E92719F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateFileDetectResponseBody build() {
            return new CreateFileDetectResponseBody(this);
        } 

    } 

}
