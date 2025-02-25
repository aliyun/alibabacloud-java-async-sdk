// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreatePlaybookResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePlaybookResponseBody</p>
 */
public class CreatePlaybookResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreatePlaybookResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePlaybookResponseBody create() {
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

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B09B40B2-F11E-512C-B755-423F2056C17B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePlaybookResponseBody build() {
            return new CreatePlaybookResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreatePlaybookResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePlaybookResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
        private String playbookUuid;

        private Data(Builder builder) {
            this.playbookUuid = builder.playbookUuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return playbookUuid
         */
        public String getPlaybookUuid() {
            return this.playbookUuid;
        }

        public static final class Builder {
            private String playbookUuid; 

            /**
             * <p>The UUID of the playbook.</p>
             * 
             * <strong>example:</strong>
             * <p>9e38111e-9794-4784-9ca8-xxxxxxx</p>
             */
            public Builder playbookUuid(String playbookUuid) {
                this.playbookUuid = playbookUuid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
