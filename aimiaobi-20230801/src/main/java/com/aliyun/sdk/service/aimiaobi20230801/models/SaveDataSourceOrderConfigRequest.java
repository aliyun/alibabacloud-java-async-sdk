// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserConfigDataSourceList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < UserConfigDataSourceList> userConfigDataSourceList;

    private SaveDataSourceOrderConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
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
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return userConfigDataSourceList
     */
    public java.util.List < UserConfigDataSourceList> getUserConfigDataSourceList() {
        return this.userConfigDataSourceList;
    }

    public static final class Builder extends Request.Builder<SaveDataSourceOrderConfigRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private String productCode; 
        private java.util.List < UserConfigDataSourceList> userConfigDataSourceList; 

        private Builder() {
            super();
        } 

        private Builder(SaveDataSourceOrderConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
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
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * UserConfigDataSourceList.
         */
        public Builder userConfigDataSourceList(java.util.List < UserConfigDataSourceList> userConfigDataSourceList) {
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

    public static class UserConfigDataSourceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String code;

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
            private String name; 
            private Integer number; 
            private String type; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
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
             * Number.
             */
            public Builder number(Integer number) {
                this.number = number;
                return this;
            }

            /**
             * Type.
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
