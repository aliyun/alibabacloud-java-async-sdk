// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFpShotDBResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFpShotDBResponseBody</p>
 */
public class CreateFpShotDBResponseBody extends TeaModel {
    @NameInMap("FpShotDB")
    private FpShotDB fpShotDB;

    @NameInMap("RequestId")
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
         * FpShotDB.
         */
        public Builder fpShotDB(FpShotDB fpShotDB) {
            this.fpShotDB = fpShotDB;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("Config")
        private String config;

        @NameInMap("Description")
        private String description;

        @NameInMap("FpDBId")
        private String fpDBId;

        @NameInMap("ModelId")
        private Integer modelId;

        @NameInMap("Name")
        private String name;

        @NameInMap("State")
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
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * FpDBId.
             */
            public Builder fpDBId(String fpDBId) {
                this.fpDBId = fpDBId;
                return this;
            }

            /**
             * ModelId.
             */
            public Builder modelId(Integer modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * State.
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
