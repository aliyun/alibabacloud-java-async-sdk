// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVulAutoRepairConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateVulAutoRepairConfigRequest</p>
 */
public class CreateVulAutoRepairConfigRequest extends Request {
    @Query
    @NameInMap("Reason")
    private String reason;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    @Query
    @NameInMap("VulAutoRepairConfigList")
    @Validation(required = true)
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
         * Reason.
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * 漏洞类型
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * VulAutoRepairConfigList.
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

    public static class VulAutoRepairConfigList extends TeaModel {
        @NameInMap("AliasName")
        @Validation(required = true)
        private String aliasName;

        @NameInMap("Name")
        @Validation(required = true)
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
             * 漏洞别名
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * 漏洞名称
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
