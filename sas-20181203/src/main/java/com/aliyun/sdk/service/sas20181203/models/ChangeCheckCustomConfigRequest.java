// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeCheckCustomConfigRequest} extends {@link RequestModel}
 *
 * <p>ChangeCheckCustomConfigRequest</p>
 */
public class ChangeCheckCustomConfigRequest extends Request {
    @Query
    @NameInMap("CheckId")
    private Long checkId;

    @Query
    @NameInMap("CustomConfigs")
    private java.util.List < CustomConfigs> customConfigs;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private ChangeCheckCustomConfigRequest(Builder builder) {
        super(builder);
        this.checkId = builder.checkId;
        this.customConfigs = builder.customConfigs;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeCheckCustomConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkId
     */
    public Long getCheckId() {
        return this.checkId;
    }

    /**
     * @return customConfigs
     */
    public java.util.List < CustomConfigs> getCustomConfigs() {
        return this.customConfigs;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ChangeCheckCustomConfigRequest, Builder> {
        private Long checkId; 
        private java.util.List < CustomConfigs> customConfigs; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ChangeCheckCustomConfigRequest request) {
            super(request);
            this.checkId = request.checkId;
            this.customConfigs = request.customConfigs;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the check item.
         * <p>
         * 
         * > You can call the [ListCheckResult](~~ListCheckResult~~) operation to query the IDs of check items.
         */
        public Builder checkId(Long checkId) {
            this.putQueryParameter("CheckId", checkId);
            this.checkId = checkId;
            return this;
        }

        /**
         * The custom configuration items of the check item.
         */
        public Builder customConfigs(java.util.List < CustomConfigs> customConfigs) {
            this.putQueryParameter("CustomConfigs", customConfigs);
            this.customConfigs = customConfigs;
            return this;
        }

        /**
         * The region where the Security Center instance is deployed. Valid values:
         * <p>
         * 
         * *   **cn-hangzhou**: International
         * *   **ap-southeast-1**: Singapore
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ChangeCheckCustomConfigRequest build() {
            return new ChangeCheckCustomConfigRequest(this);
        } 

    } 

    public static class CustomConfigs extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Operation")
        private String operation;

        @NameInMap("Value")
        private String value;

        private CustomConfigs(Builder builder) {
            this.name = builder.name;
            this.operation = builder.operation;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomConfigs create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String operation; 
            private String value; 

            /**
             * The name of the custom configuration item. The name of a custom configuration item is unique in a check item.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The operation that you want to perform on the custom configuration item. This parameter is required only if you want to delete the custom configuration item. To delete the custom configuration item, set the value to DELETE.
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * The value of the custom configuration item. The value is a string.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public CustomConfigs build() {
                return new CustomConfigs(this);
            } 

        } 

    }
}
