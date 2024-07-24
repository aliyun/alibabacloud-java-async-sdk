// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTemplateScratchRequest} extends {@link RequestModel}
 *
 * <p>GetTemplateScratchRequest</p>
 */
public class GetTemplateScratchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowDataOption")
    private String showDataOption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateScratchId")
    private String templateScratchId;

    private GetTemplateScratchRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.showDataOption = builder.showDataOption;
        this.templateScratchId = builder.templateScratchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTemplateScratchRequest create() {
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
     * @return showDataOption
     */
    public String getShowDataOption() {
        return this.showDataOption;
    }

    /**
     * @return templateScratchId
     */
    public String getTemplateScratchId() {
        return this.templateScratchId;
    }

    public static final class Builder extends Request.Builder<GetTemplateScratchRequest, Builder> {
        private String regionId; 
        private String showDataOption; 
        private String templateScratchId; 

        private Builder() {
            super();
        } 

        private Builder(GetTemplateScratchRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.showDataOption = request.showDataOption;
            this.templateScratchId = request.templateScratchId;
        } 

        /**
         * The region ID of the resource scenario.
         * <p>
         * 
         * You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The data display option. Valid values:
         * <p>
         * 
         * *   Sources: displays only the data of source nodes. This setting takes effect only when TemplateScratchType is set to ArchitectureDetection.
         * *   Source: displays only the data of the source node. This setting takes effect only when TemplateScratchType is not set to ArchitectureDetection.
         * *   Provisions: displays only the data of new nodes. This setting takes effect only when TemplateScratchType is not set to ArchitectureDetection.
         * *   All: displays all data.
         * 
         * For more information about source nodes and new nodes, see [Overview](~~352074~~).
         * 
         * >  If you do not specify this parameter, the node data is not displayed.
         */
        public Builder showDataOption(String showDataOption) {
            this.putQueryParameter("ShowDataOption", showDataOption);
            this.showDataOption = showDataOption;
            return this;
        }

        /**
         * The ID of the resource scenario.
         */
        public Builder templateScratchId(String templateScratchId) {
            this.putQueryParameter("TemplateScratchId", templateScratchId);
            this.templateScratchId = templateScratchId;
            return this;
        }

        @Override
        public GetTemplateScratchRequest build() {
            return new GetTemplateScratchRequest(this);
        } 

    } 

}
