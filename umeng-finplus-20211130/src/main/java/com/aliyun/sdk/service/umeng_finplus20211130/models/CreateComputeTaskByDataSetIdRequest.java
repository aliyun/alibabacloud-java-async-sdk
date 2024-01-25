// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20211130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateComputeTaskByDataSetIdRequest} extends {@link RequestModel}
 *
 * <p>CreateComputeTaskByDataSetIdRequest</p>
 */
public class CreateComputeTaskByDataSetIdRequest extends Request {
    @Body
    @NameInMap("BatchInfoForm")
    @Validation(required = true)
    private java.util.List < BatchInfoForm> batchInfoForm;

    @Body
    @NameInMap("DatasetId")
    @Validation(required = true)
    private Long datasetId;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("Remarks")
    private String remarks;

    private CreateComputeTaskByDataSetIdRequest(Builder builder) {
        super(builder);
        this.batchInfoForm = builder.batchInfoForm;
        this.datasetId = builder.datasetId;
        this.name = builder.name;
        this.remarks = builder.remarks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateComputeTaskByDataSetIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchInfoForm
     */
    public java.util.List < BatchInfoForm> getBatchInfoForm() {
        return this.batchInfoForm;
    }

    /**
     * @return datasetId
     */
    public Long getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return remarks
     */
    public String getRemarks() {
        return this.remarks;
    }

    public static final class Builder extends Request.Builder<CreateComputeTaskByDataSetIdRequest, Builder> {
        private java.util.List < BatchInfoForm> batchInfoForm; 
        private Long datasetId; 
        private String name; 
        private String remarks; 

        private Builder() {
            super();
        } 

        private Builder(CreateComputeTaskByDataSetIdRequest request) {
            super(request);
            this.batchInfoForm = request.batchInfoForm;
            this.datasetId = request.datasetId;
            this.name = request.name;
            this.remarks = request.remarks;
        } 

        /**
         * BatchInfoForm.
         */
        public Builder batchInfoForm(java.util.List < BatchInfoForm> batchInfoForm) {
            this.putBodyParameter("BatchInfoForm", batchInfoForm);
            this.batchInfoForm = batchInfoForm;
            return this;
        }

        /**
         * DatasetId.
         */
        public Builder datasetId(Long datasetId) {
            this.putBodyParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Remarks.
         */
        public Builder remarks(String remarks) {
            this.putBodyParameter("Remarks", remarks);
            this.remarks = remarks;
            return this;
        }

        @Override
        public CreateComputeTaskByDataSetIdRequest build() {
            return new CreateComputeTaskByDataSetIdRequest(this);
        } 

    } 

    public static class CuVersions extends TeaModel {
        @NameInMap("CuId")
        private String cuId;

        @NameInMap("CuVersion")
        private String cuVersion;

        private CuVersions(Builder builder) {
            this.cuId = builder.cuId;
            this.cuVersion = builder.cuVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CuVersions create() {
            return builder().build();
        }

        /**
         * @return cuId
         */
        public String getCuId() {
            return this.cuId;
        }

        /**
         * @return cuVersion
         */
        public String getCuVersion() {
            return this.cuVersion;
        }

        public static final class Builder {
            private String cuId; 
            private String cuVersion; 

            /**
             * CuId.
             */
            public Builder cuId(String cuId) {
                this.cuId = cuId;
                return this;
            }

            /**
             * CuVersion.
             */
            public Builder cuVersion(String cuVersion) {
                this.cuVersion = cuVersion;
                return this;
            }

            public CuVersions build() {
                return new CuVersions(this);
            } 

        } 

    }
    public static class BatchInfoForm extends TeaModel {
        @NameInMap("AppId")
        @Validation(required = true)
        private Long appId;

        @NameInMap("CuVersions")
        private java.util.List < CuVersions> cuVersions;

        private BatchInfoForm(Builder builder) {
            this.appId = builder.appId;
            this.cuVersions = builder.cuVersions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BatchInfoForm create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public Long getAppId() {
            return this.appId;
        }

        /**
         * @return cuVersions
         */
        public java.util.List < CuVersions> getCuVersions() {
            return this.cuVersions;
        }

        public static final class Builder {
            private Long appId; 
            private java.util.List < CuVersions> cuVersions; 

            /**
             * AppId.
             */
            public Builder appId(Long appId) {
                this.appId = appId;
                return this;
            }

            /**
             * CuVersions.
             */
            public Builder cuVersions(java.util.List < CuVersions> cuVersions) {
                this.cuVersions = cuVersions;
                return this;
            }

            public BatchInfoForm build() {
                return new BatchInfoForm(this);
            } 

        } 

    }
}
