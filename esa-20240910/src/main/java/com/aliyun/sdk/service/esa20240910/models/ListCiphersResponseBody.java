// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListCiphersResponseBody} extends {@link TeaModel}
 *
 * <p>ListCiphersResponseBody</p>
 */
public class ListCiphersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CiphersGroup")
    private String ciphersGroup;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<String> result;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListCiphersResponseBody(Builder builder) {
        this.ciphersGroup = builder.ciphersGroup;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCiphersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ciphersGroup
     */
    public String getCiphersGroup() {
        return this.ciphersGroup;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List<String> getResult() {
        return this.result;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String ciphersGroup; 
        private String requestId; 
        private java.util.List<String> result; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListCiphersResponseBody model) {
            this.ciphersGroup = model.ciphersGroup;
            this.requestId = model.requestId;
            this.result = model.result;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Name of the cipher suite group.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        public Builder ciphersGroup(String ciphersGroup) {
            this.ciphersGroup = ciphersGroup;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned result.</p>
         */
        public Builder result(java.util.List<String> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Total number of cipher suites.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCiphersResponseBody build() {
            return new ListCiphersResponseBody(this);
        } 

    } 

}
