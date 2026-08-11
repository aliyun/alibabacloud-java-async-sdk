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
 * {@link GetLogSyncToSLSResponseBody} extends {@link TeaModel}
 *
 * <p>GetLogSyncToSLSResponseBody</p>
 */
public class GetLogSyncToSLSResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetLogSyncToSLSResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLogSyncToSLSResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetLogSyncToSLSResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetLogSyncToSLSResponseBody build() {
            return new GetLogSyncToSLSResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLogSyncToSLSResponseBody} extends {@link TeaModel}
     *
     * <p>GetLogSyncToSLSResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TargetLogStore")
        private String targetLogStore;

        @com.aliyun.core.annotation.NameInMap("TargetProject")
        private String targetProject;

        private Data(Builder builder) {
            this.status = builder.status;
            this.targetLogStore = builder.targetLogStore;
            this.targetProject = builder.targetProject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return targetLogStore
         */
        public String getTargetLogStore() {
            return this.targetLogStore;
        }

        /**
         * @return targetProject
         */
        public String getTargetProject() {
            return this.targetProject;
        }

        public static final class Builder {
            private String status; 
            private String targetLogStore; 
            private String targetProject; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.status = model.status;
                this.targetLogStore = model.targetLogStore;
                this.targetProject = model.targetProject;
            } 

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TargetLogStore.
             */
            public Builder targetLogStore(String targetLogStore) {
                this.targetLogStore = targetLogStore;
                return this;
            }

            /**
             * TargetProject.
             */
            public Builder targetProject(String targetProject) {
                this.targetProject = targetProject;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
