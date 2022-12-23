// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTranscodeTemplateGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListTranscodeTemplateGroupResponseBody</p>
 */
public class ListTranscodeTemplateGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TranscodeTemplateGroupList")
    private java.util.List < TranscodeTemplateGroupList> transcodeTemplateGroupList;

    private ListTranscodeTemplateGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.transcodeTemplateGroupList = builder.transcodeTemplateGroupList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTranscodeTemplateGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return transcodeTemplateGroupList
     */
    public java.util.List < TranscodeTemplateGroupList> getTranscodeTemplateGroupList() {
        return this.transcodeTemplateGroupList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < TranscodeTemplateGroupList> transcodeTemplateGroupList; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The transcoding template groups.
         */
        public Builder transcodeTemplateGroupList(java.util.List < TranscodeTemplateGroupList> transcodeTemplateGroupList) {
            this.transcodeTemplateGroupList = transcodeTemplateGroupList;
            return this;
        }

        public ListTranscodeTemplateGroupResponseBody build() {
            return new ListTranscodeTemplateGroupResponseBody(this);
        } 

    } 

    public static class TranscodeTemplateGroupList extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("IsDefault")
        private String isDefault;

        @NameInMap("Locked")
        private String locked;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("TranscodeTemplateGroupId")
        private String transcodeTemplateGroupId;

        private TranscodeTemplateGroupList(Builder builder) {
            this.appId = builder.appId;
            this.creationTime = builder.creationTime;
            this.isDefault = builder.isDefault;
            this.locked = builder.locked;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.transcodeTemplateGroupId = builder.transcodeTemplateGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeTemplateGroupList create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return isDefault
         */
        public String getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return locked
         */
        public String getLocked() {
            return this.locked;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return transcodeTemplateGroupId
         */
        public String getTranscodeTemplateGroupId() {
            return this.transcodeTemplateGroupId;
        }

        public static final class Builder {
            private String appId; 
            private String creationTime; 
            private String isDefault; 
            private String locked; 
            private String modifyTime; 
            private String name; 
            private String transcodeTemplateGroupId; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The time when the template group was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Indicates whether the template group is the default one. Valid values:
             * <p>
             * 
             * *   **Default**: The template group is the default one.
             * *   **NotDefault**: The template group is not the default one.
             */
            public Builder isDefault(String isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * The lock status of the transcoding template group. Valid values:
             * <p>
             * 
             * *   **Disabled**: The template group is not locked.
             * *   **Enabled**: The template group is locked.
             */
            public Builder locked(String locked) {
                this.locked = locked;
                return this;
            }

            /**
             * The time when the template group was modified. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * The name of the template group.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the transcoding template group.
             */
            public Builder transcodeTemplateGroupId(String transcodeTemplateGroupId) {
                this.transcodeTemplateGroupId = transcodeTemplateGroupId;
                return this;
            }

            public TranscodeTemplateGroupList build() {
                return new TranscodeTemplateGroupList(this);
            } 

        } 

    }
}
