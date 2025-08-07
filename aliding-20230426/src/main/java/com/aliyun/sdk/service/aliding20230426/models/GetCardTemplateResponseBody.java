// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetCardTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetCardTemplateResponseBody</p>
 */
public class GetCardTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("commonVariableList")
    private java.util.List<CommonVariableList> commonVariableList;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("templateId")
    private String templateId;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private GetCardTemplateResponseBody(Builder builder) {
        this.commonVariableList = builder.commonVariableList;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.templateId = builder.templateId;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCardTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commonVariableList
     */
    public java.util.List<CommonVariableList> getCommonVariableList() {
        return this.commonVariableList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private java.util.List<CommonVariableList> commonVariableList; 
        private String requestId; 
        private String status; 
        private String templateId; 
        private String vendorRequestId; 
        private String vendorType; 

        private Builder() {
        } 

        private Builder(GetCardTemplateResponseBody model) {
            this.commonVariableList = model.commonVariableList;
            this.requestId = model.requestId;
            this.status = model.status;
            this.templateId = model.templateId;
            this.vendorRequestId = model.vendorRequestId;
            this.vendorType = model.vendorType;
        } 

        /**
         * commonVariableList.
         */
        public Builder commonVariableList(java.util.List<CommonVariableList> commonVariableList) {
            this.commonVariableList = commonVariableList;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * templateId.
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public GetCardTemplateResponseBody build() {
            return new GetCardTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCardTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetCardTemplateResponseBody</p>
     */
    public static class CommonVariableList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IfPrivateFiled")
        private Boolean ifPrivateFiled;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private CommonVariableList(Builder builder) {
            this.description = builder.description;
            this.id = builder.id;
            this.ifPrivateFiled = builder.ifPrivateFiled;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommonVariableList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return ifPrivateFiled
         */
        public Boolean getIfPrivateFiled() {
            return this.ifPrivateFiled;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String description; 
            private String id; 
            private Boolean ifPrivateFiled; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(CommonVariableList model) {
                this.description = model.description;
                this.id = model.id;
                this.ifPrivateFiled = model.ifPrivateFiled;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Id</p>
             * 
             * <strong>example:</strong>
             * <p>lastMessage</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * IfPrivateFiled.
             */
            public Builder ifPrivateFiled(Boolean ifPrivateFiled) {
                this.ifPrivateFiled = ifPrivateFiled;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public CommonVariableList build() {
                return new CommonVariableList(this);
            } 

        } 

    }
}
