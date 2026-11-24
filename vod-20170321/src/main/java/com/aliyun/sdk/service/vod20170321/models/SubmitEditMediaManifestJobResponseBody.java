// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link SubmitEditMediaManifestJobResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitEditMediaManifestJobResponseBody</p>
 */
public class SubmitEditMediaManifestJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ManifestEditJobId")
    private String manifestEditJobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SubmitEditMediaManifestJobResponseBody(Builder builder) {
        this.manifestEditJobId = builder.manifestEditJobId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitEditMediaManifestJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return manifestEditJobId
     */
    public String getManifestEditJobId() {
        return this.manifestEditJobId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String manifestEditJobId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SubmitEditMediaManifestJobResponseBody model) {
            this.manifestEditJobId = model.manifestEditJobId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The manifest editing task ID, which is the MediaConvert pipeline task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>93e154cb83e54b7a0f1236f847f4****</p>
         */
        public Builder manifestEditJobId(String manifestEditJobId) {
            this.manifestEditJobId = manifestEditJobId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4AF6-D7393642CA58****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SubmitEditMediaManifestJobResponseBody build() {
            return new SubmitEditMediaManifestJobResponseBody(this);
        } 

    } 

}
