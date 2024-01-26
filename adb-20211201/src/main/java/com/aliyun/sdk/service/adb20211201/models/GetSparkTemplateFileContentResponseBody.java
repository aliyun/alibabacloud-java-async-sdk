// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkTemplateFileContentResponseBody} extends {@link TeaModel}
 *
 * <p>GetSparkTemplateFileContentResponseBody</p>
 */
public class GetSparkTemplateFileContentResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private GetSparkTemplateFileContentResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSparkTemplateFileContentResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSparkTemplateFileContentResponseBody build() {
            return new GetSparkTemplateFileContentResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AppType")
        private String appType;

        @NameInMap("Content")
        private String content;

        @NameInMap("Id")
        private Long id;

        @NameInMap("ResourceGroupName")
        private String resourceGroupName;

        @NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.appType = builder.appType;
            this.content = builder.content;
            this.id = builder.id;
            this.resourceGroupName = builder.resourceGroupName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appType
         */
        public String getAppType() {
            return this.appType;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return resourceGroupName
         */
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String appType; 
            private String content; 
            private Long id; 
            private String resourceGroupName; 
            private String type; 

            /**
             * The application type. Valid values:
             * <p>
             * 
             * *   **SQL**
             * *   **STREAMING**
             * *   **BATCH**
             */
            public Builder appType(String appType) {
                this.appType = appType;
                return this;
            }

            /**
             * The content of the application template.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The application template ID.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the resource group.
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            /**
             * The file type. Valid values:
             * <p>
             * 
             * *   **folder**
             * *   **file**
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
