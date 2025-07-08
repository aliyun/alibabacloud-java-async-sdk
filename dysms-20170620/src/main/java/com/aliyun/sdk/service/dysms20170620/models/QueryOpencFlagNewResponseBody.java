// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link QueryOpencFlagNewResponseBody} extends {@link TeaModel}
 *
 * <p>QueryOpencFlagNewResponseBody</p>
 */
public class QueryOpencFlagNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsOpen")
    private Integer isOpen;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryOpencFlagNewResponseBody(Builder builder) {
        this.isOpen = builder.isOpen;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOpencFlagNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isOpen
     */
    public Integer getIsOpen() {
        return this.isOpen;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer isOpen; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryOpencFlagNewResponseBody model) {
            this.isOpen = model.isOpen;
            this.requestId = model.requestId;
        } 

        /**
         * IsOpen.
         */
        public Builder isOpen(Integer isOpen) {
            this.isOpen = isOpen;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryOpencFlagNewResponseBody build() {
            return new QueryOpencFlagNewResponseBody(this);
        } 

    } 

}
