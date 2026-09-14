// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link UpdateComputeResourceAuthUserMappingsResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateComputeResourceAuthUserMappingsResponseBody</p>
 */
public class UpdateComputeResourceAuthUserMappingsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private UpdateComputeResourceAuthUserMappingsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateComputeResourceAuthUserMappingsResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(UpdateComputeResourceAuthUserMappingsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The data object.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>10000001</p>
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

        public UpdateComputeResourceAuthUserMappingsResponseBody build() {
            return new UpdateComputeResourceAuthUserMappingsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateComputeResourceAuthUserMappingsResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateComputeResourceAuthUserMappingsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChangeRecordId")
        private Long changeRecordId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.changeRecordId = builder.changeRecordId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return changeRecordId
         */
        public Long getChangeRecordId() {
            return this.changeRecordId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long changeRecordId; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.changeRecordId = model.changeRecordId;
                this.status = model.status;
            } 

            /**
             * <p>The change record ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123xx</p>
             */
            public Builder changeRecordId(Long changeRecordId) {
                this.changeRecordId = changeRecordId;
                return this;
            }

            /**
             * <p>Indicates whether the operation succeeded. Valid values:</p>
             * <ul>
             * <li>success: The update succeeded.</li>
             * <li>fail: The update failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
