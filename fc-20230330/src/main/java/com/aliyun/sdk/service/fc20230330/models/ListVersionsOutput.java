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
 * {@link ListVersionsOutput} extends {@link TeaModel}
 *
 * <p>ListVersionsOutput</p>
 */
public class ListVersionsOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("direction")
    private String direction;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("versions")
    private java.util.List<Version> versions;

    private ListVersionsOutput(Builder builder) {
        this.direction = builder.direction;
        this.nextToken = builder.nextToken;
        this.versions = builder.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVersionsOutput create() {
        return builder().build();
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return versions
     */
    public java.util.List<Version> getVersions() {
        return this.versions;
    }

    public static final class Builder {
        private String direction; 
        private String nextToken; 
        private java.util.List<Version> versions; 

        /**
         * direction.
         */
        public Builder direction(String direction) {
            this.direction = direction;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * versions.
         */
        public Builder versions(java.util.List<Version> versions) {
            this.versions = versions;
            return this;
        }

        public ListVersionsOutput build() {
            return new ListVersionsOutput(this);
        } 

    } 

}
