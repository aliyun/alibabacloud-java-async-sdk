// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVodTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteVodTemplateResponseBody</p>
 */
public class DeleteVodTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VodTemplateId")
    private String vodTemplateId;

    private DeleteVodTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vodTemplateId = builder.vodTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVodTemplateResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VodTemplateId.
         */
        public Builder vodTemplateId(String vodTemplateId) {
            this.vodTemplateId = vodTemplateId;
            return this;
        }

        public DeleteVodTemplateResponseBody build() {
            return new DeleteVodTemplateResponseBody(this);
        } 

    } 

}
