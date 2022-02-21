// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddStudioLayoutResponseBody} extends {@link TeaModel}
 *
 * <p>AddStudioLayoutResponseBody</p>
 */
public class AddStudioLayoutResponseBody extends TeaModel {
    @NameInMap("LayoutId")
    private String layoutId;

    @NameInMap("RequestId")
    private String requestId;

    private AddStudioLayoutResponseBody(Builder builder) {
        this.layoutId = builder.layoutId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddStudioLayoutResponseBody create() {
        return builder().build();
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
        private String layoutId; 
        private String requestId; 

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

        public AddStudioLayoutResponseBody build() {
            return new AddStudioLayoutResponseBody(this);
        } 

    } 

}
