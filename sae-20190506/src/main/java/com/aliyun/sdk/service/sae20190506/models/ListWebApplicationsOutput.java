// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListWebApplicationsOutput} extends {@link TeaModel}
 *
 * <p>ListWebApplicationsOutput</p>
 */
public class ListWebApplicationsOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("WebApplicationWithInstanceCount")
    private java.util.List < WebApplicationWithInstanceCount > webApplicationWithInstanceCount;

    private ListWebApplicationsOutput(Builder builder) {
        this.nextToken = builder.nextToken;
        this.webApplicationWithInstanceCount = builder.webApplicationWithInstanceCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWebApplicationsOutput create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return webApplicationWithInstanceCount
     */
    public java.util.List < WebApplicationWithInstanceCount > getWebApplicationWithInstanceCount() {
        return this.webApplicationWithInstanceCount;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List < WebApplicationWithInstanceCount > webApplicationWithInstanceCount; 

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * WebApplicationWithInstanceCount.
         */
        public Builder webApplicationWithInstanceCount(java.util.List < WebApplicationWithInstanceCount > webApplicationWithInstanceCount) {
            this.webApplicationWithInstanceCount = webApplicationWithInstanceCount;
            return this;
        }

        public ListWebApplicationsOutput build() {
            return new ListWebApplicationsOutput(this);
        } 

    } 

}
