// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link ListSkillGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListSkillGroupResponseBody</p>
 */
public class ListSkillGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListSkillGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSkillGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListSkillGroupResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Status code. A value of &quot;Success&quot; indicates that the request succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Skill group information.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE338D98-9BD3-4413-B165</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API call succeeded. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Succeeded.</li>
         * <li><strong>false</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListSkillGroupResponseBody build() {
            return new ListSkillGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSkillGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListSkillGroupResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelType")
        private Integer channelType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SkillGroupId")
        private Long skillGroupId;

        private Data(Builder builder) {
            this.channelType = builder.channelType;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.name = builder.name;
            this.skillGroupId = builder.skillGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return channelType
         */
        public Integer getChannelType() {
            return this.channelType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return skillGroupId
         */
        public Long getSkillGroupId() {
            return this.skillGroupId;
        }

        public static final class Builder {
            private Integer channelType; 
            private String description; 
            private String displayName; 
            private String name; 
            private Long skillGroupId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.channelType = model.channelType;
                this.description = model.description;
                this.displayName = model.displayName;
                this.name = model.name;
                this.skillGroupId = model.skillGroupId;
            } 

            /**
             * <p>Channel type of the skill group.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder channelType(Integer channelType) {
                this.channelType = channelType;
                return this;
            }

            /**
             * <p>Skill group description.</p>
             * 
             * <strong>example:</strong>
             * <p>自动化技能组</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Display name of the skill group.</p>
             * 
             * <strong>example:</strong>
             * <p>自动化技能组</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>Name of the skill group.</p>
             * 
             * <strong>example:</strong>
             * <p>自动化技能组</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Skill group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder skillGroupId(Long skillGroupId) {
                this.skillGroupId = skillGroupId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
