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
 * {@link CreateModelVersionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateModelVersionResponseBody</p>
 */
public class CreateModelVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VersionName")
    private String versionName;

    private CreateModelVersionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.versionName = builder.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelVersionResponseBody create() {
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

        private Builder(CreateModelVersionResponseBody model) {
            this.requestId = model.requestId;
            this.versionName = model.versionName;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>21645FCD-BAB9-5742-89AE-AEB27****B2E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The model version.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1.0</p>
         */
        public Builder versionName(String versionName) {
            this.versionName = versionName;
            return this;
        }

        public CreateModelVersionResponseBody build() {
            return new CreateModelVersionResponseBody(this);
        } 

    } 

}
