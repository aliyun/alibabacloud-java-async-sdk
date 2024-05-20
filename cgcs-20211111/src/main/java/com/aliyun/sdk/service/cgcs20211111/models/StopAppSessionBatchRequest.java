// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopAppSessionBatchRequest} extends {@link RequestModel}
 *
 * <p>StopAppSessionBatchRequest</p>
 */
public class StopAppSessionBatchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppVersion")
    private String appVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String batchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StopParam")
    private java.util.List < StopParam> stopParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < Tags> tags;

    private StopAppSessionBatchRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appVersion = builder.appVersion;
        this.batchId = builder.batchId;
        this.projectId = builder.projectId;
        this.stopParam = builder.stopParam;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopAppSessionBatchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appVersion
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return batchId
     */
    public String getBatchId() {
        return this.batchId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return stopParam
     */
    public java.util.List < StopParam> getStopParam() {
        return this.stopParam;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<StopAppSessionBatchRequest, Builder> {
        private String appId; 
        private String appVersion; 
        private String batchId; 
        private String projectId; 
        private java.util.List < StopParam> stopParam; 
        private java.util.List < Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(StopAppSessionBatchRequest request) {
            super(request);
            this.appId = request.appId;
            this.appVersion = request.appVersion;
            this.batchId = request.batchId;
            this.projectId = request.projectId;
            this.stopParam = request.stopParam;
            this.tags = request.tags;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AppVersion.
         */
        public Builder appVersion(String appVersion) {
            this.putQueryParameter("AppVersion", appVersion);
            this.appVersion = appVersion;
            return this;
        }

        /**
         * BatchId.
         */
        public Builder batchId(String batchId) {
            this.putQueryParameter("BatchId", batchId);
            this.batchId = batchId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * StopParam.
         */
        public Builder stopParam(java.util.List < StopParam> stopParam) {
            String stopParamShrink = shrink(stopParam, "StopParam", "json");
            this.putQueryParameter("StopParam", stopParamShrink);
            this.stopParam = stopParam;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public StopAppSessionBatchRequest build() {
            return new StopAppSessionBatchRequest(this);
        } 

    } 

    public static class StopParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Object value;

        private StopParam(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StopParam create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public Object getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private Object value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Object value) {
                this.value = value;
                return this;
            }

            public StopParam build() {
                return new StopParam(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
