// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateBgpGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBgpGroupResponseBody</p>
 */
public class CreateBgpGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BgpGroupId")
    private String bgpGroupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The ID of the BGP group.</p>
         * 
         * <strong>example:</strong>
         * <p>bgpg-bp1k25cyp26cllath****</p>
         */
        public Builder bgpGroupId(String bgpGroupId) {
            this.bgpGroupId = bgpGroupId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C1221A1F-2ACD-4592-8F27-474E02883159</p>
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
