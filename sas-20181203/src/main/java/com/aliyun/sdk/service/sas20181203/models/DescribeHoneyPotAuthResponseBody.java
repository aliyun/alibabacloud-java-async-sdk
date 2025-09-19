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
 * {@link DescribeHoneyPotAuthResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHoneyPotAuthResponseBody</p>
 */
public class DescribeHoneyPotAuthResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HoneyPotAuthCount")
    private Long honeyPotAuthCount;

    @com.aliyun.core.annotation.NameInMap("HoneyPotCount")
    private Integer honeyPotCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeHoneyPotAuthResponseBody(Builder builder) {
        this.honeyPotAuthCount = builder.honeyPotAuthCount;
        this.honeyPotCount = builder.honeyPotCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHoneyPotAuthResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return honeyPotAuthCount
     */
    public Long getHoneyPotAuthCount() {
        return this.honeyPotAuthCount;
    }

    /**
     * @return honeyPotCount
     */
    public Integer getHoneyPotCount() {
        return this.honeyPotCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long honeyPotAuthCount; 
        private Integer honeyPotCount; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeHoneyPotAuthResponseBody model) {
            this.honeyPotAuthCount = model.honeyPotAuthCount;
            this.honeyPotCount = model.honeyPotCount;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The total quota.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder honeyPotAuthCount(Long honeyPotAuthCount) {
            this.honeyPotAuthCount = honeyPotAuthCount;
            return this;
        }

        /**
         * <p>The quota that is consumed.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder honeyPotCount(Integer honeyPotCount) {
            this.honeyPotCount = honeyPotCount;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>0F5023B6-9C1F-459F-ACCC-8B4636804037</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHoneyPotAuthResponseBody build() {
            return new DescribeHoneyPotAuthResponseBody(this);
        } 

    } 

}
