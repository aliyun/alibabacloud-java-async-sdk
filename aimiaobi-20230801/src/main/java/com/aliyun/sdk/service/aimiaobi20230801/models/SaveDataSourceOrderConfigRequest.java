// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link SaveDataSourceOrderConfigRequest} extends {@link RequestModel}
 *
 * <p>SaveDataSourceOrderConfigRequest</p>
 */
public class SaveDataSourceOrderConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GenerateTechnology")
    private String generateTechnology;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserConfigDataSourceList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<UserConfigDataSourceList> userConfigDataSourceList;

    private SaveDataSourceOrderConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.generateTechnology = builder.generateTechnology;
        this.productCode = builder.productCode;
        this.userConfigDataSourceList = builder.userConfigDataSourceList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveDataSourceOrderConfigRequest create() {
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
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return generateTechnology
     */
    public String getGenerateTechnology() {
        return this.generateTechnology;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return userConfigDataSourceList
     */
    public java.util.List<UserConfigDataSourceList> getUserConfigDataSourceList() {
        return this.userConfigDataSourceList;
    }

    public static final class Builder extends Request.Builder<SaveDataSourceOrderConfigRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private String generateTechnology; 
        private String productCode; 
        private java.util.List<UserConfigDataSourceList> userConfigDataSourceList; 

        private Builder() {
            super();
        } 

        private Builder(SaveDataSourceOrderConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.generateTechnology = request.generateTechnology;
            this.productCode = request.productCode;
            this.userConfigDataSourceList = request.userConfigDataSourceList;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c160c841c8e54295bf2f441432785944_p_efm</p>
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * GenerateTechnology.
         */
        public Builder generateTechnology(String generateTechnology) {
            this.putBodyParameter("GenerateTechnology", generateTechnology);
            this.generateTechnology = generateTechnology;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>miaobi</p>
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder userConfigDataSourceList(java.util.List<UserConfigDataSourceList> userConfigDataSourceList) {
            String userConfigDataSourceListShrink = shrink(userConfigDataSourceList, "UserConfigDataSourceList", "json");
            this.putBodyParameter("UserConfigDataSourceList", userConfigDataSourceListShrink);
            this.userConfigDataSourceList = userConfigDataSourceList;
            return this;
        }

        @Override
        public SaveDataSourceOrderConfigRequest build() {
            return new SaveDataSourceOrderConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link SaveDataSourceOrderConfigRequest} extends {@link TeaModel}
     *
     * <p>SaveDataSourceOrderConfigRequest</p>
     */
    public static class UserConfigDataSourceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String code;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Number")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer number;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private UserConfigDataSourceList(Builder builder) {
            this.code = builder.code;
            this.enable = builder.enable;
            this.name = builder.name;
            this.number = builder.number;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserConfigDataSourceList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return number
         */
        public Integer getNumber() {
            return this.number;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String code; 
            private Boolean enable; 
            private String name; 
            private Integer number; 
            private String type; 

            private Builder() {
            } 

            private Builder(UserConfigDataSourceList model) {
                this.code = model.code;
                this.enable = model.enable;
                this.name = model.name;
                this.number = model.number;
                this.type = model.type;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>QuarkCommonNews</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder number(Integer number) {
                this.number = number;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>SystemSearch</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public UserConfigDataSourceList build() {
                return new UserConfigDataSourceList(this);
            } 

        } 

    }
}
