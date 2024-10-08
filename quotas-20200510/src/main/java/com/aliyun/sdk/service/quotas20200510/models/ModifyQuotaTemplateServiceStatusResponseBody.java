// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the quota template.
         */
        public Builder templateServiceStatus(TemplateServiceStatus templateServiceStatus) {
            this.templateServiceStatus = templateServiceStatus;
            return this;
        }

        public ModifyQuotaTemplateServiceStatusResponseBody build() {
            return new ModifyQuotaTemplateServiceStatusResponseBody(this);
        } 

    } 

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

            /**
             * The ID of the resource directory.
             */
            public Builder resourceDirectoryId(String resourceDirectoryId) {
                this.resourceDirectoryId = resourceDirectoryId;
                return this;
            }

            /**
             * The status of the quota template. Valid values:
             * <p>
             * 
             * *   \-1: The quota template is disabled.
             * *   1: The quota template is enabled.
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
