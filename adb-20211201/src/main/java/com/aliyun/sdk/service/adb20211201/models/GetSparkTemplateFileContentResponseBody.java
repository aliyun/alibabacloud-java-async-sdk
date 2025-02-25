// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link GetSparkTemplateFileContentResponseBody} extends {@link TeaModel}
 *
 * <p>GetSparkTemplateFileContentResponseBody</p>
 */
public class GetSparkTemplateFileContentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D65A809F-34CE-4550-9BC1-0ED21ETG380</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSparkTemplateFileContentResponseBody build() {
            return new GetSparkTemplateFileContentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSparkTemplateFileContentResponseBody} extends {@link TeaModel}
     *
     * <p>GetSparkTemplateFileContentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppType")
        private String appType;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
        private String resourceGroupName;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <p>The application type. Valid values:</p>
             * <ul>
             * <li><strong>SQL</strong></li>
             * <li><strong>STREAMING</strong></li>
             * <li><strong>BATCH</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SQL</p>
             */
            public Builder appType(String appType) {
                this.appType = appType;
                return this;
            }

            /**
             * <p>The content of the application template.</p>
             * 
             * <strong>example:</strong>
             * <p>set spark.driver.resourceSpec=medium;set spark.executor.instances=2;set spark.executor.resourceSpec=medium;set spark.app.name=Spark SQL Test;</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The application template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>725204</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            /**
             * <p>The file type. Valid values:</p>
             * <ul>
             * <li><strong>folder</strong></li>
             * <li><strong>file</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>file</p>
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
