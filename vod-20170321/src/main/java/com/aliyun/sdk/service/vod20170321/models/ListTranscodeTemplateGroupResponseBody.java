// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListTranscodeTemplateGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListTranscodeTemplateGroupResponseBody</p>
 */
public class ListTranscodeTemplateGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TranscodeTemplateGroupList")
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4A*****F6-D7393642CA58</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The transcoding template groups.</p>
         */
        public Builder transcodeTemplateGroupList(java.util.List < TranscodeTemplateGroupList> transcodeTemplateGroupList) {
            this.transcodeTemplateGroupList = transcodeTemplateGroupList;
            return this;
        }

        public ListTranscodeTemplateGroupResponseBody build() {
            return new ListTranscodeTemplateGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTranscodeTemplateGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListTranscodeTemplateGroupResponseBody</p>
     */
    public static class TranscodeTemplateGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private String isDefault;

        @com.aliyun.core.annotation.NameInMap("Locked")
        private String locked;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("TranscodeTemplateGroupId")
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
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>app-****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The time when the template group was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-12-05T10:20:09Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>Indicates whether the template group is the default one. Valid values:</p>
             * <ul>
             * <li><strong>Default</strong>: The template group is the default one.</li>
             * <li><strong>NotDefault</strong>: The template group is not the default one.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Default</p>
             */
            public Builder isDefault(String isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The lock status of the transcoding template group. Valid values:</p>
             * <ul>
             * <li><strong>Disabled</strong>: The template group is not locked.</li>
             * <li><strong>Enabled</strong>: The template group is locked.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Disabled</p>
             */
            public Builder locked(String locked) {
                this.locked = locked;
                return this;
            }

            /**
             * <p>The time when the template group was modified. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-12-05T10:22:09Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The name of the template group.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the transcoding template group.</p>
             * 
             * <strong>example:</strong>
             * <p>17a9889fc66852*****d791c886700932</p>
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
