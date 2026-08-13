// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link ListGraphsResponseBody} extends {@link TeaModel}
 *
 * <p>ListGraphsResponseBody</p>
 */
public class ListGraphsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("items")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListGraphsResponseBody(Builder builder) {
        this.code = builder.code;
        this.items = builder.items;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGraphsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Items> items; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListGraphsResponseBody model) {
            this.code = model.code;
            this.items = model.items;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>租户下可用于语义查询的已发布图谱列表</p>
         * <p>This parameter is required.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListGraphsResponseBody build() {
            return new ListGraphsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGraphsResponseBody} extends {@link TeaModel}
     *
     * <p>ListGraphsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("businessProfile")
        @com.aliyun.core.annotation.Validation(required = true)
        private String businessProfile;

        @com.aliyun.core.annotation.NameInMap("displayName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("graphName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String graphName;

        @com.aliyun.core.annotation.NameInMap("isDefault")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean isDefault;

        private Items(Builder builder) {
            this.businessProfile = builder.businessProfile;
            this.displayName = builder.displayName;
            this.graphName = builder.graphName;
            this.isDefault = builder.isDefault;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return businessProfile
         */
        public String getBusinessProfile() {
            return this.businessProfile;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return graphName
         */
        public String getGraphName() {
            return this.graphName;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public static final class Builder {
            private String businessProfile; 
            private String displayName; 
            private String graphName; 
            private Boolean isDefault; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.businessProfile = model.businessProfile;
                this.displayName = model.displayName;
                this.graphName = model.graphName;
                this.isDefault = model.isDefault;
            } 

            /**
             * <p>图谱业务说明，未配置时为空字符串</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder businessProfile(String businessProfile) {
                this.businessProfile = businessProfile;
                return this;
            }

            /**
             * <p>图谱显示名称</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>图谱名称，传给 querySemanticKnowledge.graphName</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder graphName(String graphName) {
                this.graphName = graphName;
                return this;
            }

            /**
             * <p>是否为租户默认图谱</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
