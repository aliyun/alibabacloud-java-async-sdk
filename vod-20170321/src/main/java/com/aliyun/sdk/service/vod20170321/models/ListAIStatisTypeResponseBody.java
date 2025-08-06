// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link ListAIStatisTypeResponseBody} extends {@link TeaModel}
 *
 * <p>ListAIStatisTypeResponseBody</p>
 */
public class ListAIStatisTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Types")
    private String types;

    private ListAIStatisTypeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.types = builder.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAIStatisTypeResponseBody create() {
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
     * @return types
     */
    public String getTypes() {
        return this.types;
    }

    public static final class Builder {
        private String requestId; 
        private String types; 

        private Builder() {
        } 

        private Builder(ListAIStatisTypeResponseBody model) {
            this.requestId = model.requestId;
            this.types = model.types;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Types.
         */
        public Builder types(String types) {
            this.types = types;
            return this;
        }

        public ListAIStatisTypeResponseBody build() {
            return new ListAIStatisTypeResponseBody(this);
        } 

    } 

}
