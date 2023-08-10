// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UntagResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>UntagResourcesResponseBody</p>
 */
public class UntagResourcesResponseBody extends TeaModel {
    @NameInMap("tequestId")
    private String tequestId;

    private UntagResourcesResponseBody(Builder builder) {
        this.tequestId = builder.tequestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UntagResourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return tequestId
     */
    public String getTequestId() {
        return this.tequestId;
    }

    public static final class Builder {
        private String tequestId; 

        /**
         * The ID of the request.
         */
        public Builder tequestId(String tequestId) {
            this.tequestId = tequestId;
            return this;
        }

        public UntagResourcesResponseBody build() {
            return new UntagResourcesResponseBody(this);
        } 

    } 

}
