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
 * {@link CopyCasterResponseBody} extends {@link TeaModel}
 *
 * <p>CopyCasterResponseBody</p>
 */
public class CopyCasterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CasterId")
    private String casterId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CopyCasterResponseBody(Builder builder) {
        this.casterId = builder.casterId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyCasterResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String casterId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CopyCasterResponseBody model) {
            this.casterId = model.casterId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the new production studio.</p>
         * 
         * <strong>example:</strong>
         * <p>1909f043-e3d3-49e9-82d6-4329ec4a****</p>
         */
        public Builder casterId(String casterId) {
            this.casterId = casterId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CopyCasterResponseBody build() {
            return new CopyCasterResponseBody(this);
        } 

    } 

}
