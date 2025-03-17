// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ListSmartVoiceGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSmartVoiceGroupsResponseBody</p>
 */
public class ListSmartVoiceGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VoiceGroups")
    private java.util.List<VoiceGroups> voiceGroups;

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
     * @return voiceGroups
     */
    public java.util.List<VoiceGroups> getVoiceGroups() {
        return this.voiceGroups;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<VoiceGroups> voiceGroups; 

        private Builder() {
        } 

        private Builder(ListSmartVoiceGroupsResponseBody model) {
            this.requestId = model.requestId;
            this.voiceGroups = model.voiceGroups;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>627B30EB-1D0A-5C6D-8467-431626E0FA10</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The queried speaker groups.</p>
         */
        public Builder voiceGroups(java.util.List<VoiceGroups> voiceGroups) {
            this.voiceGroups = voiceGroups;
            return this;
        }

        public ListSmartVoiceGroupsResponseBody build() {
            return new ListSmartVoiceGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSmartVoiceGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSmartVoiceGroupsResponseBody</p>
     */
    public static class VoiceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("SupportSampleRate")
        private String supportSampleRate;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("Voice")
        private String voice;

        @com.aliyun.core.annotation.NameInMap("VoiceType")
        private String voiceType;

        @com.aliyun.core.annotation.NameInMap("VoiceUrl")
        private String voiceUrl;

        private VoiceList(Builder builder) {
            this.desc = builder.desc;
            this.name = builder.name;
            this.remark = builder.remark;
            this.supportSampleRate = builder.supportSampleRate;
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
         * @return supportSampleRate
         */
        public String getSupportSampleRate() {
            return this.supportSampleRate;
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
            private String supportSampleRate; 
            private String tag; 
            private String voice; 
            private String voiceType; 
            private String voiceUrl; 

            private Builder() {
            } 

            private Builder(VoiceList model) {
                this.desc = model.desc;
                this.name = model.name;
                this.remark = model.remark;
                this.supportSampleRate = model.supportSampleRate;
                this.tag = model.tag;
                this.voice = model.voice;
                this.voiceType = model.voiceType;
                this.voiceUrl = model.voiceUrl;
            } 

            /**
             * <p>The speaker description.</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>The speaker name.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The remarks of the speaker.</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * SupportSampleRate.
             */
            public Builder supportSampleRate(String supportSampleRate) {
                this.supportSampleRate = supportSampleRate;
                return this;
            }

            /**
             * <p>The tag of the speaker type.</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The speaker ID.</p>
             * 
             * <strong>example:</strong>
             * <p>zhitian</p>
             */
            public Builder voice(String voice) {
                this.voice = voice;
                return this;
            }

            /**
             * <p>The speaker type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Male</li>
             * <li>Female</li>
             * <li>Boy</li>
             * <li>Girl</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Female</p>
             */
            public Builder voiceType(String voiceType) {
                this.voiceType = voiceType;
                return this;
            }

            /**
             * <p>The URL of the sample audio file.</p>
             * 
             * <strong>example:</strong>
             * <p>https://***.com/zhiqing.mp3</p>
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
    /**
     * 
     * {@link ListSmartVoiceGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSmartVoiceGroupsResponseBody</p>
     */
    public static class VoiceGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VoiceList")
        private java.util.List<VoiceList> voiceList;

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
        public java.util.List<VoiceList> getVoiceList() {
            return this.voiceList;
        }

        public static final class Builder {
            private String type; 
            private java.util.List<VoiceList> voiceList; 

            private Builder() {
            } 

            private Builder(VoiceGroups model) {
                this.type = model.type;
                this.voiceList = model.voiceList;
            } 

            /**
             * <p>The name of the speaker group.</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The speakers.</p>
             */
            public Builder voiceList(java.util.List<VoiceList> voiceList) {
                this.voiceList = voiceList;
                return this;
            }

            public VoiceGroups build() {
                return new VoiceGroups(this);
            } 

        } 

    }
}
