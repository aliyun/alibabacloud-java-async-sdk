// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imagesearch20201214.models;

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
 * {@link IncreaseInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>IncreaseInstanceResponseBody</p>
 */
public class IncreaseInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private IncreaseInstanceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IncreaseInstanceResponseBody create() {
        return builder().build();
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

        /**
         * <p>The information about the task.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>36C43E96-8F68-44AA-B1AF-B1F7AB94A6C1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public IncreaseInstanceResponseBody build() {
            return new IncreaseInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link IncreaseInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>IncreaseInstanceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IncrementStatus")
        private String incrementStatus;

        private Data(Builder builder) {
            this.id = builder.id;
            this.incrementStatus = builder.incrementStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return incrementStatus
         */
        public String getIncrementStatus() {
            return this.incrementStatus;
        }

        public static final class Builder {
            private String id; 
            private String incrementStatus; 

            /**
             * <p>The ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The status of the task.</p>
             * <ul>
             * <li>PROCESSING: in progress</li>
             * <li>FAIL: failed</li>
             * <li>SUCCESS: successful</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PROCESSING</p>
             */
            public Builder incrementStatus(String incrementStatus) {
                this.incrementStatus = incrementStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
