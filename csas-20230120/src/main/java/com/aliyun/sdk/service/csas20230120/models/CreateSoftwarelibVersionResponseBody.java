// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link CreateSoftwarelibVersionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSoftwarelibVersionResponseBody</p>
 */
public class CreateSoftwarelibVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VersionId")
    private String versionId;

    private CreateSoftwarelibVersionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSoftwarelibVersionResponseBody create() {
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
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder {
        private String requestId; 
        private String versionId; 

        private Builder() {
        } 

        private Builder(CreateSoftwarelibVersionResponseBody model) {
            this.requestId = model.requestId;
            this.versionId = model.versionId;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2CABFEBB-0CE7-575E-833A-266F75D46713</p>
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

        public CreateSoftwarelibVersionResponseBody build() {
            return new CreateSoftwarelibVersionResponseBody(this);
        } 

    } 

}
