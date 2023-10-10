// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertSwimmingLaneGroupResponseBody} extends {@link TeaModel}
 *
 * <p>InsertSwimmingLaneGroupResponseBody</p>
 */
public class InsertSwimmingLaneGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private InsertSwimmingLaneGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertSwimmingLaneGroupResponseBody create() {
        return builder().build();
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
    public Data getData() {
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
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The data that is returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The additional information that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public InsertSwimmingLaneGroupResponseBody build() {
            return new InsertSwimmingLaneGroupResponseBody(this);
        } 

    } 

    public static class Application extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        private Application(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Application create() {
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

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The name of the application.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            public Application build() {
                return new Application(this);
            } 

        } 

    }
    public static class ApplicationList extends TeaModel {
        @NameInMap("Application")
        private java.util.List < Application> application;

        private ApplicationList(Builder builder) {
            this.application = builder.application;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationList create() {
            return builder().build();
        }

        /**
         * @return application
         */
        public java.util.List < Application> getApplication() {
            return this.application;
        }

        public static final class Builder {
            private java.util.List < Application> application; 

            /**
             * Application.
             */
            public Builder application(java.util.List < Application> application) {
                this.application = application;
                return this;
            }

            public ApplicationList build() {
                return new ApplicationList(this);
            } 

        } 

    }
    public static class EntryApplication extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        private EntryApplication(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
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

        public static final class Builder {
            private String appId; 
            private String appName; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The name of the application.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            public EntryApplication build() {
                return new EntryApplication(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ApplicationList")
        private ApplicationList applicationList;

        @NameInMap("EntryApplication")
        private EntryApplication entryApplication;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("NamespaceId")
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
        public ApplicationList getApplicationList() {
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
            private ApplicationList applicationList; 
            private EntryApplication entryApplication; 
            private Long id; 
            private String name; 
            private String namespaceId; 

            /**
             * The list of all applications that are related to the lane group.
             */
            public Builder applicationList(ApplicationList applicationList) {
                this.applicationList = applicationList;
                return this;
            }

            /**
             * The information about the Enterprise Distributed Application Service (EDAS) ingress gateway.
             */
            public Builder entryApplication(EntryApplication entryApplication) {
                this.entryApplication = entryApplication;
                return this;
            }

            /**
             * The ID of the lane group.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the lane group.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the namespace.
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
