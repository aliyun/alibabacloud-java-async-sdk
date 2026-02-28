// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link ListThingModelVersionResponseBody} extends {@link TeaModel}
 *
 * <p>ListThingModelVersionResponseBody</p>
 */
public class ListThingModelVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

        private Builder() {
        } 

        private Builder(ListThingModelVersionResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned if the call is successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListThingModelVersionResponseBody build() {
            return new ListThingModelVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListThingModelVersionResponseBody} extends {@link TeaModel}
     *
     * <p>ListThingModelVersionResponseBody</p>
     */
    public static class ModelVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("ModelVersion")
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

            private Builder() {
            } 

            private Builder(ModelVersions model) {
                this.description = model.description;
                this.gmtCreate = model.gmtCreate;
                this.modelVersion = model.modelVersion;
            } 

            /**
             * <p>The description of the TSL model version.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The timestamp when the TSL model version was published. The time is displayed in UTC. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1579235657535</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The version number of the TSL model.</p>
             * 
             * <strong>example:</strong>
             * <p>V1.0.0</p>
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
    /**
     * 
     * {@link ListThingModelVersionResponseBody} extends {@link TeaModel}
     *
     * <p>ListThingModelVersionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModelVersions")
        private java.util.List<ModelVersions> modelVersions;

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
        public java.util.List<ModelVersions> getModelVersions() {
            return this.modelVersions;
        }

        public static final class Builder {
            private java.util.List<ModelVersions> modelVersions; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.modelVersions = model.modelVersions;
            } 

            /**
             * <p>The list of TSL model versions. The versions are displayed in descending order based on the release time. The first version is the current version.</p>
             */
            public Builder modelVersions(java.util.List<ModelVersions> modelVersions) {
                this.modelVersions = modelVersions;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
