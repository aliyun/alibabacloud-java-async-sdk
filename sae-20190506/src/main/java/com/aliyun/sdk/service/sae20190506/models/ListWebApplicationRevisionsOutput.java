// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListWebApplicationRevisionsOutput} extends {@link TeaModel}
 *
 * <p>ListWebApplicationRevisionsOutput</p>
 */
public class ListWebApplicationRevisionsOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("Revisions")
    private java.util.List < Revision > revisions;

    private ListWebApplicationRevisionsOutput(Builder builder) {
        this.nextToken = builder.nextToken;
        this.revisions = builder.revisions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWebApplicationRevisionsOutput create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return revisions
     */
    public java.util.List < Revision > getRevisions() {
        return this.revisions;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List < Revision > revisions; 

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Revisions.
         */
        public Builder revisions(java.util.List < Revision > revisions) {
            this.revisions = revisions;
            return this;
        }

        public ListWebApplicationRevisionsOutput build() {
            return new ListWebApplicationRevisionsOutput(this);
        } 

    } 

}
