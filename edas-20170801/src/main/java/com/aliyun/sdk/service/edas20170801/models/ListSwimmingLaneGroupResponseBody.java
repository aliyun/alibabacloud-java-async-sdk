// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSwimmingLaneGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListSwimmingLaneGroupResponseBody</p>
 */
public class ListSwimmingLaneGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
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

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
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
        private java.util.List < Data> data; 
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
         * The data of the lane group.
         */
        public Builder data(java.util.List < Data> data) {
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

        public ListSwimmingLaneGroupResponseBody build() {
            return new ListSwimmingLaneGroupResponseBody(this);
        } 

    } 

    public static class ApplicationList extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
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

        @NameInMap("Source")
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

            /**
             * The data source. Set the value to EDAS.
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
    public static class Data extends TeaModel {
        @NameInMap("ApplicationList")
        private java.util.List < ApplicationList> applicationList;

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
        public java.util.List < ApplicationList> getApplicationList() {
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
            private java.util.List < ApplicationList> applicationList; 
            private EntryApplication entryApplication; 
            private Long id; 
            private String name; 
            private String namespaceId; 

            /**
             * The applications that are related to the lane group.
             */
            public Builder applicationList(java.util.List < ApplicationList> applicationList) {
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
             * The ID of the microservices namespace.
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
