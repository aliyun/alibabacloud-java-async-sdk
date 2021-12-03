// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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
         * <p>nextToken.</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>resources.</p>
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
