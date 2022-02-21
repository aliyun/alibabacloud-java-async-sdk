// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBgpGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBgpGroupResponseBody</p>
 */
public class CreateBgpGroupResponseBody extends TeaModel {
    @NameInMap("BgpGroupId")
    private String bgpGroupId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateBgpGroupResponseBody(Builder builder) {
        this.bgpGroupId = builder.bgpGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBgpGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return bgpGroupId
     */
    public String getBgpGroupId() {
        return this.bgpGroupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String bgpGroupId; 
        private String requestId; 

        /**
         * BgpGroupId.
         */
        public Builder bgpGroupId(String bgpGroupId) {
            this.bgpGroupId = bgpGroupId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateBgpGroupResponseBody build() {
            return new CreateBgpGroupResponseBody(this);
        } 

    } 

}
