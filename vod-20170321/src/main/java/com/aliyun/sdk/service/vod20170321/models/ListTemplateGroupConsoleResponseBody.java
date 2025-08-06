// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link ListTemplateGroupConsoleResponseBody} extends {@link TeaModel}
 *
 * <p>ListTemplateGroupConsoleResponseBody</p>
 */
public class ListTemplateGroupConsoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TemplateGroups")
    private TemplateGroups templateGroups;

    private ListTemplateGroupConsoleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.templateGroups = builder.templateGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTemplateGroupConsoleResponseBody create() {
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
     * @return templateGroups
     */
    public TemplateGroups getTemplateGroups() {
        return this.templateGroups;
    }

    public static final class Builder {
        private String requestId; 
        private TemplateGroups templateGroups; 

        private Builder() {
        } 

        private Builder(ListTemplateGroupConsoleResponseBody model) {
            this.requestId = model.requestId;
            this.templateGroups = model.templateGroups;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TemplateGroups.
         */
        public Builder templateGroups(TemplateGroups templateGroups) {
            this.templateGroups = templateGroups;
            return this;
        }

        public ListTemplateGroupConsoleResponseBody build() {
            return new ListTemplateGroupConsoleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTemplateGroupConsoleResponseBody} extends {@link TeaModel}
     *
     * <p>ListTemplateGroupConsoleResponseBody</p>
     */
    public static class TemplateGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultGroup")
        private String defaultGroup;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupSymbol")
        private String groupSymbol;

        @com.aliyun.core.annotation.NameInMap("GroupType")
        private String groupType;

        @com.aliyun.core.annotation.NameInMap("IsLocked")
        private String isLocked;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TranscodeMode")
        private String transcodeMode;

        private TemplateGroup(Builder builder) {
            this.defaultGroup = builder.defaultGroup;
            this.groupId = builder.groupId;
            this.groupSymbol = builder.groupSymbol;
            this.groupType = builder.groupType;
            this.isLocked = builder.isLocked;
            this.name = builder.name;
            this.status = builder.status;
            this.transcodeMode = builder.transcodeMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateGroup create() {
            return builder().build();
        }

        /**
         * @return defaultGroup
         */
        public String getDefaultGroup() {
            return this.defaultGroup;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupSymbol
         */
        public String getGroupSymbol() {
            return this.groupSymbol;
        }

        /**
         * @return groupType
         */
        public String getGroupType() {
            return this.groupType;
        }

        /**
         * @return isLocked
         */
        public String getIsLocked() {
            return this.isLocked;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return transcodeMode
         */
        public String getTranscodeMode() {
            return this.transcodeMode;
        }

        public static final class Builder {
            private String defaultGroup; 
            private String groupId; 
            private String groupSymbol; 
            private String groupType; 
            private String isLocked; 
            private String name; 
            private String status; 
            private String transcodeMode; 

            private Builder() {
            } 

            private Builder(TemplateGroup model) {
                this.defaultGroup = model.defaultGroup;
                this.groupId = model.groupId;
                this.groupSymbol = model.groupSymbol;
                this.groupType = model.groupType;
                this.isLocked = model.isLocked;
                this.name = model.name;
                this.status = model.status;
                this.transcodeMode = model.transcodeMode;
            } 

            /**
             * DefaultGroup.
             */
            public Builder defaultGroup(String defaultGroup) {
                this.defaultGroup = defaultGroup;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupSymbol.
             */
            public Builder groupSymbol(String groupSymbol) {
                this.groupSymbol = groupSymbol;
                return this;
            }

            /**
             * GroupType.
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * IsLocked.
             */
            public Builder isLocked(String isLocked) {
                this.isLocked = isLocked;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TranscodeMode.
             */
            public Builder transcodeMode(String transcodeMode) {
                this.transcodeMode = transcodeMode;
                return this;
            }

            public TemplateGroup build() {
                return new TemplateGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTemplateGroupConsoleResponseBody} extends {@link TeaModel}
     *
     * <p>ListTemplateGroupConsoleResponseBody</p>
     */
    public static class TemplateGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TemplateGroup")
        private java.util.List<TemplateGroup> templateGroup;

        private TemplateGroups(Builder builder) {
            this.templateGroup = builder.templateGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateGroups create() {
            return builder().build();
        }

        /**
         * @return templateGroup
         */
        public java.util.List<TemplateGroup> getTemplateGroup() {
            return this.templateGroup;
        }

        public static final class Builder {
            private java.util.List<TemplateGroup> templateGroup; 

            private Builder() {
            } 

            private Builder(TemplateGroups model) {
                this.templateGroup = model.templateGroup;
            } 

            /**
             * TemplateGroup.
             */
            public Builder templateGroup(java.util.List<TemplateGroup> templateGroup) {
                this.templateGroup = templateGroup;
                return this;
            }

            public TemplateGroups build() {
                return new TemplateGroups(this);
            } 

        } 

    }
}
