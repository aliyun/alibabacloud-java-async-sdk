// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListThingModelVersionResponseBody} extends {@link TeaModel}
 *
 * <p>ListThingModelVersionResponseBody</p>
 */
public class ListThingModelVersionResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListThingModelVersionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListThingModelVersionResponseBody create() {
        return builder().build();
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

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
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        public ListThingModelVersionResponseBody build() {
            return new ListThingModelVersionResponseBody(this);
        } 

    } 

    public static class ModelVersions extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("ModelVersion")
        private String modelVersion;

        private ModelVersions(Builder builder) {
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.modelVersion = builder.modelVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelVersions create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return modelVersion
         */
        public String getModelVersion() {
            return this.modelVersion;
        }

        public static final class Builder {
            private String description; 
            private Long gmtCreate; 
            private String modelVersion; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * ModelVersion.
             */
            public Builder modelVersion(String modelVersion) {
                this.modelVersion = modelVersion;
                return this;
            }

            public ModelVersions build() {
                return new ModelVersions(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ModelVersions")
        private java.util.List < ModelVersions> modelVersions;

        private Data(Builder builder) {
            this.modelVersions = builder.modelVersions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return modelVersions
         */
        public java.util.List < ModelVersions> getModelVersions() {
            return this.modelVersions;
        }

        public static final class Builder {
            private java.util.List < ModelVersions> modelVersions; 

            /**
             * ModelVersions.
             */
            public Builder modelVersions(java.util.List < ModelVersions> modelVersions) {
                this.modelVersions = modelVersions;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
