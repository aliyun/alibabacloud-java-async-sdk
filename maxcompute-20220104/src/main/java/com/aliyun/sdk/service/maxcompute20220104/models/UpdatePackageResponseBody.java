// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link UpdatePackageResponseBody} extends {@link TeaModel}
 *
 * <p>UpdatePackageResponseBody</p>
 */
public class UpdatePackageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private UpdatePackageResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePackageResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String data; 
        private String requestId; 

        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc1ec4016697018733156991e0888</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdatePackageResponseBody build() {
            return new UpdatePackageResponseBody(this);
        } 

    } 

}
