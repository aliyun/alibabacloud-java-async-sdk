// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link CreateDatasetVersionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDatasetVersionResponseBody</p>
 */
public class CreateDatasetVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VersionName")
    private String versionName;

    private CreateDatasetVersionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.versionName = builder.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatasetVersionResponseBody create() {
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
     * @return versionName
     */
    public String getVersionName() {
        return this.versionName;
    }

    public static final class Builder {
        private String requestId; 
        private String versionName; 

        private Builder() {
        } 

        private Builder(CreateDatasetVersionResponseBody model) {
            this.requestId = model.requestId;
            this.versionName = model.versionName;
        } 

        /**
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The dataset version name.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder versionName(String versionName) {
            this.versionName = versionName;
            return this;
        }

        public CreateDatasetVersionResponseBody build() {
            return new CreateDatasetVersionResponseBody(this);
        } 

    } 

}
