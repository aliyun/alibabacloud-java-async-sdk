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
 * {@link DescribeWhiteListStrategyUuidCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWhiteListStrategyUuidCountResponseBody</p>
 */
public class DescribeWhiteListStrategyUuidCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UuidCount")
    private Integer uuidCount;

    private DescribeWhiteListStrategyUuidCountResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.uuidCount = builder.uuidCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWhiteListStrategyUuidCountResponseBody create() {
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
     * @return uuidCount
     */
    public Integer getUuidCount() {
        return this.uuidCount;
    }

    public static final class Builder {
        private String requestId; 
        private Integer uuidCount; 

        private Builder() {
        } 

        private Builder(DescribeWhiteListStrategyUuidCountResponseBody model) {
            this.requestId = model.requestId;
            this.uuidCount = model.uuidCount;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F8B6F758-BCD4-597A-8A2C-DA5A552C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of the servers on which the application whitelist policy takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        public Builder uuidCount(Integer uuidCount) {
            this.uuidCount = uuidCount;
            return this;
        }

        public DescribeWhiteListStrategyUuidCountResponseBody build() {
            return new DescribeWhiteListStrategyUuidCountResponseBody(this);
        } 

    } 

}
