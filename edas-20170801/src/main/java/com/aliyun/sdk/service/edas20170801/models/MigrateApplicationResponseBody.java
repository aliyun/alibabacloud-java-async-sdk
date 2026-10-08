// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link MigrateApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>MigrateApplicationResponseBody</p>
 */
public class MigrateApplicationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    private MigrateApplicationResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MigrateApplicationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private Data data; 

        private Builder() {
        } 

        private Builder(MigrateApplicationResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.data = model.data;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The additional information.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The API information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public MigrateApplicationResponseBody build() {
            return new MigrateApplicationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link MigrateApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>MigrateApplicationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("migrationId")
        private String migrationId;

        private Data(Builder builder) {
            this.migrationId = builder.migrationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return migrationId
         */
        public String getMigrationId() {
            return this.migrationId;
        }

        public static final class Builder {
            private String migrationId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.migrationId = model.migrationId;
            } 

            /**
             * <p>The migration ID.</p>
             * 
             * <strong>example:</strong>
             * <p>a3de82d7-83a4-4cca-8d1e-63f87651ce78</p>
             */
            public Builder migrationId(String migrationId) {
                this.migrationId = migrationId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
