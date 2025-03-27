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
 * {@link GetDevelopmentModeResponseBody} extends {@link TeaModel}
 *
 * <p>GetDevelopmentModeResponseBody</p>
 */
public class GetDevelopmentModeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Enable")
    private String enable;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDevelopmentModeResponseBody(Builder builder) {
        this.enable = builder.enable;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDevelopmentModeResponseBody create() {
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

        private Builder(GetDevelopmentModeResponseBody model) {
            this.enable = model.enable;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Switch. Values:</p>
         * <ul>
         * <li><strong>on</strong>: Enabled.</li>
         * <li><strong>off</strong>: Disabled.</li>
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
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>156A6B-677B1A-4297B7-9187B7-2B44792</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDevelopmentModeResponseBody build() {
            return new GetDevelopmentModeResponseBody(this);
        } 

    } 

}
