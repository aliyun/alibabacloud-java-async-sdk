// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D8749D65-E80A-433C-AF1B-CE9C180FF3B4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of authorization details of the portal menu.</p>
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
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
             * <p>The ID of the authorization object.</p>
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
             * <li>0: user</li>
             * <li>1: user group</li>
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
             * <p>The menu ID of the BI portal leaf node.</p>
             * 
             * <strong>example:</strong>
             * <p>54kqgoa****</p>
             */
            public Builder menuId(String menuId) {
                this.menuId = menuId;
                return this;
            }

            /**
             * <p>The details of the object to which the menu is authorized.</p>
             */
            public Builder receivers(java.util.List < Receivers> receivers) {
                this.receivers = receivers;
                return this;
            }

            /**
             * <p>Whether only authorization is visible. Valid values:</p>
             * <ul>
             * <li>true: Only the authorization is visible.</li>
             * <li>false: Both are visible.</li>
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
