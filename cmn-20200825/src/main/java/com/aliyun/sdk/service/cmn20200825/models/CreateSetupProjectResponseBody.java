// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSetupProjectResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSetupProjectResponseBody</p>
 */
public class CreateSetupProjectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SetupProjectId")
    private String setupProjectId;

    private CreateSetupProjectResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.setupProjectId = builder.setupProjectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSetupProjectResponseBody create() {
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

    public static final class Builder {
        private String requestId; 
        private String setupProjectId; 

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

        public CreateSetupProjectResponseBody build() {
            return new CreateSetupProjectResponseBody(this);
        } 

    } 

}
