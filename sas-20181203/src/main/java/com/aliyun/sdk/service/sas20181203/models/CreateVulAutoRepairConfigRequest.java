// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateVulAutoRepairConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateVulAutoRepairConfigRequest</p>
 */
public class CreateVulAutoRepairConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VulAutoRepairConfigList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < VulAutoRepairConfigList> vulAutoRepairConfigList;

    private CreateVulAutoRepairConfigRequest(Builder builder) {
        super(builder);
        this.reason = builder.reason;
        this.type = builder.type;
        this.vulAutoRepairConfigList = builder.vulAutoRepairConfigList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVulAutoRepairConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return vulAutoRepairConfigList
     */
    public java.util.List < VulAutoRepairConfigList> getVulAutoRepairConfigList() {
        return this.vulAutoRepairConfigList;
    }

    public static final class Builder extends Request.Builder<CreateVulAutoRepairConfigRequest, Builder> {
        private String reason; 
        private String type; 
        private java.util.List < VulAutoRepairConfigList> vulAutoRepairConfigList; 

        private Builder() {
            super();
        } 

        private Builder(CreateVulAutoRepairConfigRequest request) {
            super(request);
            this.reason = request.reason;
            this.type = request.type;
            this.vulAutoRepairConfigList = request.vulAutoRepairConfigList;
        } 

        /**
         * <p>The reason why the vulnerability can be automatically fixed.</p>
         * 
         * <strong>example:</strong>
         * <p>TestAutoRepair</p>
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * <p>The type of the vulnerability. Valid values: -<strong>cve</strong>: Linux software vulnerability -<strong>sys</strong>: Windows system vulnerability</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cve</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The vulnerabilities that can be automatically fixed.</p>
         * <p>This parameter is required.</p>
         */
        public Builder vulAutoRepairConfigList(java.util.List < VulAutoRepairConfigList> vulAutoRepairConfigList) {
            this.putQueryParameter("VulAutoRepairConfigList", vulAutoRepairConfigList);
            this.vulAutoRepairConfigList = vulAutoRepairConfigList;
            return this;
        }

        @Override
        public CreateVulAutoRepairConfigRequest build() {
            return new CreateVulAutoRepairConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateVulAutoRepairConfigRequest} extends {@link TeaModel}
     *
     * <p>CreateVulAutoRepairConfigRequest</p>
     */
    public static class VulAutoRepairConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliasName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String aliasName;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        private VulAutoRepairConfigList(Builder builder) {
            this.aliasName = builder.aliasName;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VulAutoRepairConfigList create() {
            return builder().build();
        }

        /**
         * @return aliasName
         */
        public String getAliasName() {
            return this.aliasName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String aliasName; 
            private String name; 

            /**
             * <p>The alias of the vulnerability.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CVE-2018-25032:zlib 1.2.11 memory corruption</p>
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * <p>The name of the vulnerability.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>anolisos:8.4:ANSA-2022:0001</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public VulAutoRepairConfigList build() {
                return new VulAutoRepairConfigList(this);
            } 

        } 

    }
}
