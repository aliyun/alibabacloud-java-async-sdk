// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCriteriaRequest} extends {@link RequestModel}
 *
 * <p>DescribeCriteriaRequest</p>
 */
public class DescribeCriteriaRequest extends Request {
    @Query
    @NameInMap("MachineTypes")
    private String machineTypes;

    @Query
    @NameInMap("SupportAutoTag")
    private Boolean supportAutoTag;

    @Query
    @NameInMap("Value")
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
         * MachineTypes.
         */
        public Builder machineTypes(String machineTypes) {
            this.putQueryParameter("MachineTypes", machineTypes);
            this.machineTypes = machineTypes;
            return this;
        }

        /**
         * SupportAutoTag.
         */
        public Builder supportAutoTag(Boolean supportAutoTag) {
            this.putQueryParameter("SupportAutoTag", supportAutoTag);
            this.supportAutoTag = supportAutoTag;
            return this;
        }

        /**
         * Value.
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
