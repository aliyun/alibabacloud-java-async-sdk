// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSmartVoiceGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSmartVoiceGroupsResponseBody</p>
 */
public class ListSmartVoiceGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VoiceGroups")
    private java.util.List < VoiceGroups> voiceGroups;

    private ListSmartVoiceGroupsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.voiceGroups = builder.voiceGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSmartVoiceGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return voiceGroups
     */
    public java.util.List < VoiceGroups> getVoiceGroups() {
        return this.voiceGroups;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < VoiceGroups> voiceGroups; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VoiceGroups.
         */
        public Builder voiceGroups(java.util.List < VoiceGroups> voiceGroups) {
            this.voiceGroups = voiceGroups;
            return this;
        }

        public ListSmartVoiceGroupsResponseBody build() {
            return new ListSmartVoiceGroupsResponseBody(this);
        } 

    } 

    public static class VoiceList extends TeaModel {
        @NameInMap("Desc")
        private String desc;

        @NameInMap("Name")
        private String name;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("Tag")
        private String tag;

        @NameInMap("Voice")
        private String voice;

        @NameInMap("VoiceType")
        private String voiceType;

        @NameInMap("VoiceUrl")
        private String voiceUrl;

        private VoiceList(Builder builder) {
            this.desc = builder.desc;
            this.name = builder.name;
            this.remark = builder.remark;
            this.tag = builder.tag;
            this.voice = builder.voice;
            this.voiceType = builder.voiceType;
            this.voiceUrl = builder.voiceUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VoiceList create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return voice
         */
        public String getVoice() {
            return this.voice;
        }

        /**
         * @return voiceType
         */
        public String getVoiceType() {
            return this.voiceType;
        }

        /**
         * @return voiceUrl
         */
        public String getVoiceUrl() {
            return this.voiceUrl;
        }

        public static final class Builder {
            private String desc; 
            private String name; 
            private String remark; 
            private String tag; 
            private String voice; 
            private String voiceType; 
            private String voiceUrl; 

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
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
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * Voice.
             */
            public Builder voice(String voice) {
                this.voice = voice;
                return this;
            }

            /**
             * VoiceType.
             */
            public Builder voiceType(String voiceType) {
                this.voiceType = voiceType;
                return this;
            }

            /**
             * VoiceUrl.
             */
            public Builder voiceUrl(String voiceUrl) {
                this.voiceUrl = voiceUrl;
                return this;
            }

            public VoiceList build() {
                return new VoiceList(this);
            } 

        } 

    }
    public static class VoiceGroups extends TeaModel {
        @NameInMap("Type")
        private String type;

        @NameInMap("VoiceList")
        private java.util.List < VoiceList> voiceList;

        private VoiceGroups(Builder builder) {
            this.type = builder.type;
            this.voiceList = builder.voiceList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VoiceGroups create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return voiceList
         */
        public java.util.List < VoiceList> getVoiceList() {
            return this.voiceList;
        }

        public static final class Builder {
            private String type; 
            private java.util.List < VoiceList> voiceList; 

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * VoiceList.
             */
            public Builder voiceList(java.util.List < VoiceList> voiceList) {
                this.voiceList = voiceList;
                return this;
            }

            public VoiceGroups build() {
                return new VoiceGroups(this);
            } 

        } 

    }
}
