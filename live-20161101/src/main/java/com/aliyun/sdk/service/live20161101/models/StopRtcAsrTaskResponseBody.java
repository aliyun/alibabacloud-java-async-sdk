// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link StopRtcAsrTaskResponseBody} extends {@link TeaModel}
 *
 * <p>StopRtcAsrTaskResponseBody</p>
 */
public class StopRtcAsrTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RetCode")
    private Long retCode;

    private StopRtcAsrTaskResponseBody(Builder builder) {
        this.description = builder.description;
        this.requestId = builder.requestId;
        this.retCode = builder.retCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopRtcAsrTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return retCode
     */
    public Long getRetCode() {
        return this.retCode;
    }

    public static final class Builder {
        private String description; 
        private String requestId; 
        private Long retCode; 

        private Builder() {
        } 

        private Builder(StopRtcAsrTaskResponseBody model) {
            this.description = model.description;
            this.requestId = model.requestId;
            this.retCode = model.retCode;
        } 

        /**
         * <p>The result of the request. If success is returned, the request is successful. If an error message is returned, the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3D208CC1-27C9-51E9-82B8-A6682D466421</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned HTTP status code. HTTP status code 2000 indicates that the request is successful. If another HTTP status code is returned, the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        public Builder retCode(Long retCode) {
            this.retCode = retCode;
            return this;
        }

        public StopRtcAsrTaskResponseBody build() {
            return new StopRtcAsrTaskResponseBody(this);
        } 

    } 

}
