// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTaggedResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTaggedResourcesResponseBody</p>
 */
public class ListTaggedResourcesResponseBody extends TeaModel {
    @NameInMap("nextToken")
    private String nextToken;

    @NameInMap("resources")
    private java.util.List < Resource > resources;

    private ListTaggedResourcesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTaggedResourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return resources
     */
    public java.util.List < Resource > getResources() {
        return this.resources;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List < Resource > resources; 

        /**
         * The token required to obtain more results. If the number of layers exceeds the limit, the nextToken parameter is returned. You can include the parameter in subsequent calls to obtain more results. You do not need to provide this parameter in the first call.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The information about tagged services.
         */
        public Builder resources(java.util.List < Resource > resources) {
            this.resources = resources;
            return this;
        }

        public ListTaggedResourcesResponseBody build() {
            return new ListTaggedResourcesResponseBody(this);
        } 

    } 

}
