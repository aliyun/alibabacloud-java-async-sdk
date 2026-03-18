// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link PaidResourceQry} extends {@link TeaModel}
 *
 * <p>PaidResourceQry</p>
 */
public class PaidResourceQry extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("resourceStatus")
    private String resourceStatus;

    private PaidResourceQry(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceStatus = builder.resourceStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PaidResourceQry create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return resourceStatus
     */
    public String getResourceStatus() {
        return this.resourceStatus;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String resourceStatus; 

        private Builder() {
        } 

        private Builder(PaidResourceQry model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.resourceStatus = model.resourceStatus;
        } 

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
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
         * resourceStatus.
         */
        public Builder resourceStatus(String resourceStatus) {
            this.resourceStatus = resourceStatus;
            return this;
        }

        public PaidResourceQry build() {
            return new PaidResourceQry(this);
        } 

    } 

}
