// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_cnp20230828.models;

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
 * {@link CreateResourceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateResourceResponseBody</p>
 */
public class CreateResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Long data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private CreateResourceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Long getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long data; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>Data</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder data(Long data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>5514CB39-B7C0-5B89-8534-2DE1E0F2B7AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total Count</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public CreateResourceResponseBody build() {
            return new CreateResourceResponseBody(this);
        } 

    } 

}
