// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TagResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>TagResourcesResponseBody</p>
 */
public class TagResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private TagResourcesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TagResourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * The key of the tag that is attached to the resource.
         * <p>
         * 
         * *   If you want to configure this parameter, specify at least one tag key and at most 20 tag keys.
         * *   This parameter is required.
         * *   The tag key can be up to 128 characters in length. The tag key cannot start with acs: or aliyun or contain [http:// or https://.](http://或者https://。)
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public TagResourcesResponseBody build() {
            return new TagResourcesResponseBody(this);
        } 

    } 

}
