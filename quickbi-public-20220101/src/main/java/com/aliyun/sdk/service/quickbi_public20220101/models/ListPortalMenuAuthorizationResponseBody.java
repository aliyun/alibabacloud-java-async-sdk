// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPortalMenuAuthorizationResponseBody} extends {@link TeaModel}
 *
 * <p>ListPortalMenuAuthorizationResponseBody</p>
 */
public class ListPortalMenuAuthorizationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
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
        private java.util.List < Result> result; 
        private Boolean success; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The list of authorization details of the portal menu.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   true: The request was successful.
         * *   false: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListPortalMenuAuthorizationResponseBody build() {
            return new ListPortalMenuAuthorizationResponseBody(this);
        } 

    } 

    public static class Receivers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReceiverId")
        private String receiverId;

        @com.aliyun.core.annotation.NameInMap("ReceiverType")
        private Integer receiverType;

        private Receivers(Builder builder) {
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
            private String receiverId; 
            private Integer receiverType; 

            /**
             * The ID of the authorization object.
             */
            public Builder receiverId(String receiverId) {
                this.receiverId = receiverId;
                return this;
            }

            /**
             * The type of the authorization object. Valid values:
             * <p>
             * 
             * *   0: user
             * *   1: user group
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
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MenuId")
        private String menuId;

        @com.aliyun.core.annotation.NameInMap("Receivers")
        private java.util.List < Receivers> receivers;

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
        public java.util.List < Receivers> getReceivers() {
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
            private java.util.List < Receivers> receivers; 
            private Boolean showOnlyWithAccess; 

            /**
             * The menu ID of the BI portal leaf node.
             */
            public Builder menuId(String menuId) {
                this.menuId = menuId;
                return this;
            }

            /**
             * The details of the object to which the menu is authorized.
             */
            public Builder receivers(java.util.List < Receivers> receivers) {
                this.receivers = receivers;
                return this;
            }

            /**
             * Whether only authorization is visible. Valid values:
             * <p>
             * 
             * *   true: Only the authorization is visible.
             * *   false: Both are visible.
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
