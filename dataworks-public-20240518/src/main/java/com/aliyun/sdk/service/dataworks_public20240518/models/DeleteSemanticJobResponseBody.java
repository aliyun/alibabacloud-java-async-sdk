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
 * {@link DeleteSemanticJobResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteSemanticJobResponseBody</p>
 */
public class DeleteSemanticJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DeleteSemanticJobResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSemanticJobResponseBody create() {
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

        private Builder(DeleteSemanticJobResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeleteSemanticJobResponseBody build() {
            return new DeleteSemanticJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteSemanticJobResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteSemanticJobResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArchivedJobName")
        private String archivedJobName;

        @com.aliyun.core.annotation.NameInMap("Deleted")
        private Boolean deleted;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        private Data(Builder builder) {
            this.archivedJobName = builder.archivedJobName;
            this.deleted = builder.deleted;
            this.id = builder.id;
            this.jobName = builder.jobName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return archivedJobName
         */
        public String getArchivedJobName() {
            return this.archivedJobName;
        }

        /**
         * @return deleted
         */
        public Boolean getDeleted() {
            return this.deleted;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        public static final class Builder {
            private String archivedJobName; 
            private Boolean deleted; 
            private Long id; 
            private String jobName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.archivedJobName = model.archivedJobName;
                this.deleted = model.deleted;
                this.id = model.id;
                this.jobName = model.jobName;
            } 

            /**
             * ArchivedJobName.
             */
            public Builder archivedJobName(String archivedJobName) {
                this.archivedJobName = archivedJobName;
                return this;
            }

            /**
             * Deleted.
             */
            public Builder deleted(Boolean deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * JobName.
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
