// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link CreateCloudPermissionTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCloudPermissionTemplateResponseBody</p>
 */
public class CreateCloudPermissionTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CloudPermissionTemplateId")
    private String cloudPermissionTemplateId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCloudPermissionTemplateResponseBody(Builder builder) {
        this.cloudPermissionTemplateId = builder.cloudPermissionTemplateId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudPermissionTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudPermissionTemplateId
     */
    public String getCloudPermissionTemplateId() {
        return this.cloudPermissionTemplateId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String cloudPermissionTemplateId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateCloudPermissionTemplateResponseBody model) {
            this.cloudPermissionTemplateId = model.cloudPermissionTemplateId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the permission template.</p>
         * 
         * <strong>example:</strong>
         * <p>cpt_01l8dagf2iablhigj75l1n99xxxxx</p>
         */
        public Builder cloudPermissionTemplateId(String cloudPermissionTemplateId) {
            this.cloudPermissionTemplateId = cloudPermissionTemplateId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCloudPermissionTemplateResponseBody build() {
            return new CreateCloudPermissionTemplateResponseBody(this);
        } 

    } 

}
