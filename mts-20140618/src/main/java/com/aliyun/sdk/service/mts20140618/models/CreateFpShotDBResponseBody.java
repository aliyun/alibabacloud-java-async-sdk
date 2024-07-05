// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * The details of the media fingerprint library.
         */
        public Builder fpShotDB(FpShotDB fpShotDB) {
            this.fpShotDB = fpShotDB;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateFpShotDBResponseBody build() {
            return new CreateFpShotDBResponseBody(this);
        } 

    } 

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

            /**
             * The configurations of the media fingerprint library.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * The description of the media fingerprint library.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the media fingerprint library. We recommend that you keep this ID for subsequent operation calls.
             */
            public Builder fpDBId(String fpDBId) {
                this.fpDBId = fpDBId;
                return this;
            }

            /**
             * The model ID of the media fingerprint library.
             */
            public Builder modelId(Integer modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * The name of the media fingerprint library.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The status of the media fingerprint library. After the media fingerprint library is created, it enters the **offline** state. After the media fingerprint library is processed at the backend, it enters the **active** state.
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
