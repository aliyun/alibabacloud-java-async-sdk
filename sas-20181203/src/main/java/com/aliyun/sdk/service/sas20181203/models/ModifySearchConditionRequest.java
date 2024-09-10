// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySearchConditionRequest} extends {@link RequestModel}
 *
 * <p>ModifySearchConditionRequest</p>
 */
public class ModifySearchConditionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterConditions")
    private String filterConditions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ModifySearchConditionRequest(Builder builder) {
        super(builder);
        this.filterConditions = builder.filterConditions;
        this.name = builder.name;
        this.sourceIp = builder.sourceIp;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySearchConditionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filterConditions
     */
    public String getFilterConditions() {
        return this.filterConditions;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ModifySearchConditionRequest, Builder> {
        private String filterConditions; 
        private String name; 
        private String sourceIp; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ModifySearchConditionRequest request) {
            super(request);
            this.filterConditions = request.filterConditions;
            this.name = request.name;
            this.sourceIp = request.sourceIp;
            this.type = request.type;
        } 

        /**
         * The filter condition. The value of this parameter is in the JSON format and is case-sensitive. The value contains the following fields:
         * <p>
         * 
         * *   **filterParams**: the filter-related parameters. The value is in the JSON format. Valid values:
         * 
         *     *   **label**: the display name of the filter condition in the console.
         * 
         *     *   **value**: the settings of the filter condition. The value is in the JSON format. The value contains the following fields:
         * 
         *         *   **name**: the name of the field for filtering. For more information, see the value description of name.
         *         *   **value**: the value of the field for filtering.
         * 
         * *   **LogicalExp**: the logical relationship among multiple filter conditions. Valid values:
         * 
         *     *   **OR**
         *     *   **AND**
         * 
         * >  Value description of **name**:
         * 
         * *   If **Type** is set to **ecs**, you can call the [DescribeCriteria](~~DescribeCriteria~~) operation to query the supported filter conditions.
         * 
         * *   If **Type** is set to **cloud_product**, you can call the [GetCloudAssetCriteria](~~GetCloudAssetCriteria~~) operation to query the supported filter conditions.
         */
        public Builder filterConditions(String filterConditions) {
            this.putQueryParameter("FilterConditions", filterConditions);
            this.filterConditions = filterConditions;
            return this;
        }

        /**
         * The name of the common filter condition.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The source IP address of the request. You do not need to specify this parameter. It is automatically obtained by the system.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The type of the asset. Default value: **ecs**. Valid values:
         * <p>
         * 
         * *   **ecs**: host
         * *   **cloud_product**: Alibaba Cloud service
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ModifySearchConditionRequest build() {
            return new ModifySearchConditionRequest(this);
        } 

    } 

}
