// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateAppLayoutResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAppLayoutResponseBody</p>
 */
public class CreateAppLayoutResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LayoutId")
    private String layoutId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAppLayoutResponseBody(Builder builder) {
        this.layoutId = builder.layoutId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppLayoutResponseBody create() {
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>20A6D1E3-1F5F-5440-A4F1-EC7831646FE4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAppLayoutResponseBody build() {
            return new CreateAppLayoutResponseBody(this);
        } 

    } 

}
