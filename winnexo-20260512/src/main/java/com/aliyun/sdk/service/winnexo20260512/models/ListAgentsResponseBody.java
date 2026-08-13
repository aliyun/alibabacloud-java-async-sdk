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
 * {@link ListAgentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAgentsResponseBody</p>
 */
public class ListAgentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListAgentsResponseBody(Builder builder) {
        this.code = builder.code;
        this.items = builder.items;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentsResponseBody create() {
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

        private Builder(ListAgentsResponseBody model) {
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
         * <p>租户全量数字员工列表（含停用，按名称字母序）</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
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

        public ListAgentsResponseBody build() {
            return new ListAgentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAgentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("authMode")
        private String authMode;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("isActive")
        private Boolean isActive;

        @com.aliyun.core.annotation.NameInMap("operatingObjectName")
        private String operatingObjectName;

        private Items(Builder builder) {
            this.authMode = builder.authMode;
            this.displayName = builder.displayName;
            this.isActive = builder.isActive;
            this.operatingObjectName = builder.operatingObjectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return authMode
         */
        public String getAuthMode() {
            return this.authMode;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return isActive
         */
        public Boolean getIsActive() {
            return this.isActive;
        }

        /**
         * @return operatingObjectName
         */
        public String getOperatingObjectName() {
            return this.operatingObjectName;
        }

        public static final class Builder {
            private String authMode; 
            private String displayName; 
            private Boolean isActive; 
            private String operatingObjectName; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.authMode = model.authMode;
                this.displayName = model.displayName;
                this.isActive = model.isActive;
                this.operatingObjectName = model.operatingObjectName;
            } 

            /**
             * <p>使用权限授权模式：SPECIFIED_USERS=指定用户 / ALL_USERS=所有用户；未设置时为 null</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder authMode(String authMode) {
                this.authMode = authMode;
                return this;
            }

            /**
             * <p>数字员工显示名称</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>启用/停用状态</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isActive(Boolean isActive) {
                this.isActive = isActive;
                return this;
            }

            /**
             * <p>数字员工名称（唯一标识）</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder operatingObjectName(String operatingObjectName) {
                this.operatingObjectName = operatingObjectName;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
