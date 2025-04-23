// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link CheckUsedPropertyValueResponseBody} extends {@link TeaModel}
 *
 * <p>CheckUsedPropertyValueResponseBody</p>
 */
public class CheckUsedPropertyValueResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UseCount")
    private Long useCount;

    private CheckUsedPropertyValueResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.useCount = builder.useCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckUsedPropertyValueResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return useCount
     */
    public Long getUseCount() {
        return this.useCount;
    }

    public static final class Builder {
        private String requestId; 
        private Long useCount; 

        private Builder() {
        } 

        private Builder(CheckUsedPropertyValueResponseBody model) {
            this.requestId = model.requestId;
            this.useCount = model.useCount;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of convenience accounts that are associated with the specified custom property value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder useCount(Long useCount) {
            this.useCount = useCount;
            return this;
        }

        public CheckUsedPropertyValueResponseBody build() {
            return new CheckUsedPropertyValueResponseBody(this);
        } 

    } 

}
