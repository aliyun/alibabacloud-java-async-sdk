// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CreateRoutineBuildConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRoutineBuildConfigurationResponseBody</p>
 */
public class CreateRoutineBuildConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RoutineBuildConfigurationId")
    private Long routineBuildConfigurationId;

    private CreateRoutineBuildConfigurationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.routineBuildConfigurationId = builder.routineBuildConfigurationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRoutineBuildConfigurationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return routineBuildConfigurationId
     */
    public Long getRoutineBuildConfigurationId() {
        return this.routineBuildConfigurationId;
    }

    public static final class Builder {
        private String requestId; 
        private Long routineBuildConfigurationId; 

        private Builder() {
        } 

        private Builder(CreateRoutineBuildConfigurationResponseBody model) {
            this.requestId = model.requestId;
            this.routineBuildConfigurationId = model.routineBuildConfigurationId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CB1A380B-09F0-41BB-A198-72F8FD6DA2FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ER build configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3472165674357056</p>
         */
        public Builder routineBuildConfigurationId(Long routineBuildConfigurationId) {
            this.routineBuildConfigurationId = routineBuildConfigurationId;
            return this;
        }

        public CreateRoutineBuildConfigurationResponseBody build() {
            return new CreateRoutineBuildConfigurationResponseBody(this);
        } 

    } 

}
