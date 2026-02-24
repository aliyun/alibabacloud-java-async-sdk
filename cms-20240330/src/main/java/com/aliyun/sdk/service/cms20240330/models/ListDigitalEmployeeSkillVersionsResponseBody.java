// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListDigitalEmployeeSkillVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDigitalEmployeeSkillVersionsResponseBody</p>
 */
public class ListDigitalEmployeeSkillVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListDigitalEmployeeSkillVersionsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDigitalEmployeeSkillVersionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListDigitalEmployeeSkillVersionsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDigitalEmployeeSkillVersionsResponseBody build() {
            return new ListDigitalEmployeeSkillVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDigitalEmployeeSkillVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDigitalEmployeeSkillVersionsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("skillName")
        private String skillName;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.enable = builder.enable;
            this.remark = builder.remark;
            this.skillName = builder.skillName;
            this.updateTime = builder.updateTime;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return skillName
         */
        public String getSkillName() {
            return this.skillName;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String displayName; 
            private Boolean enable; 
            private String remark; 
            private String skillName; 
            private String updateTime; 
            private String version; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.displayName = model.displayName;
                this.enable = model.enable;
                this.remark = model.remark;
                this.skillName = model.skillName;
                this.updateTime = model.updateTime;
                this.version = model.version;
            } 

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026-02-06T14:09:11Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * displayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * skillName.
             */
            public Builder skillName(String skillName) {
                this.skillName = skillName;
                return this;
            }

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026-02-06T14:09:11Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
