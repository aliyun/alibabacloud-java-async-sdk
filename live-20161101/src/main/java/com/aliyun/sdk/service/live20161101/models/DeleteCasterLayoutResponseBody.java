// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCasterLayoutResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteCasterLayoutResponseBody</p>
 */
public class DeleteCasterLayoutResponseBody extends TeaModel {
    @NameInMap("CasterId")
    private String casterId;

    @NameInMap("LayoutId")
    private String layoutId;

    @NameInMap("RequestId")
    private String requestId;

    private DeleteCasterLayoutResponseBody(Builder builder) {
        this.casterId = builder.casterId;
        this.layoutId = builder.layoutId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCasterLayoutResponseBody create() {
        return builder().build();
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return layoutId
     */
    public String getLayoutId() {
        return this.layoutId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String casterId; 
        private String layoutId; 
        private String requestId; 

        /**
         * CasterId.
         */
        public Builder casterId(String casterId) {
            this.casterId = casterId;
            return this;
        }

        /**
         * LayoutId.
         */
        public Builder layoutId(String layoutId) {
            this.layoutId = layoutId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteCasterLayoutResponseBody build() {
            return new DeleteCasterLayoutResponseBody(this);
        } 

    } 

}
