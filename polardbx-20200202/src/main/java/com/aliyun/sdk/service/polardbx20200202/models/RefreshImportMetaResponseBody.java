// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link RefreshImportMetaResponseBody} extends {@link TeaModel}
 *
 * <p>RefreshImportMetaResponseBody</p>
 */
public class RefreshImportMetaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private RefreshImportMetaResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshImportMetaResponseBody create() {
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(RefreshImportMetaResponseBody model) {
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The monitoring data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The result details of the import or export task. &gt; This parameter is empty unless an exception occurs.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AE4F6C34-065F-45AA-B5DC-4B8D816F6305</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public RefreshImportMetaResponseBody build() {
            return new RefreshImportMetaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RefreshImportMetaResponseBody} extends {@link TeaModel}
     *
     * <p>RefreshImportMetaResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SlinkTaskId")
        private String slinkTaskId;

        private Data(Builder builder) {
            this.slinkTaskId = builder.slinkTaskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return slinkTaskId
         */
        public String getSlinkTaskId() {
            return this.slinkTaskId;
        }

        public static final class Builder {
            private String slinkTaskId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.slinkTaskId = model.slinkTaskId;
            } 

            /**
             * <p>The export task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>etx-szr2rr6i*****</p>
             */
            public Builder slinkTaskId(String slinkTaskId) {
                this.slinkTaskId = slinkTaskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
