// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

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
 * {@link CreateFpShotDBResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFpShotDBResponseBody</p>
 */
public class CreateFpShotDBResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FpShotDB")
    private FpShotDB fpShotDB;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateFpShotDBResponseBody(Builder builder) {
        this.fpShotDB = builder.fpShotDB;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFpShotDBResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fpShotDB
     */
    public FpShotDB getFpShotDB() {
        return this.fpShotDB;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private FpShotDB fpShotDB; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateFpShotDBResponseBody model) {
            this.fpShotDB = model.fpShotDB;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the media fingerprint library.</p>
         */
        public Builder fpShotDB(FpShotDB fpShotDB) {
            this.fpShotDB = fpShotDB;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4A13-BEF6-D7393642CA58</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateFpShotDBResponseBody build() {
            return new CreateFpShotDBResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateFpShotDBResponseBody} extends {@link TeaModel}
     *
     * <p>CreateFpShotDBResponseBody</p>
     */
    public static class FpShotDB extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FpDBId")
        private String fpDBId;

        @com.aliyun.core.annotation.NameInMap("ModelId")
        private Integer modelId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private FpShotDB(Builder builder) {
            this.config = builder.config;
            this.description = builder.description;
            this.fpDBId = builder.fpDBId;
            this.modelId = builder.modelId;
            this.name = builder.name;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FpShotDB create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fpDBId
         */
        public String getFpDBId() {
            return this.fpDBId;
        }

        /**
         * @return modelId
         */
        public Integer getModelId() {
            return this.modelId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String config; 
            private String description; 
            private String fpDBId; 
            private Integer modelId; 
            private String name; 
            private String state; 

            private Builder() {
            } 

            private Builder(FpShotDB model) {
                this.config = model.config;
                this.description = model.description;
                this.fpDBId = model.fpDBId;
                this.modelId = model.modelId;
                this.name = model.name;
                this.state = model.state;
            } 

            /**
             * <p>The configurations of the media fingerprint library.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The description of the media fingerprint library.</p>
             * 
             * <strong>example:</strong>
             * <p>The library is a text fingerprint library.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the media fingerprint library. We recommend that you keep this ID for subsequent operation calls.</p>
             * 
             * <strong>example:</strong>
             * <p>88c6ca184c0e47098a5b665e2a12****</p>
             */
            public Builder fpDBId(String fpDBId) {
                this.fpDBId = fpDBId;
                return this;
            }

            /**
             * <p>The model ID of the media fingerprint library.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder modelId(Integer modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * <p>The name of the media fingerprint library.</p>
             * 
             * <strong>example:</strong>
             * <p>example-name-****</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status of the media fingerprint library. After the media fingerprint library is created, it enters the <strong>offline</strong> state. After the media fingerprint library is processed at the backend, it enters the <strong>active</strong> state.</p>
             * 
             * <strong>example:</strong>
             * <p>offline</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public FpShotDB build() {
                return new FpShotDB(this);
            } 

        } 

    }
}
