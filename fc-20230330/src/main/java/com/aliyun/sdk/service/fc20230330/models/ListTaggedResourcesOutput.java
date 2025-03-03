// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListTaggedResourcesOutput} extends {@link TeaModel}
 *
 * <p>ListTaggedResourcesOutput</p>
 */
public class ListTaggedResourcesOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("resources")
    private java.util.List<Resource> resources;

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
    public java.util.List<Resource> getResources() {
        return this.resources;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List<Resource> resources; 

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
        public Builder resources(java.util.List<Resource> resources) {
            this.resources = resources;
            return this;
        }

        public ListTaggedResourcesOutput build() {
            return new ListTaggedResourcesOutput(this);
        } 

    } 

}
