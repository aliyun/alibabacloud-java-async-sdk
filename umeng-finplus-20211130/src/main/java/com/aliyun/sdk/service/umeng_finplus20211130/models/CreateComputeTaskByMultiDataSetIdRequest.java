// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20211130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateComputeTaskByMultiDataSetIdRequest} extends {@link RequestModel}
 *
 * <p>CreateComputeTaskByMultiDataSetIdRequest</p>
 */
public class CreateComputeTaskByMultiDataSetIdRequest extends Request {
    @Body
    @NameInMap("appId")
    private Long appId;

    @Body
    @NameInMap("dataSetIds")
    private String dataSetIds;

    @Body
    @NameInMap("name")
    private String name;

    @Body
    @NameInMap("remarks")
    private String remarks;

    private CreateComputeTaskByMultiDataSetIdRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.dataSetIds = builder.dataSetIds;
        this.name = builder.name;
        this.remarks = builder.remarks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateComputeTaskByMultiDataSetIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return dataSetIds
     */
    public String getDataSetIds() {
        return this.dataSetIds;
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

    public static final class Builder extends Request.Builder<CreateComputeTaskByMultiDataSetIdRequest, Builder> {
        private Long appId; 
        private String dataSetIds; 
        private String name; 
        private String remarks; 

        private Builder() {
            super();
        } 

        private Builder(CreateComputeTaskByMultiDataSetIdRequest request) {
            super(request);
            this.appId = request.appId;
            this.dataSetIds = request.dataSetIds;
            this.name = request.name;
            this.remarks = request.remarks;
        } 

        /**
         * appId.
         */
        public Builder appId(Long appId) {
            this.putBodyParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * dataSetIds.
         */
        public Builder dataSetIds(String dataSetIds) {
            this.putBodyParameter("dataSetIds", dataSetIds);
            this.dataSetIds = dataSetIds;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * remarks.
         */
        public Builder remarks(String remarks) {
            this.putBodyParameter("remarks", remarks);
            this.remarks = remarks;
            return this;
        }

        @Override
        public CreateComputeTaskByMultiDataSetIdRequest build() {
            return new CreateComputeTaskByMultiDataSetIdRequest(this);
        } 

    } 

}
