// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceTemplatesResponseBody</p>
 */
public class ListServiceTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceTemplates")
    private java.util.List < ServiceTemplate > serviceTemplates;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListServiceTemplatesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serviceTemplates = builder.serviceTemplates;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceTemplatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceTemplates
     */
    public java.util.List < ServiceTemplate > getServiceTemplates() {
        return this.serviceTemplates;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ServiceTemplate > serviceTemplates; 
        private Long totalCount; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServiceTemplates.
         */
        public Builder serviceTemplates(java.util.List < ServiceTemplate > serviceTemplates) {
            this.serviceTemplates = serviceTemplates;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListServiceTemplatesResponseBody build() {
            return new ListServiceTemplatesResponseBody(this);
        } 

    } 

}
