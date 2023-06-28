// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTaggedResourcesOutput} extends {@link TeaModel}
 *
 * <p>ListTaggedResourcesOutput</p>
 */
public class ListTaggedResourcesOutput extends TeaModel {
    @NameInMap("nextToken")
    private String nextToken;

    @NameInMap("resources")
    private java.util.List < Resource > resources;

    private ListTaggedResourcesOutput(Builder builder) {
        this.nextToken = builder.nextToken;
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTaggedResourcesOutput create() {
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
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * resources.
         */
        public Builder resources(java.util.List < Resource > resources) {
            this.resources = resources;
            return this;
        }

        public ListTaggedResourcesOutput build() {
            return new ListTaggedResourcesOutput(this);
        } 

    } 

}
