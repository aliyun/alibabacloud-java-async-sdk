// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link CreateFilesetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFilesetResponseBody</p>
 */
public class CreateFilesetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FsetId")
    private String fsetId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateFilesetResponseBody(Builder builder) {
        this.fsetId = builder.fsetId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFilesetResponseBody create() {
        return builder().build();
    }

    /**
     * @return fsetId
     */
    public String getFsetId() {
        return this.fsetId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String fsetId; 
        private String requestId; 

        /**
         * <p>The fileset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fset-1902718ea0ae****</p>
         */
        public Builder fsetId(String fsetId) {
            this.fsetId = fsetId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>98696EF0-1607-4E9D-B01D-F20930B6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateFilesetResponseBody build() {
            return new CreateFilesetResponseBody(this);
        } 

    } 

}
