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
 * {@link DumpMetaResponseBody} extends {@link TeaModel}
 *
 * <p>DumpMetaResponseBody</p>
 */
public class DumpMetaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DumpMetaResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DumpMetaResponseBody create() {
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
         * <p>The information about the export task.</p>
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

        public DumpMetaResponseBody build() {
            return new DumpMetaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DumpMetaResponseBody} extends {@link TeaModel}
     *
     * <p>DumpMetaResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DumpMetaStatus")
        private String dumpMetaStatus;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        private Data(Builder builder) {
            this.dumpMetaStatus = builder.dumpMetaStatus;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dumpMetaStatus
         */
        public String getDumpMetaStatus() {
            return this.dumpMetaStatus;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String dumpMetaStatus; 
            private String id; 

            /**
             * <p>The status of the export task.</p>
             * <ul>
             * <li>PROCESSING: in progress</li>
             * <li>FAIL: failed</li>
             * <li>SUCCESS: successful</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PROCESSING</p>
             */
            public Builder dumpMetaStatus(String dumpMetaStatus) {
                this.dumpMetaStatus = dumpMetaStatus;
                return this;
            }

            /**
             * <p>The ID of the export task.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
