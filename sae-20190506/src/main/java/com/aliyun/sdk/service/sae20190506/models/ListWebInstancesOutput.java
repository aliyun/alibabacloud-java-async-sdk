// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWebInstancesOutput} extends {@link TeaModel}
 *
 * <p>ListWebInstancesOutput</p>
 */
public class ListWebInstancesOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentError")
    private String currentError;

    @com.aliyun.core.annotation.NameInMap("WebInstances")
    private java.util.List < WebInstanceInfo > webInstances;

    @com.aliyun.core.annotation.NameInMap("WebVersionStatus")
    private java.util.Map < String, WebVersionStatus > webVersionStatus;

    private ListWebInstancesOutput(Builder builder) {
        this.currentError = builder.currentError;
        this.webInstances = builder.webInstances;
        this.webVersionStatus = builder.webVersionStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWebInstancesOutput create() {
        return builder().build();
    }

    /**
     * @return currentError
     */
    public String getCurrentError() {
        return this.currentError;
    }

    /**
     * @return webInstances
     */
    public java.util.List < WebInstanceInfo > getWebInstances() {
        return this.webInstances;
    }

    /**
     * @return webVersionStatus
     */
    public java.util.Map < String, WebVersionStatus > getWebVersionStatus() {
        return this.webVersionStatus;
    }

    public static final class Builder {
        private String currentError; 
        private java.util.List < WebInstanceInfo > webInstances; 
        private java.util.Map < String, WebVersionStatus > webVersionStatus; 

        /**
         * CurrentError.
         */
        public Builder currentError(String currentError) {
            this.currentError = currentError;
            return this;
        }

        /**
         * WebInstances.
         */
        public Builder webInstances(java.util.List < WebInstanceInfo > webInstances) {
            this.webInstances = webInstances;
            return this;
        }

        /**
         * WebVersionStatus.
         */
        public Builder webVersionStatus(java.util.Map < String, WebVersionStatus > webVersionStatus) {
            this.webVersionStatus = webVersionStatus;
            return this;
        }

        public ListWebInstancesOutput build() {
            return new ListWebInstancesOutput(this);
        } 

    } 

}
