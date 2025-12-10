// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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
 * {@link MigrateExperimentsResponseBody} extends {@link TeaModel}
 *
 * <p>MigrateExperimentsResponseBody</p>
 */
public class MigrateExperimentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private MigrateExperimentsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MigrateExperimentsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(MigrateExperimentsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public MigrateExperimentsResponseBody build() {
            return new MigrateExperimentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link MigrateExperimentsResponseBody} extends {@link TeaModel}
     *
     * <p>MigrateExperimentsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlreadyExists")
        private Boolean alreadyExists;

        @com.aliyun.core.annotation.NameInMap("ExperimentId")
        private String experimentId;

        @com.aliyun.core.annotation.NameInMap("Updated")
        private Boolean updated;

        private Data(Builder builder) {
            this.alreadyExists = builder.alreadyExists;
            this.experimentId = builder.experimentId;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alreadyExists
         */
        public Boolean getAlreadyExists() {
            return this.alreadyExists;
        }

        /**
         * @return experimentId
         */
        public String getExperimentId() {
            return this.experimentId;
        }

        /**
         * @return updated
         */
        public Boolean getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private Boolean alreadyExists; 
            private String experimentId; 
            private Boolean updated; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.alreadyExists = model.alreadyExists;
                this.experimentId = model.experimentId;
                this.updated = model.updated;
            } 

            /**
             * AlreadyExists.
             */
            public Builder alreadyExists(Boolean alreadyExists) {
                this.alreadyExists = alreadyExists;
                return this;
            }

            /**
             * ExperimentId.
             */
            public Builder experimentId(String experimentId) {
                this.experimentId = experimentId;
                return this;
            }

            /**
             * Updated.
             */
            public Builder updated(Boolean updated) {
                this.updated = updated;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
