// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

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
 * {@link ModifyQuotaTemplateServiceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyQuotaTemplateServiceStatusResponseBody</p>
 */
public class ModifyQuotaTemplateServiceStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TemplateServiceStatus")
    private TemplateServiceStatus templateServiceStatus;

    private ModifyQuotaTemplateServiceStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.templateServiceStatus = builder.templateServiceStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyQuotaTemplateServiceStatusResponseBody create() {
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
     * @return templateServiceStatus
     */
    public TemplateServiceStatus getTemplateServiceStatus() {
        return this.templateServiceStatus;
    }

    public static final class Builder {
        private String requestId; 
        private TemplateServiceStatus templateServiceStatus; 

        private Builder() {
        } 

        private Builder(ModifyQuotaTemplateServiceStatusResponseBody model) {
            this.requestId = model.requestId;
            this.templateServiceStatus = model.templateServiceStatus;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D47B3A10-CDAC-5412-B2EE-EC9A3DBE9053</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the quota template.</p>
         */
        public Builder templateServiceStatus(TemplateServiceStatus templateServiceStatus) {
            this.templateServiceStatus = templateServiceStatus;
            return this;
        }

        public ModifyQuotaTemplateServiceStatusResponseBody build() {
            return new ModifyQuotaTemplateServiceStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyQuotaTemplateServiceStatusResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyQuotaTemplateServiceStatusResponseBody</p>
     */
    public static class TemplateServiceStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceDirectoryId")
        private String resourceDirectoryId;

        @com.aliyun.core.annotation.NameInMap("ServiceStatus")
        private Integer serviceStatus;

        private TemplateServiceStatus(Builder builder) {
            this.resourceDirectoryId = builder.resourceDirectoryId;
            this.serviceStatus = builder.serviceStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateServiceStatus create() {
            return builder().build();
        }

        /**
         * @return resourceDirectoryId
         */
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        /**
         * @return serviceStatus
         */
        public Integer getServiceStatus() {
            return this.serviceStatus;
        }

        public static final class Builder {
            private String resourceDirectoryId; 
            private Integer serviceStatus; 

            private Builder() {
            } 

            private Builder(TemplateServiceStatus model) {
                this.resourceDirectoryId = model.resourceDirectoryId;
                this.serviceStatus = model.serviceStatus;
            } 

            /**
             * <p>The ID of the resource directory.</p>
             * 
             * <strong>example:</strong>
             * <p>rd-pG****</p>
             */
            public Builder resourceDirectoryId(String resourceDirectoryId) {
                this.resourceDirectoryId = resourceDirectoryId;
                return this;
            }

            /**
             * <p>The status of the quota template. Valid values:</p>
             * <ul>
             * <li><p>-1: The quota template is disabled.</p>
             * </li>
             * <li><p>1: The quota template is enabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder serviceStatus(Integer serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            public TemplateServiceStatus build() {
                return new TemplateServiceStatus(this);
            } 

        } 

    }
}
