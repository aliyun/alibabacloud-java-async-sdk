// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCriteriaRequest} extends {@link RequestModel}
 *
 * <p>DescribeCriteriaRequest</p>
 */
public class DescribeCriteriaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MachineTypes")
    private String machineTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportAutoTag")
    private Boolean supportAutoTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private DescribeCriteriaRequest(Builder builder) {
        super(builder);
        this.machineTypes = builder.machineTypes;
        this.supportAutoTag = builder.supportAutoTag;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCriteriaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return machineTypes
     */
    public String getMachineTypes() {
        return this.machineTypes;
    }

    /**
     * @return supportAutoTag
     */
    public Boolean getSupportAutoTag() {
        return this.supportAutoTag;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<DescribeCriteriaRequest, Builder> {
        private String machineTypes; 
        private Boolean supportAutoTag; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCriteriaRequest request) {
            super(request);
            this.machineTypes = request.machineTypes;
            this.supportAutoTag = request.supportAutoTag;
            this.value = request.value;
        } 

        /**
         * The type of the asset. Valid values:
         * <p>
         * 
         * *   Set the value to **ecs**, which specifies to query all Elastic Compute Service (ECS) instances.
         */
        public Builder machineTypes(String machineTypes) {
            this.putQueryParameter("MachineTypes", machineTypes);
            this.machineTypes = machineTypes;
            return this;
        }

        /**
         * Specifies whether the keyword that you specify for fuzzy search can be automatically matched. Default value: **false**. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder supportAutoTag(Boolean supportAutoTag) {
            this.putQueryParameter("SupportAutoTag", supportAutoTag);
            this.supportAutoTag = supportAutoTag;
            return this;
        }

        /**
         * The keyword that you specify for fuzzy search when you query the asset.
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public DescribeCriteriaRequest build() {
            return new DescribeCriteriaRequest(this);
        } 

    } 

}
