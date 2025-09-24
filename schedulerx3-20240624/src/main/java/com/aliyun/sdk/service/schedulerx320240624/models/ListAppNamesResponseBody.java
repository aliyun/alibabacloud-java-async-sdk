// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link ListAppNamesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppNamesResponseBody</p>
 */
public class ListAppNamesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListAppNamesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppNamesResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListAppNamesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListAppNamesResponseBody build() {
            return new ListAppNamesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAppNamesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppNamesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppGroupId")
        private String appGroupId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppType")
        private Integer appType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("WorkerRegistry")
        private String workerRegistry;

        private Data(Builder builder) {
            this.appGroupId = builder.appGroupId;
            this.appName = builder.appName;
            this.appType = builder.appType;
            this.id = builder.id;
            this.title = builder.title;
            this.workerRegistry = builder.workerRegistry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appGroupId
         */
        public String getAppGroupId() {
            return this.appGroupId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appType
         */
        public Integer getAppType() {
            return this.appType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return workerRegistry
         */
        public String getWorkerRegistry() {
            return this.workerRegistry;
        }

        public static final class Builder {
            private String appGroupId; 
            private String appName; 
            private Integer appType; 
            private Long id; 
            private String title; 
            private String workerRegistry; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appGroupId = model.appGroupId;
                this.appName = model.appName;
                this.appType = model.appType;
                this.id = model.id;
                this.title = model.title;
                this.workerRegistry = model.workerRegistry;
            } 

            /**
             * AppGroupId.
             */
            public Builder appGroupId(String appGroupId) {
                this.appGroupId = appGroupId;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * AppType.
             */
            public Builder appType(Integer appType) {
                this.appType = appType;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * WorkerRegistry.
             */
            public Builder workerRegistry(String workerRegistry) {
                this.workerRegistry = workerRegistry;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
