// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVulAutoRepairConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteVulAutoRepairConfigRequest</p>
 */
public class DeleteVulAutoRepairConfigRequest extends Request {
    @Query
    @NameInMap("AliasName")
    private String aliasName;

    @Query
    @NameInMap("ConfigIdList")
    private java.util.List < Long > configIdList;

    @Query
    @NameInMap("Type")
    private String type;

    private DeleteVulAutoRepairConfigRequest(Builder builder) {
        super(builder);
        this.aliasName = builder.aliasName;
        this.configIdList = builder.configIdList;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVulAutoRepairConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliasName
     */
    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * @return configIdList
     */
    public java.util.List < Long > getConfigIdList() {
        return this.configIdList;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DeleteVulAutoRepairConfigRequest, Builder> {
        private String aliasName; 
        private java.util.List < Long > configIdList; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVulAutoRepairConfigRequest request) {
            super(request);
            this.aliasName = request.aliasName;
            this.configIdList = request.configIdList;
            this.type = request.type;
        } 

        /**
         * The alias of the vulnerability.
         */
        public Builder aliasName(String aliasName) {
            this.putQueryParameter("AliasName", aliasName);
            this.aliasName = aliasName;
            return this;
        }

        /**
         * The configuration ID of the vulnerability. You can call the [ListVulAutoRepairConfig](~~ListVulAutoRepairConfig~~) operation to query the configuration IDs of the vulnerability.
         */
        public Builder configIdList(java.util.List < Long > configIdList) {
            this.putQueryParameter("ConfigIdList", configIdList);
            this.configIdList = configIdList;
            return this;
        }

        /**
         * The type of the vulnerability. Valid values:
         * <p>
         * 
         * *   **cve**: Linux software vulnerability
         * *   **sys**: Windows system vulnerability
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DeleteVulAutoRepairConfigRequest build() {
            return new DeleteVulAutoRepairConfigRequest(this);
        } 

    } 

}
