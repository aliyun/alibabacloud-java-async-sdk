// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link GetResourceGroupAgentModelSettingsResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceGroupAgentModelSettingsResponseBody</p>
 */
public class GetResourceGroupAgentModelSettingsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private GetResourceGroupAgentModelSettingsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceGroupAgentModelSettingsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(GetResourceGroupAgentModelSettingsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of model settings for resource groups. One record is returned for each resource group ID specified in the request. If a resource group is not associated with a model group under the specified agent platform and provider, ModelTemplateId and ModelTemplateName are empty.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID, which uniquely identifies the request.</p>
         * 
         * <strong>example:</strong>
         * <p>XXXXXXXX-XXXX-XXXX-XXXX-XXXXXXXXXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total count.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetResourceGroupAgentModelSettingsResponseBody build() {
            return new GetResourceGroupAgentModelSettingsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetResourceGroupAgentModelSettingsResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceGroupAgentModelSettingsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModelTemplateId")
        private String modelTemplateId;

        @com.aliyun.core.annotation.NameInMap("ModelTemplateName")
        private String modelTemplateName;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        private Data(Builder builder) {
            this.modelTemplateId = builder.modelTemplateId;
            this.modelTemplateName = builder.modelTemplateName;
            this.resourceGroupId = builder.resourceGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return modelTemplateId
         */
        public String getModelTemplateId() {
            return this.modelTemplateId;
        }

        /**
         * @return modelTemplateName
         */
        public String getModelTemplateName() {
            return this.modelTemplateName;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public static final class Builder {
            private String modelTemplateId; 
            private String modelTemplateName; 
            private String resourceGroupId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.modelTemplateId = model.modelTemplateId;
                this.modelTemplateName = model.modelTemplateName;
                this.resourceGroupId = model.resourceGroupId;
            } 

            /**
             * <p>The model group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>mt-xxxxx</p>
             */
            public Builder modelTemplateId(String modelTemplateId) {
                this.modelTemplateId = modelTemplateId;
                return this;
            }

            /**
             * <p>The model group name.</p>
             * 
             * <strong>example:</strong>
             * <p>Default model group</p>
             */
            public Builder modelTemplateName(String modelTemplateName) {
                this.modelTemplateName = modelTemplateName;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-xxxxx</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
