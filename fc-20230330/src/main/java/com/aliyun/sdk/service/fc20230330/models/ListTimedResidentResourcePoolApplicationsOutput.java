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
 * {@link ListTimedResidentResourcePoolApplicationsOutput} extends {@link TeaModel}
 *
 * <p>ListTimedResidentResourcePoolApplicationsOutput</p>
 */
public class ListTimedResidentResourcePoolApplicationsOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("applications")
    private java.util.List<TimedResidentResourcePoolApplication> applications;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    private ListTimedResidentResourcePoolApplicationsOutput(Builder builder) {
        this.applications = builder.applications;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTimedResidentResourcePoolApplicationsOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applications
     */
    public java.util.List<TimedResidentResourcePoolApplication> getApplications() {
        return this.applications;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder {
        private java.util.List<TimedResidentResourcePoolApplication> applications; 
        private String nextToken; 

        private Builder() {
        } 

        private Builder(ListTimedResidentResourcePoolApplicationsOutput model) {
            this.applications = model.applications;
            this.nextToken = model.nextToken;
        } 

        /**
         * applications.
         */
        public Builder applications(java.util.List<TimedResidentResourcePoolApplication> applications) {
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

        public ListTimedResidentResourcePoolApplicationsOutput build() {
            return new ListTimedResidentResourcePoolApplicationsOutput(this);
        } 

    } 

}
