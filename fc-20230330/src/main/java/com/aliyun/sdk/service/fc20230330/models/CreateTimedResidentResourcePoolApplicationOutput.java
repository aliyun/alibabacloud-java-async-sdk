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
 * {@link CreateTimedResidentResourcePoolApplicationOutput} extends {@link TeaModel}
 *
 * <p>CreateTimedResidentResourcePoolApplicationOutput</p>
 */
public class CreateTimedResidentResourcePoolApplicationOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("applicationStatus")
    private String applicationStatus;

    @com.aliyun.core.annotation.NameInMap("timedPoolId")
    private String timedPoolId;

    private CreateTimedResidentResourcePoolApplicationOutput(Builder builder) {
        this.applicationStatus = builder.applicationStatus;
        this.timedPoolId = builder.timedPoolId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTimedResidentResourcePoolApplicationOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationStatus
     */
    public String getApplicationStatus() {
        return this.applicationStatus;
    }

    /**
     * @return timedPoolId
     */
    public String getTimedPoolId() {
        return this.timedPoolId;
    }

    public static final class Builder {
        private String applicationStatus; 
        private String timedPoolId; 

        private Builder() {
        } 

        private Builder(CreateTimedResidentResourcePoolApplicationOutput model) {
            this.applicationStatus = model.applicationStatus;
            this.timedPoolId = model.timedPoolId;
        } 

        /**
         * applicationStatus.
         */
        public Builder applicationStatus(String applicationStatus) {
            this.applicationStatus = applicationStatus;
            return this;
        }

        /**
         * timedPoolId.
         */
        public Builder timedPoolId(String timedPoolId) {
            this.timedPoolId = timedPoolId;
            return this;
        }

        public CreateTimedResidentResourcePoolApplicationOutput build() {
            return new CreateTimedResidentResourcePoolApplicationOutput(this);
        } 

    } 

}
