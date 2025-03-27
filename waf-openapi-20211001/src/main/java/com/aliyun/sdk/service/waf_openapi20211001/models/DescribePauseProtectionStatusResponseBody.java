// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribePauseProtectionStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePauseProtectionStatusResponseBody</p>
 */
public class DescribePauseProtectionStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PauseStatus")
    private Integer pauseStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePauseProtectionStatusResponseBody(Builder builder) {
        this.pauseStatus = builder.pauseStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePauseProtectionStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pauseStatus
     */
    public Integer getPauseStatus() {
        return this.pauseStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer pauseStatus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePauseProtectionStatusResponseBody model) {
            this.pauseStatus = model.pauseStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether WAF protection is paused.</p>
         * <ul>
         * <li><strong>0</strong>: indicates that WAF protection is not paused. This is the default value.</li>
         * <li><strong>1</strong>: indicates that WAF protection is paused.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder pauseStatus(Integer pauseStatus) {
            this.pauseStatus = pauseStatus;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D7861F61-<strong><strong>-46CE-A47C-6B19</strong></strong>5EB0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePauseProtectionStatusResponseBody build() {
            return new DescribePauseProtectionStatusResponseBody(this);
        } 

    } 

}
