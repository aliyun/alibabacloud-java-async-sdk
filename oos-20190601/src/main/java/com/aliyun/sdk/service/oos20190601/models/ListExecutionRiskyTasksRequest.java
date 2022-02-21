// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExecutionRiskyTasksRequest} extends {@link RequestModel}
 *
 * <p>ListExecutionRiskyTasksRequest</p>
 */
public class ListExecutionRiskyTasksRequest extends Request {
    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TemplateName")
    @Validation(required = true)
    private String templateName;

    private ListExecutionRiskyTasksRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExecutionRiskyTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder extends Request.Builder<ListExecutionRiskyTasksRequest, Builder> {
        private String regionId; 
        private String templateName; 

        private Builder() {
            super();
        } 

        private Builder(ListExecutionRiskyTasksRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.templateName = response.templateName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        @Override
        public ListExecutionRiskyTasksRequest build() {
            return new ListExecutionRiskyTasksRequest(this);
        } 

    } 

}
