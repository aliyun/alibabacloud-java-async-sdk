// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectFeatureViewTagsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectFeatureViewTagsResponseBody</p>
 */
public class ListProjectFeatureViewTagsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Tags")
    private java.util.List < String > tags;

    private ListProjectFeatureViewTagsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectFeatureViewTagsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tags
     */
    public java.util.List < String > getTags() {
        return this.tags;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < String > tags; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < String > tags) {
            this.tags = tags;
            return this;
        }

        public ListProjectFeatureViewTagsResponseBody build() {
            return new ListProjectFeatureViewTagsResponseBody(this);
        } 

    } 

}
