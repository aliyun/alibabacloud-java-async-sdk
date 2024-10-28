// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateEdgeContainerAppVersionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEdgeContainerAppVersionResponseBody</p>
 */
public class CreateEdgeContainerAppVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VersionId")
    private String versionId;

    private CreateEdgeContainerAppVersionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEdgeContainerAppVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder {
        private String requestId; 
        private String versionId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VersionId.
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        public CreateEdgeContainerAppVersionResponseBody build() {
            return new CreateEdgeContainerAppVersionResponseBody(this);
        } 

    } 

}
