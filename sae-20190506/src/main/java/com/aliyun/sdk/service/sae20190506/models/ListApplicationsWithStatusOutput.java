// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link ListApplicationsWithStatusOutput} extends {@link TeaModel}
 *
 * <p>ListApplicationsWithStatusOutput</p>
 */
public class ListApplicationsWithStatusOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("applications")
    private java.util.List<ApplicationWithStatus> applications;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListApplicationsWithStatusOutput(Builder builder) {
        this.applications = builder.applications;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationsWithStatusOutput create() {
        return builder().build();
    }

    /**
     * @return applications
     */
    public java.util.List<ApplicationWithStatus> getApplications() {
        return this.applications;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ApplicationWithStatus> applications; 
        private String nextToken; 
        private String requestId; 

        /**
         * applications.
         */
        public Builder applications(java.util.List<ApplicationWithStatus> applications) {
            this.applications = applications;
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListApplicationsWithStatusOutput build() {
            return new ListApplicationsWithStatusOutput(this);
        } 

    } 

}
