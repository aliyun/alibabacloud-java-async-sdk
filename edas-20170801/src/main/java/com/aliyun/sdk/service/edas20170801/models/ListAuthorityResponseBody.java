// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link ListAuthorityResponseBody} extends {@link TeaModel}
 *
 * <p>ListAuthorityResponseBody</p>
 */
public class ListAuthorityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthorityList")
    private AuthorityList authorityList;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListAuthorityResponseBody model) {
            this.authorityList = model.authorityList;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The permissions.</p>
         */
        public Builder authorityList(AuthorityList authorityList) {
            this.authorityList = authorityList;
            return this;
        }

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The additional information that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>57609587-DFA2-41EC-<strong><strong>-</strong></strong>*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAuthorityResponseBody build() {
            return new ListAuthorityResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAuthorityResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthorityResponseBody</p>
     */
    public static class Action extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("Name")
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

            private Builder() {
            } 

            private Builder(Action model) {
                this.code = model.code;
                this.description = model.description;
                this.groupId = model.groupId;
                this.name = model.name;
            } 

            /**
             * <p>The code of the permission.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The description of the permission.</p>
             * 
             * <strong>example:</strong>
             * <p>Create an application</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the permission group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the permission.</p>
             * 
             * <strong>example:</strong>
             * <p>Create an application</p>
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
    /**
     * 
     * {@link ListAuthorityResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthorityResponseBody</p>
     */
    public static class ActionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private java.util.List<Action> action;

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
        public java.util.List<Action> getAction() {
            return this.action;
        }

        public static final class Builder {
            private java.util.List<Action> action; 

            private Builder() {
            } 

            private Builder(ActionList model) {
                this.action = model.action;
            } 

            /**
             * Action.
             */
            public Builder action(java.util.List<Action> action) {
                this.action = action;
                return this;
            }

            public ActionList build() {
                return new ActionList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAuthorityResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthorityResponseBody</p>
     */
    public static class Authority extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionList")
        private ActionList actionList;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("Name")
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

            private Builder() {
            } 

            private Builder(Authority model) {
                this.actionList = model.actionList;
                this.description = model.description;
                this.groupId = model.groupId;
                this.name = model.name;
            } 

            /**
             * <p>The set of permissions.</p>
             */
            public Builder actionList(ActionList actionList) {
                this.actionList = actionList;
                return this;
            }

            /**
             * <p>The description of the permission group.</p>
             * 
             * <strong>example:</strong>
             * <p>Operations on applications</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the permission group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the permission group.</p>
             * 
             * <strong>example:</strong>
             * <p>Application management</p>
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
    /**
     * 
     * {@link ListAuthorityResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthorityResponseBody</p>
     */
    public static class AuthorityList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Authority")
        private java.util.List<Authority> authority;

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
        public java.util.List<Authority> getAuthority() {
            return this.authority;
        }

        public static final class Builder {
            private java.util.List<Authority> authority; 

            private Builder() {
            } 

            private Builder(AuthorityList model) {
                this.authority = model.authority;
            } 

            /**
             * Authority.
             */
            public Builder authority(java.util.List<Authority> authority) {
                this.authority = authority;
                return this;
            }

            public AuthorityList build() {
                return new AuthorityList(this);
            } 

        } 

    }
}
