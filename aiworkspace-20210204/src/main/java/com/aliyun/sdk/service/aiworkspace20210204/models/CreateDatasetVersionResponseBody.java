// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDatasetVersionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDatasetVersionResponseBody</p>
 */
public class CreateDatasetVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("VersionName")
    private String versionName;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateDatasetVersionResponseBody(Builder builder) {
        this.versionName = builder.versionName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatasetVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return versionName
     */
    public String getVersionName() {
        return this.versionName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String versionName; 
        private String requestId; 

        /**
         * VersionName.
         */
        public Builder versionName(String versionName) {
            this.versionName = versionName;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDatasetVersionResponseBody build() {
            return new CreateDatasetVersionResponseBody(this);
        } 

    } 

}
