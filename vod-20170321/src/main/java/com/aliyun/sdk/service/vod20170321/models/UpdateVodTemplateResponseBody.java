// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateVodTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateVodTemplateResponseBody</p>
 */
public class UpdateVodTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VodTemplateId")
    private String vodTemplateId;

    private UpdateVodTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vodTemplateId = builder.vodTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVodTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vodTemplateId
     */
    public String getVodTemplateId() {
        return this.vodTemplateId;
    }

    public static final class Builder {
        private String requestId; 
        private String vodTemplateId; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4A*****F6-D7393642CA58</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the snapshot template.</p>
         * 
         * <strong>example:</strong>
         * <p>8c75a02e339b*****0b0d2c48171a22</p>
         */
        public Builder vodTemplateId(String vodTemplateId) {
            this.vodTemplateId = vodTemplateId;
            return this;
        }

        public UpdateVodTemplateResponseBody build() {
            return new UpdateVodTemplateResponseBody(this);
        } 

    } 

}
