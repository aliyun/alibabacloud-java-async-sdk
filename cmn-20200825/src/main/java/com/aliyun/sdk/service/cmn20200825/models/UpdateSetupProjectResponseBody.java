// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSetupProjectResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateSetupProjectResponseBody</p>
 */
public class UpdateSetupProjectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SetupProjectId")
    private String setupProjectId;

    @NameInMap("SetupProjectName")
    private String setupProjectName;

    @NameInMap("SetupProjectSpecification")
    private String setupProjectSpecification;

    private UpdateSetupProjectResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.setupProjectId = builder.setupProjectId;
        this.setupProjectName = builder.setupProjectName;
        this.setupProjectSpecification = builder.setupProjectSpecification;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSetupProjectResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return setupProjectId
     */
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

    /**
     * @return setupProjectName
     */
    public String getSetupProjectName() {
        return this.setupProjectName;
    }

    /**
     * @return setupProjectSpecification
     */
    public String getSetupProjectSpecification() {
        return this.setupProjectSpecification;
    }

    public static final class Builder {
        private String requestId; 
        private String setupProjectId; 
        private String setupProjectName; 
        private String setupProjectSpecification; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SetupProjectId.
         */
        public Builder setupProjectId(String setupProjectId) {
            this.setupProjectId = setupProjectId;
            return this;
        }

        /**
         * SetupProjectName.
         */
        public Builder setupProjectName(String setupProjectName) {
            this.setupProjectName = setupProjectName;
            return this;
        }

        /**
         * SetupProjectSpecification.
         */
        public Builder setupProjectSpecification(String setupProjectSpecification) {
            this.setupProjectSpecification = setupProjectSpecification;
            return this;
        }

        public UpdateSetupProjectResponseBody build() {
            return new UpdateSetupProjectResponseBody(this);
        } 

    } 

}
