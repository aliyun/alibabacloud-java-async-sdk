// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAuthorityResponseBody} extends {@link TeaModel}
 *
 * <p>ListAuthorityResponseBody</p>
 */
public class ListAuthorityResponseBody extends TeaModel {
    @NameInMap("AuthorityList")
    private AuthorityList authorityList;

    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ListAuthorityResponseBody(Builder builder) {
        this.authorityList = builder.authorityList;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthorityResponseBody create() {
        return builder().build();
    }

    /**
     * @return authorityList
     */
    public AuthorityList getAuthorityList() {
        return this.authorityList;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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
        private AuthorityList authorityList; 
        private Integer code; 
        private String message; 
        private String requestId; 

        /**
         * The permissions.
         */
        public Builder authorityList(AuthorityList authorityList) {
            this.authorityList = authorityList;
            return this;
        }

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The additional information that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAuthorityResponseBody build() {
            return new ListAuthorityResponseBody(this);
        } 

    } 

    public static class Action extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Description")
        private String description;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("Name")
        private String name;

        private Action(Builder builder) {
            this.code = builder.code;
            this.description = builder.description;
            this.groupId = builder.groupId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Action create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String description; 
            private String groupId; 
            private String name; 

            /**
             * The code of the permission.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The description of the permission.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the permission group.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the permission.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Action build() {
                return new Action(this);
            } 

        } 

    }
    public static class ActionList extends TeaModel {
        @NameInMap("Action")
        private java.util.List < Action> action;

        private ActionList(Builder builder) {
            this.action = builder.action;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActionList create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public java.util.List < Action> getAction() {
            return this.action;
        }

        public static final class Builder {
            private java.util.List < Action> action; 

            /**
             * Action.
             */
            public Builder action(java.util.List < Action> action) {
                this.action = action;
                return this;
            }

            public ActionList build() {
                return new ActionList(this);
            } 

        } 

    }
    public static class Authority extends TeaModel {
        @NameInMap("ActionList")
        private ActionList actionList;

        @NameInMap("Description")
        private String description;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("Name")
        private String name;

        private Authority(Builder builder) {
            this.actionList = builder.actionList;
            this.description = builder.description;
            this.groupId = builder.groupId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Authority create() {
            return builder().build();
        }

        /**
         * @return actionList
         */
        public ActionList getActionList() {
            return this.actionList;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private ActionList actionList; 
            private String description; 
            private String groupId; 
            private String name; 

            /**
             * The set of permissions.
             */
            public Builder actionList(ActionList actionList) {
                this.actionList = actionList;
                return this;
            }

            /**
             * The description of the permission group.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the permission group.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the permission group.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Authority build() {
                return new Authority(this);
            } 

        } 

    }
    public static class AuthorityList extends TeaModel {
        @NameInMap("Authority")
        private java.util.List < Authority> authority;

        private AuthorityList(Builder builder) {
            this.authority = builder.authority;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorityList create() {
            return builder().build();
        }

        /**
         * @return authority
         */
        public java.util.List < Authority> getAuthority() {
            return this.authority;
        }

        public static final class Builder {
            private java.util.List < Authority> authority; 

            /**
             * Authority.
             */
            public Builder authority(java.util.List < Authority> authority) {
                this.authority = authority;
                return this;
            }

            public AuthorityList build() {
                return new AuthorityList(this);
            } 

        } 

    }
}
