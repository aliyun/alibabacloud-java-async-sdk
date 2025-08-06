// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link GetInstancePropertiesResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstancePropertiesResponseBody</p>
 */
public class GetInstancePropertiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PropertyTemplateModel")
    private PropertyTemplateModel propertyTemplateModel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetInstancePropertiesResponseBody(Builder builder) {
        this.propertyTemplateModel = builder.propertyTemplateModel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstancePropertiesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return propertyTemplateModel
     */
    public PropertyTemplateModel getPropertyTemplateModel() {
        return this.propertyTemplateModel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PropertyTemplateModel propertyTemplateModel; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetInstancePropertiesResponseBody model) {
            this.propertyTemplateModel = model.propertyTemplateModel;
            this.requestId = model.requestId;
        } 

        /**
         * PropertyTemplateModel.
         */
        public Builder propertyTemplateModel(PropertyTemplateModel propertyTemplateModel) {
            this.propertyTemplateModel = propertyTemplateModel;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstancePropertiesResponseBody build() {
            return new GetInstancePropertiesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstancePropertiesResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstancePropertiesResponseBody</p>
     */
    public static class PropertyTemplateModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        private PropertyTemplateModel(Builder builder) {
            this.content = builder.content;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyTemplateModel create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        public static final class Builder {
            private String content; 

            private Builder() {
            } 

            private Builder(PropertyTemplateModel model) {
                this.content = model.content;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            public PropertyTemplateModel build() {
                return new PropertyTemplateModel(this);
            } 

        } 

    }
}
