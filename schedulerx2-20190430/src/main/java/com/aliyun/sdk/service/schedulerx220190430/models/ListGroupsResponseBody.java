// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

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
 * {@link ListGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListGroupsResponseBody</p>
 */
public class ListGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListGroupsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGroupsResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListGroupsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The applications.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>message</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>71BCC0E3-64B2-4B63-A870-AFB64EBCB58A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListGroupsResponseBody build() {
            return new ListGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListGroupsResponseBody</p>
     */
    public static class AppGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppGroupId")
        private Long appGroupId;

        @com.aliyun.core.annotation.NameInMap("AppKey")
        private String appKey;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppVersion")
        private Integer appVersion;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        private AppGroups(Builder builder) {
            this.appGroupId = builder.appGroupId;
            this.appKey = builder.appKey;
            this.appName = builder.appName;
            this.appVersion = builder.appVersion;
            this.description = builder.description;
            this.groupId = builder.groupId;
            this.namespace = builder.namespace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppGroups create() {
            return builder().build();
        }

        /**
         * @return appGroupId
         */
        public Long getAppGroupId() {
            return this.appGroupId;
        }

        /**
         * @return appKey
         */
        public String getAppKey() {
            return this.appKey;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appVersion
         */
        public Integer getAppVersion() {
            return this.appVersion;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        public static final class Builder {
            private Long appGroupId; 
            private String appKey; 
            private String appName; 
            private Integer appVersion; 
            private String description; 
            private String groupId; 
            private String namespace; 

            private Builder() {
            } 

            private Builder(AppGroups model) {
                this.appGroupId = model.appGroupId;
                this.appKey = model.appKey;
                this.appName = model.appName;
                this.appVersion = model.appVersion;
                this.description = model.description;
                this.groupId = model.groupId;
                this.namespace = model.namespace;
            } 

            /**
             * <p>The application group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder appGroupId(Long appGroupId) {
                this.appGroupId = appGroupId;
                return this;
            }

            /**
             * <p>The AppKey for the application.</p>
             * 
             * <strong>example:</strong>
             * <p>a3G77O6NZxq/lyo1NC****==</p>
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>DocTest</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The application version. 1: Basic version, 2: Professional version.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder appVersion(Integer appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * <p>The description of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>DocTest.Group</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The ID of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>1a72ecb1-b4cc-400a-a71b-20cdec9b****</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            public AppGroups build() {
                return new AppGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListGroupsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppGroups")
        private java.util.List<AppGroups> appGroups;

        private Data(Builder builder) {
            this.appGroups = builder.appGroups;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appGroups
         */
        public java.util.List<AppGroups> getAppGroups() {
            return this.appGroups;
        }

        public static final class Builder {
            private java.util.List<AppGroups> appGroups; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appGroups = model.appGroups;
            } 

            /**
             * <p>The applications and their details.</p>
             */
            public Builder appGroups(java.util.List<AppGroups> appGroups) {
                this.appGroups = appGroups;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
