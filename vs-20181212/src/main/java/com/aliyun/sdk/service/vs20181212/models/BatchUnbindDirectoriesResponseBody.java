// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link BatchUnbindDirectoriesResponseBody} extends {@link TeaModel}
 *
 * <p>BatchUnbindDirectoriesResponseBody</p>
 */
public class BatchUnbindDirectoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private java.util.List<Results> results;

    private BatchUnbindDirectoriesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchUnbindDirectoriesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return results
     */
    public java.util.List<Results> getResults() {
        return this.results;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Results> results; 

        private Builder() {
        } 

        private Builder(BatchUnbindDirectoriesResponseBody model) {
            this.requestId = model.requestId;
            this.results = model.results;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>64DB7F34-11A8-45DC-A421-40ACF446282C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of results.</p>
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        public BatchUnbindDirectoriesResponseBody build() {
            return new BatchUnbindDirectoriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchUnbindDirectoriesResponseBody} extends {@link TeaModel}
     *
     * <p>BatchUnbindDirectoriesResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("DirectoryId")
        private String directoryId;

        @com.aliyun.core.annotation.NameInMap("Error")
        private String error;

        private Results(Builder builder) {
            this.deviceId = builder.deviceId;
            this.directoryId = builder.directoryId;
            this.error = builder.error;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return directoryId
         */
        public String getDirectoryId() {
            return this.directoryId;
        }

        /**
         * @return error
         */
        public String getError() {
            return this.error;
        }

        public static final class Builder {
            private String deviceId; 
            private String directoryId; 
            private String error; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.deviceId = model.deviceId;
                this.directoryId = model.directoryId;
                this.error = model.error;
            } 

            /**
             * <p>Folder ID.</p>
             * 
             * <strong>example:</strong>
             * <p>348*****380-cn-qingdao</p>
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * <p>The folder ID.</p>
             * 
             * <strong>example:</strong>
             * <p>399*****488-cn-qingdao</p>
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * <p>The error message for the detach operation.</p>
             * <blockquote>
             * <p>This field appears only if an error occurs.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>An error occurred while processing your request.</p>
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
