// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601.models;

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
 * {@link CreateWorkgroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateWorkgroupResponseBody</p>
 */
public class CreateWorkgroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WorkgroupId")
    private String workgroupId;

    private CreateWorkgroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.workgroupId = builder.workgroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWorkgroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return workgroupId
     */
    public String getWorkgroupId() {
        return this.workgroupId;
    }

    public static final class Builder {
        private String requestId; 
        private String workgroupId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C8B26B44-0189-443E-9816-D951F59623A9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The workgroup ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-***</p>
         */
        public Builder workgroupId(String workgroupId) {
            this.workgroupId = workgroupId;
            return this;
        }

        public CreateWorkgroupResponseBody build() {
            return new CreateWorkgroupResponseBody(this);
        } 

    } 

}
