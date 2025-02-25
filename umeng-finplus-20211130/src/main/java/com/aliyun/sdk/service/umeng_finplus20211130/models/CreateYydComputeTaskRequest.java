// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20211130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateYydComputeTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateYydComputeTaskRequest</p>
 */
public class CreateYydComputeTaskRequest extends Request {
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

    @Body
    @NameInMap("appId")
    private Long appId;

    private CreateYydComputeTaskRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.name = builder.name;
        this.remarks = builder.remarks;
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateYydComputeTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    public static final class Builder extends Request.Builder<CreateYydComputeTaskRequest, Builder> {
        private Long datasetId; 
        private String name; 
        private String remarks; 
        private Long appId; 

        private Builder() {
            super();
        } 

        private Builder(CreateYydComputeTaskRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.name = request.name;
            this.remarks = request.remarks;
            this.appId = request.appId;
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

        /**
         * appId.
         */
        public Builder appId(Long appId) {
            this.putBodyParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        @Override
        public CreateYydComputeTaskRequest build() {
            return new CreateYydComputeTaskRequest(this);
        } 

    } 

}
