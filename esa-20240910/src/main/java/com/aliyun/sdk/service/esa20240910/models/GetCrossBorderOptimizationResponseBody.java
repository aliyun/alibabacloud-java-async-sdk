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
 * {@link GetCrossBorderOptimizationResponseBody} extends {@link TeaModel}
 *
 * <p>GetCrossBorderOptimizationResponseBody</p>
 */
public class GetCrossBorderOptimizationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Enable")
    private String enable;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCrossBorderOptimizationResponseBody(Builder builder) {
        this.enable = builder.enable;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCrossBorderOptimizationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enable
     */
    public String getEnable() {
        return this.enable;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String enable; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetCrossBorderOptimizationResponseBody model) {
            this.enable = model.enable;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Whether to enable Chinese mainland network access optimization. By default, it is disabled. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder enable(String enable) {
            this.enable = enable;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CF521A24-633F-5350-A6A5-42AD503D0D20</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCrossBorderOptimizationResponseBody build() {
            return new GetCrossBorderOptimizationResponseBody(this);
        } 

    } 

}
