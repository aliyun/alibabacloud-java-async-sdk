// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDatasetRequest} extends {@link RequestModel}
 *
 * <p>UpdateDatasetRequest</p>
 */
public class UpdateDatasetRequest extends Request {
    @Path
    @NameInMap("DatasetId")
    @Validation(required = true)
    private String datasetId;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("Options")
    private String options;

    private UpdateDatasetRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.description = builder.description;
        this.name = builder.name;
        this.options = builder.options;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDatasetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return options
     */
    public String getOptions() {
        return this.options;
    }

    public static final class Builder extends Request.Builder<UpdateDatasetRequest, Builder> {
        private String datasetId; 
        private String description; 
        private String name; 
        private String options; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDatasetRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.description = request.description;
            this.name = request.name;
            this.options = request.options;
        } 

        /**
         * DatasetId.
         */
        public Builder datasetId(String datasetId) {
            this.putPathParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
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
         * Options.
         */
        public Builder options(String options) {
            this.putBodyParameter("Options", options);
            this.options = options;
            return this;
        }

        @Override
        public UpdateDatasetRequest build() {
            return new UpdateDatasetRequest(this);
        } 

    } 

}
