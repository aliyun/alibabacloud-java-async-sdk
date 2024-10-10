// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteVulAutoRepairConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteVulAutoRepairConfigRequest</p>
 */
public class DeleteVulAutoRepairConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliasName")
    private String aliasName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigIdList")
    private java.util.List < Long > configIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
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
         * <p>The alias of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>RHSA-2017:0184-Important: mysql security update</p>
         */
        public Builder aliasName(String aliasName) {
            this.putQueryParameter("AliasName", aliasName);
            this.aliasName = aliasName;
            return this;
        }

        /**
         * <p>The IDs of the configurations.</p>
         * <blockquote>
         * <p> You can call the <a href="~~ListVulAutoRepairConfig~~">ListVulAutoRepairConfig</a> operation to query the IDs.</p>
         * </blockquote>
         */
        public Builder configIdList(java.util.List < Long > configIdList) {
            this.putQueryParameter("ConfigIdList", configIdList);
            this.configIdList = configIdList;
            return this;
        }

        /**
         * <p>The type of the vulnerability. Valid values:</p>
         * <ul>
         * <li>cve: Linux software vulnerability</li>
         * <li>sys: Windows system vulnerability</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cve</p>
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
