// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link ListPortalMenuAuthorizationResponseBody} extends {@link TeaModel}
 *
 * <p>ListPortalMenuAuthorizationResponseBody</p>
 */
public class ListPortalMenuAuthorizationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListPortalMenuAuthorizationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPortalMenuAuthorizationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListPortalMenuAuthorizationResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D8749D65-E80A-433C-AF1B-CE9C180FF3B4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>A list of authorization details for the BI portal menus.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><p>true: The request was successful.</p>
         * </li>
         * <li><p>false: The request failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListPortalMenuAuthorizationResponseBody build() {
            return new ListPortalMenuAuthorizationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPortalMenuAuthorizationResponseBody} extends {@link TeaModel}
     *
     * <p>ListPortalMenuAuthorizationResponseBody</p>
     */
    public static class Receivers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthPointsValue")
        private Integer authPointsValue;

        @com.aliyun.core.annotation.NameInMap("ReceiverId")
        private String receiverId;

        @com.aliyun.core.annotation.NameInMap("ReceiverType")
        private Integer receiverType;

        private Receivers(Builder builder) {
            this.authPointsValue = builder.authPointsValue;
            this.receiverId = builder.receiverId;
            this.receiverType = builder.receiverType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Receivers create() {
            return builder().build();
        }

        /**
         * @return authPointsValue
         */
        public Integer getAuthPointsValue() {
            return this.authPointsValue;
        }

        /**
         * @return receiverId
         */
        public String getReceiverId() {
            return this.receiverId;
        }

        /**
         * @return receiverType
         */
        public Integer getReceiverType() {
            return this.receiverType;
        }

        public static final class Builder {
            private Integer authPointsValue; 
            private String receiverId; 
            private Integer receiverType; 

            private Builder() {
            } 

            private Builder(Receivers model) {
                this.authPointsValue = model.authPointsValue;
                this.receiverId = model.receiverId;
                this.receiverType = model.receiverType;
            } 

            /**
             * <p>The authorization type for the menu. Valid values:</p>
             * <ul>
             * <li><p>1: View</p>
             * </li>
             * <li><p>11: Edit</p>
             * </li>
             * <li><p>3: Export and view</p>
             * </li>
             * <li><p>10: Manage data entry</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder authPointsValue(Integer authPointsValue) {
                this.authPointsValue = authPointsValue;
                return this;
            }

            /**
             * <p>The ID of the authorization object.</p>
             * <blockquote>
             * <ul>
             * <li><p>If the authorization object is an organization, this ID is the organization ID.</p>
             * </li>
             * <li><p>If the authorization object is a workspace, this ID is the workspace ID.</p>
             * </li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>121344444790****</p>
             */
            public Builder receiverId(String receiverId) {
                this.receiverId = receiverId;
                return this;
            }

            /**
             * <p>The type of the authorization object. Valid values:</p>
             * <ul>
             * <li><p>0: User</p>
             * </li>
             * <li><p>1: User group</p>
             * </li>
             * <li><p>2: Organization</p>
             * </li>
             * <li><p>3: Workspace</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder receiverType(Integer receiverType) {
                this.receiverType = receiverType;
                return this;
            }

            public Receivers build() {
                return new Receivers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPortalMenuAuthorizationResponseBody} extends {@link TeaModel}
     *
     * <p>ListPortalMenuAuthorizationResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MenuId")
        private String menuId;

        @com.aliyun.core.annotation.NameInMap("Receivers")
        private java.util.List<Receivers> receivers;

        @com.aliyun.core.annotation.NameInMap("ShowOnlyWithAccess")
        private Boolean showOnlyWithAccess;

        private Result(Builder builder) {
            this.menuId = builder.menuId;
            this.receivers = builder.receivers;
            this.showOnlyWithAccess = builder.showOnlyWithAccess;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return menuId
         */
        public String getMenuId() {
            return this.menuId;
        }

        /**
         * @return receivers
         */
        public java.util.List<Receivers> getReceivers() {
            return this.receivers;
        }

        /**
         * @return showOnlyWithAccess
         */
        public Boolean getShowOnlyWithAccess() {
            return this.showOnlyWithAccess;
        }

        public static final class Builder {
            private String menuId; 
            private java.util.List<Receivers> receivers; 
            private Boolean showOnlyWithAccess; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.menuId = model.menuId;
                this.receivers = model.receivers;
                this.showOnlyWithAccess = model.showOnlyWithAccess;
            } 

            /**
             * <p>The ID of the leaf-node menu in the BI portal.</p>
             * 
             * <strong>example:</strong>
             * <p>54kqgoa****</p>
             */
            public Builder menuId(String menuId) {
                this.menuId = menuId;
                return this;
            }

            /**
             * <p>The details of the authorization objects for the menu.</p>
             */
            public Builder receivers(java.util.List<Receivers> receivers) {
                this.receivers = receivers;
                return this;
            }

            /**
             * <p>Indicates whether the menu is visible only to authorized users. Valid values:</p>
             * <ul>
             * <li><p>true: The menu is visible only to authorized users.</p>
             * </li>
             * <li><p>false: The menu is visible to all users.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder showOnlyWithAccess(Boolean showOnlyWithAccess) {
                this.showOnlyWithAccess = showOnlyWithAccess;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
