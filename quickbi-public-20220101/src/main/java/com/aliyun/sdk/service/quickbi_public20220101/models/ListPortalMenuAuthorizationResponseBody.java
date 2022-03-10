// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPortalMenuAuthorizationResponseBody} extends {@link TeaModel}
 *
 * <p>ListPortalMenuAuthorizationResponseBody</p>
 */
public class ListPortalMenuAuthorizationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    @NameInMap("Success")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
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
        @NameInMap("ReceiverId")
        private String receiverId;

        @NameInMap("ReceiverType")
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
             * ReceiverId.
             */
            public Builder receiverId(String receiverId) {
                this.receiverId = receiverId;
                return this;
            }

            /**
             * ReceiverType.
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
        @NameInMap("MenuId")
        private String menuId;

        @NameInMap("Receivers")
        private java.util.List < Receivers> receivers;

        @NameInMap("ShowOnlyWithAccess")
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
             * MenuId.
             */
            public Builder menuId(String menuId) {
                this.menuId = menuId;
                return this;
            }

            /**
             * Receivers.
             */
            public Builder receivers(java.util.List < Receivers> receivers) {
                this.receivers = receivers;
                return this;
            }

            /**
             * ShowOnlyWithAccess.
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
