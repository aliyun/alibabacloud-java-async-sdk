// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link UpdateMiniAppBindingResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateMiniAppBindingResponseBody</p>
 */
public class UpdateMiniAppBindingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateMiniAppBindingResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMiniAppBindingResponseBody create() {
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

        private Builder(UpdateMiniAppBindingResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The request result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateMiniAppBindingResponseBody build() {
            return new UpdateMiniAppBindingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateMiniAppBindingResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateMiniAppBindingResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrivacyDraftId")
        private String privacyDraftId;

        @com.aliyun.core.annotation.NameInMap("PrivacyRevision")
        private String privacyRevision;

        @com.aliyun.core.annotation.NameInMap("ReadbackStatus")
        private String readbackStatus;

        @com.aliyun.core.annotation.NameInMap("Revision")
        private Long revision;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private Data(Builder builder) {
            this.privacyDraftId = builder.privacyDraftId;
            this.privacyRevision = builder.privacyRevision;
            this.readbackStatus = builder.readbackStatus;
            this.revision = builder.revision;
            this.status = builder.status;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return privacyDraftId
         */
        public String getPrivacyDraftId() {
            return this.privacyDraftId;
        }

        /**
         * @return privacyRevision
         */
        public String getPrivacyRevision() {
            return this.privacyRevision;
        }

        /**
         * @return readbackStatus
         */
        public String getReadbackStatus() {
            return this.readbackStatus;
        }

        /**
         * @return revision
         */
        public Long getRevision() {
            return this.revision;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String privacyDraftId; 
            private String privacyRevision; 
            private String readbackStatus; 
            private Long revision; 
            private String status; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.privacyDraftId = model.privacyDraftId;
                this.privacyRevision = model.privacyRevision;
                this.readbackStatus = model.readbackStatus;
                this.revision = model.revision;
                this.status = model.status;
                this.success = model.success;
            } 

            /**
             * PrivacyDraftId.
             */
            public Builder privacyDraftId(String privacyDraftId) {
                this.privacyDraftId = privacyDraftId;
                return this;
            }

            /**
             * PrivacyRevision.
             */
            public Builder privacyRevision(String privacyRevision) {
                this.privacyRevision = privacyRevision;
                return this;
            }

            /**
             * ReadbackStatus.
             */
            public Builder readbackStatus(String readbackStatus) {
                this.readbackStatus = readbackStatus;
                return this;
            }

            /**
             * Revision.
             */
            public Builder revision(Long revision) {
                this.revision = revision;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
