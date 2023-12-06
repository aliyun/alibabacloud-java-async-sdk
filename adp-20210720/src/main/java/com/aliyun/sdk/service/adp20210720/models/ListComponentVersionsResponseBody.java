// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListComponentVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListComponentVersionsResponseBody</p>
 */
public class ListComponentVersionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("msg")
    private String msg;

    private ListComponentVersionsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListComponentVersionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    public static final class Builder {
        private String requestId; 
        private String code; 
        private Data data; 
        private String msg; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        public ListComponentVersionsResponseBody build() {
            return new ListComponentVersionsResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("appVersion")
        private String appVersion;

        @NameInMap("componentName")
        private String componentName;

        @NameInMap("componentUID")
        private String componentUID;

        @NameInMap("description")
        private String description;

        @NameInMap("documents")
        private String documents;

        @NameInMap("imagesMapping")
        private String imagesMapping;

        @NameInMap("orchestrationValues")
        private String orchestrationValues;

        @NameInMap("packageURL")
        private String packageURL;

        @NameInMap("parentComponent")
        private Boolean parentComponent;

        @NameInMap("readme")
        private String readme;

        @NameInMap("resources")
        private String resources;

        @NameInMap("uid")
        private String uid;

        @NameInMap("version")
        private String version;

        private List(Builder builder) {
            this.appVersion = builder.appVersion;
            this.componentName = builder.componentName;
            this.componentUID = builder.componentUID;
            this.description = builder.description;
            this.documents = builder.documents;
            this.imagesMapping = builder.imagesMapping;
            this.orchestrationValues = builder.orchestrationValues;
            this.packageURL = builder.packageURL;
            this.parentComponent = builder.parentComponent;
            this.readme = builder.readme;
            this.resources = builder.resources;
            this.uid = builder.uid;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return appVersion
         */
        public String getAppVersion() {
            return this.appVersion;
        }

        /**
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        /**
         * @return componentUID
         */
        public String getComponentUID() {
            return this.componentUID;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return documents
         */
        public String getDocuments() {
            return this.documents;
        }

        /**
         * @return imagesMapping
         */
        public String getImagesMapping() {
            return this.imagesMapping;
        }

        /**
         * @return orchestrationValues
         */
        public String getOrchestrationValues() {
            return this.orchestrationValues;
        }

        /**
         * @return packageURL
         */
        public String getPackageURL() {
            return this.packageURL;
        }

        /**
         * @return parentComponent
         */
        public Boolean getParentComponent() {
            return this.parentComponent;
        }

        /**
         * @return readme
         */
        public String getReadme() {
            return this.readme;
        }

        /**
         * @return resources
         */
        public String getResources() {
            return this.resources;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String appVersion; 
            private String componentName; 
            private String componentUID; 
            private String description; 
            private String documents; 
            private String imagesMapping; 
            private String orchestrationValues; 
            private String packageURL; 
            private Boolean parentComponent; 
            private String readme; 
            private String resources; 
            private String uid; 
            private String version; 

            /**
             * appVersion.
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * componentName.
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * componentUID.
             */
            public Builder componentUID(String componentUID) {
                this.componentUID = componentUID;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * documents.
             */
            public Builder documents(String documents) {
                this.documents = documents;
                return this;
            }

            /**
             * imagesMapping.
             */
            public Builder imagesMapping(String imagesMapping) {
                this.imagesMapping = imagesMapping;
                return this;
            }

            /**
             * orchestrationValues.
             */
            public Builder orchestrationValues(String orchestrationValues) {
                this.orchestrationValues = orchestrationValues;
                return this;
            }

            /**
             * packageURL.
             */
            public Builder packageURL(String packageURL) {
                this.packageURL = packageURL;
                return this;
            }

            /**
             * parentComponent.
             */
            public Builder parentComponent(Boolean parentComponent) {
                this.parentComponent = parentComponent;
                return this;
            }

            /**
             * readme.
             */
            public Builder readme(String readme) {
                this.readme = readme;
                return this;
            }

            /**
             * resources.
             */
            public Builder resources(String resources) {
                this.resources = resources;
                return this;
            }

            /**
             * uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("list")
        private java.util.List < List> list;

        @NameInMap("pageNum")
        private Integer pageNum;

        @NameInMap("pageSize")
        private Integer pageSize;

        @NameInMap("total")
        private Integer total;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer total; 

            /**
             * list.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * pageNum.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
