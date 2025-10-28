// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link ListSwimmingLaneGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListSwimmingLaneGroupResponseBody</p>
 */
public class ListSwimmingLaneGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListSwimmingLaneGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSwimmingLaneGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListSwimmingLaneGroupResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data of the lane group.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The additional information that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BF238E37-671A-5045-B49A-0B29C166****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSwimmingLaneGroupResponseBody build() {
            return new ListSwimmingLaneGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSwimmingLaneGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListSwimmingLaneGroupResponseBody</p>
     */
    public static class ApplicationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        private ApplicationList(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationList create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 

            private Builder() {
            } 

            private Builder(ApplicationList model) {
                this.appId = model.appId;
                this.appName = model.appName;
            } 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>406073bf-afc2-4142-b3d7-629a0308****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>java-app</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            public ApplicationList build() {
                return new ApplicationList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSwimmingLaneGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListSwimmingLaneGroupResponseBody</p>
     */
    public static class EntryApplication extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        private EntryApplication(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntryApplication create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String source; 

            private Builder() {
            } 

            private Builder(EntryApplication model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.source = model.source;
            } 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>406073bf-afc2-4142-b3d7-629a0308****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>java-app</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The data source. Set the value to EDAS.</p>
             * 
             * <strong>example:</strong>
             * <p>EDAS</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public EntryApplication build() {
                return new EntryApplication(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSwimmingLaneGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListSwimmingLaneGroupResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationList")
        private java.util.List<ApplicationList> applicationList;

        @com.aliyun.core.annotation.NameInMap("EntryApplication")
        private EntryApplication entryApplication;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NamespaceId")
        private String namespaceId;

        private Data(Builder builder) {
            this.applicationList = builder.applicationList;
            this.entryApplication = builder.entryApplication;
            this.id = builder.id;
            this.name = builder.name;
            this.namespaceId = builder.namespaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return applicationList
         */
        public java.util.List<ApplicationList> getApplicationList() {
            return this.applicationList;
        }

        /**
         * @return entryApplication
         */
        public EntryApplication getEntryApplication() {
            return this.entryApplication;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public static final class Builder {
            private java.util.List<ApplicationList> applicationList; 
            private EntryApplication entryApplication; 
            private Long id; 
            private String name; 
            private String namespaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.applicationList = model.applicationList;
                this.entryApplication = model.entryApplication;
                this.id = model.id;
                this.name = model.name;
                this.namespaceId = model.namespaceId;
            } 

            /**
             * <p>The applications that are related to the lane group.</p>
             */
            public Builder applicationList(java.util.List<ApplicationList> applicationList) {
                this.applicationList = applicationList;
                return this;
            }

            /**
             * <p>The information about the Enterprise Distributed Application Service (EDAS) ingress gateway.</p>
             */
            public Builder entryApplication(EntryApplication entryApplication) {
                this.entryApplication = entryApplication;
                return this;
            }

            /**
             * <p>The ID of the lane group.</p>
             * 
             * <strong>example:</strong>
             * <p>257</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the lane group.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the microservices namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai:daily</p>
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
